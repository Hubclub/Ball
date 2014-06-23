package com.clubhub.ball.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.clubhub.ball.BallGame;

public class DesktopLauncher {
	public static void main (String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		
		cfg.title = BallGame.TITLE + BallGame.VERSION;
		cfg.width = BallGame.WIDTH;
		cfg.height = BallGame.HEIGHT;
		new LwjglApplication(new BallGame(), cfg);
	}
}
