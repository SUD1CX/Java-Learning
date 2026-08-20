// Demonstrate '?'.
// Java includes a special ternary (three-way) operator that can replace certain types of if-then-else statements. This operator is the '?'
          // expression1 ? expression2 : expression3
//Here, expression1 can be any expression that evaluates to a boolean value. If expression1 is true, then expression2 is evaluated; otherwise, expression3 is evaluated.
class Ternary {
    public static void main(String[] args) {
        int i, k;
        i=10;
        k= i<0 ? -i : i; // Get absolute value of i
        System.out.println("Absolute value of " + i + " is " + k);

        i=-10;
        k= i<0 ? -i : i; // Get absolute value of i
        System.out.println("Absolute value of " + i + " is " + k);
    }

}
