package io.github.kingrocco21.config;

import io.github.kingrocco21.TitleResizerClient;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = TitleResizerClient.MOD_ID)
public class TitleResizerConfig implements ConfigData {
    public float titleScale = 1F;
    public float subtitleScale = 1F;
}
