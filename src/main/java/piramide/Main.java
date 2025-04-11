package piramide;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura (>=3): ");
        int altura = sc.nextInt();
        Metodos piramide = new Metodos(altura);
        piramide.dibujarPiramideNormal();
        piramide.dibujarLineasCentrales();
    }
}