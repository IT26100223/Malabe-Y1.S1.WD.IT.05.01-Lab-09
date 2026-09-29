public class IT26100223Lab9Q3 {

    
    public static int add(int a, int b) {
        return a + b;
    }

  
    public static int multiply(int a, int b) {
        return a * b;
    }

    
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        
        int prod1 = multiply(3, 4);
        int prod2 = multiply(5, 7);
        int sum1 = add(prod1, prod2);
        int result1 = square(sum1);

       
        int sum2 = add(4, 7);
        int square1 = square(sum2);
        int sum3 = add(8, 3);
        int square2 = square(sum3);
        int result2 = add(square1, square2);

       
        System.out.println("Result of (3 * 4 + 5 * 7)\u00B2\t: " + result1);
        System.out.println("Result of (4 + 7)\u00B2 + (8 + 3)\u00B2\t: " + result2);
    }
}