import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int orden, rta;
        orden = Modulos.OrdenMatriz();
        int[][] Matriz = new int[orden][orden];
        CargarMatriz(Matriz, orden, orden);
        System.out.println();
        MostrarMatriz(Matriz, orden);
        do {
            System.out.println();
            System.out.println("Por filas de atrás hacia adelante-----1");
            System.out.println("Por columnas de arriba hacia abajo----2");
            System.out.println("En espiral----------------------------3");
            System.out.println("En zig-zag----------------------------4");
            System.out.println("Finalizar-----------------------------0");
            rta = sc.nextInt();
            Menu(Matriz, orden, rta);
        } while (rta != 0);

    }

    public static void Menu(int[][] Matriz, int orden, int rta) {
        switch (rta) {
            case 1:
                FilaAtrasAdelante(Matriz, orden);
                break;
            case 2:
                ColumArribaAbajo(Matriz, orden);
                break;
            case 3:
                System.out.println();
                MostrarEspiral(Matriz, orden);
                break;
            case 4:
                MostrarZigZag(Matriz, orden);
                break;
        }
    }

    public static void MostrarEspiral(int[][] Matriz, int orden) {
        int ordenSub,i;
        i=0;
        ordenSub = orden;
        boolean valor;
        valor=false;
        while(i<orden && !valor){
            for (int j = i; j < ordenSub; j++) {
                System.out.print(Matriz[i][j]);
            }
            for (int j = i + 1; j < ordenSub; j++) {//le sumamos 1 a la fila para no mostrar devuelta el elemento 0,4
                System.out.print(Matriz[j][ordenSub - 1]);
            }
            for (int j = ordenSub - 2; j >= i; j--) {
                System.out.print(Matriz[ordenSub - 1][j]);
            }
            for (int j = ordenSub - 2; j > i; j--) {
                System.out.print(Matriz[j][i]);
            }
            ordenSub--;
            
            i++;
        }
    }

    public static void DerechaIzquierda(int[][] Matriz, int orden, int posFila, int posColum) {
        for (int k = orden - 2; k >= 0; k--) {
            System.out.print(Matriz[orden - 1][k]);
        }
    }

    public static void AbajoArriba(int[][] Matriz, int orden, int posFila, int posColum) {
        for (int h = orden - 2; h > 0; h--) {
            System.out.print(Matriz[h][posColum]);
        }
    }

    public static void derecha(int[][] Matriz, int orden, int pointIncial, int pointFinal) {
        for (int i = pointIncial; i < pointFinal; i++) {
            System.out.println("");
        }
    }

    public static void MostrarZigZag(int[][] Matriz, int orden) {
        for (int i = 0; i < orden; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < orden; j++) {
                    System.out.print(Matriz[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int j = orden - 1; j >= 0; j--) {
                    System.out.print(Matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void ColumArribaAbajo(int[][] Matriz, int orden) {
        for (int i = orden - 1; i >= 0; i--) {
            for (int j = 0; j < orden; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void FilaAtrasAdelante(int[][] Matriz, int orden) {
        for (int i = 0; i < orden; i++) {
            for (int j = orden - 1; j >= 0; j--) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void MostrarMatriz(int[][] Matriz, int orden) {
        for (int i = 0; i < orden; i++) {
            for (int j = 0; j < orden; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void CargarMatriz(int[][] Matriz, int lonFila, int lonColum) {
        Scanner sc = new Scanner(System.in);
        int num;
        for (int i = 0; i < lonFila; i++) {
            for (int j = 0; j < lonColum; j++) {
                System.out.println("Ingrese numero\nfila:" + i + "\ncolumna:" + j);
                num = sc.nextInt();
                Matriz[i][j] = num;
            }
        }
    }

}
