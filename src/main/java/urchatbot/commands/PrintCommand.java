package urchatbot.commands;
import urchatbot.exception.URChatBotException;
import urchatbot.storage.Storage;
import urchatbot.taskList.TaskList;
import urchatbot.ui.Ui;

public class PrintCommand extends Command{
    private String formattedDate;

    /**
     * Constructs the PrintCommand class.
     *
     * @param formattedDate Date that the users want to search.
     */
    public PrintCommand(String formattedDate) {
        super("Print");
        this.formattedDate = formattedDate;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws URChatBotException {
        int count = 0;
        for (int i = 0; i < tasks.getTasks().size(); i++) {
            if (tasks.getTasks().get(i).toString().contains(formattedDate)) {
                count ++;
                System.out.println(tasks.getTasks().get(i).toString() + "\n");
            }
        }
        if (count <= 1) {
            ui.showPrintMessage(count, formattedDate);
        } else {
            ui.showPrintMessagePlural(count, formattedDate);
        }
    }
}
