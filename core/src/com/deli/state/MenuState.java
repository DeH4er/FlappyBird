package com.deli.state;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.deli.FlappyBirdGame;

/**
 * Created by denys on 28.04.17.
 */
public class MenuState extends State {
    private Texture bg;
    private Texture playBtn;

    public MenuState(GameStateManager gameStateManager) {
        super(gameStateManager);
        bg = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.begin();
        spriteBatch.draw(bg, 0,0, FlappyBirdGame.WIDTH, FlappyBirdGame.HEIGHT);
        spriteBatch.draw(playBtn, (FlappyBirdGame.WIDTH / 2) - (playBtn.getWidth() / 2), FlappyBirdGame.HEIGHT / 2);
        spriteBatch.end();
    }

    @Override
    public void dispose() {
        bg.dispose();
        playBtn.dispose();
    }
}
