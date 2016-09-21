/**
 * Created by Marc on 21/9/2016.
 */
public class MAin {

    public int i;


    void g(int i) {
        System.out.println("Hola soy Gervasio "+this.i);
    }

    void f(){

        int a = 1;
        System.out.println("Hello World");
        a = a + 1;
        System.out.println("A vale"+ a);
        g(666);
    }

    public static void main(String[] args){

        MAin m = new MAin();
        m.f();
    }

}

