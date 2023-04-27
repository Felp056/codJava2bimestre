/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.escaladarvinistadeheranca;

/**
 *
 * @author felip
 */
public class Mamifero extends Animal {
    private String alimento;
    public Mamifero(String Nome, String Cor, String Ambiente,int Comprimento, float velocidade,int patas, String Alimento){
        super(Nome, Cor, Ambiente, Comprimento, velocidade, patas);
        this.alimento = Alimento;
    }
    public void Comida(){
        this.alimento = ss.next();
    }
     public void ConstrutorDeMamiferos(){
        System.out.println("Nome : "+nome+"\n Cor: "+cor+"\n Tamanho: "+comprimento+"\n Velocidade : "+Velocidade+"\n Alimento : "+alimento);
    }
}
