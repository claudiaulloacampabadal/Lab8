/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package domain;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Usuario
 */
public class ComplexNGTest {

    public ComplexNGTest() {
    }

    @Test
    public void testSomeMethod() {

        //array1 (mil valores numericos)
        Object array1[] = new Object[1000];
        //array2 (mil palabras)
        Object array2[] = new Object[1000];
        //array3 (mil valores numericos)
        Object array3[] = new Object[1000];
        //array4 (mil palabras)
        Object array4[] = new Object[1000];
        //array5 (mil valores numericos)
        //el array 5 lo manejo como int para poder ordenarlo con radixSort
        int array5[] = new int[1000];
        //array6 (mil palabras)
        Object array6[] = new Object[1000];

        fill("array1",array1);
        fill("array2",array2);
        fill("array3",array3);
        fill("array4",array4);
        fill5("array5",array5);
        fill("array6",array6);
        

        //muestro los primeros 200 elementos de cada array
        //array1
        System.out.println("Array- 1 CONTENT: " + util.Utility.show(array1, 200));
        //array2
        System.out.println("Array- 2 CONTENT: " + util.Utility.show(array2, 200));
        //array3
        System.out.println("Array- 3 CONTENT: " + util.Utility.show(array3, 200));
        //array4
        System.out.println("Array- 4 CONTENT: " + util.Utility.show(array4, 200));
        //array5
        System.out.println("Array- 5 CONTENT: " + util.Utility.show(array5));
        //array6
        System.out.println("Array- 6 CONTENT: " + util.Utility.show(array6, 200));
        
        //ordenamos los arreglos
        Complex sort = new Complex();
        //array 1 ordenado
        if (!isSorted(array1)) {
            sort.quickSort(array1, 0, array1.length - 1);
        }
        System.out.println("Array 1 (QuickSort)" + util.Utility.show(array1, 100));
        //array 2 ordenado
        if (!isSorted(array2)) {
            sort.shellSort(array2);
        }
        System.out.println("Array 2 (shellSort)" + util.Utility.show(array2, 100));

        //array 3 ordenado
        if (!isSorted(array3)) {
            String temp[] = new String[1000];
            sort.mergeSort(array3, temp, 0, array3.length - 1);
        }
        System.out.println("Array 3 (mergeSort)" + util.Utility.show(array3, 100));
        //array 4 ordenado
        if (!isSorted(array4)) {
            sort.shellSort(array4);
        }
        System.out.println("Array 4 (shellSort)" + util.Utility.show(array4, 100));
        
        //array 5 ordenado   
        if (!isSorted(array5)) {
            sort.radixSort(array5, 0);
        }
        System.out.println("Array 5 (radixSort)" + util.Utility.show(array5));

        //array 6 ordenado
        if (!isSorted(array6)) {
            String temp2[] = new String[1000];
            sort.mergeSort(array6, temp2, 0, array6.length - 1);
        }
        System.out.println("Array 6 (mergeSort)" + util.Utility.show(array6, 100));
        
         //buscamos los 20 elementos en cada array
         //array1
        Search s = new Search();
        for (int i = 0; i < 20; i++) {
            Object object = array1[i];
            Object value = util.Utility.random();
            int pos = s.binarySearch(array1, value);
            System.out.println(pos != -1
                    ? "Iteractive Binary Search. ARRAY1\n"
                    + "The value [" + value + "] exists at position: " + pos
                    : "The value [" + value + "] does not exist"
            );
            pos = s.binarySearch(array1, value, 0, array1.length-1);
        System.out.println(pos!=-1
                   ?"Recursive Binary Search. ARRAY1\n"
                   +"The value ["+value+"] exists at position: "+pos
                   :"The value ["+value+"] does not exist"
        );
        }
        
        //array2
        Search s2 = new Search();
        for (int i = 0; i < 20; i++) {
            Object object = array2[i];
            String word = GenerarPalabra();
            int pos = s2.binarySearch(array2, word);
            System.out.println(pos != -1
                    ? "Iteractive Binary Search. ARRAY2\n"
                    + "The word [" + word + "] exists at position: " + pos
                    : "The word [" + word + "] does not exist"
            );
            pos = s2.binarySearch(array2, word, 0, array2.length-1);
        System.out.println(pos!=-1
                   ?"Recursive Binary Search. ARRAY2\n"
                   +"The word ["+word+"] exists at position: "+pos
                   :"The word ["+word+"] does not exist"
        );
        }
        
        //array3
        Search s3 = new Search();
        for (int i = 0; i < 20; i++) {
            Object object = array3[i];
            Object value = util.Utility.random();
            int pos = s3.binarySearch(array3, value);
            System.out.println(pos != -1
                    ? "Iteractive Binary Search. ARRAY3\n"
                    + "The value [" + value + "] exists at position: " + pos
                    : "The value [" + value + "] does not exist"
            );
            pos = s3.binarySearch(array3, value, 0, array3.length-1);
        System.out.println(pos!=-1
                   ?"Recursive Binary Search. ARRAY3\n"
                   +"The value ["+value+"] exists at position: "+pos
                   :"The value ["+value+"] does not exist"
        );
        }
        
        //array4
        Search s4 = new Search();
        for (int i = 0; i < 20; i++) {
            Object object = array4[i];
            String word = GenerarPalabra();
            int pos = s4.binarySearch(array4, word);
            System.out.println(pos != -1
                    ? "Iteractive Binary Search. ARRAY4\n"
                    + "The word [" + word + "] exists at position: " + pos
                    : "The word [" + word + "] does not exist"
            );
            pos = s4.binarySearch(array4, word, 0, array4.length-1);
        System.out.println(pos!=-1
                   ?"Recursive Binary Search. ARRAY4\n"
                   +"The word ["+word+"] exists at position: "+pos
                   :"The word ["+word+"] does not exist"
        );
        }
        
         //array5
        Search s5 = new Search();
        for (int i = 0; i < 20; i++) {
            Object object = array5[i];
            int value = util.Utility.random();
            int pos = s5.binarySearch(array5, value);
            System.out.println(pos != -1
                    ? "Iteractive Binary Search. ARRAY5\n"
                    + "The value [" + value + "] exists at position: " + pos
                    : "The value [" + value + "] does not exist"
            );
            pos = s5.binarySearch(array5, value, 0, array5.length-1);
        System.out.println(pos!=-1
                   ?"Recursive Binary Search. ARRAY5\n"
                   +"The value ["+value+"] exists at position: "+pos
                   :"The value ["+value+"] does not exist"
        );
        }
        
         //array6
        Search s6 = new Search();
        for (int i = 0; i < 20; i++) {
            Object object = array6[i];
            String word = GenerarPalabra();
            int pos = s6.binarySearch(array6, word);
            System.out.println(pos != -1
                    ? "Iteractive Binary Search. ARRAY6\n"
                    + "The word [" + word + "] exists at position: " + pos
                    : "The word [" + word + "] does not exist"
            );
            pos = s6.binarySearch(array6, word, 0, array6.length-1);
        System.out.println(pos!=-1
                   ?"Recursive Binary Search. ARRAY6\n"
                   +"The word ["+word+"] exists at position: "+pos
                   :"The word ["+word+"] does not exist"
        );
        }
    }

   private void fill(String name, Object[] a) {
        switch (name) {
            case "array1"://enteros
                for (int i = 0; i < a.length; i++) {
                    a[i] = util.Utility.random() + " , ";
                }             
                break;
            case "array2"://palabras
                for (int i = 0; i < a.length; i++) {
                    a[i]=" "+GenerarPalabra()+",";
                }
                break;  
            case "array3"://enteros
                for (int i = 0; i < a.length; i++) {
                    a[i] = util.Utility.random() + " , ";
                } 
                break;
             case "array4"://palabras
                for (int i = 0; i < a.length; i++) {
                    a[i]=" "+GenerarPalabra()+",";
                }
                break;
            case "array5"://enteros
                for (int i = 0; i < a.length; i++) {
                    a[i] = util.Utility.random() + " , ";
                }
                break;
            case "array6"://palabras
                for (int i = 0; i < a.length; i++) {
                    a[i]=" "+GenerarPalabra()+",";
                }
                break;
              
        }
    }//end fillArrays
   
   //creo un metodo que recibe un int para array5 que tiene que ser int para ordenarlo con radixSort
    public void fill5(String name, int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = util.Utility.random();
        }
    }
           

   //nos genera palabras aleatorias
    public String GenerarPalabra(){		
        String[] palabras = {"Luna", "sol", "Playa", "Francia", "Colombia", "Futbol", "Hockey", "Nubes", "Agua", "Amor", "Tristeza"};
        String palabra = "";
        //Generamos palabra
        for (int i = 0; i < palabras.length; i++) {
            palabra = palabras[(int) (Math.random() * (9))];
        }
        return palabra;
    }
    

      private boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (util.Utility.greaterT(a[i], a[i + 1])) {
                return false;
            }
        }
        return true;
    }//end is Sorted
       
    private boolean isSorted(Object[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (util.Utility.greaterT(a[i], a[i + 1])) {
                return false;
            }
        }
        return true;
    }//end is Sorted
}
