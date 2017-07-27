
public class BollywoodFilm extends ForeignFilm {
	//instance variables
	private String [] secondaryLanguageArray;
	private int numberOfSecondaryLanguages;
	private String [] songArray;
	private int numberOfSongs;
	
	//static variables
	private static int maxSongs = 20;
	private static int maxSecondaryLanguages = 5;
	
	//static methods
	public static void setMaxSongs(int newMaxSongs) {
		if(newMaxSongs > maxSongs) {
			maxSongs = newMaxSongs;
		}
	}
	
	public static int getMaxSongs() {
		return maxSongs;
	}
	
	public static void setMaxSecondaryLanguages(int newMaxSecondaryLanguages) {
		if(newMaxSecondaryLanguages > maxSecondaryLanguages) {
			maxSecondaryLanguages = newMaxSecondaryLanguages;
		}
	}
	
	public static int getMaxSecondaryLanguages() {
		return maxSecondaryLanguages;
	}
	
	public BollywoodFilm() {
		super();
		secondaryLanguageArray = new String[maxSecondaryLanguages];
		songArray = new String[maxSongs];
	}
	
	public int getNumberOfSecondaryLanguages() {
		return numberOfSecondaryLanguages;
	}
	
	public int getNumberOfSongs() {
		return numberOfSongs;
	}
	
	public void addSecondaryLanguage(String newSecondaryLanguage) {
		if(numberOfSecondaryLanguages < secondaryLanguageArray.length) {
			secondaryLanguageArray[numberOfSecondaryLanguages] = newSecondaryLanguage;
			numberOfSecondaryLanguages++;
		}
	}
	
	public String getSecondaryLanguage() {
		String allSecondaryLanguages = "";
		for(int i = 0; i < numberOfSecondaryLanguages; i++) {
			allSecondaryLanguages = allSecondaryLanguages + " " + secondaryLanguageArray[i];
		}
		return allSecondaryLanguages;
	}
	
	public void addSong(String newSong) {
		if(numberOfSongs < songArray.length) {
			songArray[numberOfSongs] = newSong;
			numberOfSongs++;
		}
	}
	
	public String getSongs() {
		String allSongs = "";
		for(int i = 0; i < numberOfSongs; i++) {
			allSongs = allSongs + " " + songArray[i];
		}
		return allSongs;
	}
	
	public String toString() {
		return super.toString() +
				"Secondary Languages: " + getSecondaryLanguage() + "\n" +
				"Songs: " + getSongs() + "\n";
	}
}