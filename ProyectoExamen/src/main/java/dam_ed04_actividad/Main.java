/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam_ed04_actividad;

public class Main {
       public static void main(String[] args) {
        operativa_cuenta(CCuenta);
    }

    public static void operativa_cuenta(CCuenta cantidad) {
        float cantidad cuenta1;
        double saldoActual1;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual1 = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual1 );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
