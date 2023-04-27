/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.empresa;

/**
 *
 * @author felip
 */
public class vendedor extends empregado{
    private float comissao;
    public vendedor(String Nome, float Salario, float Comissao){
        super(Nome, Salario);
        this.comissao = Comissao;
    }
    public void GeraVendedor(){
        System.out.println(setNome()+ " é vendedor com salario de :"+ salario*comissao +" sendo sua comissao de : "+comissao);
    }
}
