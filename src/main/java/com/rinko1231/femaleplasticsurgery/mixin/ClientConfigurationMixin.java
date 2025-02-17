package com.rinko1231.femaleplasticsurgery.mixin;


import com.rinko1231.femaleplasticsurgery.Config.SurgeryConfig;
import com.wildfire.main.config.ClientConfiguration;
import com.wildfire.main.config.FloatConfigKey;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ClientConfiguration.class)
public abstract class ClientConfigurationMixin {

    @Final @Shadow public static final FloatConfigKey BUST_SIZE = new FloatConfigKey("bust_size", 0.6F, 0.0F, SurgeryConfig.bustSizeMax.get().floatValue());

    @Final @Shadow public static final FloatConfigKey BREASTS_OFFSET_Y = new FloatConfigKey("breasts_yOffset", 0.0F, SurgeryConfig.bustOffsetYMin.get().floatValue(), 1.0F);
    @Final @Shadow public static final FloatConfigKey BREASTS_OFFSET_Z = new FloatConfigKey("breasts_zOffset", 0.0F, SurgeryConfig.bustOffsetZMin.get().floatValue(), SurgeryConfig.bustOffsetZMax.get().floatValue());

    @Final @Shadow public static final FloatConfigKey BOUNCE_MULTIPLIER = new FloatConfigKey("bounce_multiplier", 0.333F, 0.0F, SurgeryConfig.bounceMultiplierMax.get().floatValue());
    @Final @Shadow public static final FloatConfigKey FLOPPY_MULTIPLIER = new FloatConfigKey("floppy_multiplier", 0.75F, 0.25F, SurgeryConfig.floppyMultiplierMax.get().floatValue());
}