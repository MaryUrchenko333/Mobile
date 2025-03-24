import java.util.ArrayList;
import java.util.List;

class Box<T, U, V> {
    private List<T> items1 = new ArrayList<>();
    private List<U> items2 = new ArrayList<>();
    private List<V> items3 = new ArrayList<>();

    public void addItem1(T item) {
        items1.add(item);
    }

    public void addItem2(U item) {
        items2.add(item);
    }

    public void addItem3(V item) {
        items3.add(item);
    }

    public double sumOfNumbers() {
        double sum = 0;
        for (U item : items2) {
            if (item instanceof Number) {
                sum += ((Number) item).doubleValue();
            }
        }
        for (V item : items3) {
            if (item instanceof Number) {
                sum += ((Number) item).doubleValue();
            }
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String, Integer, Float> box = new Box<>();
        box.addItem1("Hello");
        box.addItem2(10);
        box.addItem3(5.5f);

        Box<String, Integer, Float> box2 = new Box<>();
        box2.addItem1("World");
        box2.addItem2(20);
        box2.addItem3(4.5f);

        double totalSum = box.sumOfNumbers() + box2.sumOfNumbers();
        System.out.println("Total sum of numbers: " + totalSum);
    }
}
