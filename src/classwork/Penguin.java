package classwork;

/**
 * Created by java on 06.02.2018.
 */
public class Penguin extends Bird implements CreateEggs {

    @Override
    public void sound() {
        System.out.println("pinguin gui gui");
    }

    @Override
    public void createEggs() {
        System.out.println("Pinguin has big eggs");
    }
}
