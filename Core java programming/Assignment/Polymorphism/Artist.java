
class Artist {
	
	String name;
	int age;
	String gender;
	String artStyle;
	
	 Artist() {
		 System.out.println("default constructor called");
	}

	 Artist(String name, int age, String gender, String artStyle) {
		super();
		System.out.println("\nparameterized constructor");
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.artStyle = artStyle;
	}

	String getName() {
		return name;
	}

	 void setName(String name) {
		this.name = name;
	}

	 int getAge() {
		return age;
	}

	 void setAge(int age) {
		this.age = age;
	}

	 String getGender() {
		return gender;
	}

	 void setGender(String gender) {
		this.gender = gender;
	}

	 String getArtStyle() {
		return artStyle;
	}

	 void setArtStyle(String artStyle) {
		this.artStyle = artStyle;
	}
	void display()
	{
		System.out.println("name:"+this.name);
		System.out.println("age:"+this.age);
		System.out.println("gender"+this.gender);
		System.out.println("artStyle"+this.artStyle);
	}
	
	void perform ()
	{
		System.out.println("performing");
	}
}
class Singer extends Artist
{
	String voiceType;
	int noofSoungs;
	String albumsoung;
	String language;
	
	 Singer() {
		super();
		System.out.println("default constructor called");
    }

	 Singer(String name, int age, String gender, String artStyle ,String voiceType, int noofSoungs, String albumsoung, String language) {
		super(name, age, gender, artStyle);
		System.out.println("\nparameterized constructor");
		this.voiceType = voiceType;
		this.noofSoungs = noofSoungs;
		this.albumsoung = albumsoung;
		this.language = language;
	}

	 String getVoiceType() {
		return voiceType;
	}

	 void setVoiceType(String voiceType) {
		this.voiceType = voiceType;
	}

	 int getNoofSoungs() {
		return noofSoungs;
	}

	 void setNoofSoungs(int noofSoungs) {
		this.noofSoungs = noofSoungs;
	}

	 String getAlbumsoung() {
		return albumsoung;
	}

	 void setAlbumsoung(String albumsoung) {
		this.albumsoung = albumsoung;
	}

	 String getLanguage() {
		return language;
	}

	 void setLanguage(String language) {
		this.language = language;
	}
	void display()
	{
		super.display();
		System.out.println(" voiceType :"+this.voiceType);
		System.out.println("no of soungs"+this.noofSoungs);
		System.out.println(" album song:"+this.albumsoung);
		System.out.println("lanuage:"+this.language);
	}
	
	void perform ()
	{
		System.out.println("singing the song");
	}
}

class Dancer extends Artist
{
	String danceStyle;
	int no_of_performance;
	int trainingYear;
	
	 Dancer() {
		super();
		System.out.println("default constructor called");
	}

	 Dancer(String name, int age, String gender, String artStyle ,String danceStyle, int no_of_performance, int trainingYear) {
		super(name, age, gender, artStyle);
		System.out.println("\nparameterized constructor");
		this.danceStyle = danceStyle;
		this.no_of_performance = no_of_performance;
		this.trainingYear = trainingYear;
	}

	 String getDanceStyle() {
		return danceStyle;
	}

	 void setDanceStyle(String danceStyle) {
		this.danceStyle = danceStyle;
	}

	 int getNo_of_performance() {
		return no_of_performance;
	}

	 void setNo_of_performance(int no_of_performance) {
		this.no_of_performance = no_of_performance;
	}

	 int getTrainingYear() {
		return trainingYear;
	}
	 
    void setTrainingYear(int trainingYear) {
		this.trainingYear = trainingYear;
	}
	void display()
	{
		super.display();
		System.out.println("dancestyle:"+this.danceStyle);
		System.out.println("no of performance"+this.no_of_performance);
		System.out.println("training year"+this.trainingYear);
	}
	
	void perform ()
	{
		System.out.println("perform the dance");
	}
	
}
class painter extends Artist
{
	String paintingStyle;
	String colorType;
	String famousPainting;
	
	 painter() {
		super();
		System.out.println("default constructor called");
	}

	 painter(String name, int age, String gender, String artStyle ,String paintingStyle, String colorType, String famousPainting) {
		super(name, age, gender, artStyle);
		System.out.println("\nparameterized constructor");
		this.paintingStyle = paintingStyle;
		this.colorType = colorType;
		this.famousPainting = famousPainting;
	}

	 String getPaintingStyle() {
		return paintingStyle;
	}

	 void setPaintingStyle(String paintingStyle) {
		this.paintingStyle = paintingStyle;
	}

	 String getColorType() {
		return colorType;
	}

	 void setColorName(String colorType) {
		this.colorType = colorType;
	}

	 String getFamousPainting() {
		return famousPainting;
	}

	 void setFamousPainting(String famousPainting) {
		this.famousPainting = famousPainting;
	}
	void display()
	{
		super.display();
		System.out.println("painting style:"+this.paintingStyle);
		System.out.println("color type:"+this.colorType);
		System.out.println("famous painting:"+this.famousPainting);
	}
	
	void perform ()
	{
		System.out.println("painter  draw the image");
	}
	
}
class DemoArtist 
{
	public static void main(String[] args) {
		
		Artist a;
		a = new Artist ("A. R. Rahman", 56, "Male", "Music Composition");
		//a.display();
	      a.perform();
		
		a= new Singer("Arijit Singh", 36, "Male", "Singing",
                      "Melodious", 200, "Tum Hi Ho", "Hindi");
	   // a.display();
	    a.perform();
	    
	    a = new Dancer ("Shakti Mohan", 36, "Female", "Dancing",
                         "Contemporary", 200, 15);
	    //a.display();
	    a.perform();
	    
	    a = new painter("Leonardo da Vinci", 67, "Male", "Painting",
                         "Renaissance", "Oil Colors", "Mona Lisa");
	    //a.display();
	    a.perform();
	}
}