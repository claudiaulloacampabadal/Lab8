package domain;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import static util.Utility.show;

/**
 *
 * @author Claudia
 */
public class ElementaryNGTest {

    public ElementaryNGTest() {

    }

    //CORRECIONES: 
    //1. En el array 3 se debe recorrer de menor a mayor, o sea por ej: -10, -9, -8 etc, y lo está recorriendo así: -8, -9, -10
    //2. Hacer el array 6 de palabras
    //Compruebe el funcionamiento de la clase “Elementary” a través de una prueba unitaria
    //(Unit Testing), de la siguiente forma:
    //a. Cree, instancie y llene 6 arreglos de la siguiente forma: array1 (mil números enteros),
    //array2 (mil letras del alfabeto), array3 (mil números negativos), array4 (mil números
    //pares), array5 (mil números impares), array6 (mil palabras).
    //b. Muestre el contenido de los primeros 200 elementos de cada a
    @Test
    public void testSomeMethod() {
        //a. Cree, instancie y llene 6 arreglos de la siguiente forma:

        //array1 (mil números enteros)
        Object array1[] = new Object[1000];
        //array2 (mil letras del alfabeto)
        Object array2[] = new Object[1000];
        //array3 (mil números negativos)
        Object array3[] = new Object[1000];
        //array4 (mil números pares)
        Object array4[] = new Object[1000];
        //array5 (mil números impares)
        Object array5[] = new Object[1000];
        //array6 (mil palabras)
        Object array6[] = new Object[1000];

        fillArrays("array1", array1);
        fillArrays("array2", array2);
        fillArrays("array3", array3);
        fillArrays("array4", array4);
        fillArrays("array5", array5);
        fillArrays("array6", array6);

        //b. Muestre el contenido de los primeros 200 elementos de cada arreglo por consola.
        System.out.println("Array 1 of integers = " + show(array1, 200));
        System.out.println("Array 2 of letters = " + show(array2, 200));
        System.out.println("Array 3 of negative numbers = " + show(array3, 200));
        System.out.println("Array 4 of even numbers = " + show(array4, 200));
        System.out.println("Array 5 of odd numbers = " + show(array5, 200));
        System.out.println("Array 6 of words = " + show(array6, 200));

        //c. Cree e instancie un objeto tipo Elementary llamado “sort.
        Elementary sort = new Elementary();

        //Utilice el método anterior, compruebe y ordene cada arreglo indicado de acuerdo a los siguientes criterios:
        //i. Si array1 no está ordenado, proceda a ordenarlo utilizando el algoritmo “bubbleSort”.
        System.out.println("Ordered Arrays \n");

        //i. Si array1 no está ordenado, proceda a ordenarlo utilizando el algoritmo “bubbleSort”.
        if (!isSorted(array1)) {
            sort.bubbleSort(array1);
        }
        System.out.println("Array 1 of integers = " + show(array1, 200));

        //ii. Si array2 no está ordenado, proceda a ordenarlo utilizando el algoritmo “improvedBubbleSort”
        if (!isSorted(array2)) {
            sort.improvedBubbleSort(array2);
        }
        System.out.println("Array 2 of letters = " + show(array2, 200));

        //iii. Si array3 no está ordenado, proceda a ordenarlo utilizando el algoritmo “selectionSort”
        if (!isSorted(array3)) {
            sort.selectionSort(array3);
        }
        System.out.println("Array 3 of negative numbers = " + show(array3, 200));

        //iv. Si array4 no está ordenado, proceda a ordenarlo utilizando el algoritmo “bubbleSort”
        if (!isSorted(array4)) {
            sort.bubbleSort(array4);
        }
        System.out.println("Array 4 of even numbers = " + show(array4, 200));

        //v. Si los arrays 5 y 6 no están ordenados, proceda a ordenarlos utilizando cualquier algoritmo elemental de ordenamiento.
        if (!isSorted(array5)) {
            sort.improvedBubbleSort(array5);
        }
        System.out.println("Array 5 of odd numbers = " + show(array5, 200));
        if (!isSorted(array6)) {
            sort.selectionSort(array6);
        }
        System.out.println("Array 6 of words = " + show(array6, 200));

    }//END TEST

    private void fillArrays(String name, Object[] a) {
        switch (name) {

            case "array1"://enteros
                for (int i = 0; i < a.length; i++) {
                    a[i] = util.Utility.random() + " , ";

                }

                break;
            case "array2"://letras
                for (int i = 0; i < a.length; i++) {
                    a[i] = util.Utility.randomLetter() + " , ";
                }

                break;
            case "array3"://negativos
                for (int i = 0; i < a.length; i++) {
                    a[i] = -util.Utility.random() + " , ";
                }
                break;
            case "array4"://pares
                for (int i = 0; i < a.length; i++) {
                    int n = util.Utility.random();
                    if ((n % 2) == 0) {
                        a[i] = n + " , ";
                    } else {
                        a[i] = n + 1;
                    }

                }
                break;
            case "array5"://impares
                for (int i = 0; i < a.length; i++) {
                    int n = util.Utility.random();
                    if ((n % 2) != 0) {
                        a[i] = n + " , ";
                    } else {
                        a[i] = n + 1;
                    }

                }

                break;
            //acá iria el array 6 
        }

    }//end fillArrays

    private String show(Object[] a, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += a[i] + "";
        }
        return result;
    }//end show

    private boolean isSorted(Object[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (util.Utility.greaterT(a[i], a[i + 1])) {
                return false;
            }
        }
        return true;
    }//end is Sorted

}//END END
