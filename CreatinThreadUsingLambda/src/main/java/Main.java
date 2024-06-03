import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data{
    String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main {
    interface Lambda{
        public void demo();
    }
    public static void main(String[] args){
//        Thread thread = new Thread(()-> {
//            System.out.println("Statement 01");
//            System.out.println("Statement 02");
//        });
//        thread.start();

        List<Data> list = new ArrayList<>();
        list.add(new Data("Olaide"));
        list.add(new Data("Hammed"));
        list.add(new Data("Ridwan"));
        list.add(new Data("Ed"));
        list.add(new Data("Gia"));
        list.add(new Data("Pooja"));

//        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(list, (o1, o2) -> {
            if (o1.getName().length() < o2.getName().length()){
                return -1;
            } else if (o1.getName().length() > o2.getName().length()) {
                return 1;
            } else {
                return 0;
            }
        });

        for (Data temp: list) {
            System.out.println(temp);
        }
    }
}
