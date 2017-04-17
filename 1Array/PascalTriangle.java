public class PascalTriangle {
  public static void main(String[] args) {
    final int NMAX = 10;

    int pascalTriangle = new int[NMAX+1][];
    for (int n = 0; n <= NMAX; n++) {
      pascalTriangle[n] = new int[n+1];
    }

    for (int n = 0; n < pascalTriangle.length; n++) {
      for (int k = 0; k < pascalTriangle[n].length; k++) {
        int binomialCoefficient = 1;
        for (int i = 1; i <= k; i++) {
          binomialCoefficient = binomialCoefficient * (n-i+1) / i;
        }
        pascalTriangle[n][k] = binomialCoefficient;
      }
    }

    for (int[] row : pascalTriangle) {
      for (int binomialCoefficient : row) {
        System.out.printf("%4d", binomialCoefficient);
      }
      System.out.println();
    }
  }
}
