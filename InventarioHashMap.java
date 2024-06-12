package juan.inventariohashmap;

import javax.swing.JOptionPane;

public class InventarioHashMap {
    //Se definen ambas listas
    public static void main(String[] args) {
        Inventario inv = new Inventario(); //Se define un nuevo objeto inventario
        int opt = 0;
        do {
            //El menú, se le añade la 5ta opción dado a que se menciona que se debe consultar el producto por nombre.
            opt = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar producto \n2. Actualizar cantidad de producto \n3. Eliminar producto \n4. Mostrar inventario\n5. Consultar producto por su nombre \n6. Salir"));
            switch (opt) {
                case 1:
                    //Se le manda el nombre al inventario, el resto del proceso se realiza dentro de la clase
                    inv.agregarProducto(JOptionPane.showInputDialog("Ingrese el nombre del producto"));
                    inv.mostrarInventario();
                    break;
                case 2:
                    //Se solicita el nombre del producto a borrar
                    inv.actualizarProducto(JOptionPane.showInputDialog("Ingrese el nombre del producto"));
                    inv.mostrarInventario();
                    break;
                case 3:
                    //Se solicita el nombre del producto a borrar
                    inv.removerProducto(JOptionPane.showInputDialog("Ingrese el nombre del producto"));
                    inv.mostrarInventario();
                    break;
                case 4:
                    //Se solicita que se muestre el contenido del inventario
                    inv.mostrarInventario();
                    break;
                case 5:
                    //Se pide el nombre del producto a consultar y luego se muestra la consulta.
                    inv.consultarProductoPorNombre(JOptionPane.showInputDialog("Ingrese el nombre del producto"));
                    inv.mostrarInventario();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default: //Si lo ingresado no entra en la lista, entonces la opción es invalida
                    JOptionPane.showMessageDialog(null, "Opción invalida");
            }
        } while (opt!=6);
    }
}
