
package enterprise.template.templateElements;

public abstract class WebSite {

    public void showPage() {

        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
