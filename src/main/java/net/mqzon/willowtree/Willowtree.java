package net.mqzon.willowtree;

import net.fabricmc.api.ModInitializer;

import net.mqzon.willowtree.block.ModBlocks;
import net.mqzon.willowtree.item.ModItemGroups;
import net.mqzon.willowtree.world.foliage.ModFoliagePlacerTypes;
import net.mqzon.willowtree.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Willowtree implements ModInitializer {
	public static final String MOD_ID = "willowtree";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		ModFoliagePlacerTypes.register();
		ModWorldGeneration.generateModWorldGen();
	}
}