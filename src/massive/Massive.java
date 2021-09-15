/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massive;

import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class Massive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Работа с одномерным массивом");
        int[] array1;
        array1 = new int[5];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;
        int[] array2 = array1;
        System.out.print("array1 = ");
        System.out.print("[");
        for (int i=0; i<array1.length; i++){
            System.out.print(array1[i]);
            System.out.print(", ");
        }
        System.out.println("]");

        System.out.print("array2 = ");
        System.out.print("[");
        for (int i=0; i<array2.length; i++){
            System.out.print(array2[i]);
            System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.println("Добавление ячейки");
        int[] newArray1 = new int[7];
        for(int i=0;i<array1.length; i++){
            newArray1[i]=array1[i];
        } 
        System.out.print("newArray1 = ");
        System.out.print("[");
        for(int i=0; i<newArray1.length; i++){
            System.out.print(newArray1[i]);
            System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.println("Использование методa arraycopy() из класса System");
        int[] newArray2 = new int[7];
        System.arraycopy(array2, 0, newArray2, 0, array2.length);
        System.out.print("newArray2 = ");
        System.out.print("[");
        for (int i=0; i<newArray2.length; i++){
            System.out.print(newArray2[i]);
            System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.println("Использование класса arrays");
        Arrays.fill(array1,5);
        System.out.print("array1 = ");
        System.out.print("[");
        for (int i=0; i<array1.length; i++){
            System.out.print(array1[i]);
            System.out.print(", ");
        }
        System.out.println("]");
        
        Arrays.fill(newArray1, 0, 4, 3);
        Arrays.fill(newArray1, 5, 6, 30);
        System.out.println("newArray1 = "+Arrays.toString(newArray1));
        
        System.out.println("Сравнение двух массивов: ");
        System.out.println("array1 эквивалентен array2: "+Arrays.equals(array1, array2));
        System.out.println("newArray1 эквивалентен newArray2: "+Arrays.equals(newArray1, newArray2));


    }
    
}
