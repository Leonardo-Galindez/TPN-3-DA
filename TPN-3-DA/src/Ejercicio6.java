import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int posFila,rta;
        posFila=Modulos.CantPosFila();
        float [][] Socios= new float [posFila][12];
        int lonFila,lonColum,deuda;
        deuda=0;
        lonFila=Socios.length;
        lonColum=Socios[0].length;
        CargarMatriz(Socios);
        do{
            System.out.println();
            System.out.println("Socios que deben 3 o mas cuotas------------------------------1");
            System.out.println("Socios que no deben ninguna cuota----------------------------2");
            System.out.println("Mostrar el socio que que tenga la mayor deuda----------------3");  
            System.out.println("Mostrar el mes que tenga la mayor deuda de todos los socios--4");
            System.out.println("Finalizar----------------------------------------------------0");
            rta=sc.nextInt();
            Menu(Socios,rta,lonFila,lonColum);
        }while(rta!=0);
            
    }

    public static void Menu(float [][] Socios,int rta,int lonFila,int lonColum){
        int CantDeuda,j;
        boolean ValorDeuda;
        switch(rta){
            case 1:
                for(int i=0;i<lonFila;i++){
                    CantDeuda=DeudasSocio(Socios, i,lonFila,lonColum);
                    if(CantDeuda>=3){
                        j=i+1;
                        System.out.println("El socio "+j+" adeuda mas de 3 cuotas");
                    }
                }
            break;
            case 2:
                for(int i=0;i<lonFila;i++){
                    ValorDeuda=ListaSocioNoDeuda(Socios, i, lonFila, lonColum);
                    if(ValorDeuda){
                        j=i+1;
                        System.out.println("El socio " + j +" no tiene deudas");
                    }
                }
            break;
            case 3:
            break;
            case 4:
            break;
            case 0:
            break;
        }
    }
    public static int DeudasSocio(float [][] Socios,int fila,int lonFila,int lonColum){
        int deuda;
        deuda=0;
      
        for(int i=0;i<lonColum;i++){
            if(Socios[fila][i]!=0){
                deuda++;
            }
        }

        return deuda;
    }
    public static boolean ListaSocioNoDeuda(float [][] Socios,int fila,int lonFila,int lonColum){
        int Nodeuda,i;
        boolean valorDeuda;
        valorDeuda=true;
        Nodeuda=0;
        i=0;
        
        while(valorDeuda && i<lonColum){
            if(Socios[fila][i]!=0){
                valorDeuda=false;
            }
            i++;
        }
        return valorDeuda;
    }

    public static void CargarMatriz(float [][] Socios){
        Scanner sc= new Scanner(System.in);
        int lonFila,lonColum,socio,deudaPos;
        float deuda;

        lonFila=Socios.length;
        lonColum=Socios[0].length;
        for(int i=0;i<lonFila;i++){
            for(int j=0;j<lonColum;j++){
                socio=i+1;
                deudaPos=j+1;
                System.out.println("socio "+socio+" ingrese deuda "+deudaPos);
                deuda=sc.nextFloat();
                Socios[i][j]=deuda;
            }
        }
    }
}
