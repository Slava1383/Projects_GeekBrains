package Lesson_3;

import java.util.Arrays;

public class Lesson_3 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 1;
            }else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[100];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] < 6){
                arr2[i] = arr2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr2));

        int[][] arrX = new int[6][6];
        for(int i = 0; i < arrX.length; i++){
            for(int j = 0; j < arrX[i].length; j++){
                if(arrX[i] == arrX[j]){
                    System.out.print("1");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int[] maxMin = {4, 5, 3, 8, 0, 6, 9};
        int max = 0;
        int min = 0;
        for(int i = 0; i < maxMin.length; i++){
            if(maxMin[i] < maxMin[i] + 1){
                max = maxMin[i];
            }else if(maxMin[i] > maxMin[i] + 1){
                min = maxMin[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        arrLen(7, 5);
    }

    public static void arrLen(int len, int initialValue) {
        int[] arrValue = new int[len];
        for(int i = 0; i < arrValue.length; i++){
            arrValue[i] = initialValue;
        }
        System.out.println(Arrays.toString(arrValue));
    }
}
