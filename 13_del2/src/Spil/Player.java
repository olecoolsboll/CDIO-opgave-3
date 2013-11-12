package Spil;

import java.awt.Color;

public class Player
{
	private String name;
	private int position; 
	private Color color;
	
	//Når et spiller object initialiseres gives et navn og en farve(mellem 1 og 6)
	public Player(String name, Color color)
	{
		this.name = name;
		this.color = color;
	}
	
	//returnerer spillerens navn
	public String getName()
	{
		return name;		
	}
	
	public void setPosition(int pos)
	{
		position = pos;
	}
	
	public int getPosition()
	{
		return position;
	}
	
	//returnerer spillerens farve
	public Color getColor()
	{
		return color;
	}

}
