package name.guolanren._1to100._71to80.p74;

/**
 * @link https://leetcode.com/problems/search-a-2d-matrix/
 * @author guolanren
 */
public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIndex = searchForColumn(matrix, target);
        return rowIndex >= 0 ? searchForRow(matrix[rowIndex], target) : false;
    }

    private int searchForColumn(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (matrix[mid][0] > target) {
                high = mid - 1;
            } else if (matrix[mid][0] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return low - 1;
    }

    private boolean searchForRow(int[] row, int target) {
        int low = 0;
        int high = row.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (row[mid] > target) {
                high = mid - 1;
            } else if (row[mid] < target) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
