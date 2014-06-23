package com.clubhub.ball;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainMenuScreen implements Screen{
	
	private BitmapFont font;
	private SpriteBatch batch;
	private final BallGame game;
	private OrthographicCamera camera;
	
	public MainMenuScreen(BallGame game) {
		
		this.game = game;
		font = new BitmapFont();
		batch = new SpriteBatch();
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, BallGame.WIDTH, BallGame.HEIGHT);
	}
	
	public void render(float delta) {
		
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		font.draw(batch, "Simple Ball Collision", 380, 200);
		font.draw(batch, "Press anywhere to start", 380, 100);
		batch.end();
		
		if(Gdx.input.isTouched()) {
			game.setScreen(new BallGameScreen());
			this.dispose();
		}
	}
	
	public void resize(int width, int height) {

	}
	
	public void resume() {
		
	}
	
	public void pause() {
		
	}
	
	public void dispose() {
		font.dispose();
		batch.dispose();
	}
	
	public void hide() {
		
	}
	
	public void show() {
		
	}
	

}
