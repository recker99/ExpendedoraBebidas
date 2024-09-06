
public class Caja {
    // Contenedor de vuelto
    private int cantM10;
    private int cantM50;
    private int cantM100;
    private int cantM500;

    // Contenedor de monedas entrantes
    private int cantCajaM10;
    private int cantCajaM50;
    private int cantCajaM100;
    private int cantCajaM500;

    // Total ingresado en la máquina
    private int totalIngresado;

    // Constructor
    public Caja(int cantM10, int cantM50, int cantM100, int cantM500) {
        this.cantM10 = cantM10;
        this.cantM50 = cantM50;
        this.cantM100 = cantM100;
        this.cantM500 = cantM500;
        // Inicializando el contenedor de monedas entrantes en 0
        this.cantCajaM10 = 0;
        this.cantCajaM50 = 0;
        this.cantCajaM100 = 0;
        this.cantCajaM500 = 0;
        // Inicializando el total ingresado en 0
        this.totalIngresado = 0;
    }

    // Método para verificar si la moneda es válida
    private boolean verificarMoneda(int moneda) {
        return moneda == 10 || moneda == 50 || moneda == 100 || moneda == 500;
    }

    // Método para ingresar una moneda
    public String ingresarMoneda(int moneda) {
        if (!verificarMoneda(moneda)) {
            return "Moneda inválida";
        }

        // Dependiendo del valor de la moneda, incrementar el contador correspondiente
        switch (moneda) {
            case 10:
                this.cantCajaM10++;  // Incrementar el contador de monedas de 10
                break;
            case 50:
                this.cantCajaM50++;  // Incrementar el contador de monedas de 50
                break;
            case 100:
                this.cantCajaM100++; // Incrementar el contador de monedas de 100
                break;
            case 500:
                this.cantCajaM500++; // Incrementar el contador de monedas de 500
                break;
        }
        // Sumar el valor de la moneda al total ingresado
        totalIngresado += moneda;

        return "Moneda de " + moneda + " ingresada. Total ingresado: " + totalIngresado;
    }

    // Métodos para obtener la cantidad de monedas ingresadas en el contenedor
    public int getCantCajaM10() {
        return cantCajaM10;
    }

    public int getCantCajaM50() {
        return cantCajaM50;
    }

    public int getCantCajaM100() {
        return cantCajaM100;
    }

    public int getCantCajaM500() {
        return cantCajaM500;
    }

    // Métodos para obtener la cantidad de monedas en el contenedor de vuelto
    public int getCantM10() {
        return cantM10;
    }

    public int getCantM50() {
        return cantM50;
    }

    public int getCantM100() {
        return cantM100;
    }

    public int getCantM500() {
        return cantM500;
    }

    // Método para calcular el vuelto y procesar la compra
    public String comprarProducto(Producto producto) {
        if (totalIngresado >= producto.getValor()) {
            int vuelto = totalIngresado - producto.getValor();
            totalIngresado = 0;  // Reiniciar el total ingresado después de la compra
            return "Compra exitosa. Vuelto: " + vuelto + " pesos.";
        } else {
            return "Dinero insuficiente para comprar " + producto.getNombre();
        }
    }

    // Método para obtener el total de dinero ingresado
    public int getTotalIngresado() {
        return totalIngresado;
    }
}
