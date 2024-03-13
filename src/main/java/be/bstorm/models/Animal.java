import java.util.List;

public class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move(int distance){
        System.out.println(name);
    }

}
