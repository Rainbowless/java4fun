public class MinMaxOfThree {
	public static void main(String[] args) { 
		int mas[] = new int[3];
		for(int i = 0; i < 3; i++) {
		    mas[i] = Integer.parseInt(args[i]);
		}
		int min = mas [0];
		for(int i = 1; i < 3; i++) {
		    if(mas[i] < min) 
			min = mas[i];
		}  
		int max = mas[0];
		for(int i = 1; i < 3; i++) {
		    if(mas[i] > max) 
			max = mas[i];
		}
		System.out.println("Min number is " + min);
		System.out.println("Max number is " + max);	  
	}		
}