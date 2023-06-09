public class OutTwo {
    public int a = 10;
    public static int b = 14;

    public static class  InTwo{
        public static int a = 15;
        public static void run(){
            System.out.println("INTWO BASARIYLA CALISTI!!");
            int a = 3;
            System.out.println(a);
            System.out.println(InTwo.a);
            System.out.println(OutTwo.b);
        }
    }

    public void print(){
       InTwo.run();
    }
}
