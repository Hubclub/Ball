package com.clubhub.ball;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;


public class BallGameScreen implements Screen{
	
	private SpriteBatch batch;
	private OrthographicCamera camera;
	private Texture ballImage;
	private Sound ballSound;
	private float ballX;
	private float ballY;
	private float xDirection;
	private float yDirection;
	
	public BallGameScreen() {
		
		batch = new SpriteBatch();
		ballImage = new Texture(Gdx.files.internal("images/blackBall.png"));
		ballSound = Gdx.audio.newSound(Gdx.files.internal("sounds/ballHit.wav"));
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, BallGame.WIDTH, BallGame.HEIGHT);
		
		ballX = MathUtils.random(0, 800f);
		ballY = 280;
		xDirection = 50;
		yDirection = 50;
	}
	
	public void render(float delta) {
		
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(ballImage, ballX, ballY);
		batch.end();
		
		ballX += xDirection * Gdx.graphics.getDeltaTime();
		ballY += yDirection * Gdx.graphics.getDeltaTime();
		
		if(ballX<0||ballX>BallGame.WIDTH-64) {
			xDirection = xDirection * (-1);
			ballSound.play();
		}
		if(ballY<0||ballY>BallGame.HEIGHT-64) {
			yDirection = yDirection * (-1);
			ballSound.play();
		}
		
	}
	
	public void resize(int width, int height) {
		
	}
	
	public void pause() {
		
	}
	
	public void resume() {
		
	}
	
	public void dispose() {
		batch.dispose();
		ballImage.dispose();
		ballSound.dispose();
	}
	
	public void hide() {
		
	}
	
	public void show() {
		
	}
}
