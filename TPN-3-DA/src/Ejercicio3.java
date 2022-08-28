import java.util.Scanner;
//problema si ingreso una frase de menos palabras o mas que la cantidad de columnas me tira error
//traza
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cantFilas,cantColum,i,j,rta;
        cantFilas=Modulos.CantPosFila();
        cantColum=Modulos.CantPosColum();
        String[][] MatrizString=new String[cantFilas][cantColum];
        InicializarMatriz(MatrizString, cantFilas, cantColum);
        IngresoCadena(MatrizString, cantFilas, cantColum);
        MostrarMatriz(MatrizString, cantFilas, cantColum);
        sc.nextInt();
        do{
            System.out.println("Ingrese posicion de la palabra ");
            System.out.println("Ingrese Fila");
            i=sc.nextInt();
            System.out.println("Ingrese Columna");
            j=sc.nextInt();
            System.out.println(MatrizString[i-1][j-1]);
            System.out.println("Desea buscar otra palabra'1' si '0' no");
            rta=sc.nextInt();
        }while(rta!=0);
    }
    public static void IngresoCadena(String [][] MatrizString,int cantFilas,int cantColum){
        Scanner sc= new Scanner(System.in);
        String frase;
        for(int j=0;j<cantFilas;j++){
            System.out.println("Ingrese frase de "+cantColum+" palabras");
            frase=sc.nextLine();
            CargarMatriz(MatrizString,frase,cantColum,j);
        }
    }
    public static void CargarMatriz( String[][] MatrizString,String frase,int cantColum,int cantfilas){
        int lon,j;
        j=0;
        frase=frase+' ';
        lon=frase.length();
        for(int i=0;i<cantColum;i++){
            while(frase.charAt(j)!=' ' && j<lon){
                MatrizString[cantfilas][i]=MatrizString[cantfilas][i]+frase.charAt(j);
                j++;
            }
            j++;
        }
    }
    public static void InicializarMatriz(String[][] MatrizString,int cantFilas,int cantColum){
        for(int i=0;i<cantFilas;i++){
            for(int j=0;j<cantColum;j++){
                MatrizString[i][j]="";
            }
        }
    }
    public static void MostrarMatriz(String[][] MatrizString,int cantFilas,int cantColum){
        for(int i=0;i<cantFilas;i++){
            for(int j=0;j<cantColum;j++){
                System.out.print(MatrizString[i][j]+" ");
            }   
            System.out.println();
        }
    }
}
