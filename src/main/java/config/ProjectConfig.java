package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import source.Parrot;
import source.Person;

@Configuration
@ComponentScan(basePackages = "source")
public class ProjectConfig {


}
