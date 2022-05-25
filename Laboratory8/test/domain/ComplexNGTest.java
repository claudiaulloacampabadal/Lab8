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

        String array2[] = new String[10];

        fill(array2);

        //muestro los primeros 200 elementos
        System.out.println("Array- 2 CONTENT: " + util.Utility.show(array2, 9));
        Complex sort = new Complex();
        sort.quickSort(array2, 0, array2.length-1);

        System.out.println("Array 2 (QuickSort)" + util.Utility.show(array2, 9));
        
        fill(array2);
        System.out.println("Array 2 CONTENT: "+ util.Utility.show(array2, 9));
        String temp[] = new String[10];
        sort.mergeSort(array2, temp, 0, array2.length-1);
    
    
    }
   
    private void fill(String[] a) {
        a[0] = "Rojo";
        a[1] = "Mar";
        a[2] = "Tierra";
        a[3] = "Luna";
        a[4] = "Perro";
        a[5] = "Gato";
        a[6] = "Futbol";
        a[7] = "Basket";
        a[8] = "Hola";
        a[9] = "Mundo";
    }

}
