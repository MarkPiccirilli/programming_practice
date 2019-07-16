import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;

public class readWriteFile {
	public static void main(String[] args) throws Exception {
		//create object for file to read
		File file = new File("readFile.txt");

		//create buffer reader object to read file
		BufferedReader b = new BufferedReader(new FileReader(file));

		//create file writer object
		FileWriter fw = new FileWriter("writeFile.txt");

		String s;
		while((s = b.readLine()) != null) {
			System.out.println(s);
			fw.write(s);
			fw.write("\n");
		}

		b.close();
		fw.close();
	}

}
