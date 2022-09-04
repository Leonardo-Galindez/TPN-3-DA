import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cantFilas,cantColum;
        boolean valorOrden;
        valorOrden=false;
        do{
            cantFilas=Filas();
            cantColum=Colum();
            valorOrden=VerificarOrden(cantFilas, cantColum);
        }while(valorOrden==false);
        char [][] Matriz= new char[cantFilas][cantColum];
        cargaMatriz(Matriz, cantFilas, cantColum);
        System.out.println();
        mostrarMatriz(Matriz, cantFilas, cantColum);

    }
    public static void cargaMatriz(char [][] Matriz,int cantFilas,int cantColum){
        int mitad,i,j;
        mitad=cantColum/2;
        for(i=0; i<cantFilas;i++){
            for(j=0;j<cantColum;j++){
                if(i + j >= mitad && j - i <= mitad){

                    Matriz[i][j] = '*';

                }else{

                    Matriz[i][j] = ' ';

                }
            }
        }

        for (j=0; j<cantColum; j++){

            Matriz[cantFilas-1][j] = '*';

        }
    }
    

    public static void mostrarMatriz(char [][] Matriz,int cantFilas,int cantColum){
        for(int i=0; i<cantFilas;i++){
            for(int j=0;j<cantColum;j++){
                System.out.print(Matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void mostrarArreglo(int [] Primos,int cantColum){
        for(int i=0;i<cantColum;i++){
            System.out.print(Primos[i]);
        }
    }

    public static boolean VerificarOrden(int filas,int colum){
        boolean valorOrden;
        valorOrden=false;
        if(filas<colum && filas % 2 !=0 && colum % 2 !=0){
            valorOrden=true;
        }
        return valorOrden;
    }

    public static int Filas(){
        int filas;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese filas");
        filas=sc.nextInt();
        return filas;
    }

    public static int Colum(){
        int colum;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese Columnas");
        colum=sc.nextInt();
        return colum;
    }
} 

