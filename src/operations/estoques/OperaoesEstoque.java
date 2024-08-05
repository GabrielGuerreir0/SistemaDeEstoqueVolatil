package operations.estoques;

import entity.Estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class OperaoesEstoque {
    Scanner sc = new Scanner(System.in);

    public void GenerateEstoque (ArrayList<Estoque> estoques){
        System.out.println("Informe o nome do estoque:\n");
        var nome_estoque = sc.nextLine();
        System.out.printf("\nInforme a localização do estoque:\n");
        var localizacao_estoque = sc.nextLine();

        Estoque novoestoque = new Estoque(nome_estoque, localizacao_estoque);
        estoques.add(novoestoque);
    }

    public void ListarEstoque (ArrayList<Estoque> estoques){
        if(estoques.isEmpty()){
            System.out.printf("Não há estoques cadastrados.\n");
            return;}
        System.out.println("Estoques:\n");
        for(int i = 0; i < estoques.size(); i++){
            System.out.printf("ID: "+  (i + 1) +"-"+ estoques.get(i).toString() + "\n");
        }
    }

    public void ExcluirEstoque (ArrayList<Estoque> estoques){
        if(estoques.isEmpty()){
            System.out.printf("Não há estoques cadastrados.\n");
            return;}
        ListarEstoque(estoques);
        System.out.printf("informe o id do estoque que deseja excluir:\n");
        var id = sc.nextInt();
        estoques.remove(id - 1);
        System.out.printf("excluido com sucesso!\n");
    }


}
