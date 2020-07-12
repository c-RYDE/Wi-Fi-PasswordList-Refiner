package passlistrefiner;

import java.util.*;
import java.io.*;

public class PasslistRefiner {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        System.out.println("Enter the input file:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Scanner pass = new Scanner(new File(input)); //the input text file
        
        System.out.println("Enter the output file:");
        Scanner out = new Scanner(System.in);
        String output = out.nextLine();
        PrintWriter print = new PrintWriter(output);//the output text file
        
        String password; //passwords stored here
        
        /* To find out the amount of lines the input file has so that it can
        decrease to show progess
        */
        
        BufferedReader reader = new BufferedReader(new FileReader(input));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        reader.close();
        
        //the output
        one:  while(pass.hasNext()){
 
            password = pass.nextLine();
           
             System.out.println(lines--+" - "+password);
             
                        if(password.length()<8){
                            continue one;
                            
                        }
                                             
                        print.println(password); 
         }
        
     print.close();
    }

}
