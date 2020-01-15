import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnClouds {

    public static void main(String[] args) {
        int[] c = {0, 0, 1, 0, 0, 1, 0};
        jumpingOnClouds(c);
    }
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for (int i = 0; i < c.length - 1; i++) {
            jumps++;
            if(i+2 < c.length && c[i+2] == 0) {
                i++;
            }
        }
        return jumps;
    }

}
