
import Paquete1.Clase1;

public class Hijo extends Padre{
    private int variable3;

    public Hijo(){
        super();
    }

    public int getVariable3() {
        return variable3;
    }

    public void setVariable3(int variable3) {
        this.variable3 = variable3;
    }

    //Modificar las variables de la clase Padre
    public void setVarsPadre(){
    
        super.variable1 = 500;  //popriedad publica del padre
        this.variable1 = 250;
        super.setVariable2(-12);  //popriedad privada
    }

    public void setDataClase1(){
        Clase1 objeto1 = new Clase1();
        objeto1.x = 15; //public
        objeto1.setY(22);
        objeto1.setZ(87);
        //objeto1.w = 38;
    }

    @Override
    public String toString() {
        return super.toString() + "Hijo [variable3=" + variable3 + "variable1=" + this.variable1 +"]";
    }
    
    
}
