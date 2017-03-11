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
public class Motor {
  private String numerodeserie;
  private int cilindros;  

   public Motor(String numerodeserie, int cilindros) {
        this.numerodeserie = numerodeserie;
        this.cilindros = cilindros;
    }

        
    public String getNumerodeserie() {
        return numerodeserie;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setNumerodeserie(String numerodeserie) {
        this.numerodeserie = numerodeserie;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
  
    public void imprimirmotor(){
    System.out.println("motor con numero de serie "+ this.getNumerodeserie() + " tiene "+ this.getCilindros() +" cilindros");
    }
  
}
