package br.com.Calculadora;

import java.util.Scanner;

public class Calculadora {
    //função principal
    public Calculadora(){
        menu();
    }
    
    //menu inicial
    public void menu(){
        System.out.println("*****************");
        System.out.println("***Calculadora***");
        System.out.println("*****************");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
        escolha();
    }
    
    //escolhe a opção do menu
    public void escolha(){
        Scanner escolha = new Scanner(System.in);
        int n = escolha.nextInt();
        operacao(n);
    }
    
    //operações de soma, subtração, divisão e multiplicação
    public void operacao(int n){
        switch(n){
            case 1:
                System.out.println("Escolheu Soma.");
                double soma = pegarNum1()+pegarNum2();
                System.out.println("O resultado da Soma: "+soma);
                break;
            case 2:
                System.out.println("Escolheu Subtração");
                double sub = pegarNum1()-pegarNum2();
                System.out.println("O resultado da Soma: "+sub);
                break;
            case 3:
                System.out.println("Escolheu Divisão");
                double div = pegarNum1()/pegarNum2();
                System.out.println("O resultado da Soma: "+div);
                break;
            case 4:
                System.out.println("Escolheu Multiplicação");
                double mult = pegarNum1()*pegarNum2();
                System.out.println("O resultado da Soma: "+mult);
                break;
            case 5:
                System.out.println("Escolheu Sair");
                System.exit(0);
            
            default: 
                System.out.println("Escolha errada!");
                menu();
        }
    }
    
    
    //pega o primeiro número que vai operar
    public double pegarNum1(){
        System.out.print("Escolha o primeiro número: ");
        Scanner num1 = new Scanner(System.in);
        double a = num1.nextInt();
        
        return a;
    }
    
    //pega o segundo número que vai operar
    public double pegarNum2(){
        System.out.print("Escolha o segundo número: ");
        Scanner num2 = new Scanner(System.in);
        double b = num2.nextInt();
        
        return b;
    }
    
    //função principal, inicia o programa
    public static void main(String args[]){
        new Calculadora();
    }
}
