package PracticaParcial;

import java.util.Scanner;


public class testBoxeador {
    public static void main(String[] args) {
        int rta, cant,pos;
        char categoria;
        String apellido;
        boolean valorApe,valorMenu;
        valorMenu=false;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Ingrese cantidad de boxeadores");
        cant = sc.nextInt();

        Boxeador[] Boxeadores = new Boxeador[cant];
        
        do{
            rta = Menu();
            switch (rta) {
                case 1:
                    CargarBoxeador(Boxeadores);
                    break;
                case 2:
                    System.out.println("Ingrese categoria");
                    categoria = sc.next().charAt(0);
                    MostrarBoxedorPorCat(Boxeadores, categoria);
                    break;
                case 3:
                    System.out.println("Ingrese apellido");
                    apellido=sc.next();
                    pos=VerificarApellido(Boxeadores, apellido);
                
                    if(pos!=-1){
                        QueBoxeadorLeGana(Boxeadores, pos, apellido);
                    }else{
                        System.out.println("No existe el boxeador:"+apellido);
                    }
    
                    break;
                case 0:
                    valorMenu=true;
                break;
    
            }
        }while(!valorMenu);
            
        
        
    }

    public static void QueBoxeadorLeGana(Boxeador []Box,int pos,String apellido){
        Boxeador nuevoBox;
        nuevoBox= new Boxeador();
        nuevoBox = Box[pos];
        for(int i = 0; i < Box.length; i++){
            if(nuevoBox.puedeGanarleA(Box[i])){
                System.out.println("El boxeador:"+apellido+" puede ganarle a:"+Box[i].toString());
            }
        }
    }

    public static int VerificarApellido(Boxeador []Box,String apellido){
        Boxeador auxBox;
        boolean valorApe;
        int i=0,pos;
        pos=0;
        valorApe=false;
        while(i<Box.length && !valorApe){
            auxBox= new Boxeador(apellido,0,0);
            if(Box[i].equals(auxBox)){
                valorApe=true;
                pos=i; 
            }else{
                pos=-1;
            }
        }
            
        return pos;
    }

    public static void MostrarBoxedorPorCat(Boxeador[] Box, char cat) {
        for (int i = 0; i < Box.length; i++) {
            if (Box[i].getCategoria() == cat) {
                System.out.println(Box[i].toString());
            }
        }
    }

    public static void CargarBoxeador(Boxeador[] Box) {
        String apellido;
        double estatura;
        int peso;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Box.length; i++) {
            System.out.println("Ingrese apellido");
            apellido = sc.next();
            System.out.println("Ingrese estatura");
            estatura = sc.nextDouble();
            System.out.println("Ingrese peso");
            peso = sc.nextInt();
            Boxeador nuevoBox = new Boxeador(apellido, estatura, peso);
            Box[i]=nuevoBox;
        }
    }

    public static int Menu() {
        Scanner sc = new Scanner(System.in);
        int rta;
        System.out.println("Cargar los datos de los boxeadores----------------1");
        System.out.println("Mostrar todos los boxeadores de una categoria-----2");
        System.out.println("Dado un apellido que boxeaderes le gana-----------3");
        System.out.println("Finalizar-----------------------------------------0");
        rta = sc.nextInt();

        return rta;
    }
}
