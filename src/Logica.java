import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PVector;

public class Logica {

	private int pantallas;
	private PApplet app;
	private CargaDatos datos;
	private int alphaU = 100;
	private int fondos, huevos;
	private PVector posBarra;
	private float barra;
	private boolean dia;

	public Logica() {
		this.app = MainProcras.app;
		datos = new CargaDatos();
		fondos = 1;
		huevos = 1;
		dia = true;
		pantallas = 4;
		barra = app.width - 80;
		posBarra = new PVector(barra, 0);

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

			if (fondos == 1) {
				app.tint(255, 255);

				app.image(CargaDatos.bien, 0, 0);
			}

			if (fondos == 2) {
				app.image(CargaDatos.medio, 0, 0);
			}

			if (fondos == 3) {
				app.image(CargaDatos.mal, 0, 0);
			}

			app.imageMode(PConstants.CENTER);

			if (huevos == 1) {
				app.image(CargaDatos.huevosuper, 325, 716);
			}
			if (huevos == 2) {
				app.image(CargaDatos.huevobien, 350, 755);
			}

			if (huevos == 3) {
				app.image(CargaDatos.huevomedio, 325, 755);
			}
			if (huevos == 4) {
				app.image(CargaDatos.huevomal, 325, 755);
			}
			app.tint(255, 80);

			app.image(CargaDatos.menu, 88, 77);
			app.image(CargaDatos.evento, 88, 251);
			app.image(CargaDatos.tarea, 88, 393);
			app.image(CargaDatos.mundo, 88, 937);
			if (dia == false) {
				app.image(CargaDatos.semana, 483, 77);
			}
			if (dia == true) {
				app.image(CargaDatos.dia, 483, 77);
			}

			app.shapeMode(PConstants.CENTER);
			app.shape(CargaDatos.linea, posBarra.x, posBarra.y);

			app.imageMode(PConstants.CORNER);
			break;
		default:
			break;
		}

	}

	public void click(float x, float y) {

		if (x > 132 && y > 879 && x < 517 && y < 942 && pantallas == 0) {
			pantallas = 1;

		}

		else if (y > 0 && y > 0 && x < 600 && y < 1024 && pantallas == 1) {
			pantallas = 2;
		}

		else if (x > 138 && y > 829 && x < 523 && y < 892 && pantallas == 2) {
			pantallas = 3;
		} else if (x > 132 && y > 767 && x < 517 && y < 829 && pantallas == 3) {
			pantallas = 4;
		}

		if (pantallas == 4) {
			if (PApplet.dist(x, y, 483, 77) < 40) {
				dia = !dia;
			}

			if (x > (app.width - 80) - CargaDatos.linea.width / 2
					&& x < (barra) + CargaDatos.linea.width / 2) {
//				movBarra(x, y);
				System.out.println("entro");
			}
		}

	}

	public void movBarra(float x, float y) {
		PVector mouse = new PVector(x,y);
		PVector dir = PVector.sub(mouse, posBarra);
		posBarra.add(0,dir.y);
//		PVector mouse = new PVector(x, y);
//		PVector mouseD = new PVector(x, y);
//		PVector dir = PVector.sub(posBarra, mouse);
//		if (mouseD.y < dir.y) {
//			posBarra.sub(mouseD);
//		}
	}

	public void flechas() {

		if (app.keyCode == 39) {
			fondos++;
			if (fondos > 3) {
				fondos = 1;
			}
		}

		if (app.keyCode == 37) {
			huevos++;
			if (huevos > 4) {
				huevos = 1;
			}
		}
	}

}
