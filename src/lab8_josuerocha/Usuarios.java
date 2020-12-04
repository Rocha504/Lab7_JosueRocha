 
package lab8_josuerocha;

/**
 *
 * @author josue
 */
public class Usuarios {
    
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private int nota;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String usuario, String password, int nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
        this.nota = nota;
    }

    public Usuarios(String nombre, String apellido, String usuario, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre +" " + apellido+"\n usuario: "+usuario+",contrasena: "+password+"\n Nota final:"+nota;
    }
    
    
    
}
