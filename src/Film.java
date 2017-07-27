
public class Film {
	//instance variables
	private String name;
	private String director;
	private int year;
	
	//default constructor
	public Film() {
		name = "";
		director = "";
		year = 0;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDirector(String newDirector) {
		director = newDirector;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setYear(int newYear) {
		if(newYear >= 1890 && newYear <= 2016) {
			year = newYear;
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return "Name: " + name + "\n" +
				"Director: " + director + "\n" +
				"Year: " + year;
	}
	
	public boolean equals(Object otherObject) {
		boolean isEqual = false;
		if(otherObject != null && otherObject instanceof Film) {
			Film otherFilm = (Film)otherObject;
			if(this.name.equals(otherFilm.name) && 
					this.director.equals(otherFilm.director) &&
					this.year == otherFilm.year) {
				isEqual = true;
			}
		}
		return isEqual;
					
		}
	}
	
