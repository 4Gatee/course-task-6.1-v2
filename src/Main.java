public class Main {
    public static void main(String[] args) {
        Dot dot1 = new Dot.DotBuilder(1, 3).setName("first").build();
        Dot dot2 = new Dot.DotBuilder(1, 3).build();
        Dot dot3 = new Dot.DotBuilder(5, 8).setName("end of line").build();

        System.out.println(dot1);
        System.out.println(dot2);
        System.out.println(dot3);

        System.out.println(dot1 == dot2);
        System.out.println(dot2 == dot3);
    }
}
