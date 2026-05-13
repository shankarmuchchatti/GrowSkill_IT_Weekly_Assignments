package may8assignment;

import java.io.*;

public class Program_FileReading {

	public static void main(String[] args) throws Exception {
		
		
		
		File file = new File("C:\\Users\\shank\\Documents\\assignment.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int totalLines = 0;
		String str = "";
		String fullLines = "";
		while((str = br.readLine())!=null) {
			fullLines = fullLines +str;
			totalLines++;
		}
		
		System.out.println("Total Lines : "+totalLines);
		String[] totalWords = fullLines.split(" ");
		System.out.println("Total Words : "+totalWords.length);
		char[] chars = fullLines.toCharArray();
		System.out.println("Total Characters : "+chars.length);
		
		int max = 0;
		String longestWord = "";
		for(String word:totalWords) {
			if(word.length()>max) {
				max=word.length();
				longestWord=word;
			}
		}
		System.out.println("Longest Word : "+longestWord);

	}

}
