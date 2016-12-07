package com.udacity.gamedev.applicationadaptertogame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

/**
 *
 * MyScreen is now ready. Next we'll set up MyGame to make use of MyScreen
 *
 */

public class MyScreen implements Screen {

    SpriteBatch batch;
    BitmapFont font;
    ScreenViewport viewport;

    @Override
    public void show() {

        batch = new SpriteBatch();
        font = new BitmapFont();
        font.getData().setScale(2);
        font.getRegion().getTexture().setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        viewport = new ScreenViewport();

    }

    @Override
    public void render(float delta) {

        viewport.apply();
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.setProjectionMatrix(viewport.getCamera().combined);
        batch.begin();

        font.draw(batch, "Hello from " + this.getClass().getSimpleName(),
                viewport.getWorldWidth() / 2,
                viewport.getWorldHeight() / 2,
                0,
                Align.center,
                false);

        batch.end();

    }

    @Override
    public void resize(int width, int height) { viewport.update(width, height, true); }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

        batch.dispose();
        font.dispose();

    }

    @Override
    public void dispose() {

    }
}
