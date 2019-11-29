package modelo;

import processing.core.PApplet;
import processing.core.PImage;

public class Personaje implements Runnable{

	private int posX;
	private int posY;
	private PImage personaje;
	private PImage personaje2;
	private int edad;
	private int numero;
	private PApplet app;
	private boolean isAlive = false;
	public Personaje( PApplet app) {
		this.personaje =  app.loadImage("../data/lisa_simpson.png");
		this.personaje2= app.loadImage("../data/bart_simpson.png");
		this.edad=(int) app.random(1, 10);
		this.posX=(int) app.random(316, 900);
		this.posY=(int) app.random(100, 500);
		this.numero=numero;
		this.personaje=personaje;
		this.app=app;
		 new Thread(this).start();
		
	}
	
	public void pintarPersonaje() {
		app.imageMode(app.CENTER);
		app.image(this.personaje,this.posX, this.posY,80,90);
	
		 
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(isAlive) {
			mover();
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		}
	}

public void mover(){
		posX+=posX+10;
		
	}
	

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public PImage getPersonaje() {
		return personaje;
	}

	public void setPersonaje(PImage personaje) {
		this.personaje = personaje;
	}

	public PImage getPersonaje2() {
		return personaje2;
	}

	public void setPersonaje2(PImage personaje2) {
		this.personaje2 = personaje2;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

}
