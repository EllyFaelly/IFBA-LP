package atividade1;

import java.util.Scanner;

public class Rafaelle3 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro intervalo de tempo:");
       
        System.out.print("Horas: ");
        int horas1 = scanner.nextInt();
        System.out.print("Minutos: ");
        int minutos1 = scanner.nextInt();
        System.out.print("Segundos: ");
        int segundos1 = scanner.nextInt();

        System.out.println("Digite o segundo intervalo de tempo:");
        
        System.out.print("Horas: ");
        int horas2 = scanner.nextInt();
        System.out.print("Minutos: ");
        int minutos2 = scanner.nextInt();
        System.out.print("Segundos: ");
        int segundos2 = scanner.nextInt();

        int somaHoras = horas1 + horas2;
        int somaMinutos = minutos1 + minutos2;
        int somaSegundos = segundos1 + segundos2;

        int diferencaHoras = Math.abs(horas1 - horas2);
        int diferencaMinutos = Math.abs(minutos1 - minutos2);
        int diferencaSegundos = Math.abs(segundos1 - segundos2);

        
        System.out.println("\nA soma dos intervalos de tempo é de:");
        System.out.println(somaHoras + ":" + somaMinutos + ":" + somaSegundos);

        System.out.println("\nA diferença dos intervalos de tempo é de:");
        System.out.println(diferencaHoras + ":" + diferencaMinutos + ":" + diferencaSegundos);
        
         scanner.close();
    }    
    
}
