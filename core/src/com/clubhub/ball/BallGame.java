package com.clubhub.ball;

import com.badlogic.gdx.Game;

public class BallGame extends Game {
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 400;
	public static final String TITLE = "BallTest";
	public static final String VERSION = "0.0.0.01";
	
	public void create() {
		this.setScreen(new MainMenuScreen(this));
	}
	
	public void render() {
		super.render();
	}
	
	public void resize(int width, int height) {
		super.resize(width, height);
	}
	
	public void resume() {
		super.resume();
	}
	
	public void pause() {
		super.pause();
	}
	
	public void dispose() {
		super.dispose();
	}
	
}