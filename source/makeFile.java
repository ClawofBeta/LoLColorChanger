import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class makeFile {
	
	//Creates a GeneralCharacterData_Legacy.ini file in path location.
	static void createFile(){
		try {
			String content = "[HealthBarSettings]\r\n" + 
					"MaxHealthTicks = 50\r\n" + 
					"MaxHealthMicroTicks = 100\r\n" + 
					"DefaultHealthPerMicroTick = 50\r\n" + 
					"DefaultHealthPerTick = 200\r\n" + 
					"DefaultHealthPerMegaTick = 1000\r\n" + 
					"\r\n" + 
					"TickAlpha = 200\r\n" + 
					"MicroTickAlpha = 140\r\n" + 
					"MicroTickHeight = 0.5\r\n" + 	
					"MegaTickAlpha = 255\r\n" + 
					"TickThickness = 1.0\r\n" + 
					"MicroTickThickness = 1.0\r\n" + 
					"MegaTickThickness = 2.0\r\n" + 
					"\r\n" + 
					"UseCompression = 1\r\n" + 
					"GoTransparent = 1\r\n" + 
					"\r\n" + 
					"[GeneralDataHero]\r\n" + 
					"FadeTimerForHealthBar = 2.0\r\n" + 
					"ZeroHealthAlpha = 225\r\n" + 
					"FullHealthAlpha = 200\r\n" + 
					"DefaultChampionCollisionRadius = 65.0\r\n" + 
					"MPBarColor = " + Frame1.manaColor.getRed() + " " + Frame1.manaColor.getGreen() + 
					" " + Frame1.manaColor.getBlue() + " " + Frame1.manaColor.getAlpha()+ "\r\n" +
					"EnergyBarColor = " + Frame1.energyColor.getRed() + " " + Frame1.energyColor.getGreen() + 
					" " + Frame1.energyColor.getBlue() + " " + Frame1.energyColor.getAlpha()+ "\r\n" +
					"ShieldBarColor=155 155 155 255\r\n" + 
					"OtherBarColor=155 155 155 255\r\n" + 
					"MPFadeColor=0 200 255 255\r\n" + 
					"EnergyFadeColor=240 240 80 255\r\n" + 
					"ShieldFadeColor=255 255 255 255\r\n" + 
					"OtherFadeColor=255 255 255 255\r\n" + 
					"ChampionParallaxOffset = 100\r\n" + 
					"\r\n" + 
					"[NewUnitBackdropTemplate]\r\n" + 
					"BackgroundTexture = SpawnedMinionBars.tga\r\n" + 
					"BackgroundLeftPixelRegion = 66 154 67 160\r\n" + 
					"BackgroundMidPixelRegion = 67 154 191 160\r\n" + 
					"BackgroundRightPixelRegion = 191 154 192 160\r\n" + 
					"\r\n" + 
					"[NewUnitDoubleBackdropTemplate]\r\n" + 
					"BackgroundTexture = SpawnedMinionBars.tga\r\n" + 
					"BackgroundLeftPixelRegion = 66 154 67 163\r\n" + 
					"BackgroundMidPixelRegion = 67 154 191 163\r\n" + 
					"BackgroundRightPixelRegion = 191 154 192 163\r\n" + 
					"\r\n" + 
					"[NewUnitHealthBarTemplate]\r\n" + 
					"BarTexture = SpawnedMinionBars.tga\r\n" + 
					"BarPixelRegion = 67 131 191 135\r\n" + 
					"TickPixelRegion = 124 155 124 155\r\n" + 
					"TickPixelWidth = 1\r\n" + 
					"MegaTickPixelRegion = 160 56 162 59\r\n" + 
					"\r\n" + 
					"[NewUnitTimerBarTemplate]\r\n" + 
					"BarTexture = SpawnedMinionBars.tga\r\n" + 
					"BarPixelRegion = 67 114 191 116\r\n" + 
					"TickPixelRegion = 124 155 124 155\r\n" + 
					"TickPixelWidth = 1\r\n" + 
					"MegaTickPixelRegion = 124 155 124 155\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"; The composition of a unit information bar is still hard-coded instead of data-driven (you can't directly change the information bar's components from this INI file).\r\n" + 
					"; This is a place for future improvements.\r\n" + 
					"[NewHealthBarFriendlyUnitDefault]\r\n" + 
					"\r\n" + 
					"HPOnlyBackdropOffset = 0 4\r\n" + 
					"HPBarStartOffset = 1 5\r\n" + 
					"TimerBarStartOffset = 1 1\r\n" + 
					"\r\n" + 
					"MidHorizontalScaling = 0.5\r\n" + 
					"\r\n" + 
					"BackgroundColor = 132 207 132 255\r\n" + 
					"HealthBarColor = 132 207 132 255\r\n" + 
					"TimerBarColor = 205 205 205 255\r\n" + 
					"\r\n" + 
					"[NewHealthBarEnemyUnitDefault]\r\n" + 
					"\r\n" + 
					"HPOnlyBackdropOffset = 0 4\r\n" + 
					"HPBarStartOffset = 1 5\r\n" + 
					"TimerBarStartOffset = 1 1\r\n" + 
					"\r\n" + 
					"MidHorizontalScaling = 0.5\r\n" + 
					"\r\n" + 
					"BackgroundColor = 255 115 115 255\r\n" + 
					"HealthBarColor = 255 115 115 255\r\n" + 
					"TimerBarColor = 255 255 255 255\r\n" + 
					"\r\n" + 
					"[NewHealthBarNeutralUnitDefault]\r\n" + 
					"\r\n" + 
					"HPOnlyBackdropOffset = 0 4\r\n" + 
					"HPBarStartOffset = 1 5\r\n" + 
					"TimerBarStartOffset = 1 1\r\n" + 
					"\r\n" + 
					"MidHorizontalScaling = 0.5\r\n" + 
					"\r\n" + 
					"BackgroundColor = 255 115 115 255\r\n" + 
					"HealthBarColor = 255 115 115 255\r\n" + 
					"TimerBarColor = 255 255 255 255\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"[NewHealthBarFriendlyUnitSpectator]\r\n" + 
					"\r\n" + 
					"HPOnlyBackdropOffset = 0 4\r\n" + 
					"HPBarStartOffset = 1 5\r\n" + 
					"TimerBarStartOffset = 1 1\r\n" + 
					"\r\n" + 
					"MidHorizontalScaling = 0.5\r\n" + 
					"\r\n" + 
					"BackgroundColor = 117 182 226 255\r\n" + 
					"HealthBarColor = 117 182 226 255\r\n" + 
					"TimerBarColor = 255 255 255 255\r\n" + 
					"\r\n" + 
					"[NewHealthBarEnemyUnitSpectator]\r\n" + 
					"\r\n" + 
					"HPOnlyBackdropOffset = 0 4\r\n" + 
					"HPBarStartOffset = 1 5\r\n" + 
					"TimerBarStartOffset = 1 1\r\n" + 
					"\r\n" + 
					"MidHorizontalScaling = 0.5\r\n" + 
					"\r\n" + 
					"BackgroundColor = 220 99 255 255\r\n" + 
					"HealthBarColor = 220 99 255 255\r\n" + 
					"TimerBarColor = 255 255 255 255\r\n" + 
					"\r\n" + 
					"[NewHealthBarNeutralUnitSpectator]\r\n" + 
					"\r\n" + 
					"HPOnlyBackdropOffset = 0 4\r\n" + 
					"HPBarStartOffset = 1 5\r\n" + 
					"TimerBarStartOffset = 1 1\r\n" + 
					"\r\n" + 
					"MidHorizontalScaling = 0.5\r\n" + 
					"\r\n" + 
					"BackgroundColor = 220 99 255 255\r\n" + 
					"HealthBarColor = 220 99 255 255\r\n" + 
					"TimerBarColor = 255 255 255 255\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"[NewHealthBarFriendlyUnitColorblind]\r\n" + 
					"\r\n" + 
					"HPOnlyBackdropOffset = 0 4\r\n" + 
					"HPBarStartOffset = 1 5\r\n" + 
					"TimerBarStartOffset = 1 1\r\n" + 
					"\r\n" + 
					"MidHorizontalScaling = 0.5\r\n" + 
					"\r\n" + 
					"BackgroundColor = 117 182 226 255\r\n" + 
					"HealthBarColor = 117 182 226 255\r\n" + 
					"TimerBarColor = 255 255 255 255\r\n" + 
					"\r\n" + 
					"[NewHealthBarEnemyUnitColorblind]\r\n" + 
					"\r\n" + 
					"HPOnlyBackdropOffset = 0 4\r\n" + 
					"HPBarStartOffset = 1 5\r\n" + 
					"TimerBarStartOffset = 1 1\r\n" + 
					"\r\n" + 
					"MidHorizontalScaling = 0.5\r\n" + 
					"\r\n" + 
					"BackgroundColor = 255 115 115 255\r\n" + 
					"HealthBarColor = 255 115 115 255\r\n" + 
					"TimerBarColor = 255 255 255 255\r\n" + 
					"\r\n" + 
					"[NewHealthBarNeutralUnitColorblind]\r\n" + 
					"\r\n" + 
					"HPOnlyBackdropOffset = 0 4\r\n" + 
					"HPBarStartOffset = 1 5\r\n" + 
					"TimerBarStartOffset = 1 1\r\n" + 
					"\r\n" + 
					"MidHorizontalScaling = 0.5\r\n" + 
					"\r\n" + 
					"BackgroundColor = 255 115 115 255\r\n" + 
					"HealthBarColor = 255 115 115 255\r\n" + 
					"TimerBarColor = 255 255 255 255\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"[LegacyFriendlyUnitBackdropTemplateDefault]\r\n" + 
					"BackgroundTexture = healthbarsDefault.tga\r\n" + 
					"BackgroundLeftPixelRegion = 4 180 5 186\r\n" + 
					"BackgroundMidPixelRegion = 5 180 149 186\r\n" + 
					"BackgroundRightPixelRegion = 149 180 150 186\r\n" + 
					"\r\n" + 
					"[LegacyFriendlyUnitHealthBarTemplateDefault]\r\n" + 
					"BarTexture = healthbarsDefault.tga\r\n" + 
					"BarPixelRegion = 5 226 149 230\r\n" + 
					"TickPixelRegion = 29 168 30 170\r\n" + 
					"MegaTickPixelRegion = 29 168 30 170\r\n" + 
					"TickPixelWidth = 1\r\n" + 
					"\r\n" + 
					"[LegacyEnemyUnitBackdropTemplateDefault]\r\n" + 
					"BackgroundTexture = healthbarsDefault.tga\r\n" + 
					"BackgroundLeftPixelRegion = 4 180 5 186\r\n" + 
					"BackgroundMidPixelRegion = 5 180 149 186\r\n" + 
					"BackgroundRightPixelRegion = 149 180 150 186\r\n" + 
					"\r\n" + 
					"[LegacyEnemyUnitHealthBarTemplateDefault]\r\n" + 
					"BarTexture = healthbarsDefault.tga\r\n" + 
					"BarPixelRegion = 5 211 149 215\r\n" + 
					"TickPixelRegion = 29 168 30 170\r\n" + 
					"MegaTickPixelRegion = 29 168 30 170\r\n" + 
					"TickPixelWidth = 1\r\n" + 
					"\r\n" + 
					"[LegacyNeutralUnitBackdropTemplateDefault]\r\n" + 
					"BackgroundTexture = healthbarsDefault.tga\r\n" + 
					"BackgroundLeftPixelRegion = 4 180 5 186\r\n" + 
					"BackgroundMidPixelRegion = 5 180 149 186\r\n" + 
					"BackgroundRightPixelRegion = 149 180 150 186\r\n" + 
					"\r\n" + 
					"[LegacyNeutralUnitHealthBarTemplateDefault]\r\n" + 
					"BarTexture = healthbarsDefault.tga\r\n" + 
					"BarPixelRegion = 5 211 149 215\r\n" + 
					";TickPixelRegion = 0 0 0 0\r\n" + 
					"TickPixelRegion = 29 168 30 170\r\n" + 
					"MegaTickPixelRegion = 29 168 30 170\r\n" + 
					"TickPixelWidth = 1\r\n" + 
					"\r\n" + 
					"[LegacyFriendlyUnitBackdropTemplateSpectator]\r\n" + 
					"BackgroundTexture = healthbarsSpectator.tga\r\n" + 
					"BackgroundLeftPixelRegion = 4 180 5 186\r\n" + 
					"BackgroundMidPixelRegion = 5 180 149 186\r\n" + 
					"BackgroundRightPixelRegion = 149 180 150 186\r\n" + 
					"\r\n" + 
					"[LegacyFriendlyUnitHealthBarTemplateSpectator]\r\n" + 
					"BarTexture = healthbarsSpectator.tga\r\n" + 
					"BarPixelRegion = 5 226 149 230\r\n" + 
					"TickPixelRegion = 29 168 30 170\r\n" + 
					"MegaTickPixelRegion = 29 168 30 170\r\n" + 
					"TickPixelWidth = 1\r\n" + 
					"\r\n" + 
					"[LegacyEnemyUnitBackdropTemplateSpectator]\r\n" + 
					"BackgroundTexture = healthbarsSpectator.tga\r\n" + 
					"BackgroundLeftPixelRegion = 4 180 5 186\r\n" + 
					"BackgroundMidPixelRegion = 5 180 149 186\r\n" + 
					"BackgroundRightPixelRegion = 149 180 150 186\r\n" + 
					"\r\n" + 
					"[LegacyEnemyUnitHealthBarTemplateSpectator]\r\n" + 
					"BarTexture = healthbarsSpectator.tga\r\n" + 
					"BarPixelRegion = 5 211 149 215\r\n" + 
					"TickPixelRegion = 29 168 30 170\r\n" + 
					"MegaTickPixelRegion = 29 168 30 170\r\n" + 
					"TickPixelWidth = 1\r\n" + 
					"\r\n" + 
					"[LegacyNeutralUnitBackdropTemplateSpectator]\r\n" + 
					"BackgroundTexture = healthbarsSpectator.tga\r\n" + 
					"BackgroundLeftPixelRegion = 4 180 5 186\r\n" + 
					"BackgroundMidPixelRegion = 5 180 149 186\r\n" + 
					"BackgroundRightPixelRegion = 149 180 150 186\r\n" + 
					"\r\n" + 
					"[LegacyNeutralUnitHealthBarTemplateSpectator]\r\n" + 
					"BarTexture = healthbarsSpectator.tga\r\n" + 
					"BarPixelRegion = 5 211 149 215\r\n" + 
					"TickPixelRegion = 29 168 30 170\r\n" + 
					"MegaTickPixelRegion = 29 168 30 170\r\n" + 
					"TickPixelWidth = 1\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"[LegacyFriendlyUnitBackdropTemplateColorblind]\r\n" + 
					"BackgroundTexture = healthbarsColorblind.tga\r\n" + 
					"BackgroundLeftPixelRegion = 4 180 5 186\r\n" + 
					"BackgroundMidPixelRegion = 5 180 149 186\r\n" + 
					"BackgroundRightPixelRegion = 149 180 150 186\r\n" + 
					"\r\n" + 
					"[LegacyFriendlyUnitHealthBarTemplateColorblind]\r\n" + 
					"BarTexture = healthbarsColorblind.tga\r\n" + 
					"BarPixelRegion = 5 226 149 230\r\n" + 
					"TickPixelRegion = 29 168 30 170\r\n" + 
					"MegaTickPixelRegion = 29 168 30 170\r\n" + 
					"TickPixelWidth = 1\r\n" + 
					"\r\n" + 
					"[LegacyEnemyUnitBackdropTemplateColorblind]\r\n" + 
					"BackgroundTexture = healthbarsColorblind.tga\r\n" + 
					"BackgroundLeftPixelRegion = 4 180 5 186\r\n" + 
					"BackgroundMidPixelRegion = 5 180 149 186\r\n" + 
					"BackgroundRightPixelRegion = 149 180 150 186\r\n" + 
					"\r\n" + 
					"[LegacyEnemyUnitHealthBarTemplateColorblind]\r\n" + 
					"BarTexture = healthbarsColorblind.tga\r\n" + 
					"BarPixelRegion = 5 211 149 215\r\n" + 
					"TickPixelRegion = 29 168 30 170\r\n" + 
					"MegaTickPixelRegion = 29 168 30 170\r\n" + 
					"TickPixelWidth = 1\r\n" + 
					"\r\n" + 
					"[LegacyNeutralUnitBackdropTemplateColorblind]\r\n" + 
					"BackgroundTexture = healthbarsColorblind.tga\r\n" + 
					"BackgroundLeftPixelRegion = 4 180 5 186\r\n" + 
					"BackgroundMidPixelRegion = 5 180 149 186\r\n" + 
					"BackgroundRightPixelRegion = 149 180 150 186\r\n" + 
					"\r\n" + 
					"[LegacyNeutralUnitHealthBarTemplateColorblind]\r\n" + 
					"BarTexture = healthbarsColorblind.tga\r\n" + 
					"BarPixelRegion = 5 211 149 215\r\n" + 
					"TickPixelRegion = 29 168 30 170\r\n" + 
					"MegaTickPixelRegion = 29 168 30 170\r\n" + 
					"TickPixelWidth = 1\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"[LegacyHealthBarMinion]\r\n" + 
					"\r\n" + 
					"BarStartOffset = 1 1\r\n" + 
					"BarEndOffset = -1 -1\r\n" + 
					"\r\n" + 
					"MidHorizontalScaling = 0.44\r\n" + 
					"\r\n" + 
					"BackgroundColor = 255 255 255 255\r\n" + 
					"BarColor = 255 255 255 255\r\n" + 
					"FadeColor = 255 255 255 255\r\n" + 
					"\r\n" + 
					"[LegacyHealthBarTurret]\r\n" + 
					"\r\n" + 
					"BarStartOffset = 1 1\r\n" + 
					"BarEndOffset = -1 -1\r\n" + 
					"\r\n" + 
					"BackgroundColor = 255 255 255 255\r\n" + 
					"BarColor = 255 255 255 255\r\n" + 
					"FadeColor = 255 255 255 255\r\n" + 
					"\r\n" + 
					"[LegacyHealthBarInhibitor]\r\n" + 
					"\r\n" + 
					"BarStartOffset = 1 1\r\n" + 
					"BarEndOffset = -1 -1\r\n" + 
					"\r\n" + 
					"PercentageOffset = 0.0 -10.0\r\n" + 
					"\r\n" + 
					"BackgroundColor = 255 255 255 255\r\n" + 
					"BarColor = 255 255 255 255\r\n" + 
					"FadeColor = 255 255 255 255\r\n" + 
					"\r\n" + 
					"[LegacyHealthBarNexus]\r\n" + 
					"\r\n" + 
					"BarStartOffset = 1 1\r\n" + 
					"BarEndOffset = -1 -1\r\n" + 
					"\r\n" + 
					"PercentageOffset = 0.0 -15.0\r\n" + 
					"MidHorizontalScaling = 1.5\r\n" + 
					"\r\n" + 
					"BackgroundColor = 255 255 255 255\r\n" + 
					"BarColor = 255 255 255 255\r\n" + 
					"FadeColor = 255 255 255 255\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"[ChampionSelfBackdropTemplateDefault]\r\n" + 
					"BackgroundTexture = healthbarsDefault.tga\r\n" + 
					"BackgroundMidPixelRegion = 1 0 141 47\r\n" + 
					"\r\n" + 
					"[ChampionFriendlyBackdropTemplateDefault]\r\n" + 
					"BackgroundTexture = healthbarsDefault.tga\r\n" + 
					"BackgroundMidPixelRegion = 0 59 169 106\r\n" + 
					"\r\n" + 
					"[ChampionEnemyBackdropTemplateDefault]\r\n" + 
					"BackgroundTexture = healthbarsDefault.tga\r\n" + 
					"BackgroundMidPixelRegion = 0 119 169 166\r\n" + 
					"\r\n" + 
					"[ChampionSelfBackdropTemplateSpectator]\r\n" + 
					"BackgroundTexture = healthbarsSpectator.tga\r\n" + 
					"BackgroundMidPixelRegion = 1 0 141 47\r\n" + 
					"\r\n" + 
					"[ChampionFriendlyBackdropTemplateSpectator]\r\n" + 
					"BackgroundTexture = healthbarsSpectator.tga\r\n" + 
					"BackgroundMidPixelRegion = 0 59 169 106\r\n" + 
					"\r\n" + 
					"[ChampionEnemyBackdropTemplateSpectator]\r\n" + 
					"BackgroundTexture = healthbarsSpectator.tga\r\n" + 
					"BackgroundMidPixelRegion = 0 119 169 166\r\n" + 
					"\r\n" + 
					"[ChampionSelfBackdropTemplateColorblind]\r\n" + 
					"BackgroundTexture = healthbarsColorblind.tga\r\n" + 
					"BackgroundMidPixelRegion = 1 0 141 47\r\n" + 
					"\r\n" + 
					"[ChampionFriendlyBackdropTemplateColorblind]\r\n" + 
					"BackgroundTexture = healthbarsColorblind.tga\r\n" + 
					"BackgroundMidPixelRegion = 0 59 169 106\r\n" + 
					"\r\n" + 
					"[ChampionEnemyBackdropTemplateColorblind]\r\n" + 
					"BackgroundTexture = healthbarsColorblind.tga\r\n" + 
					"BackgroundMidPixelRegion = 0 119 169 166\r\n" + 
					"\r\n" + 
					"[ChampionHealthBarTemplate]\r\n" + 
					"BarTexture = healthbarsDefault.tga\r\n" + 
					"BarPixelRegion = 32 47 136 56\r\n" + 
					"TickPixelRegion = 137 47 139 55\r\n" + 
					"TickPixelWidth = 1\r\n" + 
					"MegaTickPixelRegion = 137 47 139 55\r\n" + 
					"\r\n" + 
					"[ChampionPARBarTemplate]\r\n" + 
					"BarTexture = healthbarsDefault.tga\r\n" + 
					"BarPixelRegion = 32 56 136 59\r\n" + 
					"TickPixelRegion = 137 56 139 58\r\n" + 
					"TickPixelWidth = 1\r\n" + 
					"MegaTickPixelRegion = 160 56 162 59\r\n" + 
					"\r\n" + 
					"[ChampionLoCBarTemplate]\r\n" + 
					"BarTexture = healthbarsDefault.tga\r\n" + 
					"BarPixelRegion = 32 56 136 59\r\n" + 
					"TickPixelRegion = 137 56 139 58\r\n" + 
					"TickPixelWidth = 1\r\n" + 
					"MegaTickPixelRegion = 160 56 162 59\r\n" + 
					"\r\n" + 
					"[ChampionLoCBarBackdropTemplate]\r\n" + 
					"BackgroundTexture = SpawnedMinionBars.tga\r\n" + 
					"BackgroundLeftPixelRegion = 66 154 67 160\r\n" + 
					"BackgroundMidPixelRegion = 67 154 172 160\r\n" + 
					"BackgroundRightPixelRegion = 191 154 192 160\r\n" + 
					"\r\n" + 
					"[ChampionSelf2LoCBarIconData]\r\n" + 
					"SuppressionTexture=Icon_UI_CC_Suppress_01.dds\r\n" + 
					"StunTexture=Icon_UI_CC_Stunned_01.dds\r\n" + 
					"SilenceTexture=Icon_UI_CC_Silence_01.dds\r\n" + 
					"BlindTexture=Icon_UI_CC_Blind_01.dds\r\n" + 
					"AirborneTexture=Icon_UI_CC_Airborne_01.dds\r\n" + 
					"DisarmTexture=Icon_UI_CC_Disarm_01.dds\r\n" + 
					"SlowTexture=Icon_UI_CC_Slow_01.dds\r\n" + 
					"FearTexture=Icon_UI_CC_Fear_01.dds\r\n" + 
					"RootTexture=Icon_UI_CC_Root_01.dds\r\n" + 
					"CharmTexture=Icon_UI_CC_Charm_01.dds\r\n" + 
					"TauntTexture=Icon_UI_CC_Taunt_01.dds\r\n" + 
					"IconWidth=32\r\n" + 
					"IconHeight=32\r\n" + 
					"IconOffsetX=110.0\r\n" + 
					"IconOffsetY=-16.0\r\n" + 
					"AdditionalIconOffsetX=0.0\r\n" + 
					"AdditionalIconOffsetY=-32.0\r\n" + 
					"\r\n" + 
					"[ChampionSelfLoCBarIconData]\r\n" + 
					"SuppressionTexture=Icon_UI_CC_Suppress_01.dds\r\n" + 
					"StunTexture=Icon_UI_CC_Stunned_01.dds\r\n" + 
					"SilenceTexture=Icon_UI_CC_Silence_01.dds\r\n" + 
					"BlindTexture=Icon_UI_CC_Blind_01.dds\r\n" + 
					"AirborneTexture=Icon_UI_CC_Airborne_01.dds\r\n" + 
					"DisarmTexture=Icon_UI_CC_Disarm_01.dds\r\n" + 
					"SlowTexture=Icon_UI_CC_Slow_01.dds\r\n" + 
					"FearTexture=Icon_UI_CC_Fear_01.dds\r\n" + 
					"RootTexture=Icon_UI_CC_Root_01.dds\r\n" + 
					"CharmTexture=Icon_UI_CC_Charm_01.dds\r\n" + 
					"TauntTexture=Icon_UI_CC_Taunt_01.dds\r\n" + 
					"IconWidth=16\r\n" + 
					"IconHeight=16\r\n" + 
					"IconOffsetX=-10.0\r\n" + 
					"IconOffsetY=-4.0\r\n" + 
					"AdditionalIconOffsetX=16.0\r\n" + 
					"AdditionalIconOffsetY=0.0\r\n" + 
					"\r\n" + 
					"[ChampionFriendlyLoCBarIconData]\r\n" + 
					"SuppressionTexture=Icon_UI_CC_Suppress_01.dds\r\n" + 
					"StunTexture=Icon_UI_CC_Stunned_01.dds\r\n" + 
					"SilenceTexture=Icon_UI_CC_Silence_01.dds\r\n" + 
					"BlindTexture=Icon_UI_CC_Blind_01.dds\r\n" + 
					"AirborneTexture=Icon_UI_CC_Airborne_01.dds\r\n" + 
					"DisarmTexture=Icon_UI_CC_Disarm_01.dds\r\n" + 
					"SlowTexture=Icon_UI_CC_Slow_01.dds\r\n" + 
					"FearTexture=Icon_UI_CC_Fear_01.dds\r\n" + 
					"RootTexture=Icon_UI_CC_Root_01.dds\r\n" + 
					"CharmTexture=Icon_UI_CC_Charm_01.dds\r\n" + 
					"TauntTexture=Icon_UI_CC_Taunt_01.dds\r\n" + 
					"IconWidth=16\r\n" + 
					"IconHeight=16\r\n" + 
					"IconOffsetX=-10.0\r\n" + 
					"IconOffsetY=-4.0\r\n" + 
					"AdditionalIconOffsetX=20.0\r\n" + 
					"AdditionalIconOffsetY=0.0\r\n" + 
					"\r\n" + 
					"[ChampionEnemyLoCBarIconData]\r\n" + 
					"SuppressionTexture=Icon_UI_CC_Suppress_01.dds\r\n" + 
					"StunTexture=Icon_UI_CC_Stunned_01.dds\r\n" + 
					"SilenceTexture=Icon_UI_CC_Silence_01.dds\r\n" + 
					"BlindTexture=Icon_UI_CC_Blind_01.dds\r\n" + 
					"AirborneTexture=Icon_UI_CC_Airborne_01.dds\r\n" + 
					"DisarmTexture=Icon_UI_CC_Disarm_01.dds\r\n" + 
					"SlowTexture=Icon_UI_CC_Slow_01.dds\r\n" + 
					"FearTexture=Icon_UI_CC_Fear_01.dds\r\n" + 
					"RootTexture=Icon_UI_CC_Root_01.dds\r\n" + 
					"CharmTexture=Icon_UI_CC_Charm_01.dds\r\n" + 
					"TauntTexture=Icon_UI_CC_Taunt_01.dds\r\n" + 
					"IconWidth=16\r\n" + 
					"IconHeight=16\r\n" + 
					"IconOffsetX=-4.0\r\n" + 
					"IconOffsetY=-4.0\r\n" + 
					"AdditionalIconOffsetX=20.0\r\n" + 
					"AdditionalIconOffsetY=0.0\r\n" + 
					"\r\n" + 
					"[ChampionChatBubbleTemplate]\r\n" + 
					"BackgroundTexture = OtherChatBubble.tga\r\n" + 
					"BackgroundMidPixelRegion = 0 0 32 32\r\n" + 
					"\r\n" + 
					"[ChampionLevelTextTemplate]\r\n" + 
					"FontSize=9\r\n" + 
					"FontName=Arial Black\r\n" + 
					"\r\n" + 
					"[ChampionTitleTextTemplate]\r\n" + 
					"FontSize=10\r\n" + 
					"FontName=Arial\r\n" + 
					"\r\n" + 
					"[HealthBarChampionSelfDefault]\r\n" + 
					"PercentageOffset = 0 0.1\r\n" + 
					"HealthOffset = 31 18\r\n" + 
					"PAROffset = 31 30\r\n" + 
					"LoCOffset = 31 38\r\n" + 
					"\r\n" + 
					"HealthBarColor = " + Frame1.selfColor.getRed() + " " + Frame1.selfColor.getGreen() + 
					" " + Frame1.selfColor.getBlue() + " " + Frame1.selfColor.getAlpha()+ "\r\n" + 
					"HealthFadeColor = 255 0 0 255\r\n" + 
					"AllShieldColor = 170 170 170 255 \r\n" + 
					"PhysShieldColor = 255 103 0 255 \r\n" + 
					"MagicShieldColor = 153 0 255 255\r\n" + 
					"\r\n" + 
					"FadeSpeed = 0.5\r\n" + 
					"\r\n" + 
					"LevelTextOffset = 15 34\r\n" + 
					"TitleTextOffset = 75 4\r\n" + 
					"ChatBubbleOffset = 0 0\r\n" + 
					"\r\n" + 
					"[HealthBarChampionSelfSpectator]\r\n" + 
					"PercentageOffset = 0 0.1\r\n" + 
					"HealthOffset = 31 18\r\n" + 
					"PAROffset = 31 30\r\n" + 
					"LoCOffset = 31 38\r\n" + 
					"\r\n" + 
					"HealthBarColor = " + Frame1.specSelfColor.getRed() + " " + Frame1.specSelfColor.getGreen() + 
					" " + Frame1.specSelfColor.getBlue() + " " + Frame1.specSelfColor.getAlpha()+ "\r\n" +
					"HealthFadeColor = 255 0 0 255\r\n" + 
					"AllShieldColor = 170 170 170 255 \r\n" + 
					"PhysShieldColor = 255 103 0 255 \r\n" + 
					"MagicShieldColor = 153 0 255 255\r\n" + 
					"\r\n" + 
					"FadeSpeed = 0.5\r\n" + 
					"\r\n" + 
					"LevelTextOffset = 15 34\r\n" + 
					"TitleTextOffset = 75 4\r\n" + 
					"ChatBubbleOffset = 0 0\r\n" + 
					"\r\n" + 
					"[HealthBarChampionSelfColorblind]\r\n" + 
					"PercentageOffset = 0 0.1\r\n" + 
					"HealthOffset = 31 18\r\n" + 
					"PAROffset = 31 30\r\n" + 
					"LoCOffset = 31 38\r\n" + 
					"\r\n" + 
					"HealthBarColor = " + Frame1.blindSelfColor.getRed() + " " + Frame1.blindSelfColor.getGreen() + 
					" " + Frame1.blindSelfColor.getBlue() + " " + Frame1.blindSelfColor.getAlpha()+ "\r\n" +
					"HealthFadeColor = 255 0 0 255\r\n" + 
					"AllShieldColor = 170 170 170 255 \r\n" + 
					"PhysShieldColor = 255 103 0 255 \r\n" + 
					"MagicShieldColor = 204 164 2 255\r\n" + 
					"\r\n" + 
					"FadeSpeed = 0.5\r\n" + 
					"\r\n" + 
					"LevelTextOffset = 15 34\r\n" + 
					"TitleTextOffset = 75 4\r\n" + 
					"ChatBubbleOffset = 0 0\r\n" + 
					"\r\n" + 
					"[HealthBarChampionFriendlyDefault]\r\n" + 
					"PercentageOffset = 0 0.1\r\n" + 
					"HealthOffset = 32 18\r\n" + 
					"PAROffset = 32 30\r\n" + 
					"LoCOffset = 31 38\r\n" + 
					"\r\n" + 
					"HealthBarColor = " + Frame1.teamColor.getRed() + " " + Frame1.teamColor.getGreen() + 
					" " + Frame1.teamColor.getBlue() + " " + Frame1.teamColor.getAlpha()+ "\r\n" +
					"HealthFadeColor = 255 0 0 255\r\n" + 
					"AllShieldColor = 170 170 170 255 \r\n" + 
					"PhysShieldColor = 255 103 0 255 \r\n" + 
					"MagicShieldColor = 153 0 255 255\r\n" + 
					"\r\n" + 
					"FadeSpeed = 0.5\r\n" + 
					"\r\n" + 
					"LevelTextOffset = 150 34\r\n" + 
					"TitleTextOffset = 78 5\r\n" + 
					"ChatBubbleOffset = 135 0\r\n" + 
					"\r\n" + 
					"[HealthBarChampionFriendlySpectator]\r\n" + 
					"PercentageOffset = 0 0.1\r\n" + 
					"HealthOffset = 32 18\r\n" + 
					"PAROffset = 32 30\r\n" + 
					"LoCOffset = 31 38\r\n" + 
					"\r\n" + 
					"HealthBarColor = " + Frame1.specTeamColor.getRed() + " " + Frame1.specTeamColor.getGreen() + 
					" " + Frame1.specTeamColor.getBlue() + " " + Frame1.specTeamColor.getAlpha()+ "\r\n" +
					"HealthFadeColor = 255 0 0 255\r\n" + 
					"AllShieldColor = 170 170 170 255 \r\n" + 
					"PhysShieldColor = 255 103 0 255 \r\n" + 
					"MagicShieldColor = 153 0 255 255\r\n" + 
					"\r\n" + 
					"FadeSpeed = 0.5\r\n" + 
					"\r\n" + 
					"LevelTextOffset = 150 34\r\n" + 
					"TitleTextOffset = 78 5\r\n" + 
					"ChatBubbleOffset = 135 0\r\n" + 
					"\r\n" + 
					"[HealthBarChampionFriendlyColorblind]\r\n" + 
					"PercentageOffset = 0 0.1\r\n" + 
					"HealthOffset = 32 18\r\n" + 
					"PAROffset = 32 30\r\n" + 
					"LoCOffset = 31 38\r\n" + 
					"\r\n" + 
					"HealthBarColor = " + Frame1.blindTeamColor.getRed() + " " + Frame1.blindTeamColor.getGreen() + 
					" " + Frame1.blindTeamColor.getBlue() + " " + Frame1.blindTeamColor.getAlpha()+ "\r\n" +
					"HealthFadeColor = 255 0 0 255\r\n" + 
					"AllShieldColor = 170 170 170 255 \r\n" + 
					"PhysShieldColor = 255 103 0 255 \r\n" + 
					"MagicShieldColor = 204 164 2 255\r\n" + 
					"\r\n" + 
					"FadeSpeed = 0.5\r\n" + 
					"\r\n" + 
					"LevelTextOffset = 150 34\r\n" + 
					"TitleTextOffset = 78 5\r\n" + 
					"ChatBubbleOffset = 135 0\r\n" + 
					"\r\n" + 
					"[HealthBarChampionEnemyDefault]\r\n" + 
					"PercentageOffset = 0 0.1\r\n" + 
					"HealthOffset = 32 19\r\n" + 
					"PAROffset = 32 30\r\n" + 
					"LoCOffset = 30 38\r\n" + 
					"\r\n" + 
					"HealthBarColor = " + Frame1.enemyColor.getRed() + " " + Frame1.enemyColor.getGreen() + 
					" " + Frame1.enemyColor.getBlue() + " " + Frame1.enemyColor.getAlpha()+ "\r\n" +
					"HealthFadeColor = 255 0 0 255\r\n" + 
					"AllShieldColor = 170 170 170 255 \r\n" + 
					"PhysShieldColor = 255 103 0 255 \r\n" + 
					"MagicShieldColor = 153 0 255 255\r\n" + 
					"\r\n" + 
					"FadeSpeed = 0.5\r\n" + 
					"\r\n" + 
					"LevelTextOffset = 150 34\r\n" + 
					"TitleTextOffset = 78 5\r\n" + 
					"ChatBubbleOffset = 135 0\r\n" + 
					"\r\n" + 
					"[HealthBarChampionEnemySpectator]\r\n" + 
					"PercentageOffset = 0 0.1\r\n" + 
					"HealthOffset = 32 19\r\n" + 
					"PAROffset = 32 30\r\n" + 
					"LoCOffset = 30 38\r\n" + 
					"\r\n" + 
					"HealthBarColor = " + Frame1.specEnemyColor.getRed() + " " + Frame1.specEnemyColor.getGreen() + 
					" " + Frame1.specEnemyColor.getBlue() + " " + Frame1.specEnemyColor.getAlpha()+ "\r\n" +
					"HealthFadeColor = 255 0 0 255\r\n" + 
					"AllShieldColor = 170 170 170 255 \r\n" + 
					"PhysShieldColor = 255 103 0 255 \r\n" + 
					"MagicShieldColor = 153 0 255 255\r\n" + 
					"\r\n" + 
					"FadeSpeed = 0.5\r\n" + 
					"\r\n" + 
					"LevelTextOffset = 150 34\r\n" + 
					"TitleTextOffset = 78 5\r\n" + 
					"ChatBubbleOffset = 135 0\r\n" + 
					"\r\n" + 
					"[HealthBarChampionEnemyColorblind]\r\n" + 
					"PercentageOffset = 0 0.1\r\n" + 
					"HealthOffset = 32 19\r\n" + 
					"PAROffset = 32 30\r\n" + 
					"LoCOffset = 30 38\r\n" + 
					"\r\n" + 
					"HealthBarColor = " + Frame1.blindEnemyColor.getRed() + " " + Frame1.blindEnemyColor.getGreen() + 
					" " + Frame1.blindEnemyColor.getBlue() + " " + Frame1.blindEnemyColor.getAlpha()+ "\r\n" +
					"HealthFadeColor = 255 0 0 255\r\n" + 
					"AllShieldColor = 170 170 170 255 \r\n" + 
					"PhysShieldColor = 255 103 0 255 \r\n" + 
					"MagicShieldColor = 204 164 2 255\r\n" + 
					"\r\n" + 
					"FadeSpeed = 0.5\r\n" + 
					"\r\n" + 
					"LevelTextOffset = 150 34\r\n" + 
					"TitleTextOffset = 78 5\r\n" + 
					"ChatBubbleOffset = 135 0\r\n" + 
					"\r\n" + 
					"[ChampionSelfExperienceBarTemplate]\r\n" + 
					"ExperienceBarMask=xpBarMask.tga\r\n" + 
					"\r\n" + 
					"ExperienceBar=xpBar.tga\r\n" + 
					"ExperienceBarOffsetX = -6 \r\n" + 
					"ExperienceBarOffsetY = 4\r\n" + 
					"\r\n" + 
					"ExeprienceAnimation=experience.ini\r\n" + 
					"ExperienceAnimatinonOffsetX = -9\r\n" + 
					"ExperienceAnimatinonOffsetY = 4\r\n" + 
					"\r\n" + 
					"LevelUpAnimation=LevelUp.ini\r\n" + 
					"LevelUpAnimationOffsetX = -6\r\n" + 
					"LevelUpAnimationOffsetY = 4\r\n" + 
					"\r\n" + 
					"[ChampionFriendlyExperienceBarTemplate]\r\n" + 
					"LevelUpAnimation=LevelUp.ini\r\n" + 
					"LevelUpAnimationOffsetX = 130\r\n" + 
					"LevelUpAnimationOffsetY = 4\r\n" + 
					"\r\n" + 
					"[ChampionEnemyExperienceBarTemplate]\r\n" + 
					"LevelUpAnimation=LevelUp.ini\r\n" + 
					"LevelUpAnimationOffsetX = 130\r\n" + 
					"LevelUpAnimationOffsetY = 4";
 
			//"C:/Riot Games/League of Legends/RADS/solutions/lol_game_client_sln/releases/0.0.0.XXX/deploy/DATA/menu/hud" should be the default
			File file = new File(Frame1.path + "/GeneralCharacterData_Legacy.ini");
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}