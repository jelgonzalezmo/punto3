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
public class Main {
      
    
     public static void main(String[] args) {
          Automovil auto1=new Automovil("renault",1990,"mh210");
                System.out.println("auto1 es del año " + auto1.getAño()+" la marca "+auto1.getMarca()+" modelo "+ auto1.getModelo());
          Motor mot=new Motor("mj569",2);
          mot.imprimirmotor();
          Puerta pue= new Puerta("hgd74");
          pue.imprimirpuerta();
          Llanta llan=new Llanta("michelin","jh_09",15);
          llan.imprimirllantas();
    
               }      

}
