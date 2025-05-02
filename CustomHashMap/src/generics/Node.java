package generics;

public class Node <K,V>{

    K key;
    V value;

    public Node(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString(){
        return this.key + " key " + this.value + " value";
    }
}
