
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class main
{
    // instance variables - replace the example below with your own
   
    public static void main(String[] args) {
        // Crear productos
        Producto bebida1 = new Producto("001", "Coca-Cola", "Bebida gaseosa", 350);
        Producto bebida2 = new Producto("002", "Fanta", "Bebida gaseosa", 300);

        // Crear la caja con monedas
        Caja caja = new Caja(10, 10, 10, 10);

        // Simular compra
        Scanner scanner = new Scanner(System.in);

        // Mostrar opciones de productos
        System.out.println("Seleccione un producto:");
        System.out.println("1. Coca-Cola");
        System.out.println("2. Fanta");

        int opcion = scanner.nextInt();
        Producto productoSeleccionado;
        if (opcion == 1) {
            productoSeleccionado = bebida1;
        } else {
            productoSeleccionado = bebida2;
        }

        // Ingresar monedas
        System.out.println("Ingrese monedas (10, 50, 100, 500). Ingrese 0 para terminar.");
        int moneda;
        do {
            moneda = scanner.nextInt();
            if (moneda != 0) {
                System.out.println(caja.ingresarMoneda(moneda));
            }
        } while (moneda != 0);

        // Intentar comprar el producto seleccionado
        System.out.println(caja.comprarProducto(productoSeleccionado));
    }
}
