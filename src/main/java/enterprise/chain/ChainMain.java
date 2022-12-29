
package enterprise.chain;

import enterprise.chain.chainElements.*;

public class ChainMain {

    /*
    Chain of Responsibility is a behavioral design pattern
    that lets you pass requests along a chain of handlers.
    Upon receiving a request, each handler decides either to process
    the request or to pass it to the next handler in the chain.

    Цепочка ответственности — это поведенческий шаблон проектирования,
    который позволяет передавать запросы по цепочке обработчиков.
    При получении запроса каждый обработчик решает либо обработать запрос,
    либо передать его следующему обработчику в цепочке.
     */

    public static void main(String[] args) {

        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong", Priority.IMPORTANT);
        reportNotifier.notifyManager("Houston, we have a problem", Priority.ASAP);
    }
}
