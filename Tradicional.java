import java.util.ArrayList;

public class Tradicional {
    Lista lista = new Lista();
    ArrayList<Jugador> jugadores = lista.getJugadores();

    public void ListaJugadores(){
        Lista lista = new Lista();
        ArrayList<Jugador> jugadores = lista.getJugadores();
        System.out.println("============================================");
        System.out.println("Jugadores por nombre");
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.nombre + ", Posicion: " + jugador.posicion);
        }
    }

    public void ListarPosiciones(){
        System.out.println("============================================");
        System.out.println("Jugadores por posicion");
        for (int i = 0; i < jugadores.size() - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < jugadores.size(); j++) {
                if (jugadores.get(j).posicion < jugadores.get(indexMin).posicion) {
                    indexMin = j;
                }
            }
            Jugador tenporal = jugadores.get(i);
            jugadores.set(i, jugadores.get(indexMin));
            jugadores.set(indexMin, tenporal);
        }

        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.nombre + ", Posición: " + jugador.posicion);
        }

    }
    
    public void ListarNumerosPares(){
        System.out.println("============================================");
        System.out.println("Jugadores de posicion par ");
        for (Jugador jugador : lista.getJugadores()) {
            if (jugador.posicion % 2 == 0) {
                System.out.println("Nombre: " + jugador.nombre + ", Posición: " + jugador.posicion);
            }
        }
    }

    public void ListarNumerosImpares(){
        System.out.println("============================================");
        System.out.println("Jugadores de posicion impar ");
        for (Jugador jugador : lista.getJugadores()) {
            if (jugador.posicion % 2 != 0) {
                System.out.println("Nombre: " + jugador.nombre + ", Posición: " + jugador.posicion);
            }
        }
    }

    public void JugadoresPorD(){
        System.out.println("============================================");
        System.out.println("Jugadores que inician con D ");
        for (int i = 0; i < jugadores.size(); i++) {
            String nombreJugador = jugadores.get(i).nombre;
            if (nombreJugador.charAt(0) == 'D') {
                System.out.println(nombreJugador);
            }
        }
    }

}
