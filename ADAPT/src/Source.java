import java.util.Scanner;

class GetCode{
	
String[] s = str.split(“ ”);

int sum=0;
for(int i=0;i<s.length;i++){
sum+=s[i].length();
}
return (sum%9);
}
public class Source{
	
public static void main(String[] args){
Scanner sys = new Scanner(System.in);
String str = sys.nextLine();
GetCode gc = new GetCode();
int n = gc.getCodeThroughStrings(str);
System.out.println(n);
}


