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
public class Llanta {
    private String marca;
    private String modelo;
    private int tamanopulgadas;

    public Llanta(String marca, String modelo, int tamanopulgadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanopulgadas = tamanopulgadas;
    }

   

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getTamanopulgadas() {
        return tamanopulgadas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamanopulgadas(int tamanopulgadas) {
        this.tamanopulgadas = tamanopulgadas;
    }

 public void imprimirllantas(){
    System.out.println("la marca de la llanta es "+ this.getMarca() + " modelo  "+ this.getModelo() + " de tamano "+ this.getTamanopulgadas()+" pulgadas");
    }

}
