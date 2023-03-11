/**
 * week1_program3
 */

 // Program is for case sensitive words 
import java.io.*;
public class week1_program3 {

    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        String s=br.readLine();
        System.out.println("Enter substring: ");
        String sub=br.readLine();
        int ind,count=0;
        for(int i=0; i+sub.length()<=s.length(); i++)    //i+sub.length() is used to reduce comparisions
        {
            ind=s.indexOf(sub,i);
            if(ind>=0)
            {
                count++;
                i=ind;
                ind=-1;
            }
        }
        System.out.println("Occurence of '"+sub+"' in String is "+count);

    }
}
    
