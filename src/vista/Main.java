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
		logica.pintarP();
		logica.moverP();
		
	}
	
	public void mousePressed() {
		System.out.print(mouseX + " " + mouseY + "\n");
		
		if (mouseX >= 700 && mouseX <= 851 && mouseY >= 701 && mouseY <= 778) {
			cursor(HAND);
			logica.agregarP();
		}
		
		if (mouseX >= 40 && mouseX <= 118 && mouseY >= 749 && mouseY <= 789) {
			cursor(HAND);
		//natural
		}
		
		if (mouseX >= 151 && mouseX <= 228 && mouseY >= 751 && mouseY <= 789) {
			cursor(HAND);
		//parcial
		}


	}
}
