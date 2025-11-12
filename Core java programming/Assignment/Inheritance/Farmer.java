
 class Farmer {
	
	int farmer_id;
	String farmer_name;
	double land_area;
	String city;
	double annual_income;
	int no_of_equipment;
	double insurance_amount;
	
	 Farmer()//default 
	{
		 System.out.println("\ndefault constructor called"); 
	}

	 Farmer(int farmer_id, String farmer_name, double land_area, String city, double annual_income,
			int no_of_equipment, double insurance_amount) {
		 System.out.println("\nparameterized constructor called");
		this.farmer_id = farmer_id;
		this.farmer_name = farmer_name;
		this.land_area = land_area;
		this.city = city;
		this.annual_income = annual_income;
		this.no_of_equipment = no_of_equipment;
		this.insurance_amount = insurance_amount;
	}

	 int getFarmer_id() {
		return farmer_id;
	}

	 void setFarmer_id(int farmer_id) {
		this.farmer_id = farmer_id;
	}

	 String getFarmer_name() {
		return farmer_name;
	}

	 void setFarmer_name(String farmer_name) {
		this.farmer_name = farmer_name;
	}

	 double getLand_area() {
		return land_area;
	}

	 void setLand_area(double land_area) {
		this.land_area = land_area;
	}

	 String getCity() {
		return city;
	}

	 void setCity(String city) {
		this.city = city;
	}

	 double getAnnual_income() {
		return annual_income;
	}

	 void setAnnual_income(double annual_income) {
		this.annual_income = annual_income;
	}

	 int getNo_of_equipment() {
		return no_of_equipment;
	}

	 void setNo_of_equipment(int no_of_equipment) {
		this.no_of_equipment = no_of_equipment;
	}

	 double getInsurance_amount() {
		return insurance_amount;
	}

	 void setInsurance_amount(double insurance_amount) {
		this.insurance_amount = insurance_amount;
	}
	
	
	void display()//class farmer display here
	 {
			System.out.println("farmer_id is:"+this.farmer_id);
			System.out.println("farmer_name is:"+this.farmer_name);
			System.out.println("land_area is:"+this.land_area);
			System.out.println("city is:"+this.city);
			System.out.println("annual_income is:"+this.annual_income);
			System.out.println("no_of_equipment is:"+this.no_of_equipment);
			System.out.println("insurance_amount is:"+this.insurance_amount);
	 }	

}

class DairyFarmer extends Farmer
{
	int no_of_cattles;
	double milk_produced;
	int dairy_licence_no;
	
	 DairyFarmer() 
	{
		super();
		 System.out.println("\ndefault constructor called"); 
	}

	 DairyFarmer(int farmer_id, String farmer_name, double land_area, String city, double annual_income,
				int no_of_equipment, double insurance_amount,int no_of_cattles, double milk_produced, int dairy_licence_no) {
		super( farmer_id,  farmer_name,  land_area,  city,  annual_income,no_of_equipment,  insurance_amount);
		System.out.println("\nparameterized constructor");

		this.no_of_cattles = no_of_cattles;
		this.milk_produced = milk_produced;
		this.dairy_licence_no = dairy_licence_no;
	}

	 int getNo_of_cattles() {
		return no_of_cattles;
	}

	 void setNo_of_cattles(int no_of_cattles) {
		this.no_of_cattles = no_of_cattles;
	}

	 double getMilk_produced() {
		return milk_produced;
	}

	 void setMilk_produced(double milk_produced) {
		this.milk_produced = milk_produced;
	}

	 int getDairy_licence_no() {
		return dairy_licence_no;
	}

	 void setDairy_licence_no(int dairy_licence_no) {
		this.dairy_licence_no = dairy_licence_no;
	}
	
	void display()//class Dairy farmer display here
	 {
			super.display();
			System.out.println("no_of_cattles is:"+this.no_of_cattles);
			System.out.println("milk_produced is:"+this.milk_produced);
			System.out.println("dairy_licence_no is:"+this.dairy_licence_no);
	 }
}

class PouttryFarmer extends Farmer
{
	int no_of_chikens;
	int no_of_shades;
	int shad_capacity;
	int eggs_produce_day;
	String Pouttry_farmer_name;
	
	 PouttryFarmer()
	{
		super();
		 System.out.println("\ndefault constructor called"); 
	}

	 PouttryFarmer(int farmer_id, String farmer_name, double land_area, String city, double annual_income,
				int no_of_equipment, double insurance_amount,int no_of_chikens, int no_of_shades, int shad_capacity, int eggs_produce_day,
			String pouttry_farmer_name) {
			super( farmer_id,  farmer_name,  land_area,  city,  annual_income,no_of_equipment,  insurance_amount);
		System.out.println("\nparameterized constructor");

		this.no_of_chikens = no_of_chikens;
		this.no_of_shades = no_of_shades;
		this.shad_capacity = shad_capacity;
		this.eggs_produce_day = eggs_produce_day;
		this.Pouttry_farmer_name = pouttry_farmer_name;
	}

	 int getNo_of_chikens() {
		return no_of_chikens;
	}

	 void setNo_of_chikens(int no_of_chikens) {
		this.no_of_chikens = no_of_chikens;
	}

	 int getNo_of_shades() {
		return no_of_shades;
	}

	 void setNo_of_shades(int no_of_shades) {
		this.no_of_shades = no_of_shades;
	}

	 int getShad_capacity() {
		return shad_capacity;
	}

	 void setShad_capacity(int shad_capacity) {
		this.shad_capacity = shad_capacity;
	}

	 int getEggs_produce_day() {
		return eggs_produce_day;
	}

	 void setEggs_produce_day(int eggs_produce_day) {
		this.eggs_produce_day = eggs_produce_day;
	}

	 String getPouttry_farmer_name() {
		return Pouttry_farmer_name;
	}

	 void setPouttry_farmer_name(String pouttry_farmer_name) {
		Pouttry_farmer_name = pouttry_farmer_name;
	}
	
	void display()//class Pouttry farmer display here
	 {
			super.display();
			System.out.println("no_of_chikens is:"+this.no_of_chikens);
			System.out.println("no_of_shades is:"+this.no_of_shades);
			System.out.println("shad_capacity is:"+this.shad_capacity);
			System.out.println("eggs_produce_day is:"+this.eggs_produce_day);
			System.out.println("Pouttry_farmer_name is:"+this.Pouttry_farmer_name);
	 }
}

class OrganicFarmer extends Farmer
{
	int organic_id;
	String crop_type;
	String fertillize_used;
	
	 OrganicFarmer() 
	{
	super();
	 System.out.println("\ndefault constructor called"); 
	}

	 OrganicFarmer(int farmer_id, String farmer_name, double land_area, String city, double annual_income,
				int no_of_equipment, double insurance_amount,int organic_id, String crop_type, String fertillize_used) {
			super( farmer_id,  farmer_name,  land_area,  city,  annual_income,no_of_equipment,  insurance_amount);
		System.out.println("\nparameterized constructor");

		this.organic_id = organic_id;
		this.crop_type = crop_type;
		this.fertillize_used = fertillize_used;
	}

	 int getOrganic_id() {
		return organic_id;
	}

	 void setOrganic_id(int organic_id) {
		this.organic_id = organic_id;
	}

	 String getCrop_type() {
		return crop_type;
	}

	 void setCrop_type(String crop_type) {
		this.crop_type = crop_type;
	}

	 String getFertillize_used() {
		return fertillize_used;
	}

	 void setFertillize_used(String fertillize_used) {
		this.fertillize_used = fertillize_used;
	}
	
	void display()//class organic farmer display here
	 {
			super.display();
			System.out.println("organic_id is:"+this.organic_id);
			System.out.println("crop_type is:"+this.crop_type);
			System.out.println("fertillize_used is:"+this.fertillize_used);
	 }
	
}

class DemoFarmer
{
	public static void main(String[] args) {
		
		
		Farmer f2=new Farmer();
		f2.display();
		
		Farmer f1=new Farmer(101, "Ramesh Patil", 5.5, "Nashik", 450000.0, 5, 150000.0);
		f1.display();
		
		DairyFarmer d1=new DairyFarmer();
		d1.display();
		
		DairyFarmer d2=new DairyFarmer(101, "Ramesh", 12.5, "Nagpur", 500000.0, 
                4, 12000.0, 10, 2500.0, 98765);
		d2.display();
		
		PouttryFarmer p1=new PouttryFarmer();
		p1.display();
		
		PouttryFarmer p2=new PouttryFarmer(201, "Amit", 5.0, "Pune", 350000.0,
                6, 15000.0, 500, 3, 200, 1200,
                "Golden Eggs Poultry Farm");
		p2.display();
		
		OrganicFarmer o1=new OrganicFarmer();
		o1.display();
		
		OrganicFarmer o2=new OrganicFarmer(301, "Priya", 8.5, "Nashik", 420000.0,
                5, 18000.0, 1001, "Vegetables", "Cow Manure");
		o2.display();
		
	}
}
