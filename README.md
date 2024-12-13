Ejercicio 01: Validación de Signos

Esta implementación valida si una cadena de texto que contiene únicamente los caracteres (, ), [, ], {, y } tiene una estructura balanceada. Para que una cadena sea válida:

Todos los corchetes, paréntesis o llaves abiertas deben cerrarse en el orden correcto.

Cada tipo de símbolo debe emparejarse correctamente (por ejemplo, ( con )).



Algoritmo

El algoritmo utiliza una estructura de datos tipo pila (Stack) para garantizar que los signos se cierren en el orden inverso al que fueron abiertos. La lógica es la siguiente:

Recorremos cada carácter de la cadena de entrada.

Si el carácter es un signo de apertura ((, {, [), se inserta en la pila.

Si el carácter es un signo de cierre (), }, ]), verificamos:

La pila no debe estar vacía.

El símbolo en la cima de la pila debe coincidir con el tipo de cierre.

Al final del recorrido, la pila debe quedar vacía para que la cadena sea válida.



Ejemplo de Uso

Entrada Válida:

([]){}

Salida:

La cadena es válida.

Entrada Inválida:

({)}

Salida:

La cadena es inválida.

__________________________________________________________________________________________________________________________

Beneficio

Este enfoque garantiza una validación eficiente y precisa, ya que el tiempo de ejecución es lineal (), donde  es la longitud de la cadena. El uso de una pila asegura que el programa siga las reglas de apertura y cierre en orden correcto.