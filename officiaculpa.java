public class JavaStudy01 {
    public static void main(String[] args) {
        // Define the range
        int start = 3;
        int end = 7;

        // Calculate the sum using a loop
        int totalSum = 0;
        for (int num = start; num <= end; num++) {
            totalSum += num;
        }

        // Output the result
        System.out.println(totalSum);
    }
}
