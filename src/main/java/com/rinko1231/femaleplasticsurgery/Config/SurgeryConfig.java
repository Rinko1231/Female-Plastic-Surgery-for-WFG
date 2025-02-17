package com.rinko1231.femaleplasticsurgery.Config;


import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class SurgeryConfig
{
    public static ForgeConfigSpec SPEC;
    public static ForgeConfigSpec.DoubleValue bustSizeMax;

    public static ForgeConfigSpec.DoubleValue bustOffsetYMin;
    public static ForgeConfigSpec.DoubleValue bustOffsetZMin;
    public static ForgeConfigSpec.DoubleValue bustOffsetZMax;

    public static ForgeConfigSpec.DoubleValue bounceMultiplierMax;
    public static ForgeConfigSpec.DoubleValue floppyMultiplierMax;
    static
    {
        ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
        BUILDER.push("Female Plastic Surgery Config");
        bustSizeMax = BUILDER
                .defineInRange("bustSizeMax",1.0,0.8,4.0);
        bustOffsetYMin = BUILDER
                .defineInRange("Breast Height Min",-1.5,-4.0,-1.0);
        bustOffsetZMin = BUILDER
                .defineInRange("Breast Depth Min",-1.5,-4.0,-1.0);
        bustOffsetZMax = BUILDER
                .defineInRange("Breast Depth Max",0.0,0.0,4.0);

        bounceMultiplierMax = BUILDER
                .defineInRange("Bounce Multiplier Max",1.0,0.5,3.0);
        floppyMultiplierMax = BUILDER
                .defineInRange("Floppy Multiplier Max",1.5,1.0,3.0);

        SPEC = BUILDER.build();
    }

    public static void setup()
    {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SPEC, "femaleplasticsurgery-common.toml");
    }

}