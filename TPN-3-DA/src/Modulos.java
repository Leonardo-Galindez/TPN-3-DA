import java.util.Scanner;
public class Modulos {
    public static int CantPosColum(){
        Scanner sc= new Scanner(System.in);
        int PosColum;
        System.out.println("Ingrese cantidad columnas de la Matriz");
        PosColum=sc.nextInt();
        return PosColum;
    }

    public static int CantPosFila(){
        Scanner sc= new Scanner(System.in);
        int PosFila;
        System.out.println("Ingrese cantidad filas de la Matriz");
        PosFila=sc.nextInt();
        return PosFila;
    
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
}
