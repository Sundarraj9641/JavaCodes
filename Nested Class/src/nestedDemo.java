
class outer{		//outer class
	int num;
	void OuterDisplay(){		//method in outer class
		System.out.println("print from outer display");
	}
	class inner{		//inner class
		int x;
		void InnerDisplay(){	//method in inner class
			System.out.println("print from outer display");
		}
	}
}
public class nestedDemo {
	public static void main(String[] args) {
		outer o = new outer();		//creating object to outer class
		o.OuterDisplay();			//invoking method
		
		//procedure to create object for inner class
		outer.inner i = o.new inner();
		i.InnerDisplay();

		
	}

}
