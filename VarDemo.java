//A simple demonstrates of local variable type inference
class VarDemo {
    public static void main(String[] args) {
        //Use type inference to determine the type of the variable named avg. In this case, double is inferred.
        var avg=10.0;
        System.out.println("value of avg: "+avg);
        //In the following context, var is not a pre-defined identifier. It is simply a user-defined variable name.
        int var=1;
        System.out.println("value of var: "+var);
        //Interestingly, in the following sequence, var is used as both the type of declaration and as a variable name in the initializer.
        var k=-var;
        System.out.println("value of k: "+k);
        //Although you can declare an array type using var, you cannot use var with an array initializer.
        //var myArray=new int[10]  is valid but var myArray={1, 2, 3} is illegal.
    }
}
