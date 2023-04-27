/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.banco;
import java.util.Scanner;
/**
 *
 * @author felip
 */
public class ContaBancaria {
    Scanner ss = new Scanner(System.in);
    String cliente;
    int num_conta;
    float saldo;
    public ContaBancaria(String Cliente, int NumConta, float Saldo){
        this.cliente = Cliente;
        this.num_conta = NumConta;
        this.saldo = Saldo;
    }
// método sacar (o saldo não pode ficar negativo)
    public void Sacar(float Valor){
        if(saldo > 0 && Valor <= saldo){
        saldo = saldo - Valor;
        System.out.println("Saldo restante: "+saldo);
        }else{
            System.out.println("Saldo restante insulficiente para operação");
        }
    }
// método deposita
    public void Deposito(float Valor){
        saldo += saldo + Valor;
        System.out.println("Saldo atual: "+ saldo);
    }
    public void Extrato(){
        System.out.println("Nome : "+cliente + "\n Numero da Conta:  " +num_conta+"\n Saldo: "+saldo);
    }
    public float getSaldo(){
        return saldo;
    }
}
