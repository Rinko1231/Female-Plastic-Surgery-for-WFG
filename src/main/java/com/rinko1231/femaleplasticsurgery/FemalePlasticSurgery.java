package com.rinko1231.femaleplasticsurgery;


import com.rinko1231.femaleplasticsurgery.Config.SurgeryConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(FemalePlasticSurgery.MODID)
public class FemalePlasticSurgery
{
    public static final String MODID = "femaleplasticsurgery";


    public FemalePlasticSurgery(ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.COMMON, SurgeryConfig.SPEC);
    }


}
