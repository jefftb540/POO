/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.util.ArrayList;

/**
 *
 * @author TM
 */
class Diagnostico {
    private String relatorioConsulta = null;
    private Paciente paciente;
    private ArrayList <String> medicacaoPrescrita = new ArrayList(null);
    private ArrayList <String> exames = new ArrayList(null);

    public Diagnostico(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getRelatorioConsulta() {
        return relatorioConsulta;
    }

    public void setRelatorioConsulta(String relatorioConsulta) {
        this.relatorioConsulta = relatorioConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }       
/*
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }           PACIENTE NUNCA SERÁ ALTERADO
*/
    public void getMedicacaoPrescrita() {
        for (int i = 0; i < medicacaoPrescrita.size(); i++) {
            System.out.println(medicacaoPrescrita.get(i));
        }
    }

    public void setMedicacaoPrescrita(String medicacao) {
        this.medicacaoPrescrita.add(medicacao);
    }

    public void getExames() {
        for (int i = 0; i < exames.size(); i++) {
            System.out.println(exames.get(i));
        }
    }

    public void setExames(String exame) {
        this.exames.add(exame);
    }

    @Override
    public String toString() {
        return "Diagnostico: \n"
               +"Paciente=" + paciente + "\n"
               +"RelatorioConsulta: " + relatorioConsulta + "\n"
               +"MedicacaoPrescrita=" + medicacaoPrescrita + "\n"
               +"Exames=" + exames + '\n';
    }
    
    
    
    
    
    
    
}
