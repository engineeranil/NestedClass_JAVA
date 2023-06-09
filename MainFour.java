public class MainFour {
    public static void main(String[] args) {
        //ANONYMUS CLASS =>> OLUŞTURULAN NESNE ÜZERİNDEN CONSTRUCTORUN İÇİNE YAZILMIŞ BAŞKA BİR METODA ULAŞILAMAZ.
        Anonymus anonymus = new Anonymus(){
            @Override
            public void run(){
                int a = 10;
                 System.out.println(this.a);
                System.out.println(a);
                System.out.println("CONSTRUCTOR OLAN ANONIM CLASS BASARIYLA CALISTI !! ");
                print();
            }
            public void print(){
                System.out.println("ANONYMUS CLASS");
            }
        };
        anonymus.run();
    }
}
