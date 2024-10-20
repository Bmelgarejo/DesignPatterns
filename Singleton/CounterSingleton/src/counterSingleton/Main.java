package counterSingleton;

public class Main {

    public static void main(String[] args) {

        Counter counter = Counter.getInstance();
        
        counter.increment();
        counter.increment();
        counter.increment();
        
        System.out.println("Valor del contador: " + counter.getCount());

        Counter anotherCounter = Counter.getInstance();
        anotherCounter.increment();

        System.out.println("Valor del contador (segunda referencia): " + anotherCounter.getCount());
    }
}

