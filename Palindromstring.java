
public class Palindromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //to check given string is palindromme or not
		String str="madam",reversestr=" ";
		int strlength=str.length();
		for(int i=strlength-1;i>=0;--i)
		{
		reversestr= reversestr+str.charAt(i);
	}
if(str.toLowerCase().equals(reversestr.toLowerCase()))
	 {
	System.out.println(str+"given string is pallindrome ");
	}
else
{ 
	System.out.println(str+"given string is not Pallindrome");
}
	}
}
