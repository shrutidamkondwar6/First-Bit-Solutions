//package p1;

 class Employee {

	int id;
	String name;
  	double salary;
  	
  	Employee()//default constructor
	{
	System.out.println("Constructor called");
	this.id=45;
	this.name="xyz";
	this.salary=4567;
	}
  	Employee(int id,String name,double salary)//parameterized   constructor
	{
	System.out.println("parameterized  Constructor called");
	this.id=id;
	this.name=name;
	this.salary=salary;
	}
  	
	  int getId() {
		return id;
	}
	  void setId(int id) {
		this.id = id;
	}
	  String getName() {
		return name;
	}
	  void setName(String name) {
		this.name = name;
	}
	  double getSalary() {
		return salary;
	}
	  void setSalary(double salary) {
		this.salary = salary;
	}
	  double calsal()
	  {
		  return salary;
	  }
	  
	void display()
	{
	System.out.println("ID is::"+this.id);
	System.out.println("Name is::"+this.name);
	System.out.println("Salary is::"+this.salary);
	System.out.println("acutual salary=" +calsal());
	System.out.println("\n");
	}
}//employee class ends here
class Admin extends Employee
{
	double allowance;
	
	Admin()//default constructor
	{
	super();
	System.out.println("Constructor called");
	allowance=2300;
	}
	
	Admin(int id,String name,double salary,double allowance)//parameterized   constructor
	{
	super(id, name, salary);
	System.out.println("  parameterized  Constructor called");
	this.allowance=allowance;
	}
	
  double getAllowance() {
		return allowance;
	}
	  void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	  double calsal()
	  {
		  return salary+allowance;
	  }
	  
	void display()
	{
	super.display();
	System.out.println("allowance is::"+this.allowance);
	//System.out.println("actual salary=" +calsal());
	System.out.println("\n");

	}
}
class HR extends Employee
{
 	double commission;
 	
	HR()//default constructor
	{
		super();
	System.out.println("Constructor called");
 	this.commission=4000;
	}
	
	HR(int id,String name,double salary,double commission)//parameterized  constructor
	{
		super(id, name, salary);
		System.out.println(" parameterized Constructor called");
 	this.commission=commission;
	}
	
  double getCommission() {
		return commission;
	}

	  void setCommission(double commission) {
		this.commission = commission;
	}
	  double calsal()
	  {
		  return salary+commission;
	  }
	  
	void display()
	{
	super.display();
	System.out.println("commission is::"+this.commission);
	//System.out.println("actual salary=" +calsal());
	System.out.println("\n");

	}
}//HR class ends here
class SalesManager extends Employee
{
 	double incentive;
	double target;
	SalesManager()//default constructor
	{
	super();
	System.out.println("Constructor called");
	this.incentive=40099;
	this.target=3400;
	
	}
	
	SalesManager(int id,String name,double salary,double incentive,double target)//default constructor
	{
	super(id, name, salary);
	System.out.println(" parameterized Constructor called");
	this.incentive=incentive;
	this.target=target;
	}
	
	  double getIncentive() {
		return incentive;
	}

	  void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	  double getTarget() {
		return target;
	}

	  void setTarget(double target) {
		this.target = target;
	}
	  double calsal()
	  {
		  return salary+incentive+target;
	  }

	void display()
	{
	super.display();
	System.out.println("incentive is::"+this.incentive);
	System.out.println("target is::"+this.target);
	//System.out.println("actual salary=" +calsal());
	System.out.println("\n");

	}
}
class DemoEmployee
{
	public  static void main(String[] args) {
		  
		   Employee e1;
		  e1=new Employee(101,"shruti",50000);
		  e1.display();
		  
		  e1=new SalesManager(102,"pragati",70000,545,678);
		  e1.display();

		  e1=new Admin(103,"neha",60000,456);
		  e1.display();

		  e1=new HR(104,"janvi",40000,567);
		  e1.display();

		
	}
}
