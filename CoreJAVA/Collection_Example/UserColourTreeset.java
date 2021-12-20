package TestCollection;

import java.util.Scanner;
import java.util.TreeSet;

public class UserColourTreeset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TreeSet<String> colors= new TreeSet<>();

		Palette p = new Palette();
		/*
		 * p.addToPalet("Red"); p.addToPalet("Black"); p.addToPalet("white");
		 * p.addToPalet("Blue"); p.addToPalet("Green");
		 * 
		 * p.showAllColorsInPallete(); p.removeFromPalette("white");
		 * p.showAllColorsInPallete(); if(p.isColorInPalette("Red")) {
		 * System.out.println("Color present in treeSet"); } else {
		 * System.out.println("Color Not present in treeSet"); }
		 */

		while (true) {
			System.out.println("********Operations available********** ");
			System.out.println("**************************************");
			System.out.println(
					"1.Add colour\n2.show Colors of Palette\n3.remove color from Palette\n4.is colour present in Palette\n5.Quit");
			System.out.println("**************************************");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			if (choice == 5) {
				break;
			}
			switch (choice) {

			case 1:
				System.out.println("Enter the colour to add:");
				p.addToPalet(sc.next());
				break;

			case 2:
				System.out.println("Cloors of Palette");
				p.showAllColorsInPallete();
				break;

			case 3:
				System.out.println("Enter the colour to remove from Palette:");
				p.removeFromPalette(sc.next());
				break;

			case 4:
				System.out.println("Enter the colour to check is colour present in Palette:");
				if (p.isColorInPalette(sc.next())) {
					System.out.println("Color present in treeSet");
				} else {
					System.out.println("Color Not present in treeSet");
				}

			}

		}

	}

}
