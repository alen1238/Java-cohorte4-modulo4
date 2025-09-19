# Ejercicio: Sistema de Jugadores en un Videojuego Online

Estás desarrollando un videojuego estilo battle royale, y necesitas implementar un sistema básico para administrar a los jugadores conectados y su participación en las partidas.

## Requerimientos del sistema

### 1. Modelo

Clase `Jugador` con los atributos:

- `nickname` (String)
- `nivel` (int)
- `puntos` (int)

Sobrescribe `equals()` y `hashCode()` para que dos jugadores se consideren iguales si tienen el mismo nickname.

### 2. Servicio (JuegoService)

Deberás manejar diferentes estructuras según la necesidad:

- **Jugadores conectados (únicos, sin duplicados):**  
  Usa un `HashSet<Jugador>` para garantizar que no haya jugadores repetidos conectados.  
  Métodos: `conectarJugador(Jugador j)`, `desconectarJugador(Jugador j)`, `mostrarJugadoresConectados()`.

- **Ranking de jugadores:**  
  Usa un `ArrayList<Jugador>` para poder acceder rápidamente por índice y ordenar fácilmente.  
  Métodos: `actualizarRanking()`, `mostrarRanking()`.

- **Sala de espera (jugadores en cola para iniciar partida):**  
  Usa un `LinkedList<Jugador>`.  
  Métodos: `agregarASala(Jugador j)`, `sacarDeSala()`, `mostrarSala()`.

### 3. Menú de consola (Main)

Crea un menú interactivo que permita:

- Conectar y desconectar jugadores.
- Agregar jugadores a la sala de espera y sacarlos cuando inicie la partida.
- Mostrar el ranking general.


# Desarrollo del Ejercicio

A continuación, se presenta el código completo en Java que cumple con los requerimientos del enunciado.

## Clase Jugador

```java
// Jugador.java
package videojuego;

import java.util.Objects;

public class Jugador {
    private String nickname;
    private int nivel;
    private int puntos;

    public Jugador(String nickname, int nivel, int puntos) {
        this.nickname = nickname;
        this.nivel = nivel;
        this.puntos = puntos;
    }

    public String getNickname() {
        return nickname;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(nickname, jugador.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nickname='" + nickname + ''' +
                ", nivel=" + nivel +
                ", puntos=" + puntos +
                '}';
    }
}
```

## Clase JuegoService

```java
// JuegoService.java
package videojuego;

import java.util.*;

public class JuegoService {
    private HashSet<Jugador> jugadoresConectados;
    private ArrayList<Jugador> ranking;
    private LinkedList<Jugador> salaDeEspera;

    public JuegoService() {
        jugadoresConectados = new HashSet<>();
        ranking = new ArrayList<>();
        salaDeEspera = new LinkedList<>();
    }

    public boolean conectarJugador(Jugador j) {
        if (jugadoresConectados.add(j)) {
            ranking.add(j);
            return true;
        }
        return false;
    }

    public boolean desconectarJugador(Jugador j) {
        if (jugadoresConectados.remove(j)) {
            ranking.remove(j);
            salaDeEspera.remove(j);
            return true;
        }
        return false;
    }

    public void mostrarJugadoresConectados() {
        System.out.println("\n=== Jugadores Conectados ===");
        for (Jugador j : jugadoresConectados) {
            System.out.println(j);
        }
    }

    public void actualizarRanking() {
        ranking.sort((a, b) -> Integer.compare(b.getPuntos(), a.getPuntos()));
    }

    public void mostrarRanking() {
        System.out.println("\n=== Ranking ===");
        for (int i = 0; i < ranking.size(); i++) {
            System.out.println((i + 1) + ". " + ranking.get(i));
        }
    }

    public void agregarASala(Jugador j) {
        if (jugadoresConectados.contains(j)) {
            salaDeEspera.add(j);
            System.out.println(j.getNickname() + " agregado a la sala de espera.");
        } else {
            System.out.println("El jugador debe estar conectado para entrar a la sala.");
        }
    }

    public void sacarDeSala() {
        if (!salaDeEspera.isEmpty()) {
            Jugador j = salaDeEspera.removeFirst();
            System.out.println(j.getNickname() + " ha salido de la sala (inicia partida).");
        } else {
            System.out.println("La sala está vacía.");
        }
    }

    public void mostrarSala() {
        System.out.println("\n=== Sala de Espera ===");
        for (Jugador j : salaDeEspera) {
            System.out.println(j);
        }
    }
}
```

## Clase Main

```java
// Main.java
package videojuego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JuegoService service = new JuegoService();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n==== MENÚ JUEGO ====");
            System.out.println("1. Conectar jugador");
            System.out.println("2. Desconectar jugador");
            System.out.println("3. Mostrar jugadores conectados");
            System.out.println("4. Agregar jugador a sala de espera");
            System.out.println("5. Sacar jugador de sala de espera");
            System.out.println("6. Mostrar sala de espera");
            System.out.println("7. Actualizar ranking");
            System.out.println("8. Mostrar ranking");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nickname: ");
                    String nick = sc.nextLine();
                    System.out.print("Nivel: ");
                    int nivel = sc.nextInt();
                    System.out.print("Puntos: ");
                    int puntos = sc.nextInt();
                    Jugador j = new Jugador(nick, nivel, puntos);
                    if (service.conectarJugador(j))
                        System.out.println("Jugador conectado.");
                    else
                        System.out.println("Ya estaba conectado.");
                    break;
                case 2:
                    System.out.print("Nickname: ");
                    nick = sc.nextLine();
                    Jugador j2 = new Jugador(nick, 0, 0);
                    if (service.desconectarJugador(j2))
                        System.out.println("Jugador desconectado.");
                    else
                        System.out.println("Jugador no encontrado.");
                    break;
                case 3:
                    service.mostrarJugadoresConectados();
                    break;
                case 4:
                    System.out.print("Nickname: ");
                    nick = sc.nextLine();
                    service.agregarASala(new Jugador(nick, 0, 0));
                    break;
                case 5:
                    service.sacarDeSala();
                    break;
                case 6:
                    service.mostrarSala();
                    break;
                case 7:
                    service.actualizarRanking();
                    System.out.println("Ranking actualizado.");
                    break;
                case 8:
                    service.mostrarRanking();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
```
