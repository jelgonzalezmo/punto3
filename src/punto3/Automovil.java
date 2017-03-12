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

    public Automovil(String marca, int año, String modelo, Motor[] elmotor, Llanta[] llantas, Puerta[] puertas) {
        this.marca = marca;
        this.año = año;
        this.modelo = modelo;
        this.elmotor = new Motor[1];
        this.llantas = new Llanta[4];
        this.puertas = new Puerta[2];
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

    public Motor[] getElmotor() {
        return elmotor;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public Puerta[] getPuertas() {
        return puertas;
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

    public void setElmotor(Motor[] elmotor) {
        this.elmotor = elmotor;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public void setPuertas(Puerta[] puertas) {
        this.puertas = puertas;
    }

       }

 
  
    
