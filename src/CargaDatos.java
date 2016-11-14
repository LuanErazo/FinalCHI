import processing.core.PApplet;
import processing.core.PImage;

public class CargaDatos {

	private PApplet app;
	
	public static PImage login,registro,regisytoU,loginU;
	
	public CargaDatos() {
		this.app = MainProcras.app;
		
		login = app.loadImage("../data/login.png");
		registro = app.loadImage("../data/RegistroVacio.png");
		regisytoU = app.loadImage("../data/RegistroNombres.png");
		loginU = app.loadImage("../data/loginU.png");
	}
}
