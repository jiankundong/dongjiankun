package 董建坤;
@FunctionalInterface
interface Printable{
	void print(StringUtils su,String str);
}
class StringUtils{
	public void printlnUpperCase(String str) {
	System.out.println(str.toUpperCase());
}
}
public class E27 {
	private static void printUpper(StringUtils su,String text,Printable pt) {
		pt.print(su,text);
	}
	private  static void main(String[]args) {
    printUpper(new StringUtils(),"Hello",(object,t)->object.printlnUpperCase(t));
    printUpper(new StringUtils(),"Hello",StringUtils::printlnUpperCase);

	}
}
