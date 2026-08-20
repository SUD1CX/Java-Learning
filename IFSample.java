class IFSample {
    public static void main(String args[]) {
        int x, y;
        x=10;
        y=20;
        if (x < y) System.out.println("x is less than y");

        x=x*2;
        if (x==y) System.out.println("x is now equal to y");

        x=x*2;
        if (x > y) System.out.println("x is now greater than y");
        // This wont display anything
        if (x==y) System.out.println("You wont see this!");
    }
}
