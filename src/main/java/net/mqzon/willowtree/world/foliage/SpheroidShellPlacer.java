package net.mqzon.willowtree.world.foliage;

import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Math.*;
import static net.minecraft.util.math.MathHelper.floor;

public class SpheroidShellPlacer extends BlobFoliagePlacer {

    public static final MapCodec<SpheroidShellPlacer> CODEC = RecordCodecBuilder.mapCodec(
            instance -> createCodec(instance).apply(instance, SpheroidShellPlacer::new)
    );

    public SpheroidShellPlacer(IntProvider radius, IntProvider offset, int height) {
        super(radius, offset, height);
    }


    @Override
    protected FoliagePlacerType<?> getType() {
        return ModFoliagePlacerTypes.SPHEROID_SHELL_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        // semi-major axis is the distance from center to the outside (horizontal)
        // semi-minor axis is the distance from the center to the top (vertical)
        // spheroid equation: 1 = (x^2 + z^2)/sMaj^2 + (y^2)/sMin^2

        // Equation for radius of circle at height y, relative to bottom of foliage:
        // r = sqrt((sMaj^2)(1 - (y^2/sMin^2)))

        double sMaj = this.radius.getMax(); //radius
        double sMin = this.height; //foliageHeight
        BlockPos.Mutable currentCenter = treeNode.getCenter().mutableCopy().move(Direction.UP, 2 );

        for (int i = 0; i < this.height; i++) { //start from top
            int y = this.height - i;
            double r = sqrt(sMaj * sMaj * (1 - ((y * y) / (sMin * sMin))));

            List<BlockPos> points = new ArrayList<>();

            // Extra placements help connect the leaves to prevent de-spawning.
            if (r > 0.5) points.addAll(makeRing(currentCenter, r-0.5));
            if (i == 3 || i == 4) {
                points.addAll(makeRing(currentCenter, 1));
                points.add(currentCenter);
            }
            points.addAll(makeRing(currentCenter, r));
            points.addAll(makeRing(currentCenter, r+1));

            // Remove duplicate points before placing foliage blocks.
            Set<BlockPos> setPoints = new HashSet<>(points);
            List<BlockPos> distinctPoints = new ArrayList<>(setPoints);
            distinctPoints.forEach((point) -> placeFoliageBlock(world, placer, random, config, point));

            currentCenter.move(Direction.DOWN);
        }
    }

    // Generates a list of block positions for a horizontal ring of radius 'r' from center.
    // Iterates over integer offsets along the radius for one quadrant,
    // calculating the corresponding "z" offset using pythagoras.
    // Once offsets are determined, they are reused for each quadrant.

    // For visualisation, imagine starting at the top of a circle, where the "x offset" is 0.
    // Here, x is the "left/right" axis and z is the "forwards/backwards" axis.
    // We calculate the "z offset", which would initially be equal to r.
    //                 . -~- .
    //             . `    |    ` .
    //            /       |       \
    //           ||       *       ||
    //            \               /
    //             ' .         . '
    //                ' -._.- '
    //
    // Then, increment x offset, each time calculating a new z offset.
    // The z offset will decrease as the x offset increases.
    //                 . -~- .
    //             . `      /  ` .
    //            /        /      \
    //           ||       *       ||
    //            \               /
    //             ' .         . '
    //                ' -._.- '
    //
    // Eventually we reach the maximum x offset, where the z offset is equal to 0.
    //                 . -~- .
    //             . `         ` .
    //            /               \
    //           ||       *  -  - ||
    //            \               /
    //             ' .         . '
    //                ' -._.- '
    // Each calculated offset pair can be inverted in 4 permutations (++, +-, -+, --)
    // to give you the equivalent positions in all four quadrants.

    private List<BlockPos> makeRing(BlockPos center, double r) {
        List<BlockPos> points = Lists.<BlockPos>newArrayList();
        for (int i = 0; i <= r+1; i ++) {
            int xOffset = floor(min(i, r));
            int zOffset = floor(sqrt(r*r - i*i));

            BlockPos.Mutable m1 = new BlockPos.Mutable().set(center, xOffset, 0, zOffset);
            BlockPos.Mutable m2 = new BlockPos.Mutable().set(center, xOffset, 0, -zOffset);
            BlockPos.Mutable m3 = new BlockPos.Mutable().set(center, -xOffset, 0, zOffset);
            BlockPos.Mutable m4 = new BlockPos.Mutable().set(center, -xOffset, 0, -zOffset);

            points.add(m1);
            points.add(m2);
            points.add(m3);
            points.add(m4);
        }
        return points;
    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return 0;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }
}
