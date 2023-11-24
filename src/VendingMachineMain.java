public class VendingMachineMain {
    //모든 클래스는 main 클래스에서 부터 실행된다.
    public static void main(String[] args) {
        VendingMachine.printVersion();

        //VendingMachine 클래스를 생성하는 생성자 선언
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();
        //new 생성자()
        //vm : 참조형 변수

        String product1 = vm1.pushProductButton(2);
        System.out.println("product1 = " + product1);
        String product2 = vm2.pushProductButton(3);
        System.out.println("product2 = " + product2);

    }
}
