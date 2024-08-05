package entity;

import java.util.ArrayList;

public class Setor {

    private String nome;
    private String descricao;
    private String localizacao;
    private String responsavel;
    private ArrayList<Produto> produtos;

    public Setor(String nome, String descricao, String localizacao, String responsavel) {
        this.nome = nome;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.responsavel = responsavel;
        this.produtos = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Setor{" +
                "nome='" + nome + '\'' +
                ", responsavel='" + responsavel + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
