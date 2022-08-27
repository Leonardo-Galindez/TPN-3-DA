import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cantFilas,cantColum;
        String frase,palabra;
        cantFilas=Modulos.CantPosFila();
        cantColum=Modulos.CantPosColum();
        String[][] MatrizString=new String[cantFilas][cantColum];
        CargaMatriz(MatrizString, cantColum, cantFilas);
        for(int i=0;i<cantFilas;i++){
            for(int j=0;j<cantColum;j++){
                System.out.println(MatrizString[i][j]+"--");
            }   
        }
    }
    public static void CargaMatriz(String[][] MatrizString,int cantColum,int cantFilas){
        String cadena,valor;
        valor="";
        for(int i=0;i<cantFilas;i++){
            for(int j=0;j<cantColum;j++){
                do {
                    cadena=IngresoFrase();
                }while(valor!="0");
                MatrizString[i][j]=cadena;
            }
        }
    }    
    public static String IngresoFrase(){
        Scanner sc= new Scanner(System.in);
        String frase;
        System.out.println("Ingrese frase");
        frase=sc.nextLine();
        return frase;
    }

}
