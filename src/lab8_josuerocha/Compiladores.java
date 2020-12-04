 
package lab8_josuerocha;

import javax.swing.JTable;

/**
 *
 * @author josue
 */
public class Compiladores {
    
    private String nombre;
    private String creador;
    private int AnalisisLexico;
    private int AnalisisSintactico;
    private int AnalisisSemantico;
    private int GeneracionDeCodigoIntermedio;
    private int OptimizadorDeCodigo;
    private int GeneradorDeCodigo;
    private JTable variable;
    private JTable errores;
    private int lineas=AnalisisLexico+AnalisisSintactico+AnalisisSemantico+GeneracionDeCodigoIntermedio+GeneracionDeCodigoIntermedio+OptimizadorDeCodigo+GeneradorDeCodigo;
    
   
    
    
}
