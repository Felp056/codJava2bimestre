/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tads3unipar.heranca;

/**
 *
 * @author felip
 */
public class Heranca {

    public static void main(String[] args) {
        Ingresso ii = new Ingresso("Luis", 32, 300.00);
        ii.imprimeIngresso();
        VipIngresso vip = new VipIngresso("Joao", 10, 350.00);
        vip.imprimeIngressoVip();
        
        
    }
}
