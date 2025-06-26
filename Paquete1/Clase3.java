package Paquete1;

public class Clase3 {

    public void useDataClase1(){
        Clase1 objeto1 = new Clase1();
        objeto1.x = 12; //public
        //Datos protegidos no se pueden usar fuera del paquete1
        // objeto1.y = 19; //protected
        objeto1.setZ(32); //private
        //Datos tipo default  no se puede usar fuera del paquete1
        //comportamiento semejante a protected
        //objeto1.w = 38; //default
    }
    
}
