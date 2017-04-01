package br.ueg.programacaoi;

import java.util.Scanner;

public class Matriz {

    Scanner sc;
    int mat[][];
    int matT[][];

    public static void main(String[] args) {
        Matriz m = new Matriz();
        m.sc = new Scanner(System.in);
        //m.mat = new int[][]

        System.out.println("Quantas colunas tera a matriz?");
        int col = m.sc.nextInt();
        System.out.println("Quantas linhas tera a matriz?");
        int lin = m.sc.nextInt();

        m.mat = new int[col][lin];

        for (int i = 0; i < m.mat.length; i++) {
            for (int j = 0; j < m.mat[i].length; j++) {
                System.out.println("Informe o valor [" + (i+1) + "][" + (j+1) + "]");
                m.mat[i][j] = m.sc.nextInt();
            }
            System.out.println("");
        }

        System.out.println("imprimindo a matriz");
        m.imprimeMatriz(m.mat);
        
        System.out.println("fazendo a transposta ");
        m.matT = new int[lin][col];

        for (int i = 0; i < m.mat.length; i++) {
            for (int j = 0; j < m.mat[i].length; j++) {
                m.matT[j][i] = m.mat[i][j];
            }
        }

        System.out.println("imprimindo a matriz");
        m.imprimeMatriz(m.matT);
    }
    
    void imprimeMatriz(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("|" + mat[i][j] + "|");
            }
            System.out.println("");
        }
    }
}
