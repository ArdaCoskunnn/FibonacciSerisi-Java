import java.util.Scanner;

public class FibonacciSerisi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int kacakadar, sayi1= 0, sayi2= 1, yenisayi= 0;
		
		System.out.print("Kaca kadar bakilacak ==> ");
		kacakadar = input.nextInt();
		
		System.out.println(sayi1);
		
		while (yenisayi <= kacakadar) {
			System.out.println(sayi2);
			
			yenisayi = sayi1 + sayi2;
			sayi1 = sayi2;
			sayi2 = yenisayi;
		}
		input.close();
	}

}
