package java8.mix;

public class WordsOfLineReverse {

	public static void main(String[] args) {
		
	
			//System.out.println("in the method");
			//honda h=new honda();
			String s="I love my country";// country my love I
			
			 String[] strArr=s.split("\\s+");
			 String s2 = "";
			 StringBuffer s1=new  StringBuffer();
			 //int j=strArr.length;
			 for(int i=strArr.length-1;i>=0;i--) {
				 	s2=s2.concat(strArr[i]);
				 	//s1.append(strArr[i]);
				 	if(i!=0) {
				 		//s1.append(" ");
				 		s2=s2.concat(" ");
				 	}
				 //s1" "+strArr[i];
			 }
			 System.out.println(s2);
			//h.run();
	}
	

}




