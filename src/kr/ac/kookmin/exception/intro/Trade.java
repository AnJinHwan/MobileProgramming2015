package kr.ac.kookmin.exception.intro;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
public class Trade {
	
	public void readFile()
	{

		
		
		File mfile= new File("a.txt");		
		try{
				FileReader mr=new FileReader(mfile);
				int c;
				while(true)
				{
					c= mr.read();
					if(c == -1)
						break;
					System.out.print(String.valueOf((char)c));
					
					
				}
				mr.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}

		
		
	
				
				
			
			
			
		
			
