package com.ccfb.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Prabh on 2015-11-01.
 */
public class SpriteBatch extends Sprite {
    public SpriteBatch(Sprite sprite) {
        super(sprite);
    }

    public void draw(com.badlogic.gdx.graphics.g2d.SpriteBatch spriteBatch) {
        update(Gdx.graphics.getDeltaTime());
        draw(spriteBatch);
    }
}
