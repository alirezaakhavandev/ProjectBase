class Even{
    static int evenNumbers(int a) {
        a = Math.abs(a); // Handle negative numbers
        if (a == 0) return 0;

        int lastDigit = a % 10;
        int count = (lastDigit % 2 == 0) ? 1 : 0;

        return count + evenNumbers(a / 10);
    }

}
