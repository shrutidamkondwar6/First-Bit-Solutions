
 class HospitalStaff {

	int staffid;
	String staffName;
	String department;
	String designation;
	double salary;
	
	
	HospitalStaff() {
		super();
		System.out.println("default constructor called");
	}


	 HospitalStaff(int staffid, String staffName, String department, String designation, double salary) {
		super();
		this.staffid = staffid;
		this.staffName = staffName;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	 int getStaffid() {
		return staffid;
	}

      void setStaffid(int staffid) {
		this.staffid = staffid;
	}


	 String getStaffName() {
		return staffName;
	}


	 void setStaffName(String staffName) {
		this.staffName = staffName;
	}


	 String getDepartment() {
		return department;
	}


	 void setDepartment(String department) {
		this.department = department;
	}


	 String getDesignation() {
		return designation;
	}


	 void setDesignation(String designation) {
		this.designation = designation;
	}


	 double getSalary() {
		return salary;
	}


	 void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println("staff id:"+this.staffid);
		System.out.println("staff name:"+this.staffName);
		System.out.println("department name:"+this.department);
		System.out.println("designation:"+this.designation);
		System.out.println("salary:"+this.salary);
	}
	void Duty()
	{
		System.out.println("treats patients");
	}
}
 class Doctor extends HospitalStaff
 {
	 String specialization;
	 int noofpatients;
	 
	  Doctor() {
		super();
	}

	 Doctor(int staffid, String staffName, String department, String designation, double salary ,String specialization, int noofpatients) {
		super(staffid,  staffName,department, designation, salary);
		System.out.println("\nparameterized constructor");
		this.specialization = specialization;
		this.noofpatients = noofpatients;
	}

	 String getSpecialization() {
		return specialization;
	}

	 void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	 int getNoofpatients() {
		return noofpatients;
	}

	 void setNoofpatients(int noofpatients) {
		this.noofpatients = noofpatients;
	}
	 void display()
	 {
		 super.display();
		 System.out.println("specialization:"+this.specialization);
		 System.out.println("no of patients:"+this.noofpatients);
	 }
	 void Duty()
		{
			System.out.println(" assists doctor with patient treatment");
		}
 }
class Nurse extends HospitalStaff
{
	int WardNumber;
	int patientsAssigned;
	
	 Nurse() {
		super();
	}

	 Nurse (int staffid, String staffName, String department, String designation, double salary ,int wardNumber, int patientsAssigned) {
		super(staffid,  staffName,department, designation, salary);
		System.out.println("\nparameterized constructor");
		WardNumber = wardNumber;
		this.patientsAssigned = patientsAssigned;
	}

	 int getWardNumber() {
		return WardNumber;
	}

	 void setWardNumber(int wardNumber) {
		WardNumber = wardNumber;
	}

	 int getPatientsAssigned() {
		return patientsAssigned;
	}

	 void setPatientsAssigned(int patientsAssigned) {
		this.patientsAssigned = patientsAssigned;
	}
	void display()
	{
		 super.display();
		 System.out.println("WardNumber:"+this.WardNumber);
		 System.out.println("patientsAssigned:"+this.patientsAssigned);
	}
	
	void Duty()
	{
		System.out.println("assists nurse with patient care");
	}
}
class  Receptionist extends HospitalStaff
{
	int deskNumber;
	String LanguageKnown;
	
	 Receptionist() {
		super();
	}

	 Receptionist(int staffid, String staffName, String department, String designation, double salary ,int deskNumber, String languageKnown) {
		super(staffid,  staffName,department, designation, salary);
		System.out.println("\nparameterized constructor");
		this.deskNumber = deskNumber;
		LanguageKnown = languageKnown;
	}

	 int getDeskNumber() {
		return deskNumber;
	}

	 void setDeskNumber(int deskNumber) {
		this.deskNumber = deskNumber;
	}

	 String getLanguageKnown() {
		return LanguageKnown;
	}

	 void setLanguageKnown(String languageKnown) {
		LanguageKnown = languageKnown;
	}
	
	void display()
	{
		 super.display();
		 System.out.println("deskNumber:"+this.deskNumber);
		 System.out.println("language known:"+this.LanguageKnown);
	}
	
	void Duty()
	{
		System.out.println("manage patient appointments and inquiries");
	}
}// receptionist end here
class DemoHospitalStaff
{
	public static void main(String[] args) {
		
		HospitalStaff h;
		h = new HospitalStaff (101, "Dr. Meera Sharma", "Cardiology", "Senior Doctor", 95000);
		//h.display();
		h.Duty();
		
		h = new Doctor(201, "Dr. Riya Mehta", "Cardiology", "Senior Doctor",
                       95000.0, "Heart Specialist", 120);
		//h.display();
		h.Duty();
		
		h = new Nurse(301, "Rita Sharma", "Pediatrics", "Head Nurse", 55000.0, 12, 15);
		//h.display();
		h.Duty();
		
		h = new Receptionist (401, "Neha Sharma", "Front Office", "Head Receptionist",
                              40000.0, 1, "English, Hindi, Marathi");
		//h.display();
		h.Duty();
	}
}