package homework;

public class Main{
    public static void main(String[] args){

        new UserController(new UserService(), new User("Bill")).start();
    }
}