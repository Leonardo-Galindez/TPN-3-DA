public class Ejercicio13 {
    public static void main(String[] args) {

        char[][] piramide;

        piramide = crearMatriz();

        cargarPiramide (piramide);
        mostrarMatriz (piramide);

    }

    public static char[][] crearMatriz(){

        char[][] matriz;
        int filas, columnas;
        boolean validez;

        validez = true;

        do{

            System.out.println("Ingrese la cantidad de filas: (impar)");
            filas = TecladoIn.readInt();

            System.out.println("Ingrese la cantidad de columnas: (impar)");
            columnas = TecladoIn.readInt();

            if (filas % 2 == 0  columnas % 2 == 0  filas > columnas  filas < 2  columnas < 2){

                System.out.println("Los números no son impares. Intente otra vez");

                validez = false;

            }

        }while(validez == false);

        matriz = new char[filas][columnas];

        return matriz;

    }

    public static void cargarPiramide(char[][] matriz){

        int i, j, mitad;

        i = 0;
        j = 0;
        mitad = matriz[0].length / 2;

        for (i = 0; i < matriz.length-1; i++){

            for (j = 0; j < matriz[0].length; j++){

                if(i + j >= mitad && j - i <= mitad){

                    matriz[i][j] = '';

                }else{

                    matriz[i][j] = ' ';

                }
            }
        }

        i = matriz.length-1;

        for (j = 0; j < matriz[0].length; j++){

            matriz[i][j] = '';

        }
    }

    public static void mostrarMatriz(char[][] matriz){

        int i, j;

        for (i = 0; i < matriz.length; i++){

            for (j = 0; j < matriz[0].length; j++){

                System.out.print(matriz[i][j]);

            }

            System.out.println("");

        }
    }
}
