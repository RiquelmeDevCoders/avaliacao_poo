package org.example;

public class CamisaEstampada extends Camisa {
    private String estampa;

    public CamisaEstampada(String cor, String tamanho, double preco, String estampa) {
        super(cor, tamanho, preco);
        this.estampa = estampa;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Estampa: " + estampa);
    }

    @Override
    public double calcularDesconto(){

        return getPreco() * 0.15;
    }
}
