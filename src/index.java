


import java.util.Scanner;


public class index {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el ángulo");
        double angulo = sc.nextDouble();    
        double rad = Math.toRadians(angulo);
        double es = (0.5*Math.pow(10, -8))*100; //error esperado
        double ea = 100; // error aproximado
        int cont = 1, exponente = 3;
        double val= rad, valAnt = 0;

        while (ea > es){
            valAnt = val;
            if (cont % 2 == 0) {
                // suma
                val += Math.pow(rad, exponente) / fact(exponente);
            }else{ // resta
                val -= Math.pow(rad, exponente) / fact(exponente);
            }

            ea = Math.abs((val-valAnt)/val)*100;
            exponente += 2;
            cont++;

            System.out.println("Resultado de la iteracion " + cont + " : " + ea);
        }

        System.out.println("resultado: " + val);
        System.out.println("Error Aproximado (ea): "+ea);
        System.out.println("Iteraciones: "+ cont);
    }

    public static double fact(int n){
        double result = 1;
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;

    }

}
