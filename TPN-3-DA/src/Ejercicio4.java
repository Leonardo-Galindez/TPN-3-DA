import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rta,cantFilas,cantColum,posFila,mayorNota;
        float promedio,promedioTotal;
        boolean valorMenu;
        valorMenu=false;
        cantFilas=Modulos.CantPosFila();
        cantColum=Modulos.CantPosColum();
        int [][] NotasAlumnos=new int[cantFilas][cantColum];
        CargarMatriz(NotasAlumnos);
        //menu
        do{
            Texto();
            rta=sc.nextInt();
            switch(rta){
            case 1:
                promedioTotal=PromedioTotal(NotasAlumnos, cantFilas, cantColum);
                System.out.println("El promeio total de todos los alumnos es:"+promedioTotal);
            break;
            case 2:
                System.out.println("Ingrese el numero del Alumno que desea ver las notas y el promedio ");
                posFila=sc.nextInt();
                MostrarNotas(NotasAlumnos, cantColum, posFila);
                promedio=PromedioAlumno(NotasAlumnos, cantColum, posFila);
                System.out.println("El promedio es:"+promedio);
            break;
            case 3:
                mayorNota=MayorNota(NotasAlumnos, cantFilas, cantColum);
                System.out.println(" Saco la mayor nota del ultimo examen  que fue un:"+mayorNota);
            break;
            case 0:
                valorMenu=true;
                System.out.println("Operacion Finalizada");
            break;
                
            }
        }while(!valorMenu);
        
    }

    public static void Texto(){
        System.out.println();
        System.out.println("Promedio de todos sus alumnos------------1");
        System.out.println("Mostrar notas y promedio de un alumno----2");
        System.out.println("Mostrar la mayor nota del utimo examen---3");
        System.out.println("Finalizar--------------------------------0");
    }

    public static int MayorNota(int [][] NotasAlumnos,int cantFilas,int cantColum){
        int mayor,posMayor;
        mayor=0;
        posMayor=0;
        for(int i=0;i<cantFilas;i++){
            if(NotasAlumnos[i][cantColum-1]>mayor){
                mayor=NotasAlumnos[i][cantColum-1];
                posMayor=i+1;
            }
        }
        System.out.print("El alumno:"+posMayor);
        return mayor;
    }

    public static void MostrarNotas(int [][] NotasAlumnos,int cantColum,int posFila){
        for(int i=0;i<cantColum;i++){
            System.out.println("Notas:"+NotasAlumnos[posFila-1][i]+"-");
        }
    }

    public static float PromedioAlumno(int [][] NotasAlumnos,int cantColum,int posFila){
        float promedio,acumNota;
        acumNota=0;
        for(int i=0;i<cantColum;i++){
            acumNota=acumNota+NotasAlumnos[posFila-1][i];
        }
        promedio=acumNota/cantColum;
        return promedio;
    }

    public static Float PromedioTotal(int [][] NotasAlumnos,int cantFilas,int cantColum){
        float acumPromedio,promedioTotal,promedio;
        acumPromedio=0;
        for(int i=0;i<cantFilas;i++){
            promedio=PromedioAlumno(NotasAlumnos, cantColum, i+1);
            acumPromedio=acumPromedio+promedio;
        }
        promedioTotal=acumPromedio/cantFilas;
        return promedioTotal;
    }

    public static void CargarMatriz(int NotasAlumnos[][]){
        Scanner sc= new Scanner(System.in);
        int longFila,longColum,nota,ja,ia;
        longFila=NotasAlumnos.length;
        longColum=NotasAlumnos[0].length;
        for(int i=0; i<longFila;i++){
            for(int j=0;j<longColum;j++){
                ia=i+1;
                ja=j+1;
                System.out.println("Ingrese la nota del examen "+ja+" del alumno "+ia);
                nota=sc.nextInt();
                NotasAlumnos[i][j]=nota;
            }
        }
    }
}
