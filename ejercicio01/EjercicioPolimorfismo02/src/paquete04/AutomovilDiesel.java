/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;
import paquete02.Automovil;
/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil{
    private double costoD;
    private double litrosD;
    private double descuento = 10;
    
    public void establecerCostoD(double g){
        costoD = g;
    }
    
    public void establecerLitrosD(double g){
        litrosD = g;
    }
    
    public void establecerDescuento(double g){
        descuento = g;
    }
    
     @Override
    public void calcularValPagar(){
        valPagar = costoD * litrosD + (descuento / 100)* litrosD * costoD;
    }
    
    public double obtenerCostoD(){
        return costoD;
    }

    public double obtenerLitrosD(){
        return litrosD;
    }
    
    public double obtenerDescuento(){
        return descuento;
    }
    
    public String toString(){
        String cadena = String.format("Nombre del propietario: %s\nPlaca dle vehiculo: "
                + "%s\nNumero de litros: %.2f\nCosto de litros: %.2f\nDescuento: %.2f\n"
                + "Costo total: %.2f\n", nomProp,placa,litrosD,
                costoD,descuento,valPagar);
        return cadena;
    }
}
