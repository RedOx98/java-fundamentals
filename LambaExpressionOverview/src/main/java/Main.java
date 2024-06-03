public class Main {

    interface Lambda{
        public void demo();
    }
    public static void main(String[] args){
        Lambda lambda = (()->
            System.out.println("Statement 01")
        );

//                new Lambda() {
//            @Override
//            public void demo() {
//                System.out.println("Statement 01");
//            }
//        };

        lambda.demo();
    }
}
