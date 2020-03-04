
public class SwapString {

	public static void main(String[] args) {

     String a="hello";
     String b="World";
     
     //append a and b 
     a=a+b;
     //store initial string a in string b
     b=a.substring(0,a.length()-b.length());//here start from 0 and[a.length()-b.length()]exclude world then only print hello..
     
     //store initial string b in string a
     a=a.substring(b.length());
     
     System.out.println(a);
     System.out.println(b);
     

	}

}
