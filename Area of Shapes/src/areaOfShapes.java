

class shape {
	private int length;
	private int breath;
	
	shape(int length, int breath){
		this.length = length;
		this.breath= breath;
	}
	
	int getLength(){
		return length;
	}
	void setLength(int l) {
		this.length=l;
	}
	int getBreath(){
		return breath;
	}
	void setBreatch(int b) {
		this.breath=b;
	}
	
	class rectangle extends shape{
		
		rectangle(int length, int breath){
			super(length, breath);
		}
		
		int Area(){
			return length*breath;
		}
	}
	
}
public class areaOfShapes {
	public static void main(String[] args) {
		rectangle r1 = new rectangle(2,8);
		rectangle.area();
		
	}

}
