package org.example;

public class Camisa {
    private String cor;
    private String tamanho;
    private double preco;

    public Camisa(String cor, String tamanho, double preco) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public void exibirDetalhes(){
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preco: $" + preco);
    }

    public double calcularDesconto(){

        return preco * 0.10;
    }

    public  double getPreco(){

        return preco;
    }
}
