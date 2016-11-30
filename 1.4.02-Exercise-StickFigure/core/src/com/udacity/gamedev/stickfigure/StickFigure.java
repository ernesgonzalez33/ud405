package com.udacity.gamedev.stickfigure;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

/**
 * TODO: Start here
 *
 * In this exercise you'll set up a ShapeRenderer, and use it to draw a stick figure. At minimum,
 * you'll need a circle for the head, and five lines for the torso, arms, and legs.
 *
 * Remember to set up a ShapeRenderer you'll need to declare it, initialize it, and dispose of it.
 * Then to actually use the ShapeRenderer you'll need to start a batch of the appropriate type, draw
 * your shapes, and end the batch.
 *
 * We don't have step-by-step TODOs for this one, since the aim is for you to remember the steps for
 * setting up a ShapeRenderer and be able to set one up on your own. Of course, the solution is
 * available if you run into anything confusing.
 */
public class StickFigure extends ApplicationAdapter {

    ShapeRenderer renderer;

    @Override
    public void create() {

        renderer = new ShapeRenderer();

    }

    @Override
    public void dispose() {

        renderer.dispose();

    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //Hago la cabeza
        renderer.begin(ShapeRenderer.ShapeType.Filled);
        renderer.setColor(Color.WHITE);
        renderer.circle(150, 300, 50);
        renderer.end();

        //Hago el torso
        renderer.begin(ShapeRenderer.ShapeType.Line);
        Vector2 torsoArriba = new Vector2(150, 250);
        Vector2 torsoAbajo = new Vector2(150, 100);
        renderer.line(torsoArriba, torsoAbajo);

        //Hago los brazos
        Vector2 hombroDerecho = new Vector2(150, 200);
        Vector2 manoDerecha = new Vector2(200, 180);
        renderer.line(hombroDerecho, manoDerecha);

        Vector2 hombroIzquierdo = new Vector2(150, 200);
        Vector2 manoIzquierda = new Vector2(100, 180);
        renderer.line(hombroIzquierdo, manoIzquierda);

        //Hago las piernas
        Vector2 musloDerecho = new Vector2(150, 100);
        Vector2 pieDerecho = new Vector2(200, 80);
        renderer.line(musloDerecho, pieDerecho);

        Vector2 musloIzquierdo = new Vector2(150, 100);
        Vector2 pieIzquierdo = new Vector2(100, 80);
        renderer.line(musloIzquierdo, pieIzquierdo);

        renderer.end();

    }
}
