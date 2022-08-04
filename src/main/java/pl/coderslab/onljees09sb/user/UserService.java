package pl.coderslab.onljees09sb.user;

public interface UserService {
    User findByUserName(String name);
    void saveUser(User user);
}
