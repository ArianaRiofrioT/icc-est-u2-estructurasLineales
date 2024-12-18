package Ejercicio_02_sorting;

import java.util.Stack;

public class StackSorter {

    // Metodo para ordenar un Stack de forma que los menores queden arriba
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int current = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }
            tempStack.push(current);
        }
        // Copiar los elementos ordenados al Stack original
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    // Metodo main para pruebas
    public static void main(String[] args) {
        System.out.println("Ejecutando StackSorter...");
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack original: " + stack);
        sortStack(stack);
        System.out.println("Stack ordenado: " + stack);
    }
}