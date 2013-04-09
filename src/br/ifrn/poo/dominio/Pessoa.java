package codigos;

import java.util.Calendar;

public class Pessoa {
	protected int id;
    protected String nome, endereco, estadoCivil;
    protected char genero;


    public Pessoa(int id, String nome, String endereco, char genero, String estadoCivil) {
        this.id   		= id;
		this.nome 		= nome;
		this.genero 	= genero;
        this.endereco 	= endereco;
        this.estadoCivil= estadoCivil;
    }

    public Pessoa(int id, String nome, char genero) {
        this.id	      	 = id;
		this.nome 		 = nome;
        this.genero      = genero;
		this.endereco 	 = null;
		this.estadoCivil = null;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Pessoa: \n"
				+"Id:\t\t"+ id + "\n"
                +"Nome: \t\t" + nome + "\n"
                +"Endereco: \t\t" + endereco + "\n"
                +"Genero: \t\t" + genero + "\n"
                +"EstadoCivil: \t" + estadoCivil + '\n';
    }
    
    
    
}
