/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.heranca;
import java.util.Scanner;
/**
 *
 * @author felip
 */
public class Ingresso {
    String nome;
    private Double valor;
    int lugar;
    public Ingresso(String Nome, int Lugar,Double Valor){
     this.nome = Nome;
     this.valor = Valor;
     this.lugar = Lugar;
    }

    Ingresso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getNome(){
        return this.nome;
    }
    public int getLugar(){
    return this.lugar;
    }
    public Double getValor(){
        return this.valor;
    }
    
    public void imprimeIngresso(){
     System.out.println(nome + " Lugar : "+ lugar + "\n Valor Pago: "+ valor+ "\n");   
    }
    
}

