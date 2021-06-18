import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class assignment {
public static void main(String[] args)throws IOException
{
	File infile =new File("C:/Users/91837/Desktop/"+args[0]);
	 File opfile =new File("C:/Users/91837/Desktop/"+args[1]);
	 FileReader br = new FileReader(infile); 
	 BufferedReader buffer = new BufferedReader(br);
	 FileWriter bw = new FileWriter(opfile); 
	String st;
	while((st=buffer.readLine())!=null)
	{
		bw.write(vowel(st)+"\n");
		
	}
	bw.flush();
}
public static StringBuilder vowel(String input)
{
	StringBuilder sb=new StringBuilder();
    String[] arr=input.split(" ");
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i].length()>1) {
    		String h=arr[i].toLowerCase();
    		
    		if(h.charAt(1)=='a'|| h.charAt(1)=='e' || h.charAt(1)=='i' || h.charAt(1)=='o' || h.charAt(1)=='u')
    		{
    			sb.append (arr[i]+" ,");
    		}
    	}
    }
	
	return sb;
	
}
}