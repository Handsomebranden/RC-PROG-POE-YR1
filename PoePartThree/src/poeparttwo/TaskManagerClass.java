/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poeparttwo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Branden
 */
public class TaskManagerClass {
    //Initialization of task manager objects
    private List<String> developers = new ArrayList<>();
    private List<String> taskNames = new ArrayList<>();
    private List<String> taskIDs = new ArrayList<>();
    private List<Integer> taskDurations = new ArrayList<>();
    private List<String> taskStatuses = new ArrayList<>();
    //Iniializing the method for adding the tasks
    public void addTask(String developer, String taskName, String taskID, int taskDuration, String taskStatus) {
     developers.add(developer);
     taskNames.add(taskName);
     taskIDs.add(taskID);
     taskDurations.add(taskDuration);
     taskStatuses.add(taskStatus);
    }
    //Initializing the method for displaying all the tasks that have a done status
     public void displayDoneTasks() {
         for (int i = 0; i < taskStatuses.size(); i++) {
              if (taskStatuses.get(i).equals("done")) {
                  JOptionPane.showMessageDialog(null, "Developer: " + developers.get(i) + "\nTask Name: " + taskNames.get(i) + "\nTask Duration: " + taskDurations.get(i));
                  
              }
         }
     }
     //Mathod for displaying the longest duration
      public void displayLongestTask() {
           int maxDurationIndex = 0;
           for (int i = 1; i < taskDurations.size(); i++) {
               if (taskDurations.get(i) > taskDurations.get(maxDurationIndex)) {
                   JOptionPane.showMessageDialog(null, "Developer: " + developers.get(maxDurationIndex) + "\nTask Duration: " + taskDurations.get(maxDurationIndex));
                    maxDurationIndex = i; {
                    }
               }
           }
      }
      //Method for allowing the user to search for the task by the name
       public void searchTaskByName(String name) {
           int index = taskNames.indexOf(name);
            if (index != -1) {
                JOptionPane.showMessageDialog(null, "Task Name: " + taskNames.get(index) + "\nDeveloper: " + developers.get(index) + "\nTask Status: " + taskStatuses.get(index));
            } else {
                JOptionPane.showMessageDialog(null, "Task not found.");
            }
       }
       //Mothod for for the allowing the user to search for a task by developer
       public void searchTasksByDeveloper(String developer) {
           for (int i = 0; i < developers.size(); i++) {
               if (developers.get(i).equals(developer))  {
                   JOptionPane.showMessageDialog(null, "Task Name: " + taskNames.get(i) + "\nTask Status: " + taskStatuses.get(i));
               }
           }
      }
       //Method for allowing the user to delete a task by name
        public void deleteTaskByName(String name) {
            int index = taskNames.indexOf(name);
            if (index != -1) {
            developers.remove(index);
            taskNames.remove(index);
            taskIDs.remove(index);
            taskDurations.remove(index);
            taskStatuses.remove(index);
            JOptionPane.showMessageDialog(null, "Task deleted successfully.");
            } else {
                 JOptionPane.showMessageDialog(null, "Task not found.");
            }
       }
        //Mehod for allowing the users to display all the tasks
        public void displayAllTasks() {
            for (int i = 0; i < taskNames.size(); i++) {
                JOptionPane.showMessageDialog(null, "Developer: " + developers.get(i) + "\nTask Name: " + taskNames.get(i) + "\nTask ID: " + taskIDs.get(i) + "\nTask Duration: " + taskDurations.get(i) + "\nTask Status: " + taskStatuses.get(i));
            }
       }
}
