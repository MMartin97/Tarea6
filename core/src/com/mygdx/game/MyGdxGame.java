package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class MyGdxGame extends ApplicationAdapter {

	private MarioPolling mario;
    private SpriteBatch batch;

	@Override
	public void create () {

        mario = new MarioPolling();
        batch = new SpriteBatch();








	}

	@Override
	public void render () {

        mario.update();

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        //String messageMario = "Mario esta :("+mario.getPosition().x+","+mario.getPosition().y+")";

        batch.begin();

        batch.draw(mario.getTexture(), mario.getPosition().x, mario.getPosition().y, 75, 75);

        batch.end();



	}
    public void	 dispose(){
        batch.dispose();
        mario.getTexture().dispose();
    }
}


