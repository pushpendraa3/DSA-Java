public class TypeCasting {
    public static void main(String[] args) {
    int num = (int)(22.34);
        System.out.println(num);

//        automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);

        byte first = 40;
        byte second = 50;
        byte third = 100;
        int sum = first * second / third;
        System.out.println(sum);

        int number = 'a';
        System.out.println(number);
    }
}
