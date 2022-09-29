package PracticaParcial;

public class Boxeador {
    //Atributos
    private String apellido;
    private double estatura;
    private int peso;
    private char categoria;

    //Constructores

    public Boxeador(){
        this.apellido="";
        this.estatura=0;
        this.peso=0;
        setCategoria(0);
    }

    public Boxeador(String apellido,double estatura,int peso){
        this.apellido=apellido;
        this.estatura=estatura;
        this.peso=peso;
        setCategoria(peso);
    }

    //Observadores
    public String getApellido(){
        return this.apellido;
    }
    public double getEstatura(){
        return this.estatura;
    }
    public int getPeso(){
        return this.peso;
    }
    public char getCategoria(){
        return this.categoria;
    }
    public String toString(){
        return "Apellido:"+this.apellido+"Estatura:"+this.estatura+"Peso:"+this.peso+"Categoria:"+this.categoria;
    }

    //Modificadores

    public void setApellido(String apellido){

        this.apellido=apellido;

    }
    public void setEstatura(double estatura){

        this.estatura=estatura;

    }
    public void setPeso(int peso){//usamos esta
        this.peso=peso;
        setCategoria(peso);//llamada a setCategoria para establecer la categoria

    }
    private void setCategoria(int  peso){
        if(peso>94){
            this.categoria='P';
        }else{
            if(peso>79 && peso <94){
                this.categoria='C';
            }else{
                this.categoria='S';
            }
            
        }
    }
    
    //Comparadores

    public boolean equals(Boxeador nuevoBox){
        return this.apellido.equals(nuevoBox.apellido);
    }

    //Propias del tipo

    private double ObtenerIMC(){
        double imc;
        imc=this.peso/Math.pow(this.estatura,2);

        return imc;
    }

    public boolean puedeGanarleA(Boxeador boxea){
        double imc;
        imc=ObtenerIMC();
        return  imc >boxea.ObtenerIMC();
    }

}
