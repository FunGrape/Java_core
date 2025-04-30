class Main {

    public static void main(String args[]){
        double p, square, a = 7, b = 8, c = 9;
        p = (a + b + c) / 2;
        square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.print(square);
    }
}