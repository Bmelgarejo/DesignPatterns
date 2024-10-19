package builder;

public class Main {

	public static void main(String[] args) {
		
		Computer computer = new ComputerBuilder("Intel I7")
				.setColor("Black").setGbRam(true).build();
		
	   System.out.print(computer.toString());

	}

}
