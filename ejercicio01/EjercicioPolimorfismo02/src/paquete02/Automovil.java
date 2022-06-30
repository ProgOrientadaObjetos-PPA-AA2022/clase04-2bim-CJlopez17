/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
    protected String nomProp;
    protected String placa;
    protected double valPagar;

    public void establecerNombre(String nom){
        nomProp = nom;
    }
    public void establecerPlaca(String pla){
        placa = pla;
    }
    public abstract void calcularValPagar();
        
    public String obtenerNombre(){
        return nomProp;
    }
    public String obtenerPlaca(){
        return placa;
    }
    public double obtenerValPagar(){
        return valPagar;
    }
}
