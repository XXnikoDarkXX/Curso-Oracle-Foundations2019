package chickens02;

public class Chickens02 {

    public static void main(String[] args) {
        //Put yout code here

        System.out.println("Daily Average:   " + dailyAverage());
        System.out.println("Monthly Average: " + monthlyAverage());
        System.out.println("Monthly Profit:  $" + monthlyProfit());
        
        System.out.println("This is my first program");
        int a = 2;
        System.out.println("a is" + a);
     //   double doubleVar1, doubleVar2 = 3.1;
      	
    
    }

    /**
     * Funcion para calcular la media semanal de huevos cogidos
     *
     * @param egg total de huevos
     * @return la media de huevos recogido semanal
     */
    public static double dailyAverage() {
        double egg = 0;
        egg += 100;//lunes
        egg += 121;//martes
        egg += 117;//miercoles
        egg = egg / 3;
        return egg;
    }

    /**
     * Funcion para calcular la media de un mes de 30 dias
     */
    public static double monthlyAverage() {
        double huevosSemanal = dailyAverage();
        huevosSemanal = huevosSemanal * 4.2;
        return huevosSemanal;

    }

    public static double monthlyProfit() {
        double egg = 0;
        egg += 100;//lunes
        egg += 121;//martes
        egg += 117;//miercoles
        return egg * 0.18;

    }

}
