package com.mygdx.libgdxrtsgamecontrols;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.mygdx.libgdxrtsgamecontrols.RTSGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setWindowedMode(GlobalVariables.SCREEN_WIDTH,GlobalVariables.SCREEN_HEIGHT);
		config.setTitle("libgdxrtsgamecontrols");
		new Lwjgl3Application(new RTSGame(), config);
	}
}
