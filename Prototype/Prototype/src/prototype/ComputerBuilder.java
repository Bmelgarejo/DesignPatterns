package prototype;

public class ComputerBuilder {

    private Computer computer;

    // Constructor que inicializa con el procesador obligatorio
    public ComputerBuilder(String processor) {
        computer = new Computer();
        computer.setProcessor(processor);
    }

    // Método para establecer la tarjeta gráfica
    public ComputerBuilder setGraphic(String graphic) {
        computer.setGraphic(graphic);
        return this;  // Devuelve el propio builder para encadenamiento
    }

    // Método para establecer la frecuencia del procesador
    public ComputerBuilder setGhz(double ghz) {
        computer.setGhz(ghz);
        return this;
    }

    // Método para establecer la placa madre
    public ComputerBuilder setMotherBoard(String motherBoard) {
        computer.setMotherBoard(motherBoard);
        return this;
    }

    // Método para establecer si tiene RAM en GB
    public ComputerBuilder setGbRam(boolean gbRam) {
        computer.setGbRam(gbRam);
        return this;
    }

    // Método para establecer el color del equipo
    public ComputerBuilder setColor(String color) {
        computer.setColor(color);
        return this;
    }

    // Método para establecer el layout del teclado
    public ComputerBuilder setKeyLayout(String keyLayout) {
        computer.setKeyLayout(keyLayout);
        return this;
    }

    // Método para establecer el almacenamiento en GB
    public ComputerBuilder setGbHd(double gbHd) {
        computer.setGbHd(gbHd);
        return this;
    }

    // Método para establecer la pantalla
    public ComputerBuilder setScreen(String screen) {
        computer.setScreen(screen);
        return this;
    }

    // Método para devolver la instancia construida
    public Computer build() {
        return computer;
    }
}
