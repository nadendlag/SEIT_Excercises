package weightwatchers;

import java.io.*;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class DisplayFileContents {
	public static void main(String[] args) throws Exception {
		if (args.length <= 0) {
			System.out.println("Please give the file path");
			System.exit(0);
		}
		String filePath = args[0];
		File file = new File(filePath);

		if (!doesFileExist(file)) {
			System.exit(0);
		}
		String st = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
				processWord(st);
			}
		} finally {
			if (br != null) {
				br.close();
			}
		}
	}

	private static void processWord(String st) {
		String parent = null;
		Scanner level1;
		Scanner level2;
		level1 = new Scanner(st);
		level1.useDelimiter("–");
		while (level1.hasNext()) {
			parent = level1.next();
			if (StringUtils.contains(parent, ",")) {
				level2 = new Scanner(parent);
				level2.useDelimiter(",");
				while (level2.hasNext()) {
					System.out.println(level2.next().trim());

				}
				level2.close();

			} else {
				System.out.println(parent.trim());

			}
		}
		level1.close();

	}

	private static boolean doesFileExist(File file) {

		if (!file.exists()) {
			System.out.println("The file doesn't exist at the path, please give the valid path");
			return false;
		}
		return true;

	}

}