/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

/**
 *
 * @author GONZALES
 */
public class Automovil {
    private String marca;
    private int    año ;
    private String modelo;
    private Motor []elmotor;
    private Llanta[] llantas;
    private Puerta [] puertas;

    
    public Automovil() {}

    public Automovil(String marca, int año, String modelo) {
        this.marca = marca;
        this.año = año;
        this.modelo = modelo;
        this.elmotor = new Motor[1];
        this.llantas = new Llanta[4];
        this.puertas = new  Puerta[4];
    }

    public String getMarca() {
        return marca;
    }

    public int getAño() {
        return año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Llanta lasllantas(Llanta l){
    return this.llantas[3]=l;
        }
    
    public Puerta laspuertas (Puerta p){
    return this.puertas[3]=p;
        }
    public Motor Motorr (Motor m){
    return this.elmotor[0]= m;
       }
    





}

 
  
    
