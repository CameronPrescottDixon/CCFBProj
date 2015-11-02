package com.ccfb.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

public class Waypoints implements Screen {

    private SpriteBatch spbWay;
    private Array<AISprite> aiSprites;

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
        spbWay.begin();
        spbWay.end();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void show() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        spbWay = new SpriteBatch();
        spOP = new Sprite(new Texture())
        aiSprites = new Array<AISprite>();
        aiSprites.add(new AISprite(sprites, getRandomPath()));
    }

    @Override
    public void hide() {
        dispose();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {
        spbWay.dispose();
    }

}
