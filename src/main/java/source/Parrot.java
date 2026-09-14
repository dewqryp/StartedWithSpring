package source;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
public class Parrot {
    private String name = "Jojo";

    @Override
    public String toString() {
        return "Parrot name: " + name;
    }

    public Parrot() {
        System.out.println("Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
