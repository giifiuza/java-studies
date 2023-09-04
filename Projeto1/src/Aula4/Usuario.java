package Aula4;

public class Usuario {
    private String nome;
    private int idade;

    //alt + insert = para criar getter e setter, toString, construtor
    public Usuario(String nome, int idade) {
        this.nome = nome;
       setIdade(idade);
    }
    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade=Math.abs(idade);
    }

    @Override
    public String toString(){
        return String.format("O usuario %s tem a idade de %d anos.", this.nome,this.idade);
    }


}
