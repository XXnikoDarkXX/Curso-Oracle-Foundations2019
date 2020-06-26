/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;//esta variable lo usaremos para elegir las opciones del juego
        
        double decimal=0.0;
        System.out.println("----Historia de guera ----");
        System.out.println("Eres pepe tienes 22 años, estan en mitad de una guerra en una trinchera, tienes dos opciones\n"
                + "1- Recorger arma \n"
                + "2- Salvar soldado");
        byte juego = Byte.parseByte(sc.nextLine());
        if (juego == 1) {
            System.out.println("Recogistes un arma vas a matar a un enemigo que esta a tu espalda si/no?");
            opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("si")) {
                System.out.println("Matastes al enemigo");
            }else if(opcion.equalsIgnoreCase("no")){
                System.out.println("Ahora estas muerto game over");
            }
        }else if(juego==2){
            System.out.println("Salvastes al soldado Ryan pero te van a dispara a que velocidad de disparo? usa numero con decimales");
            decimal=Double.parseDouble(sc.nextLine());
        }
        
        System.out.println("Pasastes a la fase 2!!!\n  en esta fase hay que tener mas cuidado vamos a hacer una suma\n");

        System.out.println("Escribe un numero");
        int numero1=Integer.parseInt(sc.nextLine());
        System.out.println("Escribe otro numero");
        int numero2=Integer.parseInt(sc.nextLine());
        int suma =numero1+numero2;
        System.out.println("La suma es "+suma);
        System.out.println("----Fase 4 ---\nASi se que ha sido un poco tonto todo lo que he hecho pero no sabia como seguir la historia\n"
                + "La suma que acabas de hacer es muy importante pues sera tu vida jaja");
        System.out.println("Tienes dos lugares a donde ir a cual de ellos irias?");
        System.out.println("1- La stonka\n1- El pento");
        opcion=sc.nextLine();
        if (opcion.equalsIgnoreCase("La stonka")) {
            System.out.println("Bien ahora lucharas contra 10 soldados que tienen de vida 4 puntos mas te vale haber dado buena suma");
            System.out.println("Pero antes dime que velocidad en decimal crees que pueden tener ellos");
          decimal=Double.parseDouble(sc.nextLine());
            int soldados=40;
            suma=suma-soldados;
            System.out.println(suma<0?"has muerto":"Vives por poco tienes de vida"+ suma);
            
        }else if(opcion.equalsIgnoreCase("El pento")){
            System.out.println("No paso nada jaja elegistes bien pero antes dime que velocidad quieres disparar en decimales");
            decimal=Double.parseDouble(sc.nextLine());
        }
        
        
        System.out.println("--Fase 5 :)----");
        System.out.println("Vas muy bien aun nos queda 5 entradas mas te has topado con un jefe viene ahora lo alucinante es"
                + "que yan o se lucha con la vida si no con la velocidad que pusistes en la anterior fase jajaja tu velocidad"
                + "\n sera calculada aleatoriamente de 1-100 ;)");
     double miVelocidad=Math.random()*100+1;
        double total=miVelocidad-decimal;
        System.out.println("El total es "+total);
        char sobrevivir ='a';
        if (total>0) {
            System.out.println("Sobrevivistes");
           sobrevivir ='s';
        }else if(total<0){
            System.out.println("Moristes");
            sobrevivir ='m';
        }else{
            System.out.println("Jodistes el juego");
        }
        if (sobrevivir =='a') {
            System.out.println("---Fase 6: ---- \n seguimos con el juego hay que hace un par de entradas mas\n"
                    + "Bosque \n Ciudad");
            opcion=sc.nextLine();
            
            switch(opcion){
                case "Bosque":
                    System.out.println("Estas en el bosque te has quedado sin balas quieres recoger un hacha?\n"
                            + "si/no");
                    opcion=sc.nextLine();
                    if (opcion.equalsIgnoreCase("si")) {
                        System.out.println("Te salvastes recogistes el hacha y matastes al que estaba a tu espalda");
                        
                    }else{
                        System.out.println("Moristes jaja había un hombre a tu espalda que te metio to la lanza");
                    }
                    break;
                case "Ciudad":
                    System.out.println("Estas en la ciudad elige uno de las siguientes opciones\n"
                            + "1- Comprar Armadura"
                            + "2- Comprar Municion"
                            + "3- Ir a la taberna");
                    juego=Byte.parseByte(sc.nextLine());
                    if (juego==1) {
                        System.out.println("Comprastes una armadura se aumentara a 10 tu vida");
                        suma+=10;
                        System.out.println("Esta es tu vida"+suma);
                        if (suma<0) {
                            System.out.println("Juego finalizado");
                        }
                    }else if(juego==2){
                        System.out.println("Comprastes municion bien hecho");
                    }else if(juego==3){
                        System.out.println("Estas en la taberna quieres descansar o beber?");
                        opcion=sc.nextLine();
                        if (opcion.equalsIgnoreCase("beber")) {
                            System.out.println("Elegistes beber y se te restara 3 de vida jajajaj");
                            suma=suma-3;
                            System.out.println("Esta es tu vida "+suma);
                            if (suma<0) {
                                System.out.println("Moristes juego finalizado");
                            }
                        }
                    }
                    
                    break;
        }
            
        }
    }

}
