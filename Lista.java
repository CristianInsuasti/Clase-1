import java.util.ArrayList;

public class Lista {
    //atributo lista de objeto jugador
    private ArrayList<Jugador> Jugadores = new ArrayList<>();
    
    //Contructor que inicializa la lista con 10 jugadores
    public Lista() {
        Jugadores.add(new Jugador("Cristian", 2));
        Jugadores.add(new Jugador("Steven", 5));
        Jugadores.add(new Jugador("Andres", 25));
        Jugadores.add(new Jugador("Diego", 10));
        Jugadores.add(new Jugador("Calos", 11));
        Jugadores.add(new Jugador("Camilo", 15));
        Jugadores.add(new Jugador("Brayan", 34));
        Jugadores.add(new Jugador("Sebastian", 18));
        Jugadores.add(new Jugador("Gabriel", 44));
        Jugadores.add(new Jugador("Alexander", 21));
        Jugadores.add(new Jugador("Andrea", 55));
    }
    //Devuelve la lista de jugadores creada en el constructor
    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }
}