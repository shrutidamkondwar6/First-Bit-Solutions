//package Polymorphism;

class Defence //super class
{
	String name_of_head;
	int no_of_bases;
	int no_of_mission_performed;
	int no_of_troops;
	double budget;
	int no_of_dept;
	int no_of_vehicle;
	String location_of_headquarter;
	String country_name;
	int man_power_count;
	int no_of_casualtie;
	
	 Defence()// class defence default constructor
	{
		 System.out.println("default constructor called"); 
	}
	 
	 // class defence parameterized constructor

	 Defence(String name_of_head, int no_of_bases, int no_of_mission_performed, int no_of_troops, double budget,
			int no_of_dept, int no_of_vehicle, String location_of_headquarter, String country_name, int man_power_count,
			int no_of_casualtie)
	 {
			System.out.println("parameterized constructor");
			
		this.name_of_head = name_of_head;
		this.no_of_bases = no_of_bases;
		this.no_of_mission_performed = no_of_mission_performed;
		this.no_of_troops = no_of_troops;
		this.budget = budget;
		this.no_of_dept = no_of_dept;
		this.no_of_vehicle = no_of_vehicle;
		this.location_of_headquarter = location_of_headquarter;
		this.country_name = country_name;
		this.man_power_count = man_power_count;
		this.no_of_casualtie = no_of_casualtie;
	}
	 
	//class defence getters and setters

	  String getName_of_head() {
		 return name_of_head;
	 }

	  void setName_of_head(String name_of_head) {
		 this.name_of_head = name_of_head;
	 }

	  int getNo_of_bases() {
		 return no_of_bases;
	 }

	  void setNo_of_bases(int no_of_bases) {
		 this.no_of_bases = no_of_bases;
	 }

	  int getNo_of_mission_performed() {
		 return no_of_mission_performed;
	 }

	  void setNo_of_mission_performed(int no_of_mission_performed) {
		 this.no_of_mission_performed = no_of_mission_performed;
	 }

	  int getNo_of_troops() {
		 return no_of_troops;
	 }

	  void setNo_of_troops(int no_of_troops) {
		 this.no_of_troops = no_of_troops;
	 }

	  double getBudget() {
		 return budget;
	 }

	  void setBudget(double budget) {
		 this.budget = budget;
	 }

	  int getNo_of_dept() {
		 return no_of_dept;
	 }

	  void setNo_of_dept(int no_of_dept) {
		 this.no_of_dept = no_of_dept;
	 }

	  int getNo_of_vehicle() {
		 return no_of_vehicle;
	 }

	  void setNo_of_vehicle(int no_of_vehicle) {
		 this.no_of_vehicle = no_of_vehicle;
	 }

	  String getLocation_of_headquarter() {
		 return location_of_headquarter;
	 }

	  void setLocation_of_headquarter(String location_of_headquarter) {
		 this.location_of_headquarter = location_of_headquarter;
	 }

	  String getCountry_name() {
		 return country_name;
	 }

	  void setCountry_name(String country_name) {
		 this.country_name = country_name;
	 }

	  int getMan_power_count() {
		 return man_power_count;
	 }

	  void setMan_power_count(int man_power_count) {
		 this.man_power_count = man_power_count;
	 }

	  int getNo_of_casualtie() {
		 return no_of_casualtie;
	 }

	  void setNo_of_casualtie(int no_of_casualtie) {
		 this.no_of_casualtie = no_of_casualtie;
	 }//class defence getters and setters end here
	 

		 void attack()
		 {
			System.out.println("attack applied");
			System.out.println("\n");
		 }
		 
	 void display()//class defence display here
	 {
			System.out.println("name_of_head is:"+this.name_of_head);
			System.out.println("no_of_bases is:"+this.no_of_bases);
			System.out.println("no_of_mission_performed is:"+this.no_of_mission_performed);
			System.out.println("no_of_troops is:"+this.no_of_troops);
			System.out.println("budget is:"+this.budget);
			System.out.println("no_of_dept is:"+this.no_of_dept);
			System.out.println("no_of_vehicle is:"+this.no_of_vehicle);
			System.out.println("location_of_headquarter is:"+this.location_of_headquarter);
			System.out.println("country_name is:"+this.country_name);
			System.out.println("man_power_count is:"+this.man_power_count);
			System.out.println("no_of_casualtie is:"+this.no_of_casualtie);
			System.out.println("\n\n");

	}
}//class defence end here

class Army extends Defence //sub class 1
{
	
	int no_of_tants;
	int no_of_guns;
	int no_of_granads;
	int no_of_batalian;
	
	 Army()//class army default constructor
	{
		super();
		 System.out.println("default constructor called"); 
	}

	 Army( String name_of_head, int no_of_bases, int no_of_mission_performed, int no_of_troops, double budget,
			int no_of_dept, int no_of_vehicle, String location_of_headquarter, String country_name, int man_power_count,
			int no_of_casualtie,int no_of_tants, int no_of_guns, int no_of_granads, int no_of_batalian)//class army parameterized constructor
	{
		super( name_of_head,  no_of_bases, no_of_mission_performed, no_of_troops,  budget, no_of_dept, no_of_vehicle,  location_of_headquarter,  country_name,  man_power_count, no_of_casualtie);
		System.out.println("parameterized constructor");
		this.no_of_tants = no_of_tants;
		this.no_of_guns = no_of_guns;
		this.no_of_granads = no_of_granads;
		this.no_of_batalian = no_of_batalian;
	}
	
	//class army getters and setters start here

	 int getNo_of_tants() {
		return no_of_tants;
	}

	 void setNo_of_tants(int no_of_tants) {
		this.no_of_tants = no_of_tants;
	}

	 int getNo_of_guns() {
		return no_of_guns;
	}

	 void setNo_of_guns(int no_of_guns) {
		this.no_of_guns = no_of_guns;
	}

	 int getNo_of_granads() {
		return no_of_granads;
	}

	 void setNo_of_granads(int no_of_granads) {
		this.no_of_granads = no_of_granads;
	}

	 int getNo_of_batalian() {
		return no_of_batalian;
	}

	 void setNo_of_batalian(int no_of_batalian) {
		this.no_of_batalian = no_of_batalian;
	}
	
	//class army getters and setters

	 void attack()
	 {
		 System.out.println("attack using granads and gun");
		 System.out.println("\n");
	 }
	
	void display()//class army display here
	 {
		    super.display();
			System.out.println("no_of_tants is:"+this.no_of_tants);
			System.out.println("no_of_guns is:"+this.no_of_guns);
			System.out.println("no_of_granads is:"+this.no_of_granads);
			System.out.println("no_of_batalian is:"+this.no_of_batalian);
			System.out.println("attack using granads and gun");

			System.out.println("\n\n");

	 }

}//class army ends here//sub class 1 end here

class Navy extends Defence //sub class 2
{
	int no_of_ships;
	int no_of_submerizes;
	int no_of_torpedos;
	
	 Navy()//class navy default constructor
	{
		 super();
		 System.out.println("default constructor called"); 
	}

	 Navy(String name_of_head, int no_of_bases, int no_of_mission_performed, int no_of_troops, double budget,
			int no_of_dept, int no_of_vehicle, String location_of_headquarter, String country_name, int man_power_count,
			int no_of_casualtie,int no_of_ships, int no_of_submerizes, int no_of_torpedos)//class navy parameterized constructor
	{
		super( name_of_head,  no_of_bases, no_of_mission_performed, no_of_troops,  budget, no_of_dept, no_of_vehicle,  location_of_headquarter,  country_name,  man_power_count, no_of_casualtie);
		System.out.println("parameterized constructor");
		this.no_of_ships = no_of_ships;
		this.no_of_submerizes = no_of_submerizes;
		this.no_of_torpedos = no_of_torpedos;
	}

	//class navy setters and getters
	
	 int getNo_of_ships() {
		return no_of_ships;
	}

	 void setNo_of_ships(int no_of_ships) {
		this.no_of_ships = no_of_ships;
	}

	 int getNo_of_submerizes() {
		return no_of_submerizes;
	}

	 void setNo_of_submerizes(int no_of_submerizes) {
		this.no_of_submerizes = no_of_submerizes;
	}

	 int getNo_of_torpedos() {
		return no_of_torpedos;
	}

	 void setNo_of_torpedos(int no_of_torpedos) {
		this.no_of_torpedos = no_of_torpedos;
	}  //class navy setters and getters end here
	

	 void attack()
	 {
		 System.out.println("attack using torpedos");
		 System.out.println("\n");
	 }
	 
	void display()//class navy display here
	 {
		    super.display();
			System.out.println("no_of_ships is:"+this.no_of_ships);
			System.out.println("no_of_submerizes is:"+this.no_of_submerizes);
			System.out.println("no_of_torpedos is:"+this.no_of_torpedos);

			System.out.println("\n\n");

			
	 }	
}//class navy ends here//sub class 2 end here

class Air extends Defence//sub class 3
{
	int no_of_missials;
	int no_of_aircraft;
	int no_of_squadro;
	
	 Air() 
	{
	super();
	 System.out.println("default constructor called"); 
	}

	 Air(String name_of_head, int no_of_bases, int no_of_mission_performed, int no_of_troops, double budget,
			int no_of_dept, int no_of_vehicle, String location_of_headquarter, String country_name, int man_power_count,
			int no_of_casualtie,int no_of_missials, int no_of_aircraft, int no_of_squadro)
	 {
		super( name_of_head,  no_of_bases, no_of_mission_performed, no_of_troops,  budget, no_of_dept, no_of_vehicle,  location_of_headquarter,  country_name,  man_power_count, no_of_casualtie);
		System.out.println("parameterized constructor");

		this.no_of_missials = no_of_missials;
		this.no_of_aircraft = no_of_aircraft;
		this.no_of_squadro = no_of_squadro;
	}

	 int getNo_of_missials() {
		return no_of_missials;
	}

	 void setNo_of_missials(int no_of_missials) {
		this.no_of_missials = no_of_missials;
	}

	 int getNo_of_aircraft() {
		return no_of_aircraft;
	}

	 void setNo_of_aircraft(int no_of_aircraft) {
		this.no_of_aircraft = no_of_aircraft;
	}

	 int getNo_of_squadro() {
		return no_of_squadro;
	}

	 void setNo_of_squadro(int no_of_squadro) {
		this.no_of_squadro = no_of_squadro;
	}
	 
	 void attack()
	 {
		 System.out.println("attack using squardro");
		 System.out.println("\n");
	 }
	
	void display()//class air display here
	 {
		    super.display();
			System.out.println("no_of_missials is:"+this.no_of_missials);
			System.out.println("no_of_aircraft is:"+this.no_of_aircraft);
			System.out.println("no_of_squadro is:"+this.no_of_squadro);
			System.out.println("\n\n");

	 }	
}//sub class 3 end here

class DemoDefence
{
	public static void main(String[] args) {
		

		Defence d1=new Defence();
		//d1.display();
		d1.attack();
		
		d1=new Army();
		d1.attack();
		
		d1=new Navy();
		d1.attack();
		
		d1=new Air();
		d1.attack();
			
		
		
		/*Defence d2=new Defence("General Arjun Mehta", 25, 120, 25000, 5000000000.0,
	            6, 1500, "New Delhi", "India", 28000, 50);
		d2.display(); 
		
		
		Army a1=new Army();
		a1.display();
		Army a2=new Army("General Arjun Mehta", 25, 120, 25000, 5000000000.0,
	            6, 1500, "New Delhi", "India", 28000, 50,10,20,30,5);
		a2.display();
		
		
		Navy n1=new Navy();
		n1.display();
		Navy n2=new Navy("General Arjun Mehta", 25, 120, 25000, 5000000000.0,
	            6, 1500, "New Delhi", "India", 28000, 50,82,23,24);
		n2.display();
		
		
		Air ai1=new Air();
		ai1.display();
		Air ai2=new Air("General Arjun Mehta", 25, 120, 25000, 5000000000.0,
	            6, 1500, "New Delhi", "India", 28000, 50,20,34,53);
		ai2.display();*/
		
	}
}
