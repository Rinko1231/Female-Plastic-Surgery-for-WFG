package com.rinko1231.femaleplasticsurgery.Config;


import net.neoforged.neoforge.common.ModConfigSpec;

public class SurgeryConfig
{
    public static final ModConfigSpec SPEC;
    public static ModConfigSpec.DoubleValue bustSizeMax;

    public static ModConfigSpec.DoubleValue bustOffsetYMin;
    public static ModConfigSpec.DoubleValue bustOffsetZMin;
    public static ModConfigSpec.DoubleValue bustOffsetZMax;

    public static ModConfigSpec.DoubleValue bounceMultiplierMax;
    public static ModConfigSpec.DoubleValue floppyMultiplierMax;
    static
    {
        ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
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


}