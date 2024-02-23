
package rafaelle4;

import java.util.Scanner;

public class Rafaelle4 {

    
    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro maior ou igual a 0: ");
        int valor = scanner.nextInt();
   
        if (valor < 0) {
            System.out.println("Digite um valor não negativo!!");
        } else if (valor == 0) {
            number = 1;
            System.out.println("O número de dígitos do número que você digitou é: " + number);
        } else {
            while (valor > 0) {
                valor /= 10;
                number++;
            }
            System.out.println("O número de dígitos do número que você digitou é: " + number);
        }

        
        scanner.close();

   }       
    }
    

