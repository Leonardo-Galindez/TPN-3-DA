package PracticaParcial;

import java.util.Scanner;

public class CantVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Cadenas = { "Hola", "mundo", "Bievenidos" };
        int posMayor;
        posMayor = ContVocales(Cadenas);
        System.out.println(Cadenas[posMayor]);
    }

    public static int ContVocales(String[] Cadenas) {
        int contVocales, mayor, posMayor;
        String palabra;
        mayor = 0;
        posMayor = 0;
        contVocales = 0;
        palabra = "";
        for (int i = 0; i < Cadenas.length; i++) {
            palabra = Cadenas[i];
            for (int j = 0; j < palabra.length(); j++) {
                if (palabra.charAt(j) == 'a' || palabra.charAt(j) == 'e' || palabra.charAt(j) == 'i'
                        || palabra.charAt(j) == 'o' || palabra.charAt(j) == 'u') {
                    contVocales++;
                }
            }
            if (mayor < contVocales) {
                mayor = contVocales;
                posMayor = i;
            }
            contVocales = 0;//resetiar el contador para analizar otra palabra
        }
        return posMayor;
    }
}
