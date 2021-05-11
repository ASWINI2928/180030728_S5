/*String:" "--->set of characters
 * its a class,anything which we create is stored in an object
 * String a="";
 * String a=new String("");
 * The address/reference are going to be same with the common literal values
 * 
 * Strings are "immutable-->cannot make permanent changeson the object with the method application
 * "
 * String s="hi";
 * s.toUpperCase();-->HI
 * charAt is used to find the character at a particular location
 * length
 *
 */




package practice;

public class Stringpractice {

	public static void main(String[] args) {
		//0123456789
       String s="Tejaswini Vattigunta";//tejaswini--->(s,d)-()
       //String s2=new String("hi");
       //System.out.println(s.hashCode());
       //System.out.println(s2.hashCode());
//charAt
       System.out.println(s.charAt(2));
//length
       System.out.println(s.length());
//indexOf
       System.out.println(s.indexOf('s'));
//lastIndexOf
       System.out.println(s.lastIndexOf('s'));
//toUpperCase
       System.out.println(s.toUpperCase());
//toLowerCase
       System.out.println(s.toLowerCase());
//split()
       String s1="abc:def";
       String b[]=s1.split(":");
       for(String x:b) {
       System.out.println(x);
       }
//toCharArray()
       char ch[]=s.toCharArray();
       for(char x:ch) {
    	   System.out.println(x);
       }
//equals()
       System.out.println(s.equals(s1));
//compareTo()
//s1>s positive s1<s negative return 0
 
      String x="abclefg";//d and f
      String y="abcfgde";
      System.out.println(x.compareTo(y));
//concat()
      System.out.println(x.concat(y));
      System.out.println(x+y);
//substring()-->we ger a part of string
 //substring(SI),substring(SI,DI);
              //0123456
      String p=" abcdefg ";
      System.out.println(p.substring(2,6));
//trim()
      System.out.println(p.trim());
	}

}
