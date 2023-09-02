package example;

public class RemoveWhitespace {
	public static void main ( String []args) {
		String sentence = "H e  llo I'm   Th ere";
			System.out.println(sentence.replaceAll("\\s",""));
		}

}
