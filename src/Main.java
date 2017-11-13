import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int value = random.nextInt(21);
		
		if (value %2 ==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		

	}

}
