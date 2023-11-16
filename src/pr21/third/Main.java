package pr21.third;

import pr21.second.Second;

public class Main {
    public static void main(String[] args) {
        Third<Integer> arr1 = new Third<>(3, new Integer[]{1, 2, 3});
        Third<String> arr2 = new Third<>(3, new String[]{"s1", "s2", "s3"});
        System.out.println(arr1.getByIndex(2));
        System.out.println(arr2.getByIndex(4));
        System.out.println(arr2.getByIndex(1));
    }
}
