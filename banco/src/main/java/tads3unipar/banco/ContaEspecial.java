/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.banco;

/**
 *
 * @author felip
 */
public class ContaEspecial extends ContaBancaria {
    float limite;
    public ContaEspecial(String Cliente, int NumConta, float Saldo,float limite){
        super(Cliente, NumConta, Saldo);
        this.limite = limite;
    }
    public void SacarEspecial(float Valor){
        if((limite*-1) <= (saldo - Valor)){
            saldo = saldo - Valor;
        }else{
            System.out.println("limite da conta estourado ");
        }
    }
}
