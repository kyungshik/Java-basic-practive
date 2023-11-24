public class MathBeanMain {
    public static void main(String[] args) {
        MathBean mb = new MathBean();

        mb.printClassName();
        mb.printNumber(2);

        int x = mb.getOne();
        System.out.println("x = " + x);

        int y = mb.plus(1, 2);
        System.out.println("y = " + y);
    }
}
