/*Characters  ->''
 * Character c=new Character('a');
 * Boxing
 * Method:
 * isLetter()-conditional statement-->boolean value
 * isDigit()-is a digit or not-->boolean value
 * isWhitespace()-used to find the space,tab,new,line,[9]->Ascii
 * toUpperCase()->convert lower to upper
 * toLowerCase()->convert upper to lower
 * isUpperCase()->to identify uppercase letters
 * isLowerCase()->to identify lowercase letters
 * 
 * is----->boolean->
 * 
 * toString-conver character to String
 */


package practice;
class Practice
{
	//main +cntl+space bar
	public static void main(String args[])
	{
		Character c=new Character('c');//c is an object
		char ch=c;//ch is a primitive data type
		String s=Character.toString(ch);
		//syso+cntl+space bar
		System.out.println(s);
	}
}