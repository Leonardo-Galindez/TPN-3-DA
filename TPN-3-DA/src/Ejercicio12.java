import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int orden,posMayor;
        System.out.println("Ingrese orden de la matriz");
        orden=sc.nextInt();
        int [][] Matriz= new int[orden][orden];
        int [] ArregloAux = new int[orden];
        CargarMatriz(Matriz,orden);
        MostrarMatriz(Matriz, orden);
        for(int j=0;j<orden;j++){
            posMayor=MayorNumero(Matriz, orden,j);
            ArregloAux(Matriz,ArregloAux,orden,posMayor,j);
            IntercambioFilas(Matriz, ArregloAux, orden, posMayor, j);
            
        }
        MostrarMatriz(Matriz, orden);
        

    } 
    public static void IntercambioFilas(int [][] Matriz,int ArregloAux[],int orden,int posMayor,int j){
        for(int i=0;i<orden;i++){
            Matriz[posMayor][i]=ArregloAux[i];
        }
    }
    
    public static int[] ArregloAux(int [][] Matriz,int ArregloAux[],int orden,int posMayor,int j){
        for(int i=0;i<orden;i++){
            ArregloAux[i]=Matriz[j][i];
        }
        return ArregloAux;
    }

    public static int MayorNumero(int [][] Matriz,int orden,int j){
        int mayor,posMayor;
        posMayor=0;
        mayor=0;
        for(int i=0;i<orden;i++){
            if(mayor<Matriz[i][j]){
                mayor=Matriz[i][j];
                posMayor=i;
            }
        }
        return posMayor;
    }

    public static void MostrarMatriz(int [][] Matriz,int orden){
        for(int i=0;i<orden;i++){
            for(int j=0;j<orden;j++){
                System.out.print(Matriz[i][j]+" ");          
            }
            System.out.println();
        }
    }

    public static void CargarMatriz(int [][] Matriz,int orden){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Ingrese numeros");
        for(int i=0; i<orden;i++){
            for(int j=0;j<orden;j++){
                num=sc.nextInt();
                Matriz[i][j]=num;
            }
        }
    }
}