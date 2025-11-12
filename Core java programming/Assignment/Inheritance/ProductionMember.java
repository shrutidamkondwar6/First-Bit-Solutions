
 class ProductionMember//super class
{
  String name;
  int age;
  int experience_years;
  double salary;
  String movie_name;
  
  ProductionMember()//
  {
	  System.out.println("default constructor called"); 
  }
  
  
  
   ProductionMember(String name, int age, int experience_years, double salary, String movie_name) {
		System.out.println("parameterized constructor called");

	this.name = name;
	this.age = age;
	this.experience_years = experience_years;
	this.salary = salary;
	this.movie_name = movie_name;
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



   int getExperience_years() {
	return experience_years;
  }



   void setExperience_years(int experience_years) {
	this.experience_years = experience_years;
  }


 double getSalary() {
	return salary;
  }



   void setSalary(double salary) {
	this.salary = salary;
  }



   String getMovie_name() {
	return movie_name;
  }



   void setMovie_name(String movie_name) {
	this.movie_name = movie_name;
  }



  void display()//class  display here
  {
	  
	   
		System.out.println("name is:"+this.name);
		System.out.println("age is:"+this.age);
		System.out.println("experience_years is:"+this.experience_years);
		System.out.println("salary is:"+this.salary);
		System.out.println("movie_name is:"+this.movie_name);
		System.out.println("\n\n");
  }
  
}

class Actor extends ProductionMember//sub class 1
{
	String role_type;
	int no_of_scenes;
	String famous_dialogue;
	int awards_won;
	 Actor()
	{
		  System.out.println("default constructor called"); 

	}
	
	
	
	 Actor(String role_type, int no_of_scenes, String famous_dialogue, int awards_won) {
		
		System.out.println("parameterized constructor called");
		this.role_type = role_type;
		this.no_of_scenes = no_of_scenes;
		this.famous_dialogue = famous_dialogue;
		this.awards_won = awards_won;
	}



	 String getRole_type() {
		return role_type;
	}



	 void setRole_type(String role_type) {
		this.role_type = role_type;
	}



	 int getNo_of_scenes() {
		return no_of_scenes;
	}



	 void setNo_of_scenes(int no_of_scenes) {
		this.no_of_scenes = no_of_scenes;
	}



	 String getFamous_dialogue() {
		return famous_dialogue;
	}



	 void setFamous_dialogue(String famous_dialogue) {
		this.famous_dialogue = famous_dialogue;
	}



	public int getAwards_won() {
		return awards_won;
	}



	public void setAwards_won(int awards_won) {
		this.awards_won = awards_won;
	}



	void display()//class  display here
	  {
		   super.display();
		   
			System.out.println("role_type is:"+this.role_type);
			System.out.println("no_of_scenes is:"+this.no_of_scenes);
			System.out.println("famous_dialogue is:"+this.famous_dialogue);
			System.out.println("awards_won is:"+this.awards_won);
			System.out.println("\n\n");
	  }
	
}
class Director extends ProductionMember //sub class 2
{
	String style_of_direction;
	int no_of_movies_directed;
	int no_of_assistant_directors;
	String is_national_award_winner;
	String vision_statement;
	
	 Director() 
	{
		  System.out.println("default constructor called"); 

	}
	
	
	 Director(String style_of_direction, int no_of_movies_directed, int no_of_assistant_directors,
			String is_national_award_winner, String vision_statement)
	{
		System.out.println("parameterized constructor called");
		this.style_of_direction = style_of_direction;
		this.no_of_movies_directed = no_of_movies_directed;
		this.no_of_assistant_directors = no_of_assistant_directors;
		this.is_national_award_winner = is_national_award_winner;
		this.vision_statement = vision_statement;
	}



	 String getStyle_of_direction() {
		return style_of_direction;
	}



	 void setStyle_of_direction(String style_of_direction) {
		this.style_of_direction = style_of_direction;
	}



	 int getNo_of_movies_directed() {
		return no_of_movies_directed;
	}



	 void setNo_of_movies_directed(int no_of_movies_directed) {
		this.no_of_movies_directed = no_of_movies_directed;
	}



	 int getNo_of_assistant_directors() {
		return no_of_assistant_directors;
	}



	 void setNo_of_assistant_directors(int no_of_assistant_directors) {
		this.no_of_assistant_directors = no_of_assistant_directors;
	}


        String getIs_national_award_winner() {
		return is_national_award_winner;
	}



	 void setIs_national_award_winner(String is_national_award_winner) {
		this.is_national_award_winner = is_national_award_winner;
	}



	 String getVision_statement() {
		return vision_statement;
	}



	 void setVision_statement(String vision_statement) {
		this.vision_statement = vision_statement;
	}



	void display()//class  display here
	  {
		   super.display();
		   
			System.out.println("style_of_direction is:"+this.style_of_direction);
			System.out.println("no_of_movies_directed is:"+this.no_of_movies_directed);
			System.out.println("no_of_assistant_directors is:"+this.no_of_assistant_directors);
			System.out.println("is_national_award_winner is:"+this.is_national_award_winner);
			System.out.println("vision_statement is:"+this.vision_statement);
			System.out.println("\n\n");
	  }
	
}

class Technician extends ProductionMember //sub class 3
{
	String department;
	int hours_worked;
	String tool_used;
	int no_of_tools_used;
	String specialization;
	int shift_timing;
	
	 Technician()
	{
		  System.out.println("default constructor called"); 

	}
	
	
	
	 Technician(String department, int hours_worked, String tool_used, int no_of_tools_used,
			String specialization, int shift_timing) 
	{
		System.out.println("parameterized constructor called");
		this.department = department;
		this.hours_worked = hours_worked;
		this.tool_used = tool_used;
		this.no_of_tools_used = no_of_tools_used;
		this.specialization = specialization;
		this.shift_timing = shift_timing;
	}
	
	


       String getDepartment() {
		return department;
	}



	 void setDepartment(String department) {
		this.department = department;
	}



	 int getHours_worked() {
		return hours_worked;
	}



	 void setHours_worked(int hours_worked) {
		this.hours_worked = hours_worked;
	}



	 String getTool_used() {
		return tool_used;
	}



	 void setTool_used(String tool_used) {
		this.tool_used = tool_used;
	}



	 int getNo_of_tools_used() {
		return no_of_tools_used;
	}



	 void setNo_of_tools_used(int no_of_tools_used) {
		this.no_of_tools_used = no_of_tools_used;
	}



	 String getSpecialization() {
		return specialization;
	}



	 void setSpecialization(String specialization) {
		this.specialization = specialization;
	}



	 int getShift_timing() {
		return shift_timing;
	}



	 void setShift_timing(int shift_timing) {
		this.shift_timing = shift_timing;
	}



	void display()//class  display here
	  {
		   super.display();
		   
			System.out.println("department is:"+this.department);
			System.out.println("hours_worked is:"+this.hours_worked);
			System.out.println("tool_used is:"+this.tool_used);
			System.out.println("no_of_tools_used is:"+this.no_of_tools_used);
			System.out.println("specialization is:"+this.specialization);
			System.out.println("shift_timing is:"+this.shift_timing);
			System.out.println("\n\n");
	  }
	
}

class DemoProductionMember
{
	public static void main(String[] args) 
	{
		ProductionMember p1=new ProductionMember();
		p1.display();
		
		Actor a1=new Actor();
		a1.display();
		
		Director d1=new Director();
		d1.display();
		
		Technician t1=new Technician();
		t1.display();
	}
}
