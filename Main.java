public class Main {
    public static void main(String[] args) {
        //INNER CLASS(IÇ SINIFLAR) =>> STATIC OR NON-STATIC
        //NON STATIC
        Out o = new Out();
        Out.In inNesnesi = o.new In();
        inNesnesi.print();
        //1.KULLANIM SEKLI
        System.out.println("-------------");
        Out on = new Out();
        Out.In inNesnesi2 = o.getIn();
        inNesnesi2.print();
        //2.KULLANIM SEKLI

    }
}
