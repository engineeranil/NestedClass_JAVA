public class Local {
    //Nested Class(IC ICE SINIFLAR) =>> INNER(IC SINIFLAR) CLASS--LOCAL CLASS--ANONYMUS CLASS.
    //LOCAL CLASS(YEREL SINIFLAR) =>> METODUN ICINDEKI TANIMLANAN SINIFLAR METOD ICINDE ULASILABILIR
    public void run(){

        class Yerel{
            private int number;

            public Yerel(int number){
                this.number=number;
            }

            public int getNumber(){
                return number;
            }
            public void setNumber(int number){
                this.number=number;
            }
        }
        Yerel yerel = new Yerel(5);
        System.out.println("LOCAL SINIFI CALISTI !!");
        System.out.println(yerel.getNumber());
    }


}
