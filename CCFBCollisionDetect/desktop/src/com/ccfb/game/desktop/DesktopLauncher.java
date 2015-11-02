package com.ccfb.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ccfb.game.CollisionDetect;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "CCFBCollisionDetect";
		config.useGL30 = true;
		config.width = 1280;
		config.height = 1280;
		new LwjglApplication(new CollisionDetect(), config);
	}
}
