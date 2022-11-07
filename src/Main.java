import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// iki sayıyı toplayan çıkaran çarpan bolen program

		int number1, number2, select;
		Scanner input = new Scanner(System.in);
		System.out.print("1. Sayiyi giriniz: ");
		number1 = input.nextInt();
		System.out.print(" 2.Sayiyi giriniz");
		number2 = input.nextInt();

		System.out.println("1-Toplama\n 2-Cikarma\n 3-Carpma\n 4-Bolme");
		System.out.print("Seciminiz:");
		select = input.nextInt();

		switch (select) {
		case 1:
			System.out.println("Toplam: " + (number1 + number2));
			break;
		case 2:
			System.out.println("Cikarma: " + (number1 - number2));
			break;
		case 3:
			System.out.println("Carpma: " + (number1 * number2));
			break;
		case 4:
			switch (number2) {
			case 0:
				System.out.println("Sayi sifira bolunemez!");
				break;
			default:
				System.out.println("Bolme:" + (number1 / number2));
			}
			break;
		default:
			System.out.println("Yanlis sayi girişi. Lutfen tekrar deneyiniz.");

		}

		input.close();

	}

}
