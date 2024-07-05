import java.util.ArrayList;
import java.util.List;

public class SpiraMatrix {

    public List<Integer> spiralOrder(int[][] mac) {
        List<Integer> res = new ArrayList<>();

        if (mac.length == 0) {
            return res;
        }

        int rowBegin = 0;
        int rowEnd = mac.length - 1;
        int colBegin = 0;
        int colEnd = mac[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j++) {
                res.add(mac[rowBegin][j]);
            }
            rowBegin++;

            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j++) {
                res.add(mac[j][colEnd]);
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j--) {
                    res.add(mac[rowEnd][j]);
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                // Traverse Up
                for (int j = rowEnd; j >= rowBegin; j--) {
                    res.add(mac[j][colBegin]);
                }
            }
            colBegin++;
        }

        return res;
    }

    public static void main(String[] args) {
        SpiraMatrix solution = new SpiraMatrix();
        int[][] mac = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = solution.spiralOrder(mac);
        System.out.println("Spiral Order: " + result);
    }
}
