package Questions;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "#@$$$latinn string 01225366";
		String s1 = "#@$$$ latinn @#%&^% Java !@#$^ @@@@@@ Amazon";
		
		//Regular expression [^a-z A-Z 0-9] ^-not
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);

	}

}
