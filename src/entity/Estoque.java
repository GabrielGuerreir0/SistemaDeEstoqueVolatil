package entity;

import java.util.ArrayList;

public class Estoque {
    private String nome;
    private String localizacao;
    private ArrayList<Setor> setores;

    public Estoque(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.setores = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public ArrayList<Setor> getSetores() {
        return setores;
    }

    public void setSetores(ArrayList<Setor> setores) {
        this.setores = setores;
    }

    @Override
    public String toString() {
        return "Estoque{" + nome  +
                '}' + '\n';
    }
}
