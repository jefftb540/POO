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
public class Paciente extends Pessoa{
private int id;
private Acomodacoes leito = null;
private Consulta consulta = null;
private Diagnostico diagnostico = null;

    public Paciente(int id, String nome, Endereco endereco, Calendar dataNascimento, char sexo, String estadoCivil) {
        super(nome, endereco, dataNascimento, sexo, estadoCivil);
        this.id = id;
    }

    public Paciente(int id, String nome, char sexo) {
        super(nome, sexo);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Acomodacoes getLeito() {
        return leito;
    }

    public void setLeito(Acomodacoes leito) {
        this.leito = leito;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    


}
