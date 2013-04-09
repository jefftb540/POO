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
public class Funcionario extends Pessoa{
    protected int matricula;
    protected String cargo;
    protected double salario;

    public Funcionario(String nome, char sexo, int matricula, String cargo, double salario) {
        super(nome, sexo);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;       
    }
    
    public Funcionario (String nome, char sexo, int matricula){
        super (nome, sexo);
        this.matricula = matricula;
    }

    protected int getMatricula(){
        return matricula;
    }

    protected void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    protected String getCargo() {
        return cargo;
    }

    protected void setCargo(String cargo) {
        this.cargo = cargo;
    }

    protected double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario: \n"
                +"Nome: \t"+super.getNome()+"\n"
                +"Matricula=" + matricula + "\n"
                +"Cargo=" + cargo + "\n"
                +"Salario=" + salario + '\n';
    }
    
    
}
