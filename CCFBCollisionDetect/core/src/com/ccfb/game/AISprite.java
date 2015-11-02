package com.ccfb.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class AISprite extends com.ccfb.game.SpriteBatch {

    private Vector2 v2Velocity = new Vector2();
    private float fSpeed = 100, fAngle;
    private Array<Vector2> arvPath;
    private int nWayPoint = 0;

    public AISprite(Sprite sprite, Array<Vector2> arvPath) {
        super(sprite);
        this.arvPath = arvPath;
    }

    public void update(float delta) {
        fAngle = (float) Math.atan2(arvPath.get(nWayPoint).y - getY(), arvPath.get(nWayPoint).x - getX());
        v2Velocity.set((float) Math.cos(fAngle) * fSpeed, (float) Math.sin(fAngle) * fSpeed);
        setPosition(getX() + v2Velocity.x * delta, getY() + v2Velocity.y * delta);
        setRotation(fAngle * MathUtils.radDeg);
    }

}

