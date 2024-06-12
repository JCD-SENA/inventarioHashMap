package juan.inventariohashmap;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Inventario {
    HashMap<String, Integer> productos;
    
    public Inventario () {
        productos = new HashMap<String, Integer>();
    }
    
    public void agregarProducto (String nombre) {
        if (!productos.containsKey(nombre)) { // Verifica que la lista no contenga el producto ya
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial del producto"));
            //Añade el nombre y la cantidad a las listas correspondientes
            productos.put(nombre, cantidad);
            JOptionPane.showMessageDialog(null, "Producto "+nombre+" agregado a la lista");
        } else {
            JOptionPane.showMessageDialog(null, "El producto ya existe en la lista");
        }
    }
    
    public void actualizarProducto (String nombre) {
        //Se verifica que tal producto exista
        if (productos.containsKey(nombre)) {
            int nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad del producto "+nombre));
            productos.put(nombre, nuevaCantidad);
        } else {
            JOptionPane.showMessageDialog(null, "El producto no se encuentra en la lista");
        }
    }
    
    public void mostrarInventario () {
        //Se muestra el contenido del inventario y luego se muestra el contenido con un iterador
        if (productos.size() > 0) {
            for (Map.Entry<String, Integer> producto : productos.entrySet()) {
                JOptionPane.showMessageDialog(null, "Producto "+producto.getKey()+": "+producto.getValue()+" unidades");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El inventario no cuenta con contenido");
        }
    }
    
    public void removerProducto (String nombre) {
        //Se verifica que la lista contenga al producto
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
        } else {
            JOptionPane.showMessageDialog(null, "El producto "+nombre+" no se en cuentra en la lista");
        }
    }
    
    public void consultarProductoPorNombre (String nombre) {
        //Se verifica que el inventario contenga tal producto
        if (productos.containsKey(nombre)) {
            JOptionPane.showMessageDialog(null, "Producto "+nombre+": "+productos.get(nombre)+" unidades");
        } else {
            JOptionPane.showMessageDialog(null, "El producto "+nombre+" no se en cuentra en la lista");
        }
    }
}
