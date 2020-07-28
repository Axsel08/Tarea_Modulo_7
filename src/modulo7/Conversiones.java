/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo7;

/**
 *
 * @author user
 */
public class Conversiones {
    
    private int divisaOrigen,divisaDestino;
    private double Cantidad,resultado;
    
    public Conversiones(){
        
    
}

    

    public void setDivisaOrigen(int divisaOrigen) {
        this.divisaOrigen = divisaOrigen;
    
    }
    
    public int getDivisaOrigen() {
        return divisaOrigen;
    }

    public void setDivisaDestino(int divisaDestino) {
        this.divisaDestino = divisaDestino;
   
    }
     public int getDivisaDestino() {
        return divisaDestino;
     }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getCantidad() {
        return Cantidad;

   }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
     public double getResultado() {
        return resultado;
    }
     public double conversion(){
         
         if (divisaOrigen==0 && divisaDestino==1 ) {
             resultado = Cantidad / 24.8377;
             
         }
          
          if (divisaOrigen==1 && divisaDestino==0) {
              resultado = Cantidad * 24.6650;
   
         }
          if (divisaOrigen==0 && divisaDestino==2) {
              resultado= Cantidad / 30.2928;
             
         }if (divisaOrigen==2 && divisaDestino==0) {
             resultado= Cantidad * 27.8631;
             
         }
     
      return resultado;    
       
         
     }
     
   
    
}
