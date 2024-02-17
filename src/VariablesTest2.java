public class VariablesTest2 {
    public void vartest2() {
        long a = Long.MAX_VALUE;
        int b = (int) a;
        short c = (short) b;
        byte d = (byte) c;
        String str = Long.toBinaryString(a) + " " + Integer.toBinaryString(b) + " " + Short.toString(c) + " " + Byte.toString(d);

        System.out.println(a + " " + b + " " + c + " " + d);
        System.out.println(str);
    }
}
