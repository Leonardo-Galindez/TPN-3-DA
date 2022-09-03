import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int cantFila,cantColum;

        cantFila=Modulos.CantPosFila();
        cantColum=Modulos.CantPosColum();

        int [][] Matriz= new int[cantFila][cantColum];
        int [][] Traspuesta= new int  [cantColum][cantFila];

        CargaMatriz(Matriz, cantFila, cantColum);
        System.out.println();
        MostrarMatriz(Matriz, cantFila, cantColum);
        MatrizTraspuesta(Matriz, Traspuesta, cantFila, cantColum);
        System.out.println();
        MostrarMatriz(Traspuesta, cantColum, cantFila);
      
    }
    public static void MatrizTraspuesta(int [][] Matriz,int[][] Traspuesta, int cantFila,int cantColum){
        for(int i=0;i<cantFila;i++){
            for(int j=0;j<cantColum;j++){
                Traspuesta[j][i]=Matriz[i][j];
            }
        }
    }

    public static void MostrarMatriz(int [][] Matriz,int cantFila,int cantColum){
        for(int i=0;i<cantFila;i++){
            for(int j=0;j<cantColum;j++){
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void CargaMatriz(int [][] Matriz,int cantFila,int cantColum){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Ingrese numero"); 
        for(int i=0;i<cantFila;i++){
            for(int j=0;j<cantColum;j++){
                num=sc.nextInt();
                Matriz[i][j]=num;
            }
        }
    }
}
