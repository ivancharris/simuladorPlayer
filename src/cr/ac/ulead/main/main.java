package cr.ac.ulead.main;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;
import cr.ac.ulead.controlador.LectorDeCSV;
import cr.ac.ulead.controlador.ProcessorPlayer;
import cr.ac.ulead.entities.Player;

public class main {

	private static Scanner input = new Scanner(System.in);
	private static PrintStream output = new PrintStream(System.out);

	public static void main(String[] args) throws FileNotFoundException {
		LectorDeCSV oneProcessor = (LectorDeCSV) new ProcessorPlayer(
				"C:\\\\Users\\\\ivanc\\\\Desktop\\\\Proyecto SO\\\\players_15.csv");

		List<Player> listPlayer = oneProcessor.processFile();

		output.println(listPlayer.size());
		int opcion;
		do {
			output.println("Ingrese opción a procesar");
			output.println("1. Consultar jugadores por nombre");
			output.println("2. Consultar jugadores por edad");
			output.println("3. Consultar jugadores por peso (Kg)");
			output.println("4. Consultar jugadores por estatura (cm)");
			output.println("5. Consultar jugadores por nacionalidad");
			output.println("6. Consultar jugadores # de camiseta");
			output.println("7. Salir");
			opcion = input.nextInt();

			switch (opcion) {
			case 1:
				output.println("Ingrese nombre a consulta entre los jugadores");
				String nombre = input.next();
				for (int i = 0; i < listPlayer.size(); i++) {
					if (listPlayer.get(i).getLong_name().contains(nombre))
						output.println(listPlayer.get(i));
				}
				break;
			case 2:
				output.println("Ingrese la edad a consulta entre los jugadores");
				int edad = input.nextInt();
				for (int i = 0; i < listPlayer.size(); i++) {
					if (listPlayer.get(i).getAge() == edad)
						output.println(listPlayer.get(i));
				}
				break;
			case 3:
				output.println("Ingrese peso a consulta entre los jugadores");
				int peso = input.nextInt();
				for (int i = 0; i < listPlayer.size(); i++) {
					if (listPlayer.get(i).getWeight_kg() == peso)
						output.println(listPlayer.get(i));
				}
				break;
			case 4:
				output.println("Ingrese estatura (cm) a consulta entre los jugadores");
				int estatura = input.nextInt();
				for (int i = 0; i < listPlayer.size(); i++) {
					if (listPlayer.get(i).getHeight_cm() == estatura)
						output.println(listPlayer.get(i));
				}
				break;
			case 5:
				output.println("Ingrese nacionalidad a consulta entre los jugadores");
				String nacionalidad = input.next();
				for (int i = 0; i < listPlayer.size(); i++) {
					if (listPlayer.get(i).getNationality().contains(nacionalidad))
						output.println(listPlayer.get(i));
				}
				break;
			case 6:
				output.println("Ingrese  # de camiseta a consulta entre los jugadores");
				int camiseta = input.nextInt();
				for (int i = 0; i < listPlayer.size(); i++) {
					if (listPlayer.get(i).getTeam_jersey_number() == camiseta)
						output.println(listPlayer.get(i));
				}
				break;
			case 7:
				output.println("Consulta terminada");
				break;
			default:
				output.print("Inserte una opción de las anteriores");
				break;
			}
		} while (opcion != 7);
	}

}
