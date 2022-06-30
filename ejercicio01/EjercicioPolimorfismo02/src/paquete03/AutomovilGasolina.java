/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;
import java.util.Locale;
import paquete02.Automovil;
/** *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil{
    
    private double numGalones; 
    private double costoGalones;
    private double iva = 10;
    
    public void establecerNumGalones(double d){
        numGalones = d;
    }
    public void establecerCostoGal(double d){
        costoGalones = d;
    }
    public void establecerIva(double d){
        iva = d;
    }
    @Override
    public void calcularValPagar(){
        valPagar = costoGalones * numGalones + (iva / 100)* costoGalones * numGalones;  
    } 
    public double obtenerNumGalones(){
        return numGalones;
    }
    public double obtenerCostoGalones(){
        return costoGalones;
    }
    public double obtenerIva(){
        return iva;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre del propietario: %s\nPlaca dle vehiculo: "
                + "%s\nNumero de galones: %.2f\nCosto de galones: %.2f\niva: %.2f\n"
                + "Costo total: %.2f\n", nomProp,placa,numGalones,
                costoGalones,iva,valPagar);
        
        return cadena;
    }
}
