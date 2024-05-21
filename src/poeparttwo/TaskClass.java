/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poeparttwo;

/**
 *
 * @author RC_Student_lab
 */
public class TaskClass {
    //DEclaration of variables
    private static int taskCounter = 0;
    private String taskDescription;
    private String developerDetails;
    private double taskDuration;
    private String taskStatus;
    //Initialiving the task metods and objects
    public TaskClass(String taskDescription, String developerDetails, double taskDuration, String taskStatus) {
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
    } public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    } public String createTaskID() {
        String taskID = taskDescription.substring(0, 2).toUpperCase() + ":" + taskCounter + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        taskCounter++;
        return taskID;
    } public String printTaskDetails() {
        return "Task Status: " + taskStatus +
                "\nDeveloper Details: " + developerDetails +
                "\nTask Number: " + taskCounter +
                "\nTask Description: " + taskDescription +
                "\nTask ID: " + createTaskID() +
                "\nDuration: " + taskDuration + " hours";
    } public double getTaskDuration() {
        return taskDuration;
    }
}
