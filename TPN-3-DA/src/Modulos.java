import java.util.Scanner;
public class Modulos {
    public static int CantPosColum(){
        Scanner sc= new Scanner(System.in);
        int PosColum;
        System.out.println("Ingrese cantidad columnas");
        PosColum=sc.nextInt();
        return PosColum;
    }

    public static int CantPosFila(){
        Scanner sc= new Scanner(System.in);
        int PosFila;
        System.out.println("Ingrese cantidad filas");
        PosFila=sc.nextInt();
        return PosFila;
    
    }
}
