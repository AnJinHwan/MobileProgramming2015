package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddLineNumber
{
   public static void main(String[] args)
   {
       String path = AddLineNumber.class.getResource("").getPath();
       System.out.println(path);

      try
      {
         BufferedReader inputStream = 
               new BufferedReader(new FileReader(path+"original.txt"));
         PrintWriter outputStream = 
               new PrintWriter(new FileOutputStream(path+"numbered.txt"));
         String line="";
     
         int num=0;
         while((line=inputStream.readLine())!=null){
             num++;
             outputStream.write(num+" "+line+"\n");
             
         }
         inputStream.close( );
         outputStream.close( );
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
