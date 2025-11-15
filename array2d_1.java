public class array2d_1 {
    public static void main(String[] args) {
      int[][] arr = {
            {1, 5, 9},
            {2, 7, 3},
            {6, 4, 8}
        };

        // MINIMUM ELEMENT (matrix ka sabse chota element)
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        System.out.println("Minimum element : " + min);
    }    
    }
