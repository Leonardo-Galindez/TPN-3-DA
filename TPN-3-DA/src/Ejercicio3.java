import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cantFilas,cantColum;
        String frase,palabra;
        cantFilas=Modulos.CantPosFila();
        cantColum=Modulos.CantPosColum();
        String[][] MatrizString=new String[cantFilas][cantColum];
        System.out.println("Ingrese frase");
        frase=sc.nextLine();
        CargaMatriz(frase, MatrizString, cantColum, cantFilas);
        for(int i=0;i<cantFilas;i++){
            for(int j=0;j<cantColum;j++){
                System.out.println(MatrizString[i][j]+"--");
            }   
        }
    }
    public static void CargaMatriz(String cadena,String[][] MatrizString,int cantColum,int cantFilas){
        int lon,a;
        String palabra,frase;
        palabra="";
        frase="";
        a=0;
        lon=cadena.length();
        for(int i=0;i<cantFilas;i++){
            for(int j=0;j<cantColum;j++){
                while(a<lon){
                    if(cadena.charAt(i)!=' '){
                        frase=frase+cadena.charAt(a);
                    }else{
                        frase="";
                    }  
                    MatrizString[i][j]=palabra;
                    a++;
                }
            }
        }
    }    
}
