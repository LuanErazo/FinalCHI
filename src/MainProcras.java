import processing.core.PApplet;

public class MainProcras extends PApplet {

	public Logica log;
	public static PApplet app;

	public static void main(String[] args) {
		PApplet.main("MainProcras");
	}

	@Override
	public void settings() {
		size(650, 1024);

	}

	@Override
	public void setup() {
		MainProcras.app = this;
		log = new Logica();

	}

	@Override
	public void draw() {
		// background(35,47,65);
		log.pantallas();
		
	}

	@Override
	public void mousePressed() {

		log.click(mouseX, mouseY);

	}

	@Override
	public void mouseDragged() {
		log.movBarra(mouseX, mouseY);
	}

	@Override
	public void keyPressed() {
		log.flechas();

	}

}
