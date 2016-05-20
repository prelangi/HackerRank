import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan    = new Scanner(System.in);
		int numInputs   = scan.nextInt();
        int forwardDiff = 0;
        int backDiff    = 0;
        
        String s; 
        int strlength; 
        char [] chArray; 
        
        for(int i=0;i<numInputs;i++) {
            s         = scan.next();
            strlength = s.length();
            chArray   = s.toCharArray();
            
            for(int j=0;j<strlength-1;j++) {
                forwardDiff = Math.abs(chArray[j+1]-chArray[j]);
                backDiff    = Math.abs(chArray[(strlength-1)-j]-chArray[(strlength-1)-(j+1)]);
                if(forwardDiff != backDiff) {
                    System.out.println("Not Funny");
                    break;
                }
                //Traversed to the end
                if(j==strlength-2) {
                    System.out.println("Funny");
                }
            }
            
        }
        
    }
}