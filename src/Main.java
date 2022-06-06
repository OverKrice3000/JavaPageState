import Context.PageStateContext;
import Loader.FromMemoryPageStateContextLoader;
import Loader.PageStateContextLoader;
import MessageGenerator.ReportMessageGenerator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        PageStateContextLoader loader = new FromMemoryPageStateContextLoader();
        PageStateContext context = loader.loadContext();
        System.out.println(ReportMessageGenerator.generateMessage("Полина Сергеевна", context));
    }
}
