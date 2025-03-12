/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Mensajeria;

/**
 *
 * @author Gercray
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Mensajero email = new MensajeEmail();
        Mensajero sms = new MensajeMSM();
        Mensajero push = new MensajePush();
        
        email.enviarMensaje("josenagel@gmail.com", "Hola desde el email");
        sms.enviarMensaje("3504881941", "Hola desde SMS");
        push.enviarMensaje("Usuario", "Hola desde notificación push");
    }
}
