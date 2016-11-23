import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PVector;

public class Logica {

	private int pantallas;
	private PApplet app;
	private CargaDatos datos;
	private int alphaU;
	private int fondos, huevos;
	private PVector posBarra;
	private float barra, mundoX, mundoY, eventoX, eventoY, imgY;
	private boolean dia;
	private int imgDosY;

	public Logica() {
		this.app = MainProcras.app;
		datos = new CargaDatos();
		fondos = 1;
		huevos = 1;
		dia = true;
		pantallas = 4;
		alphaU = 150;
		barra = app.width - 80;
		mundoX = 88;
		mundoY = 937;

		imgY = 0;

		eventoX = 88;
		eventoY = 251;

		posBarra = new PVector(barra, 0);

	}

	public void pantallas() {

		switch (pantallas) {
		case 0:
			app.image(CargaDatos.login, 0, 0);
			break;

		case 1:
			app.tint(255, alphaU);
			app.image(CargaDatos.registro, 0, 0);
			break;

		case 2:
			app.tint(255, alphaU);
			app.image(CargaDatos.regisytoU, 0, 0);
			break;

		case 3:
			app.tint(255, alphaU);
			app.image(CargaDatos.loginU, 0, 0);
			break;

		case 4:
			app.tint(255, 255);
			if (fondos == 1) {
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
			pantallaCuatroImg();
			app.imageMode(PConstants.CORNER);
			break;

		case 5:
			app.tint(255, 255);
			if (fondos == 1) {
				app.image(CargaDatos.calendarG, 0 - 57, 0);
			}

			if (fondos == 2) {
				app.image(CargaDatos.calendarR, 0 - 57, 0);
			}

			if (fondos == 3) {
				app.image(CargaDatos.calendarM, 0, 0);
			}

		case 6:
			app.image(CargaDatos.entrega, 0, imgY);
			app.imageMode(PConstants.CENTER);
			app.image(CargaDatos.botonera, app.width / 2, imgY + 1240);
			app.imageMode(PConstants.CORNER);
			movImg();

			break;

		case 7:
			app.image(CargaDatos.recomendacion, 0, 0);
			break;

		case 8:
			app.image(CargaDatos.programado, 0, 0);

			if (app.frameCount % (60 * 4) == 0) {
				pantallas = 4;
			}
			break;
		case 9:
			app.image(CargaDatos.tareas, 0, imgDosY);
			app.imageMode(PConstants.CENTER);
			app.image(CargaDatos.botonera, app.width / 2, imgDosY + 740);
			app.imageMode(PConstants.CORNER);
			movImg();
			break;
		case 10:
			app.image(CargaDatos.recomendacionT, 0, 0);

			break;
		case 11:
			app.image(CargaDatos.programadoT, 0, 0);
			if (app.frameCount % (60 * 4) == 0) {
				pantallas = 4;
			}
			break;
		default:
			break;
		}
	}

	private void movImg() {
		if (app.mouseY > app.height - 200) {
			imgY -= 4;

		}
		if (imgY <= CargaDatos.entrega.height * -1) {
			imgY = CargaDatos.entrega.height * -1;
		}

		if (app.mouseY < 200) {
			imgY += 4;
			if (imgY >= CargaDatos.entrega.height) {
				imgY = CargaDatos.entrega.height;
			}

		}

		if (app.mouseY > app.height - 200) {
			imgDosY -= 4;

		}
		// if (imgDosY <= CargaDatos.entrega.height * -1) {
		// imgDosY = CargaDatos.entrega.height * -1;
		// }
		//
		if (app.mouseY < 200) {
			imgDosY += 4;
			// if (imgDosY >= CargaDatos.entrega.height) {
			// imgDosY = CargaDatos.entrega.height;
			// }

		}
	}

	private void pantallaCuatroImg() {
		app.tint(255, alphaU);

		app.image(CargaDatos.menu, 88, 77);
		app.image(CargaDatos.evento, eventoX, eventoY);
		app.image(CargaDatos.tarea, 88, 393);
		app.image(CargaDatos.mundo, mundoX, mundoY);
		app.image(CargaDatos.linea, posBarra.x, posBarra.y);
		if (dia == false) {
			app.image(CargaDatos.semana, 483, 77);
		}
		if (dia == true) {
			app.image(CargaDatos.dia, 483, 77);
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
			if (PApplet.dist(x, y, mundoX, mundoY) < CargaDatos.mundo.height / 2) {
				pantallas = 5;
			}

			if (PApplet.dist(x, y, eventoX, eventoY) < CargaDatos.mundo.height / 2) {
				pantallas = 6;
			}

			if (PApplet.dist(x, y, 89, 391) < 40) {
				pantallas = 9;
			}

		}

		if (PApplet.dist(x, y, 323, 746) < 40 && pantallas == 6) {
			pantallas = 7;
		}

		if (PApplet.dist(x, y, 326, 803) < 80 && pantallas == 9) {
			pantallas = 10;
		}

		if (x > 48 && y > 309 && x < 542 && y < 363 && pantallas == 7) {
			pantallas = 8;

		}

		if (x > 56 && y > 313 && x < 538 && y < 364 && pantallas == 10) {
			pantallas = 11;

		}

	}

	public void movBarra(float x, float y) {
		if (pantallas == 4) {
			if (x > (app.width - 80) - CargaDatos.linea.width / 2 && x < (barra) + CargaDatos.linea.width / 2) {
				PVector mouse = new PVector(x, y);
				PVector dir = PVector.sub(mouse, posBarra);
				posBarra.add(0, dir.y);
			}
		}
	}

	public void flechas() {
		System.out.println(app.keyCode);
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
		if (app.keyCode == 8) {
			if (pantallas == 5) {
				pantallas = 4;
			}
		}
	}

}
