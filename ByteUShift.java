//Unsigned shifting a byte value.
class ByteUShift {
    public static void main(String[] args) {
        char [] hex = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1;
        byte c = (byte) (b>>4);
        byte d = (byte) (b>>>4);//Converted to int before the shift and extra 1s are added to maintain the sign, therefore even after unsigned shift the value remains the same
        byte e = (byte) ((b & 0xff) >>4);
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println("b >> 4 = 0x" + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        System.out.println("b >>> 4 = 0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
        System.out.println("(b & oxff) >> 4 = 0x" + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
    }
}
