import java.util.Scanner;

import javax.swing.text.MaskFormatter;
public class Ejercicio2 {
    public static void main(String[] args) {
       
        int cantFilas,cantColum;
        boolean valor;
        /*cantFilas=Modulos.CantPosFila();
        cantColum=Modulos.CantPosColum();*/
        /*CargarMatriz(MatrizCarac, cantFilas, cantColum);
        MostrarMatriz(MatrizCarac, cantFilas, cantColum);*/
        char [][] Matriz=  {{'a','a','c','d'},
                            {'a','c','d','c'},
                            {'b','d','c','a'},
                            {'f','c','a','d'}};
        valor= VerificarMatriz(Matriz);
        if(valor){
            System.out.println("diagonal 2da igual");
        }
    }
    public static boolean VerificarMatriz(char [][] Matriz){

        boolean valor;
        char letra,l;
        int lon;
        letra=' ';
        valor=false;
        lon=Matriz.length-1;
        letra=Matriz[0][Matriz.length-1];
        for(int i=0;i<=lon;i++){
            for(int j=0;j<=lon;j++){
                if(i+j == lon){
                    if(letra==Matriz[i][j]){
                        valor=true;
                    }else{
                        valor=false;
                    }
             
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
