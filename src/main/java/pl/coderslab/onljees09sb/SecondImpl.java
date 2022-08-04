package pl.coderslab.onljees09sb;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class SecondImpl implements SomeInterface{
    @Override
    public void doSth() {

    }
}
