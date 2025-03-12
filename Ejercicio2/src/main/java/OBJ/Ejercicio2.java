/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package OBJ;

/**
 *
 * @author Gercray
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Documento pdf = new DocumentoPDF();
        Documento word = new DocumentoWord();
        Documento excel = new DocumentoExcel();
        
        pdf.exportar();
        word.exportar();
        excel.exportar();
    }
}
