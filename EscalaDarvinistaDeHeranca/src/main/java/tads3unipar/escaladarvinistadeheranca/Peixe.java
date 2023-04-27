/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.escaladarvinistadeheranca;

/**
 *
 * @author felip
 */
public class Peixe extends Animal{
    private String Caracteristica;
    public Peixe(String Nome, String Cor, String Ambiente,int Comprimento, float velocidade,int patas, String caracteristica){
        super(Nome, Cor, Ambiente, Comprimento, velocidade, patas);
        this.Caracteristica = caracteristica;
    }
    public void alteraCaracteristica(String caracteristica){
        caracteristica = ss.next();
        this.Caracteristica = caracteristica;
    }
    public void ConstroiPeixe(){
    System.out.print(nome + " vive em " +ambiente+ " de cor "+cor+" com "+Patas+" patas e"+comprimento+" cm de tamanho e corre a "+Velocidade+" KM/H");
}
    public void Caracters(){
        System.out.println("Nome : "+nome+"\n Cor: "+cor+"\n Tamanho: "+comprimento+"\n Velocidade : "+Velocidade+"\n Caracteristica: "+Caracteristica);
    }
}
