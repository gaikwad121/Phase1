
class Interest {
    public static void main(String[] args) {
        int P = 500000;
        int R = 15;
        int T = 5;

        // Simple Interest
        double simpleInterest = P * R * T / 100.0;
        System.out.printf("Simple Interest = Rs. %.2f\n", simpleInterest);

        // Compound Interest
        double rate = R / 100.0;
        double amount = P * Math.pow((1 + rate), T);
        double compoundInterest = amount - P;

        System.out.printf("Compound Interest = Rs. %.2f\n", compoundInterest);
        System.out.printf("Total Amount = Rs. %.2f\n", amount);
    }
}
