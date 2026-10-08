// Use for-each style for on a two-dimensional array.
class ForEach3 {
    public static void main(String[] args) {
        int sum=0;
        int [] [] nums = new int[3][5];

        //Give nums some value
        for (int i=0; i<3;  i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }
            //            Col 0   Col 1   Col 2   Col 3   Col 4
            //Row 0 (x) ->  1       2       3       4       5
            //Row 1 (x) ->  2       4       6       8      10
            //Row 2 (x) ->  3       6       9      12      15
        //Use for-each for to display and sum the values.
        for (int [] x : nums){ // This fetches one row at a time
            for (int y : x){ //This fetches the numbers from the selected row at a time
                System.out.println("Value is: "+y);
                sum+=y;
            }
        }
        System.out.println("Summation:" + sum);
    }
}
