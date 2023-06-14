/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import entitys.Circunsferencia;
import java.util.Scanner;
/**
 *
 * @author tpira
 */
public class CircunsferenciaService {
    
    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n");
   
    public void crearCircunferencia(){
        Circunsferencia c = new Circunsferencia();
        
        System.out.println("Ingrese un Radio");
        c.setRadio(scanner.nextDouble());
    }
    
    public void area(Circunsferencia c) {
        
        System.out.println(Math.pow(Math.PI,2) * c.getRadio());
    }
    
    public void perimetro(Circunsferencia c){
        
        System.out.println(Math.PI * 2 * c.getRadio());
    }
}
