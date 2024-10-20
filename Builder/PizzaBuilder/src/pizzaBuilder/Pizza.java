package pizzaBuilder;

import java.util.List;

public class Pizza {
    private String tipo;
    private String tamaño;
    private String masa;
    private List<String> ingredientes;

    public Pizza(String tipo, String tamaño, String masa, List<String> ingredientes) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.masa = masa;
        this.ingredientes = ingredientes;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getMasa() {
        return masa;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tipo='" + tipo + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", masa='" + masa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}

