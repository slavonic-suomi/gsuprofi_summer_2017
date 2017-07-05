package by.gsu.lesson9.strings;

import by.gsu.lesson9.strings.tasks.BooleanTask;
import by.gsu.lesson9.strings.tasks.IntTask;
import by.gsu.lesson9.strings.tasks.StringTask;

public class StringsMain {
    public static void main(String[] args) {
        String input = "dsaqwe";

        StringProcessor[] processors = getProcessors();

      /*  for (int i = 0; i < processors.length; i++) {
            System.out.println(processors[i].getDescription());
            System.out.println(processors[i].process(input));
            System.out.println();
        } */

        for (StringProcessor proc : processors) {
            System.out.println(proc.getDescription());
            System.out.println(proc.process(input));
            System.out.println();
        }
    }

    private static StringProcessor[] getProcessors() {
       /* StringProcessor[] processors = new StringProcessor[3];
        processors[0] = new IntTask();
        processors[1] = new BooleanTask();
        processors[2] = new StringTask();

        return processors; */


       /*StringProcessor[] processors =
               {new IntTask(), new BooleanTask(), new StringTask()};
       return processors; */

       return new StringProcessor[]
               {new IntTask(), new BooleanTask(), new StringTask()};
    }
}
