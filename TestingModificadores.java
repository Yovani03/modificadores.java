import Paquete1.Clase2;

public class TestingModificadores {
    
    public static void main (String [] args){
        Padre papa = new Padre();
        Hijo chamaco = new Hijo();
        Hijo chamaca = new Hijo();
        Clase2 objeto2 = new Clase2();
        
    //Asignar valores a miembros de la clase Padre
    //Asignar valores es una método de acceso a los miembros

    papa.setVariable2(-12); //propiedad privada
    papa.variable1 = 25; //propedad publicada

    // leer valores de los miembros de la clase Padre
    // leer valores es otro método de acceso a los miembros
    System.out.println("Valor de variable2:" + papa.getVariable2());
    System.out.println("Valor de variable1:" + papa.variable1);
    
    chamaco.setVariable3(18);
    chamaco.setVarsPadre();//Modificación desde el Testing
    System.out.println("Info de chamaco:" + chamaco.toString());

    chamaca.setVariable3(98);
    chamaca.variable1 = 32; //Modificación desde el Testing
    chamaca.setVariable2(29); //Modificación desde el Testing

    System.out.println("Info de chamaca:" + chamaca.toString());

    System.out.println();
    // objeto2.x = 10;
    // //Esto no se puede hacer por que es protected y testin esta fuera del paquete 
    // objeto2.y = 12;
    objeto2.setZ(8);
    System.out.println(objeto2.getData());
    

    }
}