package builder;

public class Computer {

	private String processor;
	private String graphic;
	private double ghz;
	private String motherBoard;
	private boolean gbRam;
	private String color;
	private String keyLayout;
	private double gbHd;
	private String screen;
	
	public Computer() {
			
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getGraphic() {
		return graphic;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}

	public double getGhz() {
		return ghz;
	}

	public void setGhz(double ghz) {
		this.ghz = ghz;
	}

	public String getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
	}

	public boolean isGbRam() {
		return gbRam;
	}

	public void setGbRam(boolean gbRam) {
		this.gbRam = gbRam;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getKeyLayout() {
		return keyLayout;
	}

	public void setKeyLayout(String keyLayout) {
		this.keyLayout = keyLayout;
	}

	public double getGbHd() {
		return gbHd;
	}

	public void setGbHd(double gbHd) {
		this.gbHd = gbHd;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	@Override
	public String toString() {
		return "Computer [processor=" + processor + ", graphic=" + graphic + ", ghz=" + ghz + ", motherBoard="
				+ motherBoard + ", gbRam=" + gbRam + ", color=" + color + ", keyLayout=" + keyLayout + ", gbHd=" + gbHd
				+ ", screen=" + screen + "]";
	}
	

	
	
}
