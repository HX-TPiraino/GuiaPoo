/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import entitys.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author tpira
 */
public class RectanguloServices {
    
    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    
    public Rectangulo createRectangle(){
        System.out.println("Ingrese la base y la altura respectivamente");
        return new Rectangulo(scanner.nextInt(), scanner.nextInt());
    }
    
    public int calcularSuperficie(Rectangulo r) {
        return (r.getBase() + r.getAltura()) * 2;
    }
}
