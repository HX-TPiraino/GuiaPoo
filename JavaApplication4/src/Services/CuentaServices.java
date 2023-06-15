/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import entitys.Cuenta;
import java.util.Scanner;

/**
 *
 * @author tpira
 */
public class CuentaServices {
    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta(){
        System.out.println("Ingrese su num de cuenta, dni y saldo");
        return new Cuenta(scanner.nextInt(),scanner.nextLong(),scanner.nextInt());
    }
    
    public void ingresar(double ingreso, Cuenta c){
        c.setIngreso(c.getIngreso() + ingreso);
    }
    
    public void retirar(double retiro, Cuenta c){
        double aux = c.getSaldoActual() - retiro;
        System.out.println("Mi metodo se cobra la coma como comicion");
        c.setSaldoActual(aux <= 0 ? 0 : (int) Math.round(aux));
    }
    
    public void extraccionRapida(int retiro, Cuenta c){
        
        double aux = c.getSaldoActual() - retiro;
        c.setSaldoActual(aux > c.getSaldoActual()*0.2 ? c.getSaldoActual() : (int) aux);
    }
    
    public String consultarSaldo(Cuenta c){
        return "Usted tiene: " + c.getSaldoActual();
    }
    
    public String consultarDatos(Cuenta c){
        return c.toString();
    }
}
