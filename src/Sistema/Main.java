/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author Miguel
 */
public class Main {
    public static void Main(String[] args) {
        FacadeControle sistema = new FacadeControle();
        
        sistema.inicializarSubsistemas();
        sistema.aumentarBrilho();
    }
}
