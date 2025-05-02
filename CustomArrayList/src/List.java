package generics;

import java.util.Arrays;

public class List <T>{

    private T[] array;
    private int firstFreeIndex;

    public List(){
        this.array = (T[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(T t){
        int newSize = array.length + array.length/2;

        if(firstFreeIndex == array.length){
            T[] newArray = (T[]) new Object[newSize];
            for(int i =0;i< array.length;i++){
                newArray[i] = array[i];
            }
            newArray[firstFreeIndex] = t;
            firstFreeIndex++;
            this.array = newArray;
            return;
        }
        this.array[firstFreeIndex] = t;
        firstFreeIndex++;
    }

    public boolean contains(T t){
        for(int i = 0; i< firstFreeIndex;i++){
            if(array[i] != null && array[i].equals(t)){
                return true;
            }
        }
        return false;
    }

    public int getLength(){
        return this.firstFreeIndex;
    }

    public T get(int index){
        if(index>= firstFreeIndex || index <0){
            System.out.println("Index out of bounds!");
            throw new IndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
            return array[index];


    }

    public int getIndex(T t){
        for(int i= 0; i< firstFreeIndex;i++){
            if(array[i].equals(t)){
                return i;
            }
        }
        return -1;
    }

    public void remove(T t){
        int index = getIndex(t);
        if(index != -1){
            array[index] = null;
            for(int i = index+1; i< array.length;i++){
                array[i-1] = array[i];

            }
            array[firstFreeIndex - 1] = null;
            firstFreeIndex--;
        }
    }

    public String toString(){
        return Arrays.toString(array);
    }
}
