import java.util.Scanner;

public class Kadai2_4 {
	public static void main(String[] args) {
		System.out.println("整数を入力してください。");
		Scanner scan = new Scanner(System.in);
		int intSeisu = scan.nextInt();

		for(int i = 1; i <= intSeisu; i++){
			String hyouji = "";
			if(i % 3 ==  0 && i % 5 == 0){
				hyouji = "FizzBuzz";
			}else if(i % 3 ==  0){
				hyouji = "Fizz";
			}else if(i % 5 == 0){
				hyouji = "Buzz";
			}else{
				hyouji = String.valueOf(i);
			}

			System.out.println(hyouji);
		}

	}
}
