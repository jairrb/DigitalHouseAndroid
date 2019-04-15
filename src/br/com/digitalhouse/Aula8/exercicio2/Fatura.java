package br.com.digitalhouse.Aula8.exercicio2;

import java.util.Set;

public class Fatura {
    private Set<Itens> itens;

    public Fatura(Set<Itens> itens) {
        this.itens = itens;
    }

    public Fatura() {
    }

    public Set<Itens> getItens() {
        return itens;
    }

    public void setItens(Set<Itens> itens) {
        this.itens = itens;
    }

    public Double getTotalFatura(){
        double totalFatura = 0.0;
        for (Itens item : itens) {
            System.out.println( "Item: "+item.getNumero()+
                                " Desc: "+item.getDescricao()+
                                " Qtd: "+item.getQuantidade()+
                                " Unit.: "+item.getPrecoUnit());
            totalFatura += item.getQuantidade() * item.getPrecoUnit();
        }

        return totalFatura;
    }
}
