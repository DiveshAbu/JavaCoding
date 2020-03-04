
public class DuplicateCharacter {

	public static void main(String[] args) {
     String str="abcfefff";
     getDuplicate(str);

	}
	public static void getDuplicate(String str) {
		 int count = 0;
		 char[] ch = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;j<str.length();j++) {
				
				if(ch[i]==ch[j]) {
					
					System.out.println(ch[i]);
					count++;
					break;
				}
			}
		}
		
	}

}
