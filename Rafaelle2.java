package rafaelle.pkg2;

import java.util.Scanner;

public class Rafaelle2 {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a quantidade de livros que deseja comprar: ");
        int quantidadeLivros = scanner.nextInt();

       
        double descontoA = 0.25 * quantidadeLivros + 7.50;

       
        double descontoB = 0.50 * quantidadeLivros + 2.50;

       
        String melhorOpcao = (descontoA < descontoB) ? "A" : "B";

       
        System.out.println("A melhor opção de desconto para você é: " + melhorOpcao);
        System.out.println("Desconto total: R$" + ((melhorOpcao.equals("A")) ? descontoA : descontoB));

               scanner.close();
    }
}

 
