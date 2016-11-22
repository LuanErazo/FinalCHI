import processing.core.PApplet;

public class Logica {

	private int pantallas ;
	private PApplet app;
	private CargaDatos datos;
	private int alphaU = 100;
	private int fondos,huevos;
	private boolean dia;

	public Logica() {
		this.app = MainProcras.app;
		datos = new CargaDatos();
		fondos = 1;
		huevos = 1;
		dia = true;

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
				app.image(CargaDatos.bien, 0, 0);
			}

			if (fondos == 2) {
				app.image(CargaDatos.medio, 0, 0);
			}

			if (fondos == 3) {
				app.image(CargaDatos.mal, 0, 0);
			}

			app.imageMode(app.CENTER);
			
			if(huevos==1){
				app.image(CargaDatos.huevosuper, 325, 716);
			}
			if(huevos==2){
				app.image(CargaDatos.huevobien, 350, 755);
			}
			
			if(huevos==3){
				app.image(CargaDatos.huevomedio, 325, 755);
			}
			if(huevos==4){
				app.image(CargaDatos.huevomal, 325, 755);
			}
			
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

			app.imageMode(app.CORNER);
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
		} else if (app.mouseX > 132 && app.mouseY > 767 && app.mouseX < 517 && app.mouseY < 829 && pantallas == 3) {
			pantallas = 4;
		}

		else if (PApplet.dist(app.mouseX, app.mouseY, 483, 77) < 40 && pantallas == 4) {
			dia = false;

		
		}

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
