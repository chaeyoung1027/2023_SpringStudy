public class MainClass {
    public static void main(String args[]) {
        //다형성 : 부모의 참조변수로 자식객체를 생성한다.
        Hello Ehello = new HelloWorldEn();
        Ehello.sayHello();
        Hello Khello = new HelloWorldKr();
        Khello.sayHello();
    }
}