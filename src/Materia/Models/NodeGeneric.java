package materia.models;

public class NodeGeneric {
    
    private T value;
    private NodeGeneric<T> next;

        public NodelGeneric(T value) {
            this.value = value;
            this.next = null;
            
    }
    @Override
    public String toString() {
        return "Node"
    }

}
