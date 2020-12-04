 
package lab8_josuerocha;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class Compiladores {
    
    private String nombre;
    private String creador;
    private int AnalisisLexico;
    private DefaultTableModel tabla1;
    private DefaultTableModel tabla2;
    private int AnalisisSintactico;
    private int AnalisisSemantico;
    private int GeneracionDeCodigoIntermedio;
    private int OptimizadorDeCodigo;
    private int GeneradorDeCodigo;
    private int lineas=AnalisisLexico+AnalisisSintactico+AnalisisSemantico+GeneracionDeCodigoIntermedio+GeneracionDeCodigoIntermedio+OptimizadorDeCodigo+GeneradorDeCodigo;

    public Compiladores() {
    }

    public Compiladores(String nombre, String creador, int AnalisisLexico, int AnalisisSintactico, int AnalisisSemantico, int GeneracionDeCodigoIntermedio, int OptimizadorDeCodigo, int GeneradorDeCodigo, DefaultTableModel tabla1, DefaultTableModel tabla2) {
        this.nombre = nombre;
        this.creador = creador;
        this.AnalisisLexico = AnalisisLexico;
        this.AnalisisSintactico = AnalisisSintactico;
        this.AnalisisSemantico = AnalisisSemantico;
        this.GeneracionDeCodigoIntermedio = GeneracionDeCodigoIntermedio;
        this.OptimizadorDeCodigo = OptimizadorDeCodigo;
        this.GeneradorDeCodigo = GeneradorDeCodigo;
        this.tabla1 = tabla1;
        this.tabla2 = tabla2;
    }
    
    

     

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getAnalisisLexico() {
        return AnalisisLexico;
    }

    public void setAnalisisLexico(int AnalisisLexico) {
        this.AnalisisLexico = AnalisisLexico;
    }

    public int getAnalisisSintactico() {
        return AnalisisSintactico;
    }

    public void setAnalisisSintactico(int AnalisisSintactico) {
        this.AnalisisSintactico = AnalisisSintactico;
    }

    public int getAnalisisSemantico() {
        return AnalisisSemantico;
    }

    public void setAnalisisSemantico(int AnalisisSemantico) {
        this.AnalisisSemantico = AnalisisSemantico;
    }

    public int getGeneracionDeCodigoIntermedio() {
        return GeneracionDeCodigoIntermedio;
    }

    public void setGeneracionDeCodigoIntermedio(int GeneracionDeCodigoIntermedio) {
        this.GeneracionDeCodigoIntermedio = GeneracionDeCodigoIntermedio;
    }

    public int getOptimizadorDeCodigo() {
        return OptimizadorDeCodigo;
    }

    public void setOptimizadorDeCodigo(int OptimizadorDeCodigo) {
        this.OptimizadorDeCodigo = OptimizadorDeCodigo;
    }

    public int getGeneradorDeCodigo() {
        return GeneradorDeCodigo;
    }

    public void setGeneradorDeCodigo(int GeneradorDeCodigo) {
        this.GeneradorDeCodigo = GeneradorDeCodigo;
    }

    public DefaultTableModel getTabla1() {
        return tabla1;
    }

    public void setTabla1(DefaultTableModel tabla1) {
        this.tabla1 = tabla1;
    }

    public DefaultTableModel getTabla2() {
        return tabla2;
    }

    public void setTabla2(DefaultTableModel tabla2) {
        this.tabla2 = tabla2;
    }

    public int getLineas() {
        return lineas;
    }

    public void setLineas(int lineas) {
        this.lineas = lineas;
    }

    @Override
    public String toString() {
        return "nombre de Compilador=" + nombre + ", creador=" + creador + ", lineas de codigo=" + lineas;
    }
    
   
    
    
}
