package ru.job4j.tracker;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Store tracker, List<UserAction> actions) throws SQLException {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) throws SQLException {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());

        MemTracker tracker = new MemTracker();
            List<UserAction> actions = List.of(
                    new CreateAction(output),
                    new EditAction(output),
                    new DeleteAction(output),
                    new ShowAllAction(output),
                    new FindItemByIdAction(output),
                    new FindItemByNameAction(output),
                    new ExitAction(),
                    new CreateForGCAction(output),
                    new DeleteForGCAction(output)
            );
            new StartUI(output).init(input, tracker, actions);

        /*          ===  for sqltracker ===
        try (SqlTracker tracker = new SqlTracker()) {
            tracker.init();
            List<UserAction> actions = List.of(
                    new CreateAction(output),
                    new EditAction(output),
                    new DeleteAction(output),
                    new ShowAllAction(output),
                    new FindItemByIdAction(output),
                    new FindItemByNameAction(output),
                    new ExitAction()
            );
            new StartUI(output).init(input, tracker, actions);
        } catch (Exception e) {
            e.printStackTrace();
        } */
    }
}
