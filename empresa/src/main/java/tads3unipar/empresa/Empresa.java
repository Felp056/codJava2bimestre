/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tads3unipar.empresa;

/**
 *
 * @author felip
 */
public class Empresa {
public static void main(String[] args){
    empregado ee = new empregado("Jeferson", (float)1750.25);
    ee.ImprimeEmpregado();
    Gerente gg = new Gerente("Sandro", (float)2500.75, "Compras");
    gg.Ogerente();
    vendedor vv = new vendedor("Jaime", (float)2000.00, (float)1.15);
    vv.GeraVendedor();
}
}
