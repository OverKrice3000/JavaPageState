import Context.PageStateContext;
import Loader.FromMemoryPageStateContextLoader;
import Loader.PageStateContextLoader;
import MessageGenerator.ReportMessageGenerator;

public class Main {

    public static void main(String[] args){
        PageStateContextLoader loader = new FromMemoryPageStateContextLoader();
        PageStateContext context = loader.loadContext();
        System.out.println(ReportMessageGenerator.generateMessage("Полина Сергеевна", context));
    }
}
