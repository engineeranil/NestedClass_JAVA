public class Out {
    public int a = 5;

    public class In{
        public int a = 10;
        public void print(){
            System.out.println("IN CLASSI CALISTI!!");
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Out.this.a);
        }
    }

    public void run(){
        In in = new In();
        in.print();
    }
    public In getIn(){
        //2.KULLANIM SEKLI
        In in = new In();
        return new In();
    }
    public In getIn2(){
        //3.KULLANIM SEKLI
        return new In();
    }

}
