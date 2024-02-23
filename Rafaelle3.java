
package rafaelle3;

import java.util.Scanner;

public class Rafaelle3 {

   
    public static void main(String[] args) {
        int solicitarnumero;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro intervalo de tempo:");
        int solicitarnumero = scannner.NextInt();
        int horas1 = solicitarnumero("Horas: " + scanner);
        int minutos1 = solicitarnumero("Minutos: " + scanner);
        int segundos1 = solicitarnumero("Segundos: " + scanner);
        
        System.out.println("Digite o segundo:");
        int horas2 = solicitarnumero("Horas: " + scanner);
        int minutos2 = solicitarnumero("Minutos: " + scanner);
        int segundos2 = solicitarnumero("Segundos: " + scanner);

        
        int somaHoras = horas1 + horas2;
        int somaMinutos = minutos1 + minutos2;
        int somaSegundos = segundos1 + segundos2;

       
        int diferencaHoras = Math.abs(horas1 - horas2);
        int diferencaMinutos = Math.abs(minutos1 - minutos2);
        int diferencaSegundos = Math.abs(segundos1 - segundos2);

        
        System.out.println("\nA soma dos intervalos de tempo é de:");
        System.out.println("Horas: " + somaHoras);
        System.out.println("Minutos: " + somaMinutos);
        System.out.println("Segundos: " + somaSegundos);

        System.out.println("\nA diferença dos intervalos de tempo é de:");
        System.out.println("Horas: " + diferencaHoras);
        System.out.println("Minutos: " + diferencaMinutos);
        System.out.println("Segundos: " + diferencaSegundos);

         scanner.close();


    }    
    
}
