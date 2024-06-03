import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Data{
    private String name;

    public Data(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args){
//        List<Data> list = Arrays.asList(6,4,8,7,23,9,0);
        List<Data> list = Arrays.asList(new Data("Olaide"),new Data("Hammed"),new Data("Raj"));
        System.out.println(list);

        list.forEach(temp -> {
            if (temp.getName().equals("Olaide")) {
                System.out.println("upcoming founder ");
            }
            System.out.println(temp.getName());
        });

//        list.forEach(i -> System.out.println(i));
    }
}
