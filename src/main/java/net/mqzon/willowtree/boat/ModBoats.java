package net.mqzon.willowtree.boat;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.mqzon.willowtree.Willowtree;

public class ModBoats {
    public static final Identifier WILLOW = Identifier.of(Willowtree.MOD_ID, "willow");
    public static final Item WILLOW_BOAT = TerraformBoatItemHelper.registerBoatItem(WILLOW, false);
    public static final Item WILLOW_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(WILLOW, true);
}
