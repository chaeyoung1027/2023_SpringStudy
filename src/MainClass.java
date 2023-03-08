public class MainClass {
    public static void main(String args[]){
        HelloWorldEn hello = new HelloWorldEn();
        callMethod(hello);
    }

    public static void callMethod(HelloWorldEn he){
        he.sayHello();
    }
}
