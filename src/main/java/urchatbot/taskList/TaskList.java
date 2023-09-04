package urchatbot.taskList;

import urchatbot.exception.URChatBotException;
import urchatbot.tasks.Task;

import java.util.ArrayList;
public class TaskList {
    public static ArrayList<Task> tasks;

    /**
     * Constructs the Tasklist class.
     */
    public TaskList() {
        tasks = new ArrayList<>();
    }

    /**
     * Constructs the Tasklist class in an alternative way.
     *
     * @param tasks Task to construct the tasklist.
     */
    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * Adds tasks to the tasklist.
     *
     * @param task Task to add.
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * Deletes tasks to the tasklist.
     *
     * @param index Task number to delete.
     */
    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    /**
     * Clears all tasks in the tasklist.
     */
    public void clearTask() {
        tasks.clear();
    }
    public ArrayList<Task> getTasks() {
        return tasks;
    }
    public int getSize() {
        return tasks.size();
    }
}
