class SetRowColumnZero {

    public void setZeroes(int[][] mac) {
      boolean firstRow = false, firstCol = false;
      int rows = mac.length;
      int cols = mac[0].length;
  
      // Determine if first row or first column need to be zeroed
      for (int i = 0; i < rows; i++) {
        if (mac[i][0] == 0) {
          firstCol = true;
          break;
        }
      }
  
      for (int j = 0; j < cols; j++) {
        if (mac[0][j] == 0) {
          firstRow = true;
          break;
        }
      }
  
      // Use the first row and first column to mark zero rows and columns
      for (int i = 1; i < rows; i++) {
        for (int j = 1; j < cols; j++) {
          if (mac[i][j] == 0) {
            mac[i][0] = 0;
            mac[0][j] = 0;
          }
        }
      }
  
      // Zero out cells based on markers in the first row and column
      for (int i = 1; i < rows; i++) {
        for (int j = 1; j < cols; j++) {
          if (mac[i][0] == 0 || mac[0][j] == 0) {
            mac[i][j] = 0;
          }
        }
      }
  
      // Zero out the first row if needed
      if (firstRow) {
        for (int j = 0; j < cols; j++) {
          mac[0][j] = 0;
        }
      }
  
      // Zero out the first column if needed
      if (firstCol) {
        for (int i = 0; i < rows; i++) {
          mac[i][0] = 0;
        }
      }
    }
  
    public static void main(String[] args) {
      Solution solution = new Solution();
      int[][] mac = {
        {1, 2, 3, 4},
        {5, 0, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 0}
      };
  
      solution.setZeroes(mac);
  
      // Print the modified matrix
      for (int i = 0; i < mac.length; i++) {
        for (int j = 0; j < mac[0].length; j++) {
          System.out.print(mac[i][j] + "    " );
        }
        System.out.println();
      }
    }
  }
  