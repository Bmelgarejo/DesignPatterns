package pizzaBuilder;

import java.util.ArrayList;
import java.util.List;


public class PizzaBuilder {
    private String tipo;
    private String tamaño;
    private String masa;
    private List<String> ingredientes;

    public PizzaBuilder() {
        ingredientes = new ArrayList<>();
    }

    public PizzaBuilder setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public PizzaBuilder setTamaño(String tamaño) {
        this.tamaño = tamaño;
        return this;
    }

    public PizzaBuilder setMasa(String masa) {
        this.masa = masa;
        return this;
    }

    public PizzaBuilder addIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
        return this;
    }

    public Pizza build() {
        return new Pizza(tipo, tamaño, masa, ingredientes);
    }
}

