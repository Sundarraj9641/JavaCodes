

abstract class shape{				//Abstract class
	abstract void  Area();		//declaration of Abstract method
}

class square extends shape{			//class Square inherited from shape 
	double side;
	
	square(double side){			//constructor
		this.side = side;	
	}
	
	void Area() {					//initializing abstract method
		System.out.println("Area of Square is: " + side*side);
	}
}

class triangle extends shape{		//class Triangle inherited from shape 
	double base;
	double height;
	
	triangle(double base, double height){		//constructor
		this.base = base;
		this.height = height;
	}
	
	void Area() {						//initializing abstract method
		System.out.println("Area of Triangle is: " + base*height);
	}
}
public class shapesUsingAbstractClass {
	public static void main(String[] args) {
	
			shape []s = new shape[4];		//initializing array of objects for class "Shape"
			s[0] = new square(3);
			s[1] = new triangle(3,7);		
			s[2] = new square(5);
			s[3] = new triangle(5,8);
			
			for(shape s1 : s) {				//invoking methods using for each loop
				s1.Area();
			}
	}
}
