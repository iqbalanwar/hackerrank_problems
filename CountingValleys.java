import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {
    public static void main(String[] args) {
        countingValleys(8, "UDDDUDUUDU"); // output should be 2
    }

    static int countingValleys(int n, String s) {
        int valleys = 0;
        int count = 0;

        char[] path = s.toCharArray();
        for (int i = 0; i < path.length; i++) {
            if (path[i] == 'U') count++;
            else count--;
            if ( count == -1 && path[i] != 'U' ) {
                valleys++;
            }
            System.out.println("The count is " + count);
            System.out.println("The number of valleys are " + valleys);
        }
        return valleys;
    }
}