import processing.core.PApplet;

public class Logica {
	
	private int pantallas;
	private PApplet app;
	private CargaDatos datos;
	
	public Logica() {
		this.app = MainProcras.app;
		datos = new CargaDatos();
		
	}
	
	public void pantallas(){
		
		switch (pantallas) {
		case 0:
			app.image(CargaDatos.login, 0, 0);
			break;
			
		case 2:
//			app.image(img, a, b);
			break;

		default:
			break;
		}
	
		
		
	}
	
	
	

}
