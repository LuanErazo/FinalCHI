import processing.core.PApplet;

public class MainProcras extends PApplet {
	
	 public Logica log;
	 public static PApplet app;
	 
	public static void main(String[] args) {
		PApplet.main("MainProcras");
	}

	@Override
	public void settings() {
		size(650,1024);
		
	}

	@Override
	public void setup() {
		MainProcras.app = this;
		log = new Logica();

	}

	@Override
	public void draw() {
		background(255);
	}
}
