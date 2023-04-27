/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.empresa;

/**
 *
 * @author felip
 */
public class empregado {
   private String nome;
    float salario;
    public empregado(String Nome, float Salario){
        this.nome = Nome;
        this.salario = Salario;
    }
    public String setNome(){
     return this.nome;   
    }
    public void ImprimeEmpregado(){
     System.out.println("Funcionario : "+nome+" gannha mensal: "+salario);
    }
}
