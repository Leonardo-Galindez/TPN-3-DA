import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int lonFila,lonColum,rta;
        lonFila=Modulos.CantPosFila();
        lonColum=Modulos.CantPosColum();
        int [][] Matriz= new int[lonFila][lonColum];
        CargarMatriz(Matriz, lonFila, lonColum);
        System.out.println();
        MostrarMatriz(Matriz, lonFila, lonColum);
        do {
            System.out.println();
            System.out.println("Por filas de atrás hacia adelante-----1");
            System.out.println("Por columnas de arriba hacia abajo----2");
            System.out.println("En espiral----------------------------3");
            System.out.println("En zig-zag----------------------------4");
            System.out.println("Finalizar-----------------------------0");
            rta=sc.nextInt();
            Menu(Matriz, lonFila, lonColum, rta);
        } while (rta!=0);
        
        
    }
    public static void Menu(int [][] Matriz,int lonFila,int lonColum,int rta){
        switch(rta){
            case 1:
                FilaAtrasAdelante(Matriz, lonFila, lonColum);
            break;
            case 2:
                ColumArribaAbajo(Matriz, lonFila, lonColum);
            break;
            case 3:
                System.out.println();
                MostrarEspiral(Matriz, lonFila, lonColum);
            break;
            case 4:
                MostrarZigZag(Matriz, lonFila, lonColum);
            break;
        }
    }
    public static void MostrarEspiral(int [][] Matriz,int lonFila,int lonColum){
    } 
   
    public static void DerechaIzquierda(int [][] Matriz,int lonFila,int lonColum,int posFila,int posColum){
        for(int k=lonColum-2;k>=0;k--){
            System.out.print(Matriz[lonFila-1][k]);
        }
    }
    public static void AbajoArriba(int [][] Matriz,int lonFila,int lonColum,int posFila,int posColum){
        for(int h=lonFila-2;h>0;h--){
            System.out.print(Matriz[h][posColum]);
        }
    }
    public static void derecha(int [][] Matriz,int lonFila,int lonColum,int pointIncial,int pointFinal){
        for(int i=pointIncial;i<pointFinal;i++){
            System.out.println("");
        }
    }

    public static void MostrarZigZag(int [][] Matriz,int lonFila,int lonColum){
        for(int i=0;i<lonFila;i++){
            if(i%2==0){
                for(int j=0;j<lonColum;j++){
                    System.out.print(Matriz[i][j]+" ");          
                }
                System.out.println();
            }else{
                for(int j=lonColum-1;j>=0;j--){
                    System.out.print(Matriz[i][j]+" ");          
                }
                System.out.println();
            }
        }
    }

   
    public static void ColumArribaAbajo(int [][] Matriz,int lonFila,int lonColum){
        for(int i=lonFila-1;i>=0;i--){
            for(int j=0;j<lonColum;j++){
                System.out.print(Matriz[i][j]+" ");          
            }
            System.out.println();
        }
    }

        
    public static void FilaAtrasAdelante(int [][] Matriz,int lonFila,int lonColum){
        for(int i=0;i<lonFila;i++){
            for(int j=lonColum-1;j>=0;j--){
                System.out.print(Matriz[i][j]+" ");          
            }
            System.out.println();
        }
    }

    public static void MostrarMatriz(int [][] Matriz,int lonFila,int lonColum){
        for(int i=0;i<lonFila;i++){
            for(int j=0;j<lonColum;j++){
                System.out.print(Matriz[i][j]+" ");          
            }
            System.out.println();
        }
    }
    

    public static void CargarMatriz(int [][] Matriz,int lonFila,int lonColum){
        Scanner sc= new Scanner(System.in);
        int num;
        for(int i=0;i<lonFila;i++){
            for(int j=0;j<lonColum;j++){
                System.out.println("Ingrese numero\nfila:"+i+"\ncolumna:"+j);   
                num=sc.nextInt();   
                Matriz[i][j]=num;          
            }
        }
    }

}
