public class Producto {
    // Atributos de la clase producto
    private String codigo;
    private String nombre;
    private String descripcion;
    private int valor;

    // Constructor sin parámetros
    public Producto() {
        this.codigo = "";
        this.nombre = "";
        this.descripcion = "";
        this.valor = 0;
    }

    // Constructor con parámetros
    public Producto(String codigo, String nombre, String descripcion, int valor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    // Métodos getter y setter
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}


