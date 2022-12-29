
package enterprise.proxy;

import enterprise.proxy.proxyElements.Project;
import enterprise.proxy.proxyElements.ProxyProject;

public class ProxyMain {

    /*
    Proxy is a structural design pattern that provides an object that acts as a substitute
    for a real service object used by a client. A proxy receives client requests,
    does some work (access control, caching, etc.) and then passes the request to a service object.

    Прокси — это структурный шаблон проектирования, предоставляющий объект,
    который действует как замена реального объекта службы, используемого клиентом.
    Прокси получает клиентские запросы, выполняет некоторую работу
    (управление доступом, кэширование и т.д.), а затем передает запрос сервисному объекту.
     */

    public static void main(String[] args) {

        Project project = new ProxyProject("https://github.com/User/real-project");

        project.run();
    }
}
