package MessageGenerator;

import Context.PageStateContext;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReportMessageGenerator {

    public static String generateMessage(String name, PageStateContext context) {
        String deletedUrls = context.getDeletedPagesUrls().toString();
        deletedUrls = deletedUrls.substring(1, deletedUrls.length() - 1);
        String addedUrls = context.getAddedPagesUrls().toString();
        addedUrls = addedUrls.substring(1, addedUrls.length() - 1);
        String changedUrls = context.getChangedPagesUrls().toString();
        changedUrls = changedUrls.substring(1, changedUrls.length() - 1);

        return "Здравствуйте, дорогая " +
                name + System.lineSeparator() +
                System.lineSeparator() +
                "За последние сутки во вверенных Вам сайтах произошли следующие изменения:" + System.lineSeparator() +
                System.lineSeparator() +
                "Исчезли следующие страницы: " + deletedUrls + System.lineSeparator() +
                "Появились следующие новые страницы: " + addedUrls + System.lineSeparator() +
                "Изменились следующие страницы: " + changedUrls + System.lineSeparator() +
                System.lineSeparator() +
                "С уважением," + System.lineSeparator() +
                "автоматизированная система" + System.lineSeparator() +
                "мониторинга.";
    }

}








