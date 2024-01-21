package io.github.KingRocco21.title_resizer.client;

import io.github.KingRocco21.title_resizer.client.config.TitleResizerConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class TitleResizerClient implements ClientModInitializer {

	@Override
	public void onInitializeClient(ModContainer mod) {
		AutoConfig.register(TitleResizerConfig.class, GsonConfigSerializer::new);
	}
}
