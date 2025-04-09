import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	     digitList = new ArrayList <Integer>();
		int digit = 0;
		int r = num;
		if(r == 0){
			digitList.add(0);
			}
		while(r > 0){
			digitList.add(0,(r%10));
			r = r/10;
		}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 0; i < digitList.size()-1; i++){
			if(digitList.get(i) < digitList.get(i + 1)){
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
