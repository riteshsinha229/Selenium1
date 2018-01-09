package au_31;

public class SplitString {

	public static void main(String[] args) {
		
		String s1="java string split";  
		
		System.out.println("String S1 :- " +s1);
		
		String words[]=s1.split(" ");//splits the string based on whitespace 
		
		//using java foreach loop to print elements of string array
		for(String w:words){  
			System.out.println(w);  
			}
		
		String t0=words[0];
		String t1=words[1];
		String t2=words[2];
		System.out.println("Re_Arranged String s1 :-" +t2+" "+t0+" "+t1);
	
	}

}
