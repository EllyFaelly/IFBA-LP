/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelle1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Rafaelle1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da Prova 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da Prova 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota da Prova 3: ");
        double nota3 = scanner.nextDouble();

        
        double media = (nota1 + nota2 + nota3) / 3;

       
        if (media >= 7.0) {
            System.out.println("Você foi Aprovado! Sua média é: " + media);
        } else {
            
            System.out.print("Digite a nota de Recuperação: ");
            double recuperacao = scanner.nextDouble();

            
            double novaMedia = (media + recuperacao) / 2;

            
            if (novaMedia >= 5.0) {
                System.out.println("Está na recuperação! Sua média é: " + novaMedia);
            } else {
                System.out.println("Você foi Reprovado! Sua nova média é: " + novaMedia);
            }
        }

        
        scanner.close();
    }

    }
    
