package source;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Parrot parrot = context.getBean("parrot2",Parrot.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getParrot());

    }
}
