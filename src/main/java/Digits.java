import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	    ArrayList <Integer> s = new ArrayList <Integer>();
		int digit = 0;
		int r = num;
		while( r > 0){
			digits = r % 1;
			r = r/10;
			s(0,digit);
		}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 0; i < s.length()-1; i++){
			if(s.get(i) < s.get(i + 1)){
				return true;
			}
		}
		return false;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
