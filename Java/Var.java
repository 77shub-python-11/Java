public class Var {
    int x = 10; //instances variables
    int y = 20;//instances variables
    public static void main(String[] args) {
        int x = 10;//local variables
        int y = 40; //local variables
        Var t1 = new Var();
        Var t2 = new Var();
        t1.x = t1.y +20;
        t2.x = t1.x +40;
        t2.y = t2.x +x;
        t1.y = x +y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(t1.y);
        System.out.println(t1.x);
        System.out.println(t2.x);
        System.out.println(t2.y);
    }
}