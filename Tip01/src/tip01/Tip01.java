
package tip01;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        double totalPersona1;
        
        double persona1= 10*5;//calculamos primero los impuestos
        persona1= (persona1/100);
        //se lo sumamos al total de la persona 1
        totalPersona1=persona1;
        persona1=10*15;
        persona1=persona1/100;
        totalPersona1+=persona1+10;
        System.out.println(totalPersona1);
        
    }
    /**
     * 
     * @param importeInicio el importe inicial
     * @param impuestos
     * @param propina
     * @return 
     */
    public static double calcularTotal(byte importeInicio,byte impuestos,byte propina){
        double total;
        double semiTotal;
        semiTotal=importeInicio*impuestos;
        semiTotal=semiTotal/100;
        total=semiTotal;
        semiTotal=importeInicio*propina;
        
        
        
    }
}
