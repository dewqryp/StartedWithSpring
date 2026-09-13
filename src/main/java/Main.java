import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        Parrot p =  new Parrot ();
    }
}
