package operations.produto;

import entity.Estoque;
import entity.Produto;
import entity.Setor;
import operations.estoques.OperaoesEstoque;

import java.util.ArrayList;
import java.util.Scanner;

public class OperacaoProduto {
    OperaoesEstoque ope = new OperaoesEstoque();
    Scanner sc = new Scanner(System.in);

    public void cadastrarProduto(ArrayList<Estoque> estoques) {
        if (estoques.isEmpty()) {
            System.out.println("Nenhum estoque disponível.");
            return;
        }

        System.out.println("Escolha o estoque onde você deseja adicionar o produto:");
        ope.ListarEstoque(estoques);

        System.out.println("Informe o ID do estoque:");
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
            return;
        } else {
            for (int i = 0; i < setores.size(); i++) {
                System.out.println("ID: " + (i + 1) + " - " + setores.get(i).toString());
            }
        }

        System.out.println("Informe o ID do setor:");
        int idSetor = sc.nextInt() - 1;
        sc.nextLine();

        if (idSetor < 0 || idSetor >= setores.size()) {
            System.out.println("ID não encontrado neste estoque!");
            return;
        }

        Setor setorSelecionado = setores.get(idSetor);

        System.out.println("Informe o nome do produto:");
        String nomeProduto = sc.nextLine();
        System.out.println("Informe a descrição do produto:");
        String descProduto = sc.nextLine();
        System.out.println("Informe o preço de compra do produto por unidade:");
        double precoCompra = sc.nextDouble();
        System.out.println("Informe o preço de venda do produto por unidade:");
        double precoVenda = sc.nextDouble();
        sc.nextLine();
        System.out.println("Informe o código do produto:");
        String codigoProduto = sc.nextLine();
        System.out.println("Informe a quantidade do produto:");
        int quantidadeProduto = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe o fornecedor do produto:");
        String fornecedorProduto = sc.nextLine();

        Produto novoProduto = new Produto(nomeProduto, descProduto, precoVenda, precoCompra, codigoProduto, quantidadeProduto, fornecedorProduto);

        if (setorSelecionado.getProdutos() == null) {
            ArrayList<Produto> produtos = new ArrayList<>();
            produtos.add(novoProduto);
            setorSelecionado.setProdutos(produtos);
        } else {
            setorSelecionado.getProdutos().add(novoProduto);
        }

        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos(ArrayList<Estoque> estoques) {
        if (estoques.isEmpty()) {
            System.out.println("Nenhum estoque disponível.");
            return;
        }

        ope.ListarEstoque(estoques);

        System.out.println("Informe o ID do estoque:");
        int idEstoque = sc.nextInt() - 1;
        sc.nextLine();

        if (idEstoque < 0 || idEstoque >= estoques.size()) {
            System.out.println("Estoque não encontrado!");
            return;
        }

        Estoque estoqueSelecionado = estoques.get(idEstoque);
        ArrayList<Setor> setores = estoqueSelecionado.getSetores();

        if (setores == null || setores.isEmpty()) {
            System.out.println("Nenhum setor encontrado neste estoque.");
            return;
        }

        for (int i = 0; i < setores.size(); i++) {
            System.out.println("ID: " + (i + 1) + " - " + setores.get(i).toString());
        }

        System.out.println("Informe o ID do setor:");
        int idSetor = sc.nextInt() - 1;
        sc.nextLine();

        if (idSetor < 0 || idSetor >= setores.size()) {
            System.out.println("ID de setor inválido!");
            return;
        }

        Setor setorSelecionado = setores.get(idSetor);
        ArrayList<Produto> produtos = setorSelecionado.getProdutos();

        if (produtos == null || produtos.isEmpty()) {
            System.out.println("Nenhum produto encontrado neste setor.");
            return;
        }

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("ID: " + (i + 1) + " - " + produtos.get(i).toString());
        }
    }

    public void excluirProduto(ArrayList<Estoque> estoques) {
        if (estoques.isEmpty()) {
            System.out.println("Nenhum estoque disponível.");
            return;
        }

        ope.ListarEstoque(estoques);

        System.out.println("Informe o ID do estoque:");
        int idEstoque = sc.nextInt() - 1;
        sc.nextLine();

        if (idEstoque < 0 || idEstoque >= estoques.size()) {
            System.out.println("Estoque não encontrado!");
            return;
        }

        Estoque estoqueSelecionado = estoques.get(idEstoque);
        ArrayList<Setor> setores = estoqueSelecionado.getSetores();

        if (setores == null || setores.isEmpty()) {
            System.out.println("Nenhum setor encontrado neste estoque.");
            return;
        }

        for (int i = 0; i < setores.size(); i++) {
            System.out.println("ID: " + (i + 1) + " - " + setores.get(i).toString());
        }

        System.out.println("Informe o ID do setor:");
        int idSetor = sc.nextInt() - 1;
        sc.nextLine();

        if (idSetor < 0 || idSetor >= setores.size()) {
            System.out.println("ID de setor inválido!");
            return;
        }

        Setor setorSelecionado = setores.get(idSetor);
        ArrayList<Produto> produtos = setorSelecionado.getProdutos();

        if (produtos == null || produtos.isEmpty()) {
            System.out.println("Nenhum produto encontrado neste setor.");
            return;
        }

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("ID: " + (i + 1) + " - " + produtos.get(i).toString());
        }

        System.out.println("Informe o ID do produto que deseja excluir:");
        int idProduto = sc.nextInt() - 1;
        sc.nextLine();

        if (idProduto < 0 || idProduto >= produtos.size()) {
            System.out.println("Não existe produto com este ID!");
            return;
        }

        produtos.remove(idProduto);
        System.out.println("Produto excluído com sucesso!");
    }

    public void atualizarQuantidade(ArrayList<Estoque> estoques) {
        if (estoques.isEmpty()) {
            System.out.println("Nenhum estoque disponível.");
            return;
        }

        ope.ListarEstoque(estoques);

        System.out.println("Informe o ID do estoque:");
        int idEstoque = sc.nextInt() - 1;
        sc.nextLine();

        if (idEstoque < 0 || idEstoque >= estoques.size()) {
            System.out.println("Estoque não encontrado!");
            return;
        }

        Estoque estoqueSelecionado = estoques.get(idEstoque);
        ArrayList<Setor> setores = estoqueSelecionado.getSetores();

        if (setores == null || setores.isEmpty()) {
            System.out.println("Nenhum setor encontrado neste estoque.");
            return;
        }

        for (int i = 0; i < setores.size(); i++) {
            System.out.println("ID: " + (i + 1) + " - " + setores.get(i).toString());
        }

        System.out.println("Informe o ID do setor:");
        int idSetor = sc.nextInt() - 1;
        sc.nextLine();

        if (idSetor < 0 || idSetor >= setores.size()) {
            System.out.println("ID de setor inválido!");
            return;
        }

        Setor setorSelecionado = setores.get(idSetor);
        ArrayList<Produto> produtos = setorSelecionado.getProdutos();

        if (produtos == null || produtos.isEmpty()) {
            System.out.println("Nenhum produto encontrado neste setor.");
            return;
        }

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("ID: " + (i + 1) + " - " + produtos.get(i).toString());
        }

        System.out.println("Informe o ID do produto que deseja atualizar a quantidade:");
        int idProduto = sc.nextInt() - 1;
        sc.nextLine();

        if (idProduto < 0 || idProduto >= produtos.size()) {
            System.out.println("Não existe produto com este ID!");
            return;
        }

        System.out.println("Informe a nova quantidade de produtos em estoque:");
        int quantidade = sc.nextInt();
        sc.nextLine();

        produtos.get(idProduto).setQuantidade(quantidade);
        System.out.println("Quantidade atualizada com sucesso!");
    }
}

