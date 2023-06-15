/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import entitys.Operacion;
import java.util.Scanner;

/**
 *
 * @author tpira
 */
public class OperacionServices {
    
    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    public void crearOperacion(Operacion op) {
        System.out.println("Ingrese primer numero");
        op.setNumero1(scanner.nextInt());
        
        System.out.println("Ingrese segundo numero");
        op.setNumero2(scanner.nextInt());
    }
    
    public int sumar(Operacion op) {
        return op.getNumero1() + op.getNumero2();
    }
    
    public int restar(Operacion op) {
        return op.getNumero1() - op.getNumero2();
    }
    
    public int mutiplicar(Operacion op){
        try {
           if(op.getNumero1() == 0 || op.getNumero2() == 0) throw new ArithmeticException();
          return op.getNumero1() * op.getNumero2();
        }catch (ArithmeticException e){
            System.out.println("Error: " + e);
        }
        return 0;
    }
    
    public int dividir(Operacion op){
        try {
            int resultado = 10 / 0;
            System.out.println("El resultado de la división es: " + resultado);
            return resultado;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
}
