package homework.saver;

import homework.entity.User;

public class UserSaver implements Saver<User>{

    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
