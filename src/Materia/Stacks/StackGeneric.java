package materia.Stacks;

import java.util.EmptyStackException;

import materia.models.NodeGeneric;

public class StackGeneric {

    private NodeGeneric top; //Nodo Generico
    private int size; //Variable tamanio 0(1)

    //Crea una Pila instanciando el nodo top como null y el tamanio en 0
    public StackGeneric() {
        this.top = null;
        this.size = 0;
    }
//Metodo para agregar un elemento a la pila
public <T> void push(T data) {
    NodeGeneric<T> newNode = new NodeGeneric<>(data);
    newNode.setNext(top);

    
}

//Metodo para retiar un elemento de la pila
public T pop() {
    if (isEmpaty()) {
        throw new EmptyStackException();
    }
    T value = top.getValue();
    top = top.getNext();
    size--;
    return value;
}
//Metodo que retorna el valor del node de la cima
public T peek() {
    if (isEmpaty()) {
        throw new EmptyStackException();
    }
    return top-getValue();
}

public boolean isEmpaty() {
    return top == null;
}
}

