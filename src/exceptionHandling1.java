class exceptionHandling1 {
    public static void main(String[] args) {
        int[] numerator = {12, 23, 40, 19};
        int[] denominator = {3, 4, 0, 12};
        for (int i = 0; i < 6; i++) {
            try {
                divide(numerator[i], denominator[i]);

            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index out of Bound Exception "+e);
            }
        }
    }
    static void divide ( int a, int b){
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Zero Division Error " + e);

        }
    }
}

