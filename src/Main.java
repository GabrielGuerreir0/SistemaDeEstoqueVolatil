import entity.Estoque;
import operations.Operacoes;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Estoque> estoques = new ArrayList<Estoque>();
        Operacoes operacoes = new Operacoes();

        int opcao = 9;

        System.out.printf("\n\nBem vindo ao nosso Sistema de estoque!!");

        while (opcao != 0) {


        System.out.printf("\nEscolha a operação que deseja realizar\n\n");
            System.out.printf("0-Sair do sistema\n");
        System.out.printf("1-Listar, adicionar ou remover um estoque\n");
        System.out.printf("2-Listar, adicionar ou remover um setor a algum estoque\n");
        System.out.printf("3-Listar, adicionar ou remover um item de algum setor de algum estoque\n\n");
        opcao = scan.nextInt();
        operacoes.Escolha(opcao, estoques);

        }
    }
}