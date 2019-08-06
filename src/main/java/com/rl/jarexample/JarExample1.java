package com.rl.jarexample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JarExample1 {
	public static void main(String[] args) throws IOException {
		try {  
		File file = new File("File4.txt");  
        file.createNewFile();
        //String path = file.getAbsolutePath();  
        //System.out.println(path);
			FileWriter fw=new FileWriter(file);
			fw.write("hi everyone");    
			 fw.close();
        
        
        
		}catch(Exception e){
			System.out.println(e);
			
			
		}	
	}

}
