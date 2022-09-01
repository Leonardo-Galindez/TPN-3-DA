import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int lonFila,lonColum,posColum;

        lonFila=Modulos.CantPosFila();
        lonColum=Modulos.CantPosColum();
        int [][] Matriz=new int[lonFila][lonColum];
        int [] Numeros= new int[lonColum];
        CargarMatriz(Matriz, lonFila, lonColum);
        MostrarMatriz(Matriz, lonFila, lonColum);
        System.out.println();
        System.out.println("Ingrese colum de la matriz para el arreglo");
        posColum=sc.nextInt();
        AsignarColum(Matriz, Numeros, lonFila, lonColum, posColum-1);
        System.out.println();
        MostrarArreglo(Numeros, lonFila, lonColum);

    }

    public static void AsignarColum(int [][] Matriz,int [] Numeros,int lonFila,int lonColum,int posColum){
        for(int i=0;i<lonFila;i++){ 
            for(int j=0;j<lonColum;j++){
                if(j==posColum){
                    Numeros[i]=Matriz[i][posColum];
                }
            }
        }
    }

    public static void MostrarMatriz(int [][] Matriz,int lonFila,int lonColum){
        for(int i=0;i<lonFila;i++){
            for(int j=0;j<lonColum;j++){
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void MostrarArreglo (int []Numeros,int lonFila,int lonColum){
        for(int i=0;i<lonFila;i++){
            System.out.print(Numeros[i]+" ");
            
        }
    }

    public static void CargarMatriz(int [][] Matriz,int lonFila,int lonColum){
        int num;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<lonFila;i++){
            for(int j=0;j<lonColum;j++){
                System.out.println("Ingrese numero");
                num=sc.nextInt();
                Matriz[i][j]=num;
            }
        }
    }
}
