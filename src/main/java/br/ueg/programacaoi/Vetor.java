package br.ueg.programacaoi;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class Vetor {

    int vet[];
    String vetString[];
    double mat[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        Vetor v = new Vetor();
        v.vet = new int[]{10, 11, 12, 13, 14, 15};
        for (int i = 0; i < v.vet.length; i++) {
            System.out.println("vetor[" + i + "] = " + v.vet[i]);
        }
        
        v.vetString =  new String[10];
        v.vetString = new String[11];
        
        v.mat = new double[5][5];
        for(int i = 0; i < v.mat.length; i++ ){
            for(int j = 0; j < v.mat[i].length; j++){
                v.mat[i][j] = i * j;
            }
        }
        for(int i = 0; i < v.mat.length; i++ ){
            for(int j = 0; j < v.mat[i].length; j++){
                System.out.print("|" + v.mat[i][j] + "|");
            }
            System.out.println("");
        }
        
    }
}
