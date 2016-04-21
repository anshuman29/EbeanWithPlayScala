package services;

import models.Task;
import java.util.List;

public class EbeanLogic {
    public void testEbean(){

        //Get from database
        List<Task> tasks = Task.find.all();
        System.out.println("Number of entries in database: : " +tasks.size());

        //Id needs to be unique, cannot be one which already exists in the DB
        Task newTask = new Task();
        newTask.id = new Long(5);
        newTask.name = "akshay";
        newTask.done = true;

        //Add new entry in database
        Task.db().save(newTask);

        tasks = Task.find.all();
        System.out.println("Number of entries in database: " +tasks.size());

    }
}
