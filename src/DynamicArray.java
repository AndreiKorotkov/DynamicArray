package com.epam.Adrei_Korotkov.java.lesson4.task1;

/**
 * created by Andrei_Korotkov 8/8/2019
 */
public class DynamicArray<T> { //T как тип объекта


    public Object[] array;

    public int size = 0;

    public DynamicArray(int innSize) {
        this.array = new Object[innSize];
    }

    public T get(int i) {
        return (T) array[i];
    }

    public void add(T t) {
        if (array.length <= size) {
            Object[] tmp = array;
            array = new Object[size * 2];
            for (int i = 0; i < tmp.length; i++) {
                array[i] = tmp[i];
            }
        }
        array[size] = t;
        size++;
    }

    public void remove(int e) {

        Object[] tmp = array;
        array = new Object[array.length - 1];
        for (int i = 0; i < e; i++) {
            array[i] = tmp[i];
        }
        for (int i = e + 1; i < tmp.length; i++) {
            array[i - 1] = tmp[i];
        }

    }

    @Override
    public String toString() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        return "";
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        DynamicArray<Integer> myArray = new DynamicArray<>(5);

        myArray.add(0);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);

        System.out.println(myArray.get(5));

        myArray.remove(5);

        System.out.println(myArray.get(5));

        System.out.println(myArray.toString());

    }
}
