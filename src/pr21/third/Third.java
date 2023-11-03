package pr21.third;

import java.util.Arrays;

public class Third<T> {
    private T[] arr;
    private int size;


    Third(int size) {
        this.size = size;
        T[] newArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = null;
        }
        this.arr = newArr;
    }


    Third(int size, T[] thisArr) {
        this.size = size;
        T[] newArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = thisArr[i];
        }
        this.arr = newArr;
    }


    public int getSize() {
        return size;
    }


    public T[] getArr() {
        return arr;
    }


    public void setSize(int size) {
        this.size = size;
    }


    public void setArr(T[] arr) {
        this.arr = arr;
    }


    public T getByIndex(int index) {
        if (index >= this.size || index < 0) {
            System.out.println("Неверный индекс!");
            return arr[0];
        }
        else {
            return this.arr[index];
        }
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    @Override
    public String toString() {
        return "second{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
}
