import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int orden,i;
        boolean valorMatriz;
        valorMatriz=true;
        i=0;
        System.out.println("Ingrese orden de la matriz");
        orden=sc.nextInt();
        int [][] Matriz=new int[orden][orden];
        CargarMatriz(Matriz, orden);
        while(valorMatriz && i<orden){
            valorMatriz=VerificarMatriz(Matriz,orden,i);
            i++;
        }
        if(valorMatriz){
            System.out.println("Matriz simetrica");
        }else{
            System.out.println("Matriz antisimetrica");
        }

    }
    public static boolean VerificarMatriz(int [][] Matriz,int orden,int i){
        boolean valorMatriz;
        valorMatriz=false;
        
        for(int j=0;j<orden;j++){
            if(Matriz[i][j]==Matriz[j][i]){
                valorMatriz=true;
            }else{
                valorMatriz=false;
            }
        }
        return valorMatriz;

    }
    public static void CargarMatriz(int [][] Matriz,int orden){
        Scanner sc=new Scanner(System.in);
        int num;
        for(int i=0;i<orden;i++){
            for(int j=0;j<orden;j++){
                System.out.println("Ingrese numero");
                num=sc.nextInt();
                Matriz[i][j]=num;
            }
        }
    }
}
