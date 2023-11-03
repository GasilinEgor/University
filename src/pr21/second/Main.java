package pr21.second;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Double[] arr2 = {4.5, 6.7, 8.9};
        String[] arr3 = {"w1", "w2", "w3"};
        Second<Integer> newArr1 = new Second<>(arr1.length, arr1);
        Second<Double> newArr2 = new Second<>(arr2.length, arr2);
        Second<String> newArr3 = new Second<>(arr3.length, arr3);
        newArr1.print();
        newArr2.print();
        newArr3.print();
    }
}
