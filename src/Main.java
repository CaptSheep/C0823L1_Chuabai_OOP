// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Circle circle = new Circle(10);
//        System.out.println("Ban kinh : " + circle.getRadius());
//        System.out.println("Dien tich  : " + circle.getArea());



        TV tv = new TV();
        tv.setChannel(10);
        tv.setVolume(100);
        tv.channelUp();
        tv.volumeDown();
        tv.turnOn();
        System.out.println(tv);
    }
}