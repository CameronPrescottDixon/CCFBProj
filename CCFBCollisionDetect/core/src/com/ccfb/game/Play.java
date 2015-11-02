package com.ccfb.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class Play implements Screen {

    private TiledMap tdMap;
    private OrthogonalTiledMapRenderer otdRender;
    private OrthographicCamera orthoCam;

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
        otdRender.setView(orthoCam);
        otdRender.render();
    }

    @Override
    public void resize(int width, int height) {
        orthoCam.viewportWidth = width;
        orthoCam.viewportHeight = height;
        orthoCam.update();
    }

    @Override
    public void show() {
        tdMap = new TmxMapLoader().load("maps/MAPANT2.tmx");
        otdRender = new OrthogonalTiledMapRenderer(tdMap);
        orthoCam = new OrthographicCamera();
    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {
        tdMap.dispose();
        otdRender.dispose();
    }

}
