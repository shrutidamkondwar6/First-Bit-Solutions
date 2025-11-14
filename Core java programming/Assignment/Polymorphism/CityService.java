
class CityService // super class
{
	String service_name;
	int Service_id;
	String department;
	double budget;
	String location;

	 CityService() 
	{
		  System.out.println("default constructor called"); 

	}

       CityService(String service_name, int service_id, String department, double budget, String location) {
		System.out.println("parameterized constructor called");
		this.service_name = service_name;
		Service_id = service_id;
		this.department = department;
		this.budget = budget;
		this.location = location;
	}

	 String getService_name() {
		return service_name;
	}

	 void setService_name(String service_name) {
		this.service_name = service_name;
	}

	 int getService_id() {
		return Service_id;
	}

	 void setService_id(int service_id) {
		Service_id = service_id;
	}

	 String getDepartment() {
		return department;
	}

	 void setDepartment(String department) {
		this.department = department;
	}

	 double getBudget() {
		return budget;
	}

	 void setBudget(double budget) {
		this.budget = budget;
	}

	 String getLocation() {
		return location;
	}

	 void setLocation(String location) {
		this.location = location;
	}

	void display()// class display here
	{

		System.out.println("service_name is:" + this.service_name);
		System.out.println("Service_id is:" + this.Service_id);
		System.out.println("department is:" + this.department);
		System.out.println("budget is:" + this.budget);
		System.out.println("location is:" + this.location);
		System.out.println("\n\n");
	}
	
	void Duty()
	{
		System.out.println("WasteManagement Duty: Manage city waste collection and recycling.");
		System.out.println("manage patient appointments and inquiries");
	}

}// class CityService ends here //super class ends here

class WasteManagement extends CityService// sub class 1
{
	int trucks_available;
	double recycling_rate;
	int staff_count;
	String area_coverd;
	String manager_name;

	 WasteManagement() 
	{
		  System.out.println("default constructor called"); 

	}

	 WasteManagement(int trucks_available, double recycling_rate, int staff_count, String area_coverd,
			String manager_name) {
		System.out.println("parameterized constructor called");
		this.trucks_available = trucks_available;
		this.recycling_rate = recycling_rate;
		this.staff_count = staff_count;
		this.area_coverd = area_coverd;
		this.manager_name = manager_name;
	}

	 int getTrucks_available() {
		return trucks_available;
	}

	 void setTrucks_available(int trucks_available) {
		this.trucks_available = trucks_available;
	}

	 double getRecycling_rate() {
		return recycling_rate;
	}

	 void setRecycling_rate(double recycling_rate) {
		this.recycling_rate = recycling_rate;
	}

	 int getStaff_count() {
		return staff_count;
	}

	  void setStaff_count(int staff_count) {
		this.staff_count = staff_count;
	}

	  String getArea_coverd() {
		return area_coverd;
	}

	  void setArea_coverd(String area_coverd) {
		this.area_coverd = area_coverd;
	}

	  String getManager_name() {
		return manager_name;
	}

	  void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	void display()// class display here
	{
		super.display();

		System.out.println("trucks_available is:" + this.trucks_available);
		System.out.println("recycling_rate is:" + this.recycling_rate);
		System.out.println("staff_count is:" + this.staff_count);
		System.out.println("area_coverd is:" + this.area_coverd);
		System.out.println("manager_name is:" + this.manager_name);
		System.out.println("\n\n");
	}
	
	void Duty()
	{
		System.out.println("City Services ");
	}

}// class WasteManagement ends here //sub class 1 ends here

class WaterSupply extends CityService// sub class 2
{
	String water_source;
	double Storage_capacity;
	double pipeline;
	int house_holds_served;
	double quality_rating;

	 WaterSupply()
	{
		  System.out.println("default constructor called"); 

	}

	 WaterSupply(String water_source, double storage_capacity, double pipeline, int house_holds_served,
			double quality_rating) 
	{
		System.out.println("parameterized constructor called");
		this.water_source = water_source;
		Storage_capacity = storage_capacity;
		this.pipeline = pipeline;
		this.house_holds_served = house_holds_served;
		this.quality_rating = quality_rating;
	}
	
	

	 String getWater_source() {
		return water_source;
	}

	 void setWater_source(String water_source) {
		this.water_source = water_source;
	}

	 double getStorage_capacity() {
		return Storage_capacity;
	}

	 void setStorage_capacity(double storage_capacity) {
		Storage_capacity = storage_capacity;
	}

	 double getPipeline() {
		return pipeline;
	}

	 void setPipeline(double pipeline) {
		this.pipeline = pipeline;
	}

	  int getHouse_holds_served() {
		return house_holds_served;
	}

	 void setHouse_holds_served(int house_holds_served) {
		this.house_holds_served = house_holds_served;
	}

	 double getQuality_rating() {
		return quality_rating;
	}

	  void setQuality_rating(double quality_rating) {
		this.quality_rating = quality_rating;
	}

	void display()// class display here
	{
		super.display();

		System.out.println("water_source is:" + this.water_source);
		System.out.println("Storage_capacity is:" + this.Storage_capacity);
		System.out.println("pipeline is:" + this.pipeline);
		System.out.println("house_holds_served is:" + this.house_holds_served);
		System.out.println("quality_rating is:" + this.quality_rating);
		System.out.println("\n\n");
	}
	
	void Duty()
	{
	    System.out.println("WaterSupply Duty: Ensure clean water supply and pipeline maintenance.");
	}
}// class WaterSupply ends here //sub class 2 ends here

class ElectricityDepartment extends CityService // sub class 3
{
	int no_power_stations;
	double daily_consumption;
	int no_of_transformers;
	int no_of_outages_reported;
	String maintenance_team;
	
	 ElectricityDepartment() 
	{
		  System.out.println("default constructor called"); 

	}
	
	

	 ElectricityDepartment(int no_power_stations, double daily_consumption, int no_of_transformers,
			int no_of_outages_reported, String maintenance_team)
	{
		System.out.println("parameterized constructor called");
		this.no_power_stations = no_power_stations;
		this.daily_consumption = daily_consumption;
		this.no_of_transformers = no_of_transformers;
		this.no_of_outages_reported = no_of_outages_reported;
		this.maintenance_team = maintenance_team;
	}



	 int getNo_power_stations() {
		return no_power_stations;
	}



	 void setNo_power_stations(int no_power_stations) {
		this.no_power_stations = no_power_stations;
	}



	 double getDaily_consumption() {
		return daily_consumption;
	}



	 void setDaily_consumption(double daily_consumption) {
		this.daily_consumption = daily_consumption;
	}



	 int getNo_of_transformers() {
		return no_of_transformers;
	}



	 void setNo_of_transformers(int no_of_transformers) {
		this.no_of_transformers = no_of_transformers;
	}



	 int getNo_of_outages_reported() {
		return no_of_outages_reported;
	}



	 void setNo_of_outages_reported(int no_of_outages_reported) {
		this.no_of_outages_reported = no_of_outages_reported;
	}



	 String getMaintenance_team() {
		return maintenance_team;
	}



	  void setMaintenance_team(String maintenance_team) {
		this.maintenance_team = maintenance_team;
	}



	void display()// class display here
	{
		super.display();

		System.out.println("no_power_stations is:" + this.no_power_stations);
		System.out.println("daily_consumption is:" + this.daily_consumption);
		System.out.println("no_of_transformers is:" + this.no_of_transformers);
		System.out.println("no_of_outages_reported is:" + this.no_of_outages_reported);
		System.out.println("maintenance_team is:" + this.maintenance_team);
		System.out.println("\n\n");
	}
	
	void Duty()
	{
	    System.out.println("ElectricityDepartment Duty: Maintain power supply and transformers.");
	}
}// class ElectricityDepartment ends here //sub class 3 ends here

class DemoCityService
{
	  static void main(String[] args) {
		
		CityService d1=new CityService();
		//d1.display();
		d1.Duty();
		
		d1=new WasteManagement();
		//d1.display();
		d1.Duty();
		
		d1=new WaterSupply();
		//d1.display();
		d1.Duty();
		
	    d1=new ElectricityDepartment();
		//e1.display();
	    d1.Duty();
	}
}
