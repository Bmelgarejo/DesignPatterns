package pizzaBuilder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new PizzaBuilder()
                .setTipo("Margarita")
                .setTamaño("Grande")
                .setMasa("Delgada")
                .addIngrediente("Queso")
                .addIngrediente("Tomate")
                .build();

        System.out.println(pizza1);

        Pizza pizza2 = new PizzaBuilder()
                .setTipo("Pepperoni")
                .setTamaño("Mediana")
                .setMasa("Gruesa")
                .addIngrediente("Queso")
                .addIngrediente("Pepperoni")
                .addIngrediente("Aceitunas")
                .build();

        System.out.println(pizza2);
    }
}

