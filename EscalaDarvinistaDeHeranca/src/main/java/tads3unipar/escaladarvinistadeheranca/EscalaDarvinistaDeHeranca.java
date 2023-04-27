/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tads3unipar.escaladarvinistadeheranca;

/**
 *
 * @author felip
 */
public class EscalaDarvinistaDeHeranca {
    public static void main(String[]args){
    Animal aa = new Animal("Homem", "Branca", "Cidade", 175, 20, 4);
    System.out.println("ZOO: \n ----------------------------------------------------------------");
    aa.ConstroiAnimal();
    Peixe pp = new Peixe("Carpa", "Dourada", "Agua Doce", 50, 30, 0, "Peixe que come algas");
    pp.ConstroiAnimal();
    pp.Caracters();
    Mamifero mm = new Mamifero("gorila", "preta", "Savana", 180, 40, 4, "BANAN");
    mm.ConstroiAnimal();
    mm.ConstrutorDeMamiferos();
  }
}
