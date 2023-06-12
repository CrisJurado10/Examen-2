import java.util.ArrayList;

public class Plato {
    int precio, calorias, tiempopreparacion;
    String nombre;

    public Plato(String nombre, int precio, int calorias, int tiempopreparacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
        this.tiempopreparacion = tiempopreparacion;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getTiempopreparacion() {
        return tiempopreparacion;
    }

    public void setTiempopreparacion(int tiempopreparacion) {
        this.tiempopreparacion = tiempopreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Plato{" +
                "\nnombre: " + nombre+
                "\nprecio: " + precio+
                "\ncalorias: " + calorias+
                "\nTiempo de preparacion: " + tiempopreparacion + "}";
    }



}
