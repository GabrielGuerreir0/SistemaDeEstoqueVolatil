package operations.setor;

import entity.Estoque;
import entity.Setor;
import operations.estoques.OperaoesEstoque;

import java.util.ArrayList;
import java.util.Scanner;

public class OperacaoSetor {

    Scanner sc = new Scanner(System.in);
    OperaoesEstoque ope = new OperaoesEstoque();

    public void criarSetor(ArrayList<Estoque> estoques) {
        ope.ListarEstoque(estoques);
        if (estoques.isEmpty()) {return;}

        System.out.println("Informe o id do estoque:");
        int idEstoque = sc.nextInt() - 1;
        sc.nextLine();

        if (idEstoque < 0 || idEstoque >= estoques.size()) {
            System.out.println("ID não encontrado!");
            return;
        }

        Estoque estoqueSelecionado = estoques.get(idEstoque);

        System.out.println("Informe o nome do setor:");
        String nomeSetor = sc.nextLine();

        System.out.println("Informe a descrição do setor:");
        String descSetor = sc.nextLine();

        System.out.println("Informe a localização do setor:");
        String locSetor = sc.nextLine();

        System.out.println("Informe o nome do responsável pelo setor:");
        String nomeResponsavelSetor = sc.nextLine();

        Setor setor = new Setor(nomeSetor, descSetor, locSetor, nomeResponsavelSetor);
        if (estoqueSelecionado.getSetores() == null) {
            ArrayList<Setor> setores = new ArrayList<>();
            setores.add(setor);
            estoqueSelecionado.setSetores(setores);
        } else {
            estoqueSelecionado.getSetores().add(setor);
        }
    }

    public void listarSetor(ArrayList<Estoque> estoques) {
        ope.ListarEstoque(estoques);
        if (estoques.isEmpty()) {return;}

        System.out.println("Informe o id do estoque:");
        int idEstoque = sc.nextInt() - 1;
        sc.nextLine();

        if (idEstoque < 0 || idEstoque >= estoques.size()) {
            System.out.println("ID não encontrado!");
            return;
        }

        Estoque estoqueSelecionado = estoques.get(idEstoque);
        ArrayList<Setor> setores = estoqueSelecionado.getSetores();

        if (setores == null || setores.isEmpty()) {
            System.out.println("Nenhum setor encontrado neste estoque.");
        } else {
            for (int i = 0; i < setores.size(); i++) {
                System.out.println("ID: " + (i + 1) + " - " + setores.get(i).toString());
            }
        }
    }

    public void excluirSetor(ArrayList<Estoque> estoques) {
        ope.ListarEstoque(estoques);
        if (estoques.isEmpty()) {return;}

        System.out.println("Informe o id do estoque:");
        int idEstoque = sc.nextInt() - 1;
        sc.nextLine();

        if (idEstoque < 0 || idEstoque >= estoques.size()) {
            System.out.println("ID não encontrado!");
            return;
        }

        Estoque estoqueSelecionado = estoques.get(idEstoque);
        ArrayList<Setor> setores = estoqueSelecionado.getSetores();

        if (setores == null || setores.isEmpty()) {
            System.out.println("Nenhum setor para excluir neste estoque.");
            return;
        }

        for (int i = 0; i < setores.size(); i++) {
            System.out.println("ID: " + (i + 1) + " - " + setores.get(i).toString());
        }

        System.out.println("Informe o ID do setor a ser excluído:");
        int escolha = sc.nextInt() - 1;
        sc.nextLine();

        if (escolha < 0 || escolha >= setores.size()) {
            System.out.println("ID não encontrado!");
        } else {
            setores.remove(escolha);
            System.out.println("Setor excluído com sucesso.");
        }
    }
}
