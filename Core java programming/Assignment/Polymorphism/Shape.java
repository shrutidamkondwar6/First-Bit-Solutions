public class Shape {

	    String color;
	    double borderWidth;
	    String shapeName;
	    double area;

	    Shape()//default
	    {
	    	super();
	    	System.out.println("shape default constructor");
//	    	color="default";
//	    	borderWidth=4.5;
//	    	shapeName="not entered";
	    }
	    Shape(String shapeName, String color, double borderWidth) //parameterized 
	    {
	    	 System.out.println("shape parameterized constructor");
	        this.shapeName = shapeName;
	        this.color = color;
	        this.borderWidth = borderWidth;
	    }
	    
	    public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public double getBorderWidth() {
			return borderWidth;
		}

		public void setBorderWidth(double borderWidth) {
			this.borderWidth = borderWidth;
		}

		public String getShapeName() {
			return shapeName;
		}

		public void setShapeName(String shapeName) {
			this.shapeName = shapeName;
		}


	    void display() {
	        System.out.println("Shape: " + shapeName);
	        System.out.println("Color: " + color);
	        System.out.println("Border Width: " + borderWidth);
	    }

	    double calarea()
	    {
	    	return area;
	    }

	}//shape class ends here

	class Rectangle extends Shape {
	    double length;
	    double breadth;
	    Rectangle()//default
	    {
	    	super();
	    	System.out.println("reclangle default constructor");
//	    	length=5.6;
//	    	breadth=4.5;
	    	
	    }
	    Rectangle(String color, double borderWidth, double length, double breadth) {
	        super("Rectangle", color, borderWidth);
	        System.out.println("reclangle parameterized constructor");
	        this.length = length;
	        this.breadth = breadth;
	    }

	    double area() {
	        return length * breadth;
	    }

	    public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public double getBreadth() {
			return breadth;
		}
		public void setBreadth(double breadth) {
			this.breadth = breadth;
		}
		
		
		void display() {
	        super.display();
	        System.out.println("Length: " + length);
	        System.out.println("Breadth: " + breadth);
	    }
		
		double calarea()
	    {
	    	return length*breadth;
	    }
	}//reclangle class ends here
	
	
	class Circle extends Shape {
	    double radius;
	    Circle()//default
	    {
	    	super();
	    	System.out.println("circle default constructor");
	    	//radius=4.5;
	    	
	    }
	    Circle(String color, double borderWidth, double radius)//parameterized
	    {
	        super("Circle", color, borderWidth);
	        System.out.println("circle parameterized constructor");
	        this.radius = radius;
	    }

	    public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius = radius;
		}
		

	    void display() {
	        super.display();
	        System.out.println("Radius: " + radius);
	    }
	    
	    double calarea() 
	    {
	    	return 3.14 * radius * radius;
	    	
	    }
	}//circle class ends here
	
	class Triangle extends Shape {
	    double base;
	    double height;
	    Triangle()//default
	    {
	    	super();
	    	System.out.println("triangle default constructor");
//	    	base=4.3;
//	    	height=6.5;
	    }
	    Triangle(String color, double borderWidth, double base, double height)//parameterized
	    {
	        super("Triangle", color, borderWidth);
	        System.out.println("triangle parameterized constructor");
	        this.base = base;
	        this.height = height;
	    }

	    public double getBase() {
			return base;
		}
		public void setBase(double base) {
			this.base = base;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		

	    void display() {
	        super.display();
	        System.out.println("Base: " + base);
	        System.out.println("Height: " + height);
	       
	    }
	    
	    double calarea() 
	    {
	        return 0.5 * base * height;
	    }
	}//triangle class ends here

	class DemoShape {
	    public static void main(String[] args) 
	    {
	       
	    	Shape s;
	    	s=new Shape();
	        System.out.println("Area : " + s.calarea());

	    	//s.calarea();
	    	
	    	s=new Rectangle();
	        System.out.println("Area of Rectangle: " + s.calarea());

	    	//s.calarea();	
	    	
	    	s=new Circle();
	        System.out.println("Area of Circle: " + s.calarea());

	    	//s.calarea();
	    	
	    	s=new Triangle();
	    	System.out.println("Area of Triangle: " +s.calarea());
	    	//s.calarea();
		
	    }//main ends here
	}//demo class ends here