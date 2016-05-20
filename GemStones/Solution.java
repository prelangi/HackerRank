import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Find intersecting sets among the given inputs to find the elements.
        Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		String s = scan.next();
        
        char[] chArray = s.toCharArray();
        
        HashSet<Character> elements = new HashSet<Character>();
        HashSet<Character> elements_2 = new HashSet<Character>();
        for(int k=0;k<chArray.length;k++) {
            elements.add(chArray[k]);
        }
        
		for(int i=1;i<T;i++)
		{
			s = scan.nextLine();
            chArray = s.toCharArray();
            for(int k=0;k<chArray.length;k++) {
                elements_2.add(chArray[k]);
            }
            elements.retainAll(elements_2); //Find the intersection of the two sets
            elements_2.clear(); //Clear the iterating set
            
        }
        
        System.out.println(elements.size());
    }
}