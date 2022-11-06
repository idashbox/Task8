package Task8;

import java.util.Arrays;

public class Prog {
    public static void main(String[] args) {
        shift(Tests.test5, 2);
        shift(Tests.test1, 2);
        shift(Tests.test2, 1);
        shift(Tests.test3, 2);
        shift(Tests.test4, 4);
    }
    public static void shift(int[][] array, int n){
        int [][] array_prob = new int [array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            int [] prob = new int [array[0].length];
            for (int j = 0; j < array[i].length; j++) {
                prob[j] = array[i][j];
            }
            array_prob[i] = prob;
        }
        int [][] array_prob2 = new int [array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            int [] prob = new int [array[0].length];
            for (int j = 0; j < array[i].length; j++) {
                prob[j] = array[i][j];
            }
            array_prob2[i] = prob;
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (j >= n){
                    array_prob[i][j-n] = array[i][j];
                }
                if (j < n){
                    array_prob[i][array[i].length - n + j] = array[i][j];
                }
            }
            array_prob2[(i+n)%array.length] = array_prob[i];
        }
        for (int[] ints : array_prob2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
