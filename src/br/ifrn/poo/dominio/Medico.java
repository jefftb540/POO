/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;
import java.util.Calendar;

/**
 *
 * @author TM
 */
public class Medico extends Funcionario{
    private Especialidade especialidade;
    private String tipoConselho;
    private int numInscConselho;
    private Consulta consulta = null;

    public Medico(String nome, char sexo, int matricula, String cargo, double salario, Especialidade especialidade, String tipoConselho, int numInscConselho) {
        super(nome, sexo, matricula, cargo, salario);
        this.especialidade = especialidade;
        this.tipoConselho = tipoConselho;
        this.numInscConselho = numInscConselho;
    }   

    public Medico(String nome, char sexo, int matricula, String cargo, Especialidade especialidade, int numInscConselho) {
        super(nome, sexo, matricula);
        this.cargo = cargo;
        this.especialidade = especialidade;
        this.numInscConselho = numInscConselho;
    }

    public Medico(String nome, char sexo, int matricula, String tipoConselho, int numInscConselho) {
        super(nome, sexo, matricula);
        this.tipoConselho = tipoConselho;
        this.numInscConselho = numInscConselho;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipoConselho() {
        return tipoConselho;
    }

    public void setTipoConselho(String tipoConselho) {
        this.tipoConselho = tipoConselho;
    }

    public int getNumInscConselho() {
        return numInscConselho;
    }

    public void setNumInscConselho(int numInscConselho) {
        this.numInscConselho = numInscConselho;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    } 

    @Override
    public String toString() {
        return  "Profissional:\n"+
                "Nome: \t\t\t" + super.getNome()+"\n"+
                "cargo: \t\t\t" + cargo +"\n"+
                "Especialidade: " + especialidade +"\n"+ 
                "Salario: \t" + super.getSalario()+"\n"+
                "Conselho: \t\t\t" + tipoConselho +"\n"+ 
                "Numero de inscrição no conselhor: "+numInscConselho+"\n"+
                "Matricula: \t\t" + matricula + "\n"+
                "Endereco = \t\t\t" + super.getEndereco()+"\n"+
                "Data Nascimento: \t" + super.getDataNascimento()+"\n"+
                "Sexo: \t\t\t" + super.getSexo()+"\n"+
                "Estado Civil: \t" + super.getEstadoCivil() +"\n";              
    }
    
    
    
    
    
    
}
