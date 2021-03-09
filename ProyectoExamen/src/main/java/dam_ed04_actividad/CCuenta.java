/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam_ed04_actividad;

public class CCuenta implements NewInterface {

    /**
     * @return the cuenta
     */
    @Override
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    @Override
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    @Override
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;


    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    @Override
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    @Override
    public String obtenerNombre()
    {
        return getNombre();
    }


    @Override
    public double estado()
    {
        return getSaldo();
    }


    @Override
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    @Override
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }


    @Override
    public String obtenerCuenta()
    {
        return getCuenta();
    }


    @Override
    public String getNombre() {
        return nombre;
    }


    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public double getTipoInterés() {
        return tipoInterés;
    }


    @Override
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    } 
}
