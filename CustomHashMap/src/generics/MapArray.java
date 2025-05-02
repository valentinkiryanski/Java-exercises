package generics;
import java.util.List;
import java.util.ArrayList;

public class MapArray <K,V>{

    private List<Node<K,V>>[] nodes;
    private int totalIndexes = 0;
    private int totalFullIndexes = 0;
    @SuppressWarnings("unchecked")
    public MapArray(){
        this.nodes = (ArrayList<Node<K,V>>[]) new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            nodes[i] = new ArrayList<>();
        }

    }

    public void put(K key,V value){
        Node <K,V>n = new Node(key,value);
        int nextSize = nodes.length + nodes.length/2;
        if(totalIndexes >= nodes.length){
            List<Node<K,V>>[] newNodes = new ArrayList[nextSize];
            for(int i =0; i< nodes.length;i++){
                    newNodes[i] = new ArrayList<>();
            }
            for(int i =0; i< nodes.length;i++){
                for(Node<K,V> node : getNodesAtIndex(i)){
                    int newIndex = Math.abs(node.getKey().hashCode() % newNodes.length);
                    newNodes[newIndex].add(node);
                }
            }
            this.nodes = newNodes;
        }
        if(totalIndexes < nodes.length){
            boolean isEqual = false;
            int keyIndex = (Math.abs(key.hashCode() % length()));
            if(!nodes[keyIndex].isEmpty()){
                for(Node<K,V> node : getNodesAtIndex(keyIndex)){
                    if(keyIndex == (Math.abs(node.getKey().hashCode() % nodes.length))){
                        if(!node.getKey().equals(n.getKey())){
                            isEqual = false;
                        }else if(node.getKey().equals(n.getKey())){
                            nodes[keyIndex].remove(node);
                            isEqual = true;
                        }
                    }
                }
                if(!nodes[keyIndex].isEmpty()){
                    if(!isEqual){
                        nodes[keyIndex].add(n);
                    }if(isEqual){
                        nodes[keyIndex].add(n);
                    }
                }

            } if(nodes[keyIndex].isEmpty()){
                nodes[keyIndex].add(n);
                totalIndexes++;
            }
        }
    }

    public int length(){
        return this.nodes.length;
    }

    public List<Node<K,V>> getNodesAtIndex(int index){

        if(this.nodes[index] != null){
            return this.nodes[index];
        }
        return null;
    }

    public V get(K key){
        int keyIndex  = Math.abs(key.hashCode() % nodes.length);
        if(nodes[keyIndex] != null){
            for(Node<K,V> node : nodes[keyIndex]){
                if(node.getKey().equals(key)){
                    return node.getValue();
                }
            }
        }
        return null;
    }

    public V remove(K key){
        int keyIndex = Math.abs(key.hashCode() % nodes.length);
        if(!nodes[keyIndex].isEmpty()){
            for(Node <K,V> node : getNodesAtIndex(keyIndex)){
                if(node.getKey().equals(key)){
                    V value = node.getValue();
                    nodes[keyIndex].remove(node);
                    if(nodes[keyIndex].isEmpty()){
                        totalIndexes--;
                    }
                    return value;
                }
            }
        }
        return null;
    }

    public boolean containsKey(K key){
        int keyIndex = Math.abs(key.hashCode() % nodes.length);
        if(!nodes[keyIndex].equals(null)){
            for(Node node : getNodesAtIndex(keyIndex)){
                if(node.getKey().equals(key)){
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean isEmpty(){
        for(List<Node<K,V>> n: nodes){
            if(!n.equals(null)){
                return false;
            }
        }
        return true;
    }

    public int size(){
        return this.totalIndexes;
    }


}
