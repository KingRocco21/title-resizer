package io.github.kingrocco21.mixin.client;

import io.github.kingrocco21.TitleResizerClient;
import io.github.kingrocco21.config.TitleResizerConfig;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(InGameHud.class)
abstract class InGameHudMixin {
	TitleResizerConfig config = AutoConfig.getConfigHolder(TitleResizerConfig.class).getConfig();

	// Titles
	@Redirect(method = "renderTitleAndSubtitle",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/math/MatrixStack;scale(FFF)V", ordinal = 0), allow = 1)
	private void customTitleScale(MatrixStack dimensions, float x, float y, float z) {
		dimensions.scale(x * config.titleScale, y * config.titleScale, z);
	}

	// Subtitles
	@Redirect(method = "renderTitleAndSubtitle",
			at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/math/MatrixStack;scale(FFF)V", ordinal = 1), allow = 1)
	private void customSubtitleScale(MatrixStack dimensions, float x, float y, float z) {
		dimensions.scale(x * config.subtitleScale, y * config.subtitleScale, z);
	}
}