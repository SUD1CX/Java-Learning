// Demonstrate boolean logic operators.
class BoolLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a|b;
        boolean d = a&b;
        boolean e = a^b;
        boolean f = (!a&b)|(a&!b);
        boolean g = !a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a|b = " + c);
        System.out.println("a&b = " + d);
        System.out.println("a^b = " + e);
        System.out.println("(!a&b)|(a&!b) = " + f);
        System.out.println("!a = " + g);
        //If you use the || and && forms(Short Circuit Logical Operators) rather than the | and & forms of these operators, Java will not bother to evaluate the right-hand operand when the outcome of the expression can be determined by the left operand alone.
    }
}
