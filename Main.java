public class Main {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_GREEN = "\u001B[32m";

    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {

        //First Test
        System.out.println(ANSI_YELLOW+"-----------------------------------------------------------------------------------------"+ANSI_YELLOW);
        System.out.println(ANSI_YELLOW+"First Test"+ANSI_RESET);
        System.out.println(ANSI_YELLOW+"-----------------------------------------------------------------------------------------"+ANSI_RESET);
        Movie movie = new Movie("Rise of eden hazard",1);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  MOVIE DESCRIPTION   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("The title of movie is: \" "+movie.getTitle()+"\"");
        System.out.println("The price code of movie is "+movie.getPriceCode());
        Rental rental = new Rental(movie,10);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!   RENTAL DESCRIPTION  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        System.out.println("The name of the movie rented is \" "+rental.getMovie().getTitle()+"\"");
        System.out.println("No of Days rented: "+rental.getDaysRented());



        Customer customer = new Customer("Kante");
        customer.addRental(rental);
        System.out.println("!!!!!!!!!!!!!!!!!!  Customer Information   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("The name of the customer is "+customer.getName());

        System.out.println("--- The Statement follows : ");

        String statement= customer.statement();
        System.out.println(statement);

        System.out.println(ANSI_BLUE+"Comparing the statement with the expected "+ANSI_RED);

        if(statement.equals(new TestClass().statement(customer.getRentals(),customer.getName()))){
            System.out.println(ANSI_GREEN+"Correct Output"+ANSI_RESET);
        }
        else{
            System.out.println(ANSI_RED+"Incorrect Output"+ANSI_RESET);
        }


       //Second-Test

        System.out.println(ANSI_YELLOW+"-----------------------------------------------------------------------------------------"+ANSI_RESET);
        System.out.println(ANSI_YELLOW+"Second Test"+ANSI_RESET);
        System.out.println(ANSI_YELLOW+"-----------------------------------------------------------------------------------------"+ANSI_RESET);
        Movie movie1 = new Movie("Rise of Ngolo Kante",0);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  MOVIE DESCRIPTION   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("The title of movie is: \" "+movie1.getTitle()+"\"");
        System.out.println("The price code of movie is "+movie1.getPriceCode());
        Rental rental1 = new Rental(movie1,10);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!   RENTAL DESCRIPTION  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        System.out.println("The name of the movie rented is \" "+rental1.getMovie().getTitle()+"\"");
        System.out.println("No of Days rented: "+rental1.getDaysRented());



        Customer customer1 = new Customer("Pogba");
        customer1.addRental(rental1);
        System.out.println("!!!!!!!!!!!!!!!!!!  Customer Information   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("The name of the customer is "+customer1.getName());

        System.out.println("--- The Statement follows : ");

        String statement1= customer1.statement();
        System.out.println(statement1);

        System.out.println(ANSI_BLUE+"Comparing the statement with the expected "+ANSI_RED);

        if(statement1.equals(new TestClass().statement(customer1.getRentals(),customer1.getName()))){
            System.out.println(ANSI_GREEN+"Correct Output"+ANSI_RESET);
        }
        else{
            System.out.println(ANSI_RED+"Incorrect Output"+ANSI_RESET);
        }


        // Third test

        System.out.println(ANSI_YELLOW+"-----------------------------------------------------------------------------------------"+ANSI_RESET);
        System.out.println(ANSI_YELLOW+"Third Test"+ANSI_RESET);
        System.out.println(ANSI_YELLOW+"-----------------------------------------------------------------------------------------"+ANSI_RESET);
        Movie movie2 = new Movie("Rise of Hudson Oodi",2);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  MOVIE DESCRIPTION   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("The title of movie is: \" "+movie2.getTitle()+"\"");
        System.out.println("The price code of movie is "+movie2.getPriceCode());
        Rental rental2 = new Rental(movie2,10);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!   RENTAL DESCRIPTION  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        System.out.println("The name of the movie rented is \" "+rental2.getMovie().getTitle()+"\"");
        System.out.println("No of Days rented: "+rental2.getDaysRented());



        Customer customer2 = new Customer("Sancho");
        customer2.addRental(rental2);
        System.out.println("!!!!!!!!!!!!!!!!!!  Customer Information   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("The name of the customer is "+customer2.getName());

        System.out.println("--- The Statement follows : ");

        String statement2= customer2.statement();
        System.out.println(statement2);

        System.out.println(ANSI_BLUE+"Comparing the statement with the expected "+ANSI_RED);

        if(statement2.equals(new TestClass().statement(customer2.getRentals(),customer2.getName()))){
            System.out.println(ANSI_GREEN+"Correct Output"+ANSI_RESET);
        }
        else{
            System.out.println(ANSI_RED+"Incorrect Output"+ANSI_RESET);
        }






    }
}
