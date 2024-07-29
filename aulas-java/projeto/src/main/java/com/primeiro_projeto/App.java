package com.primeiro_projeto;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


}
