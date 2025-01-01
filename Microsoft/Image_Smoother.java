/*
 * An image smoother is a filter of the size 3 x 3 
 * that can be applied to each cell of an image by 
 * rounding down the average of the cell and the 
 * eight surrounding cells (i.e., the average of 
 * the nine cells in the blue smoother). If one 
 * or more of the surrounding cells of a cell is 
 * not present, we do not consider it in the 
 * average (i.e., the average of the four cells in 
 * the red smoother).
 * 
 * Approach:-
 * Simple Brute Force approach, seleting a window size of 3x3, 
 * storing the sum of all the elements in the window, 
 * and storing the result in the final res array.
 * 
 */








public class Image_Smoother {

    public int[][] imageSmoother(int[][] img) {
        int n = img.length;
        int m = img[0].length;

        int[] x = { -1, -1, -1, 0, 0, 0, 1, 1, 1 };
        int[] y = { -1, 0, 1, -1, 0, 1, -1, 0, 1 };
        int[][] res = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = 0;
                int count = 0;
                for (int k = 0; k < 9; k++) {
                    int newX = i + x[k];
                    int newY = j + y[k];

                    if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
                        sum += img[newX][newY];
                        count++;
                    }
                }
                res[i][j] = sum / count;
            }
        }
        return res;
    }

}