package atividade1;

import java.util.Scanner;

public class Rafaelle4 {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro maior ou igual a 0: ");
        String valor = scanner.nextLine();
        
        try {  
            int valorNumero = Integer.parseInt(valor);  
            
            if (valorNumero >= 0)
            {
                int numeroDeDigitos = valor.length();
                System.out.println("A quantidade de dígitos do número é:" + numeroDeDigitos);
                return;
            }
            
            System.out.println("[E]: O VALOR DEVE SER MAIOR OU IGUAL A ZERO");
            
        } catch(NumberFormatException e){
            System.out.println("[E]: O VALOR DEVE SER UM NÚMERO");
        }  
    }    
    
}
