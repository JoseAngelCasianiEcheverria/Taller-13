/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mensajeria;

/**
 *
 * @author Gercray
 */
public class MensajePush extends Mensajero{
    
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando Push a " + destinatario + ": " + mensaje);
    }
}
