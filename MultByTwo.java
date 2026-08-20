//Left shifting as a quick way to multiply by 2.
class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;

        for (i = 0; i < num; i++) {
            num = num << 1;
            System.out.println(num);
            //System.out.println(Integer.toBinaryString(num));
        }
    }
}
