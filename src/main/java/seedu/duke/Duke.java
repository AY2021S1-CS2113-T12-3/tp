package seedu.duke;

import seedu.duke.tasks.TaskList;
import seedu.duke.userinterface.CliUserInterface;

public class Duke {
    private static final TaskList tasksList = new TaskList();
    public static boolean notQuit = true;

    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) throws Exception {
        CliUserInterface ui = new CliUserInterface();
        ui.run();
    }
}
