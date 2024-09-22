package loops;

public class StringConcepts {
	
	public void stringmethods() {
		String S=" Bhuvanesh   ";
		String s=new String("Bhuvanesh");
		System.out.println(s.concat(".C"));//1.adding strings
		String s1=" is working on system";
		String s2=" is working";
		String s3=" on system";
		System.out.println(s.concat(s2).concat(" on system."));
		System.out.println(s.concat(s2+s3));
		System.out.println(s+s1);//it is concatenation.
		System.out.println(s.contains("bh"));//2.returns boolean value like true or false.
		System.out.println(s.contains("Bh"));//true
		System.out.println(s.contains("Bhuvanesh"));//true
		System.out.println(s.contains("bhuvanesh"));//false
		System.out.println(s.length());//3.returns length of the characters
		System.out.println(S.trim());//4.trim spaces on front and back.
		System.out.println(S.length());//counting index with spaces.
		System.out.println(s.charAt(5));//5.returns a character from a string based on index.
		System.out.println(s.equals("Bhuvanesh"));//6.returns true or false like comparing characters with lower/upper case.
		System.out.println(s.equals("bhuvanesh"));//false
		System.out.println(s.equals("BhuVan"));//false
		System.out.println(s.equals("bhuvAn"));//false
		System.out.println(s.equalsIgnoreCase("Bhuvanesh"));//7.returns true or false like compares characters without lower/upper case.
		System.out.println(s.equalsIgnoreCase("bhuvanesh"));//true
		System.out.println(s.equalsIgnoreCase("Bhuva"));//false
		String s4="Bhuvanesh is working on system";
		System.out.println(s4.replace("B","KK"));//8.replace single/multiple sequences of character in string.
		System.out.println(s4.replace("e","y"));
		System.out.println(s4.replace("s","A"));//replace single/multiple of old to new character in string.
		System.out.println(s4.substring(0,7));//9.extract substring from the main string.
		System.out.println(s4.substring(10));
		System.out.println(s.toUpperCase());//10.returns all characters in upper case.
		System.out.println(s.toLowerCase());//11.returns all characters in lower case.
		String sArray[]=s4.split(" ");//12.split the strings into multiple parts based on delimeter.
		System.out.println(sArray[0]);
		System.out.println(sArray[1]);
		System.out.println(sArray[2]);
	}
	
	public static void main(String[] args) {
		StringConcepts sc=new StringConcepts();
		sc.stringmethods();
	}

}
