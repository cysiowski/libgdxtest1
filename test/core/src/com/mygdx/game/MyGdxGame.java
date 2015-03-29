package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;
	private Texture pionek;
	private BitmapFont font;
	private GameObject gameObject1;

	@Override
	public void create() {
		img = new Texture("Teeko_board.jpg");
		pionek = new Texture("pionek.png");
		batch = new SpriteBatch();
		font = new BitmapFont();
		gameObject1 = new GameObject(pionek);
	}

	@Override
	public void render() {
		update();
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		font.draw(batch, "Teeko v0.25", 200, 550);
		batch.draw(img, 0, 0, 500, 500);
		batch.draw(gameObject1.getImg(), gameObject1.x, gameObject1.y, 50, 50);

		batch.end();
	}

	private void update() {
		if (Gdx.input.isKeyPressed(Keys.UP) && gameObject1.y<=400) {
			gameObject1.y += 500 * Gdx.graphics.getDeltaTime();
		}
		if (Gdx.input.isKeyPressed(Keys.DOWN) && gameObject1.y>0) {
			gameObject1.y -= 100 * Gdx.graphics.getDeltaTime();
		}
		if (Gdx.input.isKeyPressed(Keys.LEFT) && gameObject1.x>0) {
			gameObject1.x -= 100 * Gdx.graphics.getDeltaTime();
		}
		if (Gdx.input.isKeyPressed(Keys.RIGHT) && gameObject1.x<=400) {
			gameObject1.x += 100 * Gdx.graphics.getDeltaTime();
		}

	}

	@Override
	public void dispose() {
		batch.dispose();
		font.dispose();
		img.dispose();
	}
}
