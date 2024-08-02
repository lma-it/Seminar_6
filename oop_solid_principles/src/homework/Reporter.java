package homework;

public class Reporter {

    private User user;

    public Reporter(User user) {
        this.user = user;
    }
    
    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}
