
class Musical_Instrument {

	String instrument_name;
	String type;
	int size;
	int weight;
	double price;
	String soundRange;
	
	Musical_Instrument() {
	System.out.println("default constructor called");
}

 Musical_Instrument(String instrument_name, String type, int size, int weight, double price,
			String soundRange) {
		super();
		this.instrument_name = instrument_name;
		this.type = type;
		this.size = size;
		this.weight = weight;
		this.price = price;
		this.soundRange = soundRange;
	}

String getInstrument_name() {
	return instrument_name;
}

 void setInstrument_name(String instrument_name) {
	this.instrument_name = instrument_name;
}

 String getType() {
	return type;
}

 void setType(String type) {
	this.type = type;
}

 int getSize() {
	return size;
}

 void setSize(int size) {
	this.size = size;
}

 int getWeight() {
	return weight;
}

 void setWeight(int weight) {
	this.weight = weight;
}

 double getPrice() {
	return price;
}

 void setPrice(double price) {
	this.price = price;
}

 String getSoundRange() {
	return soundRange;
}

 void setSoundRange(String soundRange) {
	this.soundRange = soundRange;
}
 void display()
 {
	 System.out.println("instrument name:"+this.instrument_name);
	 System.out.println("type:"+this.type);
	 System.out.println("size:"+this.size);
	 System.out.println("weight:"+this.weight);
	 System.out.println("price:"+this.price);
	 System.out.println("SoundRange"+this.soundRange);
 }
 
 void Play()
 {
	 System.out.println("playing musical instrument sound");
 }
}// musical Instruments end here

class Gitar extends Musical_Instrument
{
	int noofStrings;
	String DesignType;
	
	 Gitar() {
		super();
	}

	 Gitar(String instrument_name, String type, int size, int weight, double price,String soundRange ,int noofStrings, String designType)
	 {
		super( instrument_name,type,  size,weight,price, soundRange);
		System.out.println("\nparameterized constructor");
		this.noofStrings = noofStrings;
		DesignType = designType;
	}

	 int getNoofStrings() {
		return noofStrings;
	}

	 void setNoofStrings(int noofStrings) {
		this.noofStrings = noofStrings;
	}

	 String getDesignType() {
		return DesignType;
	}

	 void setDesignType(String designType) {
		DesignType = designType;
	}
	void display()
	{
		System.out.println("no of Strings:"+this.DesignType);
		System.out.println("Design type:"+this.DesignType);
	}
	
	void Play()
	 {
		 System.out.println("playing gitar Strings");
	 }
}// Guitar class end here

class piano extends Musical_Instrument
{
	int noofKeys;
	int pedalcount;
	
	 piano() {
		super();
	}

	 piano(String instrument_name, String type, int size, int weight, double price,String soundRange ,int noofKeys, int pedalcount)
	{
		super( instrument_name,type,  size,weight,price, soundRange);
		System.out.println("\nparameterized constructor");
		this.noofKeys = noofKeys;
		this.pedalcount = pedalcount;
	}

	 int getNoofKeys() {
		return noofKeys;
	}

	 void setNoofKeys(int noofKeys) {
		this.noofKeys = noofKeys;
	}

	 int getPedalcount() {
		return pedalcount;
	}

	 void setPedalcount(int pedalcount) {
		this.pedalcount = pedalcount;
	}
	void display()
	{
		System.out.println("no of keys:"+this.noofKeys);
		System.out.println("pedalcount:"+this.pedalcount);
	}
	
	void Play()
	 {
		 System.out.println("playing piano melogy ");
	 }
}// piano class end here

class Drum extends Musical_Instrument
{
	String drumType;
	double diameter;
	

    Drum() {
	super();
	}


      Drum(String instrument_name, String type, int size, int weight, double price,String soundRange ,String drumType, double diameter)
	{
		super( instrument_name,type,  size,weight,price, soundRange);
		System.out.println("\nparameterized constructor");
		this.drumType = drumType;
		this.diameter = diameter;
	}

	 String getDrumType() {
		return drumType;
	}

	void setDrumType(String drumType) {
		this.drumType = drumType;
	}

	double getDiameter() {
		return diameter;
	}

	void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	void display()
	{
		System.out.println("drumtype:"+this.drumType);
		System.out.println("Diameter:"+this.diameter);
	}
	
	void Play()
	 {
		 System.out.println("beating drum rthym");
	 }
}// Drum class end here

class DemoMusical_Instrument
{
	public static void main(String[] args) {
		
		Musical_Instrument m;
		m = new Musical_Instrument ("Guitar", "String", 40, 3, 15000.50, "Low to High");
		//m.display();
		m.Play();
		
		m = new  Gitar ("Guitar", "String", 40, 3, 15000.50, "Low to High", 6, "Acoustic");
		//m.display();
		m.Play();
		 
		m = new piano ("Grand Piano", "Keyboard", 60, 300, 250000.00, "Wide Range", 88, 3);
		//m.display();
		m.Play();
		
		m = new Drum ("Snare Drum", "Percussion", 20, 7, 12000.00, "Medium Range", "Snare", 14.5);
		//m.display();
		m.Play();
	}
}