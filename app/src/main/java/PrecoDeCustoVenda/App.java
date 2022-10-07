package PrecoDeCustoVenda;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
    /*
    Faça um algoritmo que receba o preço de custo de um produto e mostre o valor 
    de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com 
    um percentual informado pelo usuário;
    */
    
        float precoCusto = 0;
        float valorVenda = 0;
        float acrescimo  = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Preco de custo: R$ ");
        precoCusto = leitor.nextFloat();
        
        System.out.println("Percentual de venda: ");
        acrescimo = leitor.nextFloat();
        
        valorVenda = (precoCusto * acrescimo / 100) + precoCusto;
        System.out.println("O valor de venda será: R$ " + valorVenda);
        
    
    
    
    
    
    }
}
