import java.util.Scanner;

public class FilmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Film[] filmArray = new Film[10];
		int numberOfFilms = 0;
		int option;
		do {
			System.out.println("Press 1 to create a Film");
			System.out.println("Press 2 to create a Foreign Film");
			System.out.println("Press 3 to create a Bollywood Film");
			System.out.println("Press 4 to view all the films");
			System.out.println("Press 5 to exit");
			option = keyboard.nextInt();
			
			if(option == 1) {
				Film currentFilm = new Film();
				enterInformation(currentFilm);
				boolean alreadyInTheArray = checkForDuplicate(filmArray,numberOfFilms,currentFilm);
				if(!alreadyInTheArray) {
					numberOfFilms = insertIntoArray(filmArray,numberOfFilms,currentFilm);
				}
				else {
					System.out.println("This film already exists in the system");
				}
			}
			else if(option == 2) {
				ForeignFilm currentForeignFilm = new ForeignFilm();
				enterInformation(currentForeignFilm);
				boolean alreadyInTheArray = checkForDuplicate(filmArray,numberOfFilms, currentForeignFilm);
				if(!alreadyInTheArray) {
					numberOfFilms = insertIntoArray(filmArray,numberOfFilms,currentForeignFilm);
				}
				else {
					System.out.println("This film already exists in the system.");
				}
			}
			else if(option == 3) {
				BollywoodFilm currentBollywoodFilm = new BollywoodFilm();
				enterInformation(currentBollywoodFilm);
				boolean alreadyInTheArray = checkForDuplicate(filmArray,numberOfFilms, currentBollywoodFilm);
				if(!alreadyInTheArray) {
					numberOfFilms = insertIntoArray(filmArray,numberOfFilms,currentBollywoodFilm);
				} 
				else {
					System.out.println("This film already exists in the system");
				}
			}
			else if(option == 4) {
				print(filmArray,numberOfFilms);
			}
			else if(option == 5) {
				System.out.println("Thank you for using the Film Library prototype.");
			}
			else {
				System.out.println("Error. Invalid entry");
			}
			
			
		}while(option != 5);
		
	}
	
	public static boolean checkForDuplicate(Film [] array, int numberOfFilms, Film newFilm) {
		boolean alreadyInTheArray = false;
		for(int i=0; i < numberOfFilms; i++) {
			if(array[i].equals(newFilm)) {
				alreadyInTheArray = true;
			}
		}
		
		return alreadyInTheArray;
		
	}
	
	public static int insertIntoArray(Film [] array, int numberOfFilms, Film newFilm) {
		array[numberOfFilms] = newFilm;
		numberOfFilms++;
		return numberOfFilms;
	}
	
	public static void print(Film [] array, int numberOfFilms) {
		for(int i=0; i < numberOfFilms; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void enterInformation(Film newFilm) {
		Scanner keyboard = new Scanner(System.in);
		if(newFilm != null) {
			System.out.println("Enter the name of the film");
			String name = keyboard.nextLine();
			System.out.println("Enter the director of the film");
			String director = keyboard.nextLine();
			System.out.println("Enter the year of the film");
			int year = keyboard.nextInt();
			keyboard.nextLine();
			
			newFilm.setName(name);
			newFilm.setDirector(director);
			newFilm.setYear(year);
			
			if(newFilm instanceof ForeignFilm) {
				System.out.println("Enter the native language the film is: ");
				String nativeLanguage = keyboard.nextLine();
				System.out.println("Enter translation of the name in English");
				String translationOfNameInEnglish = keyboard.nextLine();
				System.out.println("How many subtitles does this film have?");
				int number = keyboard.nextInt();
				keyboard.nextLine();
				ForeignFilm newForeignFilm = (ForeignFilm)newFilm;
				newForeignFilm.setNativeLanguage(nativeLanguage);
				newForeignFilm.setTranslationOfNameInEnglish(translationOfNameInEnglish);
				
				for(int i =0; i < number; i++) {
					System.out.println("Enter the next subtitle");
					String nextSubtitle = keyboard.nextLine();
					if(newForeignFilm.getNumberOfSubtitles() < ForeignFilm.getMaxSubtitles()) {
						newForeignFilm.addSubtitle(nextSubtitle);
					}
				}
				
				if(newFilm instanceof BollywoodFilm) {
					BollywoodFilm newBollywoodFilm = (BollywoodFilm)newFilm;
					
					System.out.println("How many secondary languages does this film have?");
					int secondary = keyboard.nextInt();
					keyboard.nextLine();
					
					for(int i=0; i < secondary; i++) {
						System.out.println("Enter the next secondary language");
						String nextSecondaryLanguage = keyboard.nextLine();
						if(newBollywoodFilm.getNumberOfSecondaryLanguages() < BollywoodFilm.getMaxSecondaryLanguages()) {
							newBollywoodFilm.addSecondaryLanguage(nextSecondaryLanguage);
						}
					}
					
					System.out.println("How many songs does this film have?");
					int songs = keyboard.nextInt();
					keyboard.nextLine();
					
					for(int i=0; i < songs; i++) {
						System.out.println("Enter the next song");
						String nextSong = keyboard.nextLine();
						if(newBollywoodFilm.getNumberOfSongs() < BollywoodFilm.getMaxSongs()) {
							newBollywoodFilm.addSong(nextSong);
						}
					}
					
					
					
				}
				
				
			}
			
			
		}
	}

}