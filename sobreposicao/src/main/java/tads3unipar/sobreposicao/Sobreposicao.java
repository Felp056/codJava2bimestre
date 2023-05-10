/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tads3unipar.sobreposicao;

/**
 *
 * @author felip
 */
public class Sobreposicao {

    public static void main(String[] args) {
        animal pet = new animal();
        pet.fazerBarulho();
        pet = new cachorro();
        pet.fazerBarulho();
        pet = new gato();
        pet.fazerBarulho();
    }
}
