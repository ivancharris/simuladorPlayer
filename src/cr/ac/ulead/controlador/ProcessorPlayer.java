package cr.ac.ulead.controlador;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import cr.ac.ulead.entities.Player;

public class ProcessorPlayer extends LectorDeCSV {

		public ProcessorPlayer(String fileName) {
			super(fileName);
		}

		@Override
		protected List<Player> readLines(Scanner reader) {
			ArrayList<Player> result = new ArrayList<>();
			boolean skip = true;
			while (reader.hasNextLine()) {
				String onePlayer = reader.nextLine();
				if (!skip) {
					Player currentPlayer = getPlayerDataFromString(onePlayer);
					result.add(currentPlayer);
				} else {
					skip = false;
				}
			}
			return result;
		}

		private Player getPlayerDataFromString(String playerData) {
			String long_name = null,dob = null,nationality = null, club = null;
			int age = 0,height_cm = 0,weight_kg = 0,team_jersey_number = 0;
			Player newPlayer = new Player(long_name,age,dob,height_cm,weight_kg,nationality,club,team_jersey_number);
			String[] data = playerData.split(",");
			long_name= newPlayer.setLong_name(data[0]);
			age=newPlayer.setAge(Integer.parseInt(data[1]));
			dob=newPlayer.setDob(data[2]);
			height_cm=newPlayer.setHeight_cm(Integer.parseInt(data[3]));
			weight_kg=newPlayer.setWeight_kg(Integer.parseInt(data[4]));
			nationality=newPlayer.setNationality(data[5]);
			club=newPlayer.setClub(data[6]);
			//team_jersey_number=newPlayer.setTeam_jersey_number(Integer.parseInt(data[7]));
			return newPlayer;
		}

		
	}

