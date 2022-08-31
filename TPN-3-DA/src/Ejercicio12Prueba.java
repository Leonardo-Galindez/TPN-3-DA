import java.util.Scanner;
public class Ejercicio12Prueba {
   /* 
    public static void cargarMatrizI(int[][] mat, int cantFila, int cantCol) {
        Scanner sc = new Scanner(System.in);
        int fila, col;
        System.out.println("INGRESE LOS VALORES CORRESPONDIENTES");
        for (fila = 0; fila < cantFila; fila++) {
            for (col = 0; col < cantCol; col++) {
                System.out.print(" fila [" + (fila + 1) + "] , columna [" + (col + 1)+"]:");
                mat[fila][col] = sc.nextInt();
            }
        }
    }







public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);    
        int [][]matriz;
        int []arregloFila;
        int j,mayor,aux,i,j;
       System.out.println("Igrese la cantidad de filas para la matriz");
       i=sc.nextInt();
       System.out.println("Igrese la cantidad columnas para la matriz");
       j=sc.nextInt();
        int [][]matriz = new int [i][j];
        cargarMatriz(matriz,i,j);
        boolean igual=true;
        for(int i=0;i<matriz.length;i++ ){
            arregloFila=arreglo(matriz,i);
            mayor=mayor(arreglo,i);
            j=0;
            while( j<matriz[i].length&&igual){
                if(mayor!=i){
                    aux=matriz[mayor][j];
                    matriz[mayor][j]=matriz[i][j];
                    matriz[i][j]=aux;
                    j++;
                }else{
                    igual=false;
                }
            }
            corte=true;
            for( j=0;j<matriz[i].length;j++ ){
                if(j>i){
                    matriz[i][j]=0;
                }
            }
        }
        imprimirMatrizI(matriz);
    }
    public static int mayor(int[]arr,int num){
        int pos = 0,i,mayor=0;
        for(i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    if(arr[i]>mayor){
                        mayor =arr[i];
                        pos=i;
                    }
                } 
            }
        return pos;
    }
public static int [] arreglo (int [][]matriz,int num){
        int []arreglo;
            arreglo =new int [matriz.length];
            for(int i=0;i<matriz.length;i++ ){
                    arreglo[i]=matriz[i][num];
            }
        return arreglo;
    
    }
public static void imprimirMatrizI(int[][] mat) {
        int fila, col;
        for (fila = 0; fila < mat.length; fila++) {
            for (col = 0; col < mat[fila].length; col++) {
                System.out.print("[" + mat[fila][col] + "]");
            }
            System.out.println();
        }
    }


    */   

}
