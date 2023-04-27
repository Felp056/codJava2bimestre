/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tads3unipar.banco;

/**
 *
 * @author felip
 */
public class Banco {

    public static void main(String[] args) {
        ContaBancaria cc = new ContaBancaria("Arnold", 55, (float)10000.00);
        cc.Sacar((float)5000.00);
        cc.Deposito((float)2500.00);
        cc.Extrato();
        Poupanca pp = new Poupanca("Felipe", 32, (float)9000.00, (float)0.03);
        pp.novoSaldo();
        pp.Extrato();
        ContaEspecial cp = new ContaEspecial("Winderso", 16, (float)4000.00, (float)5000.00);
        cp.Extrato();
        cp.SacarEspecial((float)5000.00);
        cp.Extrato();
    }
}
