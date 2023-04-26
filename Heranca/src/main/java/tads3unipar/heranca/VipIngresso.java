/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.heranca;
/**
 *
 * @author felip
 */
public class VipIngresso extends Ingresso{
    public VipIngresso(String _nome,int _Lugar,Double _valorVip){
        super(_nome, _Lugar, _valorVip);
    }
    Double ValVip = getValor() * 2;
    public void imprimeIngressoVip(){
     System.out.println(nome + " Lugar Vip : "+ lugar + "\n Valor Pago: "+ ValVip+ "\n");   
    }
}
