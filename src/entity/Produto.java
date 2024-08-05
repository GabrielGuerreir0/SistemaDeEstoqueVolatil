package entity;

public class Produto {
    private String nome;
    private String descricao;
    private Double preco_v;
    private Double preco_c;
    private String codigo;
    private int quantidade;
    private String fornecedor;

    public Produto(String nome, String descricao, Double preco_v, Double preco_c, String codigo, int quantidade, String fornecedor) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco_v = preco_v;
        this.preco_c = preco_c;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
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

    public Double getPreco_v() {
        return preco_v;
    }

    public void setPreco_v(Double preco_v) {
        this.preco_v = preco_v;
    }

    public Double getPreco_c() {
        return preco_c;
    }

    public void setPreco_c(Double preco_c) {
        this.preco_c = preco_c;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco de venda=" + preco_v +
                ", preco de compra=" + preco_c +
                ", codigo='" + codigo + '\'' +
                ", quantidade=" + quantidade +
                ", fornecedor='" + fornecedor + '\'' +
                '}';
    }
}

