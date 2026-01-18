package arrayPrograms;

public class PowerOfANumber {

	
	public static void main(String[] args) {
		
		int num=23;
		
		int power=power(num);
		
		System.out.println("The power of "+num+" is "+power);
	}
	
	public static int power(int num)
	{
		
		int power=num*num;
		
		return power;
	}
}
