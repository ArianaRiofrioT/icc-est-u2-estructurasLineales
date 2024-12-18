VALIDACIÓN DE SIGNOS Y ORDENAMIENTO DE STACK

Este repositorio contiene dos ejercicios implementados en Java que hacen uso de estructuras de datos como pilas (Stack) para resolver problemas comunes de validación y ordenación.

---

## Ejercicio 1: `SignValidator`

Este programa valida si una cadena de texto contiene signos de apertura y cierre correctamente balanceados. Los signos considerados son:

- Paréntesis: `()`
- Llaves: `{}`
- Corchetes: `[]`
- Ángulos: `<>`

**Uso del código:**
1. El método principal es `isValid(String s)`, que toma como entrada una cadena.
2. Se utiliza una pila para mantener los signos de apertura.
3. Cuando se encuentra un signo de cierre, se verifica si coincide con el último signo de apertura almacenado en la pila.
4. Al final, si la pila está vacía, significa que todos los signos están balanceados correctamente.

**Ejemplo de ejecución:**
```java
Input: "{[()]}"   => Output: true
Input: "{(})"     => Output: false
```
__________________________________________________________________________________________________________________________

## Ejercicio 2: `StackSorter`

**Descripción:**
Este programa implementa un algoritmo para ordenar una pila (Stack) de números enteros de manera que los valores menores queden en la parte superior.

**Uso del código:**
1. El método principal es `sortStack(Stack<Integer> stack)`, que toma como entrada una pila desordenada.
2. Se utiliza una pila temporal para almacenar los elementos en orden.
3. Los elementos de la pila original se reorganizan hasta que estén completamente ordenados.
4. Finalmente, los elementos ordenados se copian de vuelta a la pila original.

**Ejemplo de ejecución:**
```java
Stack original: [5, 1, 4, 2, 3]
Stack ordenado: [1, 2, 3, 4, 5]
```


___________-----------------------_______________________________----------------------_________________________________

- Ambos programas hacen un uso eficiente de las pilas para resolver problemas prácticos.
- Se recomienda familiarizarse con la clase `Stack` de Java para comprender mejor la implementación.
