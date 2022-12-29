
package enterprise.template;

import enterprise.template.templateElements.NewsPage;
import enterprise.template.templateElements.WebSite;
import enterprise.template.templateElements.WelcomePage;

public class TemplateMain {

    /*
    Template is a behavioral design pattern that allows you to define
    a skeleton of an algorithm in a base class and let subclasses override the steps
    without changing the overall algorithm’s structure.

    Шаблон — это поведенческий шаблон проектирования, который позволяет вам
    определить скелет алгоритма в базовом классе и позволить подклассам
    переопределять шаги без изменения общей структуры алгоритма.
     */

    public static void main(String[] args) {

        WebSite welcomePage = new WelcomePage();
        WebSite newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("------------------------------");

        newsPage.showPage();
        System.out.println("------------------------------");
    }
}
