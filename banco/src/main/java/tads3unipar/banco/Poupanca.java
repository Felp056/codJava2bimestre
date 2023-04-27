/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.banco;

/**
 *
 * @author felip
 */
public class Poupanca extends ContaBancaria{
    private int diaRecebimento;
    private double taxa;
    public Poupanca(String Cliente, int NumConta, float Saldo, double taxa){
        super(Cliente, NumConta, Saldo);
    }
    public void novoSaldo(){
       saldo += saldo * taxa;
    }
}
