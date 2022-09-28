import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
       
        int cantFilas,cantColum;
        boolean valor;
        cantFilas=Modulos.CantPosFila();
        cantColum=Modulos.CantPosColum();
        char [][] MatrizCarac=new char[cantFilas][cantColum];
        /*CargarMatriz(MatrizCarac, cantFilas, cantColum);
        MostrarMatriz(MatrizCarac, cantFilas, cantColum);*/
        char [][] Matriz= {{'a','a','c'},{'a','c','a'},{'c','a','a'}};
        valor= VerificarMatriz(Matriz);
        if(valor){
            System.out.println("diagonal 2da igual");
        }
    }
    public static boolean VerificarMatriz(char [][] Matriz){

        boolean valor;
        valor=false;
        for(int i=0;i<3;i++){
            for(int j=2;j>=0;j--){
                if(Matriz[i][j]=='c'){
                    valor=true;
                }
            }
        }
        return valor;

    }
    public static void CargarMatriz(char Matriz[][],int cantFilas,int cantColum){
        Scanner sc=new Scanner(System.in);
        char carac;
        for(int i=0;i<cantFilas;i++){
            for(int j=0;j<cantColum;j++){
                System.out.println("Ingrese caracter fila:"+i+" columna:"+j);
                carac=sc.next().charAt(0);
                Matriz[i][j]=carac;
            }
        }
    }
    public static void MostrarMatriz(char Matriz[][],int cantFilas,int cantColum){
        for(int i=0;i<cantFilas;i++){
            for(int j=0;j<cantColum;j++){
                if(i==j){
                    System.out.print(Matriz[i][j]);
                }
            }
        }
    }
    
}
