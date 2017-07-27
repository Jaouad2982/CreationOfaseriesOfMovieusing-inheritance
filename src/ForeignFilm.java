
public class ForeignFilm extends Film {
	//instance variables
	private String nativeLanguage;
	private String translationOfNameInEnglish;
	private String [] subtitleArray;
	private int numberOfSubtitles;
	
	//static variables
	private static int maxSubtitles = 10;
	
	//static methods
	public static void setMaxSubtitles(int newMaxSubtitles) {
		if(newMaxSubtitles > maxSubtitles) {
			maxSubtitles = newMaxSubtitles;
		}
	}
	
	public static int getMaxSubtitles() {
		return maxSubtitles;
	}
	
	//default constructor
	public ForeignFilm() {
		super();
		nativeLanguage = "";
		translationOfNameInEnglish = "";
		subtitleArray = new String[maxSubtitles];
		numberOfSubtitles = 0;
	}
	
	//non-static methods
	public void setNativeLanguage(String newNativeLanguage) {
		nativeLanguage = newNativeLanguage;
	}
	
	public String getNativeLanguage() {
		return nativeLanguage;
	}
	
	public void setTranslationOfNameInEnglish(String translationOfNameInEnglish){
		this.translationOfNameInEnglish = translationOfNameInEnglish;
	}
	
	public String getTranslationOfNameInEnglish() {
		return translationOfNameInEnglish;
	}
	
	public void addSubtitle(String newSubtitle) {
		if(numberOfSubtitles < subtitleArray.length) {
			subtitleArray[numberOfSubtitles] = newSubtitle;
			numberOfSubtitles++;
		}
	}
	
	public String getSubtitles() {
		String allSubtitles = "";
		for(int i = 0; i < numberOfSubtitles; i++) {
			allSubtitles = allSubtitles + " " + subtitleArray[i];
		}
		return allSubtitles;
	}
	
	public int getNumberOfSubtitles() {
		return numberOfSubtitles;
	}
	
	public String toString() {
		return super.toString() + "\n" + 
				"Native Language: " + nativeLanguage + "\n" +
				"Tranlation of the Name in English: " + translationOfNameInEnglish + "\n" +
				"The languages this film is subtitled in are: " + getSubtitles() + "\n";
	}
}