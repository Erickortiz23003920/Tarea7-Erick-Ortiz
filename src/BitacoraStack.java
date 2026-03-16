package src;

import java.util.ArrayList;
import java.util.List;

class BitacoraStack {
    private List<String> eventos;

    public BitacoraStack() {
        eventos = new ArrayList<>();
    }

    public void registrar(String evento) {
        eventos.add(evento);
    }

    public String consultarUltimo() throws Exception {
        if (estaVacia()) {
            throw new Exception("La bitácora está vacía. No hay eventos para consultar.");
        }
        return eventos.get(eventos.size() - 1);
    }

    public String eliminarUltimo() throws Exception {
        if (estaVacia()) {
            throw new Exception("La bitácora está vacía. No hay eventos para eliminar.");
        }
        return eventos.remove(eventos.size() - 1);
    }

    public boolean estaVacia() {
        return eventos.isEmpty();
    }

    public int totalEventos() {
        return eventos.size();
    }
}
