/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam_ed04_actividad;

/**
 *
 * @author 1cfgs
 */
public interface NewInterface {

    void asignarNombre(String nom);

    double estado();

    /**
     * @return the cuenta
     */
    String getCuenta();

    String getNombre();

    /**
     * @return the saldo
     */
    double getSaldo();

    double getTipoInterés();

    void ingresar(double cantidad) throws Exception;

    String obtenerCuenta();

    String obtenerNombre();

    void retirar(double cantidad) throws Exception;

    /**
     * @param cuenta the cuenta to set
     */
    void setCuenta(String cuenta);

    void setNombre(String nombre);

    /**
     * @param saldo the saldo to set
     */
    void setSaldo(double saldo);

    void setTipoInterés(double tipoInterés);
    
}
