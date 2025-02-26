import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Para subir a la branch
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        double imc, peso, estatura;
        System.out.println("ingrese su peso: ");
        peso = teclado.nextDouble();

        System.out.println("Ingrese su estatura: ");
        estatura = teclado.nextDouble();

        imc = peso / (estatura * estatura);
        if (imc < 18.49) {
            System.out.println("El indice de su masa corporal es: " + imc + "bajo");
        } else if (imc <= 24.99){
            System.out.println("El indice de su masa corporal es: " + imc + " normal");
        } else if (imc <= 29.99) {
            System.out.println("El indice de su masa corporal es: " + imc + "sobre peso");
        } else if (imc <= 34.99) {
            System.out.println("El indice de su masa corporal es: " + imc + "obesidad leve");
        } else if (imc <= 39.99){
            System.out.println("El indice de su masa corporal es: " + imc + "obesidad media");
        } else {
            System.out.println("El indice de su masa corporal es: " + imc + "obesidad morvida");
        } */
        //Aleatorio
            Scanner teclado = new Scanner(System.in);
            int min = 5;
            int max = 100;
            Random ale = new Random();
            int numero = ale.nextInt((max - min +1)) + min;

        }
    }