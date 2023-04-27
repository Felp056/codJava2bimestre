/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.escaladarvinistadeheranca;
import java.util.Scanner;
/**
 *
 * @author felip
 */
public class Animal {
    Scanner ss = new Scanner(System.in);
    protected String nome;
    protected String cor;
    protected String ambiente;
    protected int comprimento;
    protected float Velocidade;
    protected int Patas;
    public Animal(String Nome, String Cor, String Ambiente,int Comprimento, float velocidade, int patas){
        this.nome = Nome;
        this.cor = Cor;
        this.ambiente = Ambiente;
        this.comprimento = Comprimento;
        this.Velocidade = velocidade;
        this.Patas = patas;
    };
public void alteraNome(String Nome){
    Nome = ss.next();
    this.nome = Nome;
};
public void alteraComprimento(int Comprimento){
    Comprimento = ss.nextInt();
    this.comprimento = Comprimento;
};
public void alteraPatas(int patas){
    patas = ss.nextInt();
    this.Patas = patas;
};

public void alteraCor(String Cor){
    Cor = ss.next();
    this.cor = Cor;
};

public void alteraAmbiente(String Ambiente){
    Ambiente = ss.next();
    this.ambiente = Ambiente;
};
public void alteraVelocidade(float velocidade){
    velocidade = ss.nextFloat();
    this.Velocidade = velocidade;
};
public void ConstroiAnimal(){
    System.out.println(nome + " vive em " +ambiente+ " de cor "+cor+" com "+Patas+" patas e "+comprimento+" cm de tamanho e corre a "+Velocidade+" KM/H");
}
}
