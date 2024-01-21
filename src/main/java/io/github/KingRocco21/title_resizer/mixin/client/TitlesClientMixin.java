package io.github.KingRocco21.title_resizer.mixin.client;

import com.mojang.blaze3d.vertex.PoseStack;
import io.github.KingRocco21.title_resizer.client.config.TitleResizerConfig;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.client.gui.Gui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(Gui.class)
public class TitlesClientMixin {
	TitleResizerConfig config = AutoConfig.getConfigHolder(TitleResizerConfig.class).getConfig();
	// Titles
	@Redirect(method = "render", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/PoseStack;scale(FFF)V", ordinal = 0), allow = 1)
	private void scaleProxy(PoseStack pose, float x, float y, float z) {
		pose.scale(x * config.titleWidth, y * config.titleHeight, z);
	}
	// Subtitles
	@Redirect(method = "render", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/PoseStack;scale(FFF)V", ordinal = 1), allow = 1)
	private void scaleProxy2(PoseStack pose, float x, float y, float z) {
		pose.scale(x * config.subtitleWidth, y * config.subtitleHeight, z);
	}
}
