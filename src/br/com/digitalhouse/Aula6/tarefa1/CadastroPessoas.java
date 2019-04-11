package br.com.digitalhouse.Aula6.tarefa1;

import java.util.ArrayList;

public class CadastroPessoas {
    private int qtdAtual;
    private ArrayList<Pessoa> cadastro = new ArrayList<Pessoa>();

    public void cadastraPessoa(Pessoa pessoa){
        cadastro.add(pessoa);
    }

    public void imprimeCadastro(){
        for (int i = 0; i < this.cadastro.size();i++){
            this.cadastro.get(i).imprimeDados();
        }
    }
}
