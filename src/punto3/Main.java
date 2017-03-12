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
         Motor[] elmotor =new Motor[1];
         elmotor [0]= new Motor("tel_78945",2);
         Puerta  [] puertas=new Puerta[2];
         puertas [0]=new Puerta("corrediza");
         puertas [1]=new Puerta("corrediza");
         Llanta  [] llantas=new Llanta[4];
         llantas [0]=new Llanta ("michelin","mlh-98003",13);
         llantas [1]=new Llanta ("michelin","mlh-98003",13);
         llantas [2]=new Llanta ("michelin","mlh-98003",13);
         llantas [3]=new Llanta ("michelin","mlh-98003",13);
         
         
         Automovil auto1=new Automovil("renault",2001,"captur",elmotor,llantas,puertas);
     }
}
