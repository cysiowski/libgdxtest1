package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class GameObject extends Rectangle {
	private Texture img;

	public GameObject(Texture tex)
	{
		this.img = tex;
	}
	public Texture getImg() {
		return img;
	}

	
	
}
