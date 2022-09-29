package PracticaParcial;
public class SumaFc {
    public static void main(String[] args) {

        int[][] Matriz = {  { 1, 1, 1 },
                            { 1, 1, 1 },
                            { 1, 1, 1} };
        int sumaF,sumaC,i;
        sumaF=0;
        sumaC=0;
        i=0;
        boolean valorMatriz;
        valorMatriz=true;

        while(i<Matriz.length && valorMatriz){
            for(int j=0;j<Matriz.length;j++){
                sumaF=sumaF+Matriz[i][j];
            }
            for(int j=0;j<Matriz.length;j++){
                sumaC=sumaC+Matriz[j][i];
            }
            if(sumaF<sumaC){
               valorMatriz=false;
            }
            sumaC=0;
            sumaF=0;
            i++;
        }
            
                          
    }
}
