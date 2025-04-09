import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	     DigitList = new ArrayList <Integer>();
		int digit = 0;
		int r = num;
		if(r == 0){
			DigitList.add(new Integer(0));
			}
		while(r > 0){
			DigitList.add(0, new Integer(r%10));
			r = r/10;
		}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 0; i < DigitList.size()-1; i++){
			if(DigitList.get(i) < DigitList.get(i + 1)){
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
