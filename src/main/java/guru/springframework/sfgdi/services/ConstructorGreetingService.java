package guru.springframework.sfgdi.services;

import com.springframework.pets.PetServiceFactory;
import org.springframework.stereotype.Service;


public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
