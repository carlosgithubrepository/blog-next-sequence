package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuideThirteen {
	public static void main(String[] args) throws IOException {	
	   
		var processBuilder = new ProcessBuilder();
		processBuilder.command("cmd.exe", "/c", "ping -n 3 facebook.com");
	    var process = processBuilder.start();
		var reader = new BufferedReader(new InputStreamReader 
					 (process.getInputStream()));
		String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
	}
}