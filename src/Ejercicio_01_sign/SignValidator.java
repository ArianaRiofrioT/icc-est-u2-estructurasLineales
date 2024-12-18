package Ejercicio_01_sign;

import java.util.Stack;

public class SignValidator {

    // Metodo para validar los signos de un string
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[' || c == '<') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']' || c == '>') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!matches(top, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']') ||
               (open == '<' && close == '>');
    }

    public static void main(String[] args) {
        System.out.println("Ejecutando SignValidator...");
        String input1 = "{[()]}";
        String input2 = "{(})";

        System.out.println("Input: " + input1 + " => Output: " + isValid(input1)); // true
        System.out.println("Input: " + input2 + " => Output: " + isValid(input2)); // false
    }
}

