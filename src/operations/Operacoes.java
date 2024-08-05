package operations;

import entity.Estoque;
import entity.Setor;
import operations.estoques.OperaoesEstoque;
import operations.produto.OperacaoProduto;
import operations.setor.OperacaoSetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Operacoes {

    public static  void  Escolha(int escolha, ArrayList<Estoque> estoques){

        Scanner sc = new Scanner(System.in);

        OperacaoSetor ops = new OperacaoSetor();
        OperaoesEstoque ope = new OperaoesEstoque();
        OperacaoProduto opp = new OperacaoProduto();

        switch (escolha) {


            case 1:
                System.out.printf("1.listar\n");
                System.out.printf("2.Adicionar\n");
                System.out.printf("3.Deletar\n");
                System.out.printf("Informe a operação:\n");
                var escolhaEstoqque = sc.nextInt();
                switch (escolhaEstoqque){
                    case 1:
                        ope.ListarEstoque(estoques);
                        break;
                        case 2:
                            ope.GenerateEstoque(estoques);
                            break;
                            case 3:
                                ope.ExcluirEstoque(estoques);
                                break;
                    default:
                        System.out.printf("Operacao Invalida\n");
                        break;
                }
                break;

            case 2:
                System.out.printf("1.listar\n");
                System.out.printf("2.Adicionar\n");
                System.out.printf("3.Deletar\n");
                System.out.printf("Informe a operação:\n");
                var escolhaSetor = sc.nextInt();
                switch (escolhaSetor){
                    case 1:
                        ops.listarSetor(estoques);
                        break;
                        case 2:
                            ops.criarSetor(estoques);
                            break;
                            case 3:
                                ops.excluirSetor(estoques);

                }
                break;

            case 3:
                System.out.printf("1.listar\n");
                System.out.printf("2.Adicionar\n");
                System.out.printf("3.Deletar\n");
                System.out.printf("4.Atualizar quantidade\n");
                System.out.printf("Informe a operação:\n");
                var escolhaProduto = sc.nextInt();
                switch (escolhaProduto) {
                    case 1:
                        opp.listarProdutos(estoques);
                        break;
                    case 2:
                        opp.cadastrarProduto(estoques);
                        break;
                    case 3:
                        opp.excluirProduto(estoques);
                        break;
                        case 4:
                            opp.atualizarQuantidade(estoques);
                            break;
                }
                break;

        }
    }


}
