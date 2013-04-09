/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author TM
 */
public class Administrador extends Funcionario{
    Cadastro arquivoGeral;
    static String login;
    static String senha;

    public Administrador(String login, String senha, String nome, char sexo, int matricula, String cargo, double salario) {
        super(nome, sexo, matricula, cargo, salario);
        this.login = login;
        this.senha = senha;
    }

    
    
    public void alterarSenha(String senha){
        try{
            this.senha = senha;
            System.out.println("Senha alterada com sucesso.");
        }catch(Exception e){
            e.getMessage();
//            System.out.prinln("Não foi possivel alterar a senha.");
            
        }
    }
    
    private void cadastrarConsulta(Funcionario profissional, double valor, String id){
        Consulta consulta = new Consulta(profissional, valor, id);
        arquivoGeral.inserirConsulta(consulta);
    }
    
    private void agendarConsulta(String id, Calendar data){
	arquivoGeral.marcarConsulta(id, data);
        
    }
        
    private void listarConsultas(){
	arquivoGeral.listarConsultas();
    }   
    
    private boolean excluirConsulta(String id){
	return arquivoGeral.removerConsulta(id);		 
    }
    
    private void cadastrarFuncionario(String nome, char sexo, int matricula, String cargo, double salario){
        Funcionario funcionario = new Funcionario(nome, sexo, matricula, cargo, salario);
        arquivoGeral.adicionarFuncionario(funcionario); 
    }
    
    private void deletarFuncionario(int matricula){
	arquivoGeral.removerFuncionario(matricula);
    }
    
    public String getLogin(){
        return this.login;
    }

    public String getSenha() {
        return this.senha;
    }
    
}
