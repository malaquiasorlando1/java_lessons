/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_pratica;

/**
 *
 * @author omalaquias
 */
import java.util.Scanner;
public class Exercicio1m {
    public static void main(String[] args)
    {
       Scanner read = new Scanner(System.in);
       int opcoes;
       String operador;
       double n1,n2,result, salario_base, salario_liquido, abono;
       System.out.println("1 - Calculadora Básica\n2- Cálculo do abono salarial\n"
               + "Escolha uma das opções: "); 
       opcoes = read.nextInt();
       switch (opcoes)
       {
           case 1:
               System.out.println("Insira o primeiro número");
               n1 = read.nextDouble();
               System.out.println("Escolha um dos operadores +, -, * , /");
               operador = read.next();
               System.out.println("Insira o segundo número");
               n2 = read.nextDouble();
               switch (operador)
               {
                   case "+":
                       result = n1+ n2;
                       System.out.printf("%.2f + %.2f = %.2f",n1,n2,result);
                       break;
                   case "-":
                       result = n1 - n2;
                       System.out.printf("%.2f - %.2f = %.2f",n1,n2,result);
                       break;
                   case "*":
                       result = n1 * n2;
                       System.out.printf("%.2f * %.2f = %.2f",n1,n2,result);
                       break;
                   case "/":
                       result = n1 / n2;
                       System.out.printf("%.2f / %.2f = %.2f",n1,n2,result);
                       break;
               }
               break;
           case 2:
               System.out.println("Insira o salário base");
               salario_base = read.nextDouble();
               System.out.println("Insira o salário líquido");
               salario_liquido = read.nextDouble();
               abono = salario_liquido - salario_base;
               System.out.println("O abono do funcionário é " + abono);
               break;
           default:
               System.out.println("Escolheu uma opção inválida");
               
       }
    }
}
