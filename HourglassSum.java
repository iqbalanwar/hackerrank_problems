import java.util.*;

class HourglassSum {
  public static void main(String[] args) {
    int[][] arr ={
      {1,1,1,0,0,0},
      {0,1,0,0,0,0},
      {1,1,1,0,0,0},
      {0,0,2,4,4,0},
      {0,0,0,2,0,0},
      {0,0,1,2,4,0}
    };
    int[][] arr2 = {
      {3,7,-3,0,1,8},
      {1,-4,-7,-8,-6,5},
      {-8, 1, 3, 3, 5, 7},
      {-2, 4, 3, 1, 2, 7},
      {2, 4, -5, 1, 8, 4},
      {5,-7,6,5,2,8}
    };
    System.out.println("The max hourglass sum in arr is " + hourglassSum(arr));
    System.out.println("The max hourglass sum in arr2 is " + hourglassSum(arr2));
  }

  static int hourglassSum(int[][] arr) {
    // solution is O(n^2 + n), which is O(n^2)

    // int sumTop = Integer.MIN_VALUE; // apparently initializing to 0 is bad
    // int mid = Integer.MIN_VALUE; 
    // int sumBottom = Integer.MIN_VALUE;

    List<Integer> hourglassTotals = new ArrayList<Integer>();
    for(int i=0; i < arr.length-2; i++) {
        for(int j=0; j < arr[i].length-2; j++) {
          // sumTop = arr[i][j] + arr[i][j+1] + arr[i][j+2];
          // mid = arr[i+1][j+1];
          // sumBottom = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
          // hourglassTotals.add(sumTop + mid + sumBottom);
          hourglassTotals.add(arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
        }
    }
    int max = Integer.MIN_VALUE;
    for(int k = 0; k < hourglassTotals.size(); k++) {
      if (hourglassTotals.get(k) > max) {
        max = hourglassTotals.get(k);
      }
    }
    return max;
  }
}
