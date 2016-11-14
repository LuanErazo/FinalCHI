import processing.core.PApplet;

public class MainProcras extends PApplet {
	
	Logica log;
	
	public static void main(String[] args) {
		PApplet.main("MainProcras");
	}

	@Override
	public void settings() {
		size(650,1024);
		
	}

	@Override
	public void setup() {
		log = new Logica(this);

	}

	@Override
	public void draw() {
		background(255);
	}
}
