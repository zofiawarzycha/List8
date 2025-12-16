import java.util.Random;

public class Matrix {
    // Access modifier: PRIVATE
    // Why: The array and dimensions are tightly coupled. Modifying 'rows' without resizing
    // 'data' would crash the program. We keep them private to ensure consistency.
    private int[][] data;
    private int rows;
    private int cols;

    /**
     * Constructor that initializes the matrix with random values.
     * @param rows number of rows
     * @param cols number of columns
     */
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
        // Task 9: Logic broken into a meaningful helper method
        populateWithRandomValues();
    }

    /**
     * Gets the number of rows.
     * Access modifier: PUBLIC
     * Why: Read-only access to dimensions is safe and necessary for external calculations.
     * @return row count
     */
    public int getRows() {
        return rows;
    }

    /**
     * Gets the number of columns.
     * Access modifier: PUBLIC
     * Why: Read-only access to dimensions is safe.
     * @return column count
     */
    public int getCols() {
        return cols;
    }

    /**
     * Helper method to populate the matrix with random numbers.
     * Task 9: Extracted method for better readability.
     * Task 9: Variable names 'row' and 'col' used instead of 'i' and 'j' for clarity.
     */
    private void populateWithRandomValues() {
        Random random = new Random();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                data[row][col] = random.nextInt(100) + 1;
            }
        }
    }

    // Note: No setters for rows/cols/data to ensure immutability of dimensions.
}