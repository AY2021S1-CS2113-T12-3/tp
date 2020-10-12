package seedu.duke.userinterface.command;

import seedu.duke.notebooks.Notebook;
import seedu.duke.notebooks.NotebookShelf;
import seedu.duke.notebooks.Page;
import seedu.duke.notebooks.Section;
import seedu.duke.userinterface.AppState;

public class Add extends CliCommand {
    //TODO have subclasses of CliCommand for commands with and without arguments, and the subclass with arguments could
    // contain these fields to be overridden.
    public static final String COMMAND_WORD = "add";
    private String name;
    private String content;

    public Add(String argument, AppState uiMode) {
        this.setAppState(uiMode);
        this.getName(argument);
    }

    private String getName(String argument) {
        name  = argument.replace("add", "");
        return name;
    }

    public void execute() {
        switch (appState.getAppMode()) {
        case NOTEBOOK_SHELF:
            addNotebook(appState.getCurrentBookShelf());
        case NOTEBOOK_BOOK:
            addNotebookSection(appState.getCurrentNotebook());
            break;
        case NOTEBOOK_SECTION:
            addNotebookPage(appState.getCurrentSection());
            break;
        default:
            System.out.println("\tunable to add notebook/section/page");
            break;
        }
    }

    private String addContent() {
        return content;
    }

    private void addNotebook(NotebookShelf currentBookShelf) {
        new Notebook(name);
    }

    private void addNotebookSection(Notebook currentNotebook) {
        new Section(name);
    }

    private void addNotebookPage(Section currentSection) {
        new Page(name, content);
    }
}
