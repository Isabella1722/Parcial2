package modelo;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logica {
	private PApplet app;
	private Personaje p;
	private LinkedList<Personaje> personajes;
	private OrdenarPorEdad edadComp;
	private int[ ] personajesAgregados;
	public Logica(PApplet app) {
		// TODO Auto-generated constructor stub

		personajes = new LinkedList<Personaje>();
		this.app = app;
		personajesAgregados = new  int[4];
		edadComp=new OrdenarPorEdad();
	}

	public void pintar() {
		// Boton de crear
		app.fill(0);
		app.rect(700, 700, 150, 80);
		app.textSize(30);
		app.fill(255);
		app.text("CREAR", 730, 750);

		// Boton de ordenarr natural
		app.fill(0);
		app.rect(39, 750, 80, 40);
		app.textSize(30);
		app.fill(255);
		app.text("N", 65, 778);

		// Boton de ordenar parcial
		app.fill(0);
		app.rect(150, 750, 80, 40);
		app.textSize(30);
		app.fill(255);
		app.text("P", 186, 778);

	}

	public void pintarP() {
		for (int i = 0; i < personajes.size(); i++) {
			// personaje.pintarPersonaje();
			personajes.get(i).pintarPersonaje();
		

		}

	}
	
	public void moverP() {
		for (int i = 0; i < personajes.size(); i++) {
			personajes.get(i).mover();
		

		}

	}
	
	public void agregarP() {
		Personaje p =new Personaje (app);
		personajes.add(p);
		
		
	}
	
	
	public void arregloP(){
		//for (int i = 0; i < personajesAgregados.length; i++) {
			
	//	}
		
	}
	public void ordenarEdad() {
		Collections.sort(personajes,edadComp);
		
	}

	public void ordenarNum() {
		
		
	}
	
	

}
