package command;


import java.util.ArrayList;
import java.util.List;

//Invoker
public class Invoker {

    private List<Command> commandos = new ArrayList<>();
    private int current = 0;

    public void compute(Command command) {
        command.execute();
        commandos.add(command);
        current++;
    }

    public void undo(int levels) {
        for(int i=0;i<levels;i++) {
            if(current >0) {

                Command command = commandos.remove(--current);
                command.undo();
            }
        }
    }
}