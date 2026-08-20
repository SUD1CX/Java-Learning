// Test for primes.
class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num=14;

        if(num<2) isPrime=true;
        else isPrime=false;

        for(int i=2;i<=num;i++) {
            if(num%i==0) {
                isPrime=false;
                break;
            }
        }
        if(isPrime==true) System.out.println("Prime number");
        else System.out.println("Not Prime number");
    }
}
