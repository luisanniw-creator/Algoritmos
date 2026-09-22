/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

import java.util.Arrays;

/**
 *
 * @author luisa
 */
public class BubbleSort {
    public static void main(String[] arg){
        int[] vector={5,3,8,4,2};
        int comparaciones=0;
        
        for(int i= 0; i <vector.length - 1; i++){
            for(int j=0; j <vector.length -1; j++){
                comparaciones++;
                if(vector [j]> vector[j+1]){
                    int temp = vector[j];
                    vector[j]=vector[j+1];
                   vector[j+1] =temp;
                }
            }
                
            System.out.println("Pasada" + (i+i) + ":" + Arrays.toString(vector));
        }
           System.out.println("Final" + Arrays.toString(vector));
           System.out.println("comparaciones:" + comparaciones);

    }
        
    }