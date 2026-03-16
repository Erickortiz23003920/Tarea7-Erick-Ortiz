package src;

public class Main {
    public static void main(String[] args) {
        try {
            BitacoraStack bitacora = new BitacoraStack();

            bitacora.registrar("Motor de estribor encendido");
            bitacora.registrar("Velocidad warp alcanzada");
            bitacora.registrar("Señal de comunicación estable");
            bitacora.registrar("Anomalía detectada en sector 7");
            bitacora.registrar("Escudos al 40%");
            bitacora.registrar("ERROR CRÍTICO: fallo en sistema de navegación");

            String ultimo = bitacora.consultarUltimo();
            System.out.println("Último evento registrado: " + ultimo);

            if (ultimo.contains("ERROR")) {
                System.out.println("\n*** Protocolo de revisión activado ***");
                for (int i = 0; i < 3; i++) {
                    String eliminado = bitacora.eliminarUltimo();
                    System.out.println("Evento eliminado: " + eliminado);
                }
            }

            System.out.println("\n--- Estado actual de la bitácora ---");
            System.out.println("Total de eventos restantes: " + bitacora.totalEventos());
            if (!bitacora.estaVacia()) {
                System.out.println("Evento en la cima: " + bitacora.consultarUltimo());
            } else {
                System.out.println("La bitácora está vacía.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
 * Reflexión:
Esta bitacora funciona mejor porque en una situación de emergencia es crucial poder ver el ultimo error resgistrado, para poder tomar decisiones rapidas y efectivas. En este caso, al detectar un error critico, se activa un protocolo de revision que elimina los ultimos eventos registrados, lo que permite al equipo de la nave centrarse en los eventos mas rcientes y relevantes para resolver la situaación de emergencia.
 */
