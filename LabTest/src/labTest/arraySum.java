package labTest;

public class arraySum {
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		
		int sum = 0;
		int iteration = 1;
		
//		For Each
		for (int number: numbers) {
			sum += number;
		}
		
//		For Loop
		for (int i = 0; i < numbers.length;i++) {
			sum += numbers[i];
		}
	
		System.out.println("Length: " + numbers.length);
		System.out.println("Array Sum: " + sum);		
	}

}
