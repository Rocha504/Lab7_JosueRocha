 
package lab8_josuerocha;

/**
 *
 * @author josue
 */
public class Error {
    
    private String codigo;
    private String descripcion;

    public Error() {
    }

    public Error(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Error: " + codigo + "\n"+ descripcion;
    }
    
    
}
