package registerationSchedular.util;

import registerationSchedular.util.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FileProcessor {

	private BufferedReader bufferRead;
	private static int lineNum = 0;

	public FileProcessor(String InputFileName) throws FileNotFoundException{
		FileReader inputfile = new FileReader(InputFileName);
		Logger.writeMessage("constructor invoked: "+ this.getClass().getName(),Logger.DebugLevel.CONSTRUCTOR);
		bufferRead = new BufferedReader(inputfile);
	}
	
	public String readLineFromFile(){
		String line = null;
		try {
			if(bufferRead != null)
				line = bufferRead.readLine();
				lineNum++;
		}
		catch(IOException e) {
			System.out.println("Error while reading from file at line: " + lineNum);
			e.printStackTrace();
			System.exit(1);
		}
		return line;
	}

}
