public class Recursive{

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static String reverse(String str) {
        if (str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }



    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) return true; // if it has only one character is Palindrome
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false; // if the first and last characters are not
        //the same it is not a Palindrome
        //cut the first and the last
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return binarySearch(arr, target, left, mid - 1);
        return binarySearch(arr, target, mid + 1, right);
    }

}
