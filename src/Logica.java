import processing.core.PApplet;

public class Logica {

	private int pantallas;
	private PApplet app;
	private CargaDatos datos;
	private int alphaU = 100;

	public Logica() {
		this.app = MainProcras.app;
		datos = new CargaDatos();

	}

	public void pantallas() {

		switch (pantallas) {
		case 0:
			app.image(CargaDatos.login, 0, 0);
			break;

		case 1:
			app.tint(255, 80);
			app.image(CargaDatos.registro, 0, 0);
			break;

		case 2:
			app.tint(255, 80);
			app.image(CargaDatos.regisytoU, 0, 0);
			break;

		case 3:
			app.tint(255, 80);
			app.image(CargaDatos.loginU, 0, 0);
			break;
			
		case 4:
			app.rect(0, 0, app.width, app.height);
			
			break;
		default:
			break;
		}

	}

	public void click() {

		if (app.mouseX > 132 && app.mouseY > 879 && app.mouseX < 517 && app.mouseY < 942 && pantallas == 0) {
			pantallas = 1;

		}

		else if (app.mouseX > 0 && app.mouseY > 0 && app.mouseX < 600 && app.mouseY < 1024 && pantallas == 1) {
			pantallas = 2;
		}

		else if (app.mouseX > 138 && app.mouseY > 829 && app.mouseX < 523 && app.mouseY < 892 && pantallas == 2) {
			pantallas = 3;
		}

	}

}
