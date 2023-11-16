package pr21.second;

import java.util.Arrays;

public class Second<T> {
    private T[] arr;
    private int size;


    Second(int size) {
        this.size = size;
        T[] newArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = null;
        }
        this.arr = newArr;
    }


    Second(int size, T[] thisArr) {
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
