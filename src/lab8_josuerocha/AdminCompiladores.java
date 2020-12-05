
package lab8_josuerocha;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class AdminCompiladores {
    
     private ArrayList<Compiladores> listaCompiladores = new ArrayList();
    private File archivo = null;

    public AdminCompiladores() {
    }
    
    
    
    public AdminCompiladores(String path) {
        archivo = new File(path);
    }

    public ArrayList<Compiladores> getListaUsuarios() {
        return listaCompiladores;
    }

    public void setListaUsuarios(ArrayList<Compiladores> listaCompiladores) {
        this.listaCompiladores = listaCompiladores;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
     public void setCompilador(Compiladores p) {
        this.listaCompiladores.add(p);
    }

    @Override
    public String toString() {
        return "listaCompiladores=" + listaCompiladores;
    }
    
    public void cargarArchivo() {
        try {            
            listaCompiladores= new ArrayList();
            Compiladores temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Compiladores) objeto.readObject()) != null) {
                        listaCompiladores.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Compiladores t : listaCompiladores) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
