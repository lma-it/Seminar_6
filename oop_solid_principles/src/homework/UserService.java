package homework;

public class UserService{

    public void save(User user){
        Persister persister = new Persister(user);
        persister.save();
    }
}
