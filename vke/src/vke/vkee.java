package vke;

import java.util.Scanner;

public class vkee {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen boyunuzu giriniz (cm): ");
		double boy = scanner.nextDouble() / 100; // Boyu metreye dönüştürme
		System.out.print("Lutfen kilonuzu giriniz (kg): ");
		double kilo = scanner.nextDouble();
		double indeks = kilo / (boy * boy);
		System.out.print("Vucut kitle indeksiniz: " + indeks);
	}
}
