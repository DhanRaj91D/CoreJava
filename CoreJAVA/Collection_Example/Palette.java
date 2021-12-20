package TestCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class Palette {
	private TreeSet<String> colors;

	public Palette() {

		colors = new TreeSet<String>();
	}

	public Palette(TreeSet<String> colors) {

		this.colors = colors;
	}

	public TreeSet<String> getColors() {
		return colors;
	}

	public void setColors(TreeSet<String> colors) {
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "Colour [colors=" + colors + "]";
	}

	public void addToPalet(String color) {

		colors.add(color.toLowerCase());

	}

	public void showAllColorsInPallete() {

		Iterator<String> it = colors.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		/*
		 * Stream<String> colourstream= colors.stream();
		 * colourstream.forEach((colour)->{System.out.println(colour);} );
		 */
	}

	public void removeFromPalette(String colour) {

		if(colors.remove(colour.toLowerCase()))
		{
			System.out.println("Removed successfull");
		}
		else
		{
			System.out.println("Erorr you entered element is not in palette!!!!!");
		}
	}

	public boolean isColorInPalette(String color) {

		for (String str : colors) {

			if (color.equalsIgnoreCase(str)) {
				return true;
			}

		}
		return false;

	}

}
