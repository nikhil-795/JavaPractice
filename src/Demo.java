public class Demo {


    public static void main(String[] args) {
        /*Computer call= new Computer();
        System.out.println(call.getMePen(5));
        call.playmusic();*/

        Calculater c=new Calculater();
        System.out.println("add 2 number"+c.add(2,3));
        System.out.println("add 3 number "+c.add(5,2,3));
        System.out.println("double added "+c.add(2.2,3));
    }
}


