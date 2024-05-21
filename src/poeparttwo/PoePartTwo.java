/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poeparttwo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static poeparttwo.UserLogInClass.VerificationOfUser.ifPasswordIsValid;
import static poeparttwo.UserLogInClass.VerificationOfUser.ifUsernamieIsValid;

/**
 *
 * @author RC_Student_lab
 */
public class PoePartTwo {
    //Placing the Task Statuses method into an array
    private static final String[] TASK_STATUSES = {"To Do", "Done", "Doing"};
    public static void main(String[] args) {
        // Initializing the method registering of the user
        JOptionPane.showMessageDialog(null, "Your username should be 5 characters long and should contain an underscore");
        String userName = JOptionPane.showInputDialog("Enter username:");
        //Initiaizing the method for displaying the password conditions in a list format
         String[] items = {"Your password should be", "8 Characters long", "Contain a capital letter", "Contain a number", "and should contain a special character"};
         String message = String.join("\n", items);
         JOptionPane.showMessageDialog(null, message, "List of Items", JOptionPane.INFORMATION_MESSAGE);
         String password = JOptionPane.showInputDialog("Enter password:");
         String firstName = JOptionPane.showInputDialog("Enter first name:");
         String lastName = JOptionPane.showInputDialog("Enter last name:");
         //Initializing the method to register the user
         if (ifUsernamieIsValid(userName)) {
             JOptionPane.showMessageDialog(null, "Username successfully captured");
         } else {
             JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
             return;
         }  if (ifPasswordIsValid(password)) {
             JOptionPane.showMessageDialog(null, "Password successfully captured");
             JOptionPane.showConfirmDialog(null,"“Welcome to EasyKanban”");
             JOptionPane.showMessageDialog(null, "Login successful. Welcome " + firstName + " " + lastName);
         } else {
             JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
             return;
         }
         //Initializing the object to enter the number of tasks
         int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks:"));
         //Formatting the list to store the tasks
         List<TaskClass> tasks = new ArrayList<>();
         //Initializing the method for adding the tasks
         for (int i = 0; i < numTasks; i++) {
             //Initializing the method and objects for getting the tasks details
              String taskDescription = JOptionPane.showInputDialog("Enter task description (max 50 characters):");
              String developerDetails = firstName + " " + lastName;
              double taskDuration = Double.parseDouble(JOptionPane.showInputDialog("Enter task duration (hours):"));
              String taskStatus = (String) JOptionPane.showInputDialog(null, "Select task status:", "Task Status", JOptionPane.QUESTION_MESSAGE, null, TASK_STATUSES, TASK_STATUSES[0]);
              //Method for cheacking the lenght of the task description
              if (taskDescription.length() > 50) {
                  JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                   i--;
                   continue;
              }
              //Initializing the method and objectts for creating a new task
              TaskClass task = new TaskClass(taskDescription, developerDetails, taskDuration, taskStatus);
              tasks.add(task);
              //Initializing the method for displaying the task details
              JOptionPane.showMessageDialog(null, task.printTaskDetails());
         }
         //Initializing the method for calculating the total number of hours
         double totalHours = 0;
         for (TaskClass task : tasks) {
             totalHours += task.getTaskDuration();
         }
         JOptionPane.showMessageDialog(null, "Total hours across all tasks: " + totalHours);
         //Method for displaying the report that is currently in development
         JOptionPane.showMessageDialog(null, "Show report - Coming Soon");
         //Method for quittinf the program
          JOptionPane.showMessageDialog(null, "Goodbye!");
    }
    
}