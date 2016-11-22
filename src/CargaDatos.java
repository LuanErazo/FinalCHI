import processing.core.PApplet;
import processing.core.PImage;

public class CargaDatos {

	private PApplet app;
	
	public static PImage login,registro,regisytoU,loginU;
	
	public static PImage dia,evento,menu,mundo,semana,tarea;
	
	public static PImage bien,medio,mal;
	
	public static PImage huevosuper,huevobien,huevomedio,huevomal;
	
	public CargaDatos() {
		this.app = MainProcras.app;
		
		login = app.loadImage("../data/login.png");
		registro = app.loadImage("../data/RegistroVacio.png");
		regisytoU = app.loadImage("../data/RegistroNombres.png");
		loginU = app.loadImage("../data/loginU.png");
		
		dia = app.loadImage("../data/dia.png");
		evento = app.loadImage("../data/evento.png");
		menu = app.loadImage("../data/menu.png");
		mundo = app.loadImage("../data/mundo.png");
		semana = app.loadImage("../data/semana.png");
		tarea = app.loadImage("../data/tarea.png");
		
		bien = app.loadImage("../data/fondobien.png");
		medio = app.loadImage("../data/fondomedio.png");
		mal = app.loadImage("../data/fondomal.png");
		
		huevosuper = app.loadImage("../data/huevoultra.png");
		huevobien = app.loadImage("../data/huevobien.png");
		huevomedio = app.loadImage("../data/huevosad.png");
		huevomal = app.loadImage("../data/huevomalmal.png");
	}
}
