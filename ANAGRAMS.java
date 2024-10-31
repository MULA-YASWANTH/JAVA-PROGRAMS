/*Check whether two strings are anagrams to each other using a java program.
Two strings are said to be anagram if we can form one string by arranging the characters of another string.
Example:
silent and listen are anagrams
triangle and integral are anagrams*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = sc.nextLine();
        
        System.out.println("Enter the second string:");
        String s2 = sc.nextLine();
        
        // Check if lengths are different
        if (s1.length() != s2.length()) {
            System.out.println("The two strings are not anagrams.");
        } else {
            // Convert strings to char arrays and sort them
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            
            Arrays.sort(c1);
            Arrays.sort(c2);
            
            // Compare sorted arrays
            if (Arrays.equals(c1, c2)) {
                System.out.println("The two strings are anagrams.");
            } else {
                System.out.println("The two strings are not anagrams.");
            }
        }
        
        sc.close();
    }
}
