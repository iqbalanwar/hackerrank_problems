import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {
    public static void main(String[] args) {
        // The following was deemed inefficient by HackerRank
        // The time complexity of this is O(3*n), which is just O(n)
        repeatedString("aba", 10);      // should return 7

        // This was the accepted solution, by HackerRank
        // The time complexity of this is O(2*n), which is just O(n)
        repeatedString2("ababa", 3);    // should return 2
    }

    static long repeatedString(String s, long n) {
        String pattern = s;
        long occurences = 0;
        if(s.length() > n) {
            return -1;
        }
        else if(s.length() <= n) {
            long numberOfRepeats = n / s.length();
            long remainder = n % s.length();

            for (int i = 1; i < numberOfRepeats; i++) {
                pattern = pattern.concat(s);
            }
            if(remainder > 0) {
                char[] str = s.toCharArray();
                for (int j = 0; j < remainder; j++) {
                    pattern += str[j];
                }
            }

            char[] patternArr = pattern.toCharArray();
            for (int k = 0; k < patternArr.length; k++) {
                if (patternArr[k] == 'a') {
                    occurences++;
                }
            }
            System.out.println(occurences);
        }
        return occurences;
    }

    static long repeatedString2(String s, long n) {
        long occurences = 0;
        char[] str = s.toCharArray();
        if(s.length() > n) {
            for(int i = 0; i < n; i++) {
                if (str[i] == 'a') {
                    occurences++;
                }
            }
            System.out.println(occurences);
            return occurences;
        }
        else if(s.length() <= n) {

            for (int k = 0; k < str.length; k++) {
                if (str[k] == 'a') {
                    occurences++;
                }
            }
            long numberOfRepeats = n / s.length();
            occurences *= numberOfRepeats;

            long remainder = n % s.length();
            if(remainder > 0) {
                for (int j = 0; j < remainder; j++) {
                    if(str[j] == 'a') {
                        occurences++;
                    }
                }
            }

            System.out.println(occurences);
        }
        return occurences;
    }
}