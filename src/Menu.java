import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Menu {
    private ArrayList<Plato> platosG = new ArrayList<>();

    private ArrayList<Plato> platos;
    private int count = 0;

    public Menu(){this.platos = new ArrayList<>();
    }

    public boolean agregarLibro(String nombre, int calorias, int precio, int tiempopreparacion) {
        // Verificar si el plato ya existe con el mismo nombre ya existe
        for (Plato plato : platos) {
            if (plato.getNombre().equals(nombre)) {
                return false; // Libro ya existe
            }
        }

        // Si no existe el plato este se agragara
        Plato l = new Plato(nombre, calorias, precio, tiempopreparacion);

        platos.add(l);
        return true; //  agregado exitosamente
    }
    public ArrayList<Plato> generarPlatos(){
        ArrayList<Plato> platosG = new ArrayList<>();



        //Platos generados
        Plato l1 = new Plato("Pizza", 20, 200, 40);
        Plato l2 = new Plato("Lasagna ", 8, 150, 30);
        Plato l3 = new Plato("Encebollado", 10, 100, 50);
        Plato l4 = new Plato("Tacos", 7, 120, 45);
        Plato l5 = new Plato("Fanesca", 5, 180, 38 );

        return platosG;
    }


    public Plato buscarBinario(String nombre) {
        int left = 0;
        int right = platos.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (platos.get(mid).getNombre().equals(nombre)) {
                return platos.get(mid);
            }
            if (platos.get(mid).getNombre().compareTo(nombre) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null; // Si no se encuentra el plato
    }


    public Plato eliminarPlatoPorNombre(String nombre) {
        for (Plato plato : platos) {
            if (plato.getNombre().equals(nombre)) {
                Plato l = plato;
                platos.remove(l);
                return l; // Plato se ha eliminado
            }
        }
        return null; // Plato no encontrado
    }

}
