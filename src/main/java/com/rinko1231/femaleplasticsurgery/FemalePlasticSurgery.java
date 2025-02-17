package com.rinko1231.femaleplasticsurgery;


import com.rinko1231.femaleplasticsurgery.Config.SurgeryConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;


@Mod(FemalePlasticSurgery.MODID)
public class FemalePlasticSurgery
{
    public static final String MODID = "femaleplasticsurgery";

    public FemalePlasticSurgery() {

        MinecraftForge.EVENT_BUS.register(this);
        SurgeryConfig.setup();
    }


}
