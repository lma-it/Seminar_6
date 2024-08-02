package homework;

public class UserController {
    private UserService service;
    private Reporter reporter;
    private User user;

    public UserController(UserService service, User user) {
        this.service = service;
        this.user = user;
        this.reporter = new Reporter(this.user);
    }


    public void start(){
        this.reporter.report();
        this.service.save(user);
    }
}
