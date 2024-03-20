package com.example.coreJava;

public class StringPractice {
	public static void main(String[] args) {
       String string  = "IDBIINTECH.COM";
       
       System.out.println(string.length());
       
       System.out.println(string.toLowerCase());
       
       System.out.println(string.substring(3));
       
       System.out.println(string.substring(3, 7));
       
       System.out.println(string.subSequence(3, 7));
       
       String s1 = "idbi";
       String s2 = "intech";
       System.out.println(s1.concat(s2));
       
       System.out.println(string.indexOf("I"));
       
       System.out.println(string.indexOf("I",2));
       
       String s3 = "Rabi"; String s4 = "Rabi";
       String s5 = new String("IDBI");
       String s6 = new String("IDBI ");
       System.out.println(s3.equals(s4));
       System.out.println(s3==s4);
       System.out.println(s3.hashCode()==s4.hashCode());
       System.out.println(s5.hashCode()==s6.hashCode());
       
       StringBuffer strb = new StringBuffer();
       strb.append("Hellow");
       strb.append(" ");
       strb.append("World");
       
      // System.out.println(strb);
       // count no char in string
       String str = "Hello world";
       char [] charArray = str.toCharArray();
       int count = 0;
       for(int i = 0 ; i<str.length();i++){
    	   if(str.charAt(i)!=' ')
           count++;
       }
       System.out.println(count);
       // reverse string
       String reverse = null;
       char charArrayrev[] ;
       StringBuffer sb = new StringBuffer();
       for(int j = str.length()-1;j>=0;j--) {
    	  // charArrayrev = str.charAt(j);
    	   sb.append(str.charAt(j));
       }
      // System.out.println("======="+sb);
   // count particular char using in string 
       String obj = "Rabinarayan Das";
       char ch = 'a';
       int counting =0;
       for(int k = 0;k<obj.length();k++) {
    	   if(obj.charAt(k)==ch) {
    		   counting++;
    	   }
       }
       System.out.println("a count is :"+ counting);
	}
}
