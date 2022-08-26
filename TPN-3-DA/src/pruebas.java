import java.util.Scanner;
public class pruebas {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cant,lon;
        String frase,palabra;
        cant=Modulos.CantPosColum();
        String[]MatrizString=new String[cant];
        System.out.println("Ingrese frase de "+cant+"palabras");
        frase=sc.nextLine();
        lon=frase.length();
        for(int i=0;i<cant;i++){
            palabra=SepararFrase(frase,lon);
            MatrizString[i]=palabra;
            System.out.print(MatrizString[i]+"-");
        }
        
        
    }
    public static String SepararFrase(String frase,int lon){
        int i,espacio;
        String palabra;
        boolean valor;
        valor=false;
        palabra="";
        i=0;
        while(!valor){
            if(frase.charAt(i)!=' '){
                palabra=palabra+frase.charAt(i);
            }else{
                valor=true;
                espacio=i;
            }
            i++;
        }
        return palabra;
    }
    public static void CargarMatriz(String[]MatrizString,String frase,int cant){

        for(int i=0;i<cant;i++){

        }
    }
       
}
