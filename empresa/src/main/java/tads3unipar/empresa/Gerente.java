/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.empresa;

/**
 *
 * @author felip
 */
public class Gerente extends empregado{
    private String departamento;
    public Gerente(String Nome, float Salario, String Departamento){
        super(Nome, Salario);
        this.departamento = Departamento;
    }
    public void Ogerente(){
        System.out.println(setNome()+ " é gerente de "+ departamento+ " com salario de :"+ salario);
    }
}
