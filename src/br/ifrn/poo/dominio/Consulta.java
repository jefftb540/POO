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
class Consulta {
    private String id;
    private Funcionario profissional;
    private double valor;
    private Calendar data = null;

    public Consulta(Funcionario profissional, double valor, String id) {
        this.profissional = profissional;
        this.valor = valor;
        this.id = id;
    }

    public Consulta(Funcionario profissional, double valor) {
        this.profissional = profissional;
        this.valor = valor;
    }

    public Funcionario getProfissional() {
        return profissional;
    }

    public void setProfissional(Funcionario profissional) {
        this.profissional = profissional;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getId() {
        return id;
    }
/*
    public void setId(int id) {
        this.id = id;
    }
*/  
    
    @Override
    public String toString() {
        return "Consulta: \n"
                +"ID: \t"+id+"\n"
                +"Profissional: \t" + profissional + "\n"
                +"Valor: \t" + valor + '\n';
                
    }
    
    
}
