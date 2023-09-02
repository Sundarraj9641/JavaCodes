

enum level {			//Enum declaration
	BEGINNER("B"), INTERMEDIATE("I"), ADVANCED("A");   //adding abbreviation
	
	private String abbr;   
	level(String abbr){		//constructor
		this.abbr=abbr;
	}
	
	public String getAbbr() {		//method to return 
		return abbr;
	}
}
public class enumDemo {
	public static void main(String[] args) {
		level l1 = level.ADVANCED;		//create object for enum
		System.out.println(l1.getAbbr());		//invoking abbr method using object l1
	}
}
