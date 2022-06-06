package MessageGenerator;

import Context.PageStateContext;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReportMessageGenerator {

    public static String urlsListToString(List<String> list){
        String urls = list.toString();
        return urls.substring(1, urls.length() - 1);
    }

    public static String generateMessage(String name, PageStateContext context) {
        return "Здравствуйте, дорогая " +
                name + System.lineSeparator() +
                System.lineSeparator() +
                "За последние сутки во вверенных Вам сайтах произошли следующие изменения:" + System.lineSeparator() +
                System.lineSeparator() +
                "Исчезли следующие страницы: " + urlsListToString(context.getDeletedPagesUrls()) + System.lineSeparator() +
                "Появились следующие новые страницы: " + urlsListToString(context.getAddedPagesUrls()) + System.lineSeparator() +
                "Изменились следующие страницы: " + urlsListToString(context.getChangedPagesUrls()) + System.lineSeparator() +
                System.lineSeparator() +
                "С уважением," + System.lineSeparator() +
                "автоматизированная система" + System.lineSeparator() +
                "мониторинга.";
    }

}








