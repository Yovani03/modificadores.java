package Paquete1;

public class Clase2 extends Clase1{
    
    // Clase2 hereda de clase1, y ambas estan en el mismo paquete 
    // Por eso clase2 puede usar los datos de Clase1 como si fuera suyos


    public void setDate(){
        this.x = 12; // public
        this.y = 9; //protented
        setZ(18);
        this.w = 19;
    }
    public String getData(){
        return "Datos de Clase2: x=" + this.x + "y=" + this.y + "z=" + getZ();
    }
}
