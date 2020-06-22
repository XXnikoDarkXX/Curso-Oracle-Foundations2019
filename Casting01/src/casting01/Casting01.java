
package casting01;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
     //   byte numero= 128;Se queja porque el valor maximo de un byte es 127
        byte numero=127;
        
        System.out.println(numero);
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte

        short numero2=128;
        System.out.println((byte)numero2);//lo que hace es poner -128 pues el byte solo permite un valor positivo maximo de 127
        
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again

        byte numero3=127;
        numero3+=1;
        System.out.println(numero3);
        numero3+=1;
        System.out.println(numero3);
        
        int numer=53;
        int num2=47;
        byte num3;
       
        
    }    
}
