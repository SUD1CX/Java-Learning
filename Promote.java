class Promote {
    public static void main(String[] args) {
        byte b= 42;
        char c= 'a';
        short s= 1024;
        int i= 50000;
        float f= 5.67f;
        double d= .1234;
        double result = (f*b) + (i/c) - (d*s);
        //In Java, a char is automatically converted to an int during arithmetic operations using its underlying numeric Unicode (ASCII) value.
        System.out.println((f*b) + "+" + (i/c) + "-" + (d*s));
        System.out.println("result = "+result);
    }
}
