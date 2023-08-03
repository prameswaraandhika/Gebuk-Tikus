package com.andhikap.managers;

import com.andhikap.managers.GameManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TextManager {
	static BitmapFont font; // we draw the text to the screen using this variable

	// viewport width and height
	static float width, height;

	public static void initialize(float width, float height) {
		font = new BitmapFont();
		TextManager.width = width;
		TextManager.height = height;
		// set the font color to red
		font.setColor(Color.WHITE);
		// scale the font size according to screen width
		font.getData().setScale(width / 970f);
	}

	public static void displayMessage(SpriteBatch batch) {
		float fontWidth = 10; // get the width of the text being displayed

		// top the score display at top right corner
		font.draw(batch, "Score: " + GameManager.score, width - fontWidth - width / 19f, height * 0.95f);

	}
}