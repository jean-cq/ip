package urchatbot.commands;

import urchatbot.storage.Storage;
import urchatbot.taskList.TaskList;
import urchatbot.ui.Ui;

public class ExitCommand extends Command {
    /**
     * Constructs the ExitCommand class.
     *
     * @param taskDescription Task description of the task.
     */
    public ExitCommand(String taskDescription) {
        super(taskDescription);
    }

    @Override
    public boolean isExit(){
        return true;
    }
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showByeMessage();
    }
}
