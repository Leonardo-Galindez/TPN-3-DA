import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int lonFila,lonColum;
        lonFila=Modulos.CantPosFila();
        lonColum=Modulos.CantPosColum();
        int [][] Matriz=new int[lonFila][lonColum];
        int [] Numeros= new int[lonFila];
    }
    public static void CargarMatriz(int [][] Matriz,int lonFila,int lonColum){
        for(int i=0;i<lonFila;i++){
            for(int j=0;j<lonColum;j++){
                System.out.println("Ingrese numero");
            }
        }
    }
    public static void CargarArreglo(int [][] Matriz,int lonFila){
        for(int i=0;i<lonFila;i++){
            
        }
    }
}
