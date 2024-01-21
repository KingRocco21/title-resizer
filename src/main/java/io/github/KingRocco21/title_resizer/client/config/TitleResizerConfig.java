package io.github.KingRocco21.title_resizer.client.config;

import io.github.KingRocco21.title_resizer.TitleResizer;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = TitleResizer.MOD_ID)
public class TitleResizerConfig implements ConfigData {
	public float titleHeight = 1f;
	public float titleWidth = 1f;
	public float subtitleHeight = 1f;
	public float subtitleWidth = 1f;
}
