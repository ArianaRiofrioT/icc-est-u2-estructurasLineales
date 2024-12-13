package materia.Stacks;

import java.util.LinkedList;

public class CustomStack<T> {
    private LinkedList<T> stack;

    public CustomStack() {
        stack = new LinkedList<>();
    }

    // Método para agregar un elemento al stack
    public void push(T item) {
        stack.push(item);
        System.out.println("Elemento " + item + " agregado a la pila");
    }

    // Método para obtener el elemento en la cima sin eliminarlo
    public T peek() {
        return stack.peek();
    }

    // Método para retirar un elemento de la pila
    public T pop() {
        return stack.pop();
    }

    // Método para obtener el tamaño del stack
    public int getSize() {
        return stack.size();
    }

    // Método para imprimir los elementos del stack
    public void printStack() {
        System.out.println("Elementos en la pila:");
        for (T item : stack) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
