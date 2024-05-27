package homework;

import homework.entity.User;
import homework.reporter.ConsoleReporter;
import homework.saver.UserSaver;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        new ConsoleReporter().printReport(user);
        new UserSaver().save(user);
    }
}