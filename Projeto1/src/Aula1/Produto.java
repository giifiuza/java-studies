package Aula1;

public class Produto {
    String nome;
    double preco;
    double desconto;

    //Método construtor é sempre executado
    //alt+insert - Gera automaticamente o construtor
    //%s - String
    //%f - float/double
    Produto(String nome, double preco, double desconto){
        //System.out.println("Foi executado");
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    String retornaStringFormatada(){
        return String.format("O produto %s está com o preço %f e com desconte %f", this.nome,this.preco,this.desconto);
    }

    @Override
    public Produto clone(){
        try{
            Produto clone = (Produto) super.clone();
            return clone;
        }
        catch (CloneNotSupportedException e){
            throw new AssertionError("Cópia não realizada");
        }


    }




}
