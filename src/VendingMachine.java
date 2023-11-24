public class VendingMachine {
    //Field(필드): 가지는 것들 - 상품, 동전, 돈통,
    //Constructor(생성자):
    //Method(메소드): 할 수 있는 기능 -

    public String pushProductButton(int menuId) {
        System.out.println(menuId + "를 전달 받았습니다.");
        return "콜라";
    }

    public static void printVersion() {
        System.out.println("Version 1.0");
    }
}
