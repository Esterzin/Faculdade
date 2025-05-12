public class Principal {

    public static void main(String[] args) {

        Paralelepipedo p1 = new Paralelepipedo(10.0,6.0,8.0);
        System.out.println("O volume 1 e:" + p1.getVolume());
        System.out.println("A area 1 e:" + p1.getArea());
        
        Paralelepipedo p2 = new Paralelepipedo(4.0,3.0,1.5);
        System.out.println("O volume 2 e:" + p2.getVolume());
        System.out.println("A area 2 e:" + p2.getArea());
        
    }
}
