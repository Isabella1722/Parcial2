package vista;

import modelo.Logica;
import processing.core.PApplet;

public class Main extends PApplet{

	Logica logica;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	public void settings () {
		size(1000,800);
	}
	
	public void setup () {
		  logica =new Logica(this);
	
	}
	
	public void draw () {
		background(255);
		logica.pintar();
		
	}
	
	public void mousePressed() {
		System.out.print(mouseX + " " + mouseY + "\n");
		logica.pintarP();
	}
}
