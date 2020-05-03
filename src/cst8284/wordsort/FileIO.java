package cst8284.wordsort;
/*
 * ZHANG Yajun
 * 040958689
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FileIO {
	private static int numberOfStringsLoaded;

	public static ArrayList<String> loadArrayListFromFile(File f) {
		ArrayList<String> arStr = new ArrayList<>();
		try (Scanner fileIn = new Scanner(f)) {
			while (fileIn.hasNext()) {
				arStr.add(fileIn.nextLine());
				numberOfStringsLoaded++;
			}
		} catch (IOException ex) {
			return null;
		}
		return arStr;
	}

	public static boolean fileExists(File f) {
		return f != null && f.exists() && f.isFile() && Files.isReadable(f.toPath());
	}

	public static String toStringFromArrayList(ArrayList<String> arStr) {
		String str = "";
		for (String s : arStr)
			str += (s + "\n");
		return str;
	}

	public static String toStringFileIO(File f) {
		return "File name: " + f.getName() + "\nFile size: " + f.length() + "\nThe last modified: "
				+ new Date(f.lastModified()) + "\nNumber of Strings loaded: " + numberOfStringsLoaded;
	}
}
