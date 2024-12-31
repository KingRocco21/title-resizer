package io.github.kingrocco21;

import io.github.kingrocco21.config.TitleResizerConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;

public class TitleResizerClient implements ClientModInitializer {
	public static final String MOD_ID = "title-resizer";
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		AutoConfig.register(TitleResizerConfig.class, GsonConfigSerializer::new);
	}
}