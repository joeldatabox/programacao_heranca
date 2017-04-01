package br.ueg.programacaoi;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        boolean a1= false;
        
        
        
        
        System.out.println("Qual o valor do lado A?");
        a = sc.nextInt();
        System.out.println("Qual o valor do lado B?");
        b = sc.nextInt();
        System.out.println("Qual o valor do lado C?");
        c = sc.nextInt();
        
        if((a > (b + c)) || (b > (c+a)) || (c > (a+b))){
            System.out.println("As medidas informadas não forma um triangulo");
        }else{
            System.out.println("As medidas informadas forma um triangulo");
        }
    }
}
