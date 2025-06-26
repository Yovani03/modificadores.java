package Paquete1;

public class Clase1 {
    //NIVELES DE ACCESO
    public int x;//SE PUEDE USAR EN CUALQUIER
    protected int y; //X//fuera de la clase
    private int z;
    int w; // default  X//en una cklase que esta fuera del paquete
    
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Clase1 [x=" + x + ", y=" + y + ", z=" + z + "]";
    }
}


