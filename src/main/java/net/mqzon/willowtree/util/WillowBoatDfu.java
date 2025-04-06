package net.mqzon.willowtree.util;

import com.terraformersmc.terraform.boat.api.data.TerraformBoatDfuApi;

import java.util.Collection;
import java.util.Set;

public class WillowBoatDfu implements TerraformBoatDfuApi {
    @Override
    public Collection<String> getDfuBoatIds() {
        return Set.of("willowtree:willow_boat", "willowtree:willow_chest_boat");
    }
}