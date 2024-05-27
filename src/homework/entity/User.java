package homework.entity;

import homework.reporter.Reportable;
import homework.saver.Savable;

public class User implements Reportable, Savable {
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String getReportInfo() {
        return "Report for user: " + name;
    }
}
