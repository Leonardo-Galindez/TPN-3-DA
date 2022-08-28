import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int orden,numBase,j,i;
        i=0;
        j=0;
        boolean valorDiagonal,valorColum,valorFila;
        valorFila=true;
        valorColum=true;
        System.out.println("Ingrese orden de la matriz");
        orden=sc.nextInt();
        int [][] CuadroMagico = new int [orden][orden];
        CargarMatriz(CuadroMagico, orden);
        MostrarMatriz(CuadroMagico, orden);
        numBase=NumeroBase(CuadroMagico, orden);
        sc.nextLine();
        System.out.println(numBase);
        valorDiagonal=VerificarDiagonal(CuadroMagico, orden);
        while(valorFila && i<orden){
            valorFila=VerificarFila(CuadroMagico, orden, i);
            i++;
        } 
        while(valorFila && j<orden){
            valorFila=VerificarColum(CuadroMagico, orden, j);
            j++;
        } 
        if(valorDiagonal && valorFila && valorColum){
            System.out.println("Es un Cubo Magico");
        }else{
            System.out.println("No es un cubo magico");
        }
    }
    //terminado
    public static boolean VerificarDiagonal(int [][] CuadroMagico,int orden){
        int numBase,acum;
        boolean valorDiagonal;
        valorDiagonal=false;
        acum=0;
        numBase=NumeroBase(CuadroMagico, orden);
        for(int i=0;i<orden;i++){
            for(int j=0;j<orden;j++){
                if(i==j){
                    acum=acum+CuadroMagico[i][j];
                }
            }
        }
        if(acum==numBase){
            valorDiagonal=true;
        }
        return valorDiagonal;
    }

    public static boolean VerificarFila(int [][] CuadroMagico,int orden,int fila){
        int numBase,acum,i;
        i=0;
        boolean valorFila;
        valorFila=false;
        acum=0;
        numBase=NumeroBase(CuadroMagico, orden);
        for(i=0;i<orden;i++){
            acum=acum+CuadroMagico[fila][i];
            if(acum==numBase){
                valorFila=true;
            }
        }
        return valorFila;
    }

    public static boolean VerificarColum(int [][] CuadroMagico,int orden,int colum){
        int numBase,acum,i;
        i=0;
        boolean valorColum;
        valorColum=false;
        acum=0;
        numBase=NumeroBase(CuadroMagico, orden);
        for(i=0;i<orden;i++){
            acum=acum+CuadroMagico[i][colum];
            if(acum==numBase){
                valorColum=true;
            }
        }
        
        return valorColum;
    }

     //terminado
    public static int NumeroBase(int [][] CuadroMagico,int orden){
        int numero,acum;
        acum=0;
        for(int i=0;i<orden;i++){
            for(int j=0;j<orden;j++){
                acum=acum+CuadroMagico[i][j];
            }
            System.out.println();
        }
        numero=acum/orden;
        return numero;
    }
     //terminado
    public static void MostrarMatriz(int [][] CuadroMagico,int orden){
        for(int i=0;i<orden;i++){
            for(int j=0;j<orden;j++){
                System.out.print(CuadroMagico[i][j]+" "); 
            }
            System.out.println();
        }
    }
    //terminado
    public static void CargarMatriz(int [][] CuadroMagico,int orden){
        Scanner sc =new Scanner(System.in);
        int num;
        for(int i=0;i<orden;i++){
            for(int j=0;j<orden;j++){
                System.out.println("Ingrese Numero");
                num=sc.nextInt();
                CuadroMagico[i][j]=num;
            }
        }
    }
}
