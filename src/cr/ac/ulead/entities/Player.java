package cr.ac.ulead.entities;

public class Player {

	private String long_name;
	private int age;
	private String dob;
	private int height_cm;
	private int weight_kg;
	private String nationality; 
	private String club;
	private int team_jersey_number;
	
	public String getLong_name() {
		return long_name;
	}
	public String setLong_name(String long_name) {
		return this.long_name = long_name;
	}
	public int getAge() {
		return age;
	}
	public int setAge(int age) {
		return this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public String setDob(String dob) {
		return this.dob = dob;
	}
	public int getHeight_cm() {
		return height_cm;
	}
	public int setHeight_cm(int height_cm) {
		return this.height_cm = height_cm;
	}
	public int getWeight_kg() {
		return weight_kg;
	}
	public int setWeight_kg(int weight_kg) {
		return this.weight_kg = weight_kg;
	}
	public String getNationality() {
		return nationality;
	}
	public String setNationality(String nationality) {
		return this.nationality = nationality;
	}
	public String getClub() {
		return club;
	}
	public String setClub(String club) {
		return this.club = club;
	}
	public int getTeam_jersey_number() {
		return team_jersey_number;
	}
	public int setTeam_jersey_number(int team_jersey_number) {
		return this.team_jersey_number = team_jersey_number;
	}
	
	public Player(String long_name, int age, String dob, int height_cm, int weight_kg, String nationality, String club,
			int team_jersey_number) {
		super();
		this.long_name = long_name;
		this.age = age;
		this.dob = dob;
		this.height_cm = height_cm;
		this.weight_kg = weight_kg;
		this.nationality = nationality;
		this.club = club;
		this.team_jersey_number = team_jersey_number;
	}
	
	@Override
	public String toString() {
		return "Player [long_name=" + long_name + ", age=" + age + ", dob=" + dob + ", height_cm=" + height_cm
				+ ", weight_kg=" + weight_kg + ", nationality=" + nationality + ", club=" + club
				+ ", team_jersey_number=" + team_jersey_number + "]";
	}
	




}
