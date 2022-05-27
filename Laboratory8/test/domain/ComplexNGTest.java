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
        Object array5[] = new Object[1000];
        //array6 (mil palabras)
        Object array6[] = new Object[1000];

        fill("array1",array1);
        fill("array2",array2);
        fill("array3",array3);
        fill("array4",array4);
        fill("array5",array5);
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
        System.out.println("Array- 5 CONTENT: " + util.Utility.show(array5, 200));
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
        //array 5 ordenado INCOMPLETO
        //sort.radixSort(a, 0);
        //array 6 ordenado
        if (!isSorted(array6)) {
            String temp2[] = new String[1000];
            sort.mergeSort(array6, temp2, 0, array6.length - 1);
        }
        System.out.println("Array 6 (mergeSort)" + util.Utility.show(array6, 100));

        //System.out.println("Array 2 (shellSort)" + util.Utility.show(array2, 100));
//        System.out.println("Array 2 CONTENT: "+ util.Utility.show(array2, 9));
//        String temp[] = new String[10];
//        sort.mergeSort(array2, temp, 0, array2.length-1);

    
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

   //nos genera palabras aleatorias
    public String GenerarPalabra(){		
		String palabra = "";
		//La longitud de la palabra la decidimos al azar
		int longitud = (int)(Math.random() * 9) + 1;
		//Generamos palabra
		for (int i=0; i<longitud; i++){
			int codigoAscii = (int)Math.floor(Math.random()*(122 -
					97)+97);

			//para pasar el código a carácter lo hago con hacer un cast a char
			palabra = palabra + (char)codigoAscii;
		}
		return palabra;
	}
    
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
}
