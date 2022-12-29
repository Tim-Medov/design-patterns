
package enterprise.mediator;

import enterprise.mediator.mediatorElements.Admin;
import enterprise.mediator.mediatorElements.Role;
import enterprise.mediator.mediatorElements.SimpleTextChat;
import enterprise.mediator.mediatorElements.User;

public class MediatorMain {

    /*
    Mediator is a behavioral design pattern that reduces coupling between components of a program
    by making them communicate indirectly, through a special mediator object.

    Медиатор — это поведенческий шаблон проектирования, который уменьшает связь между компонентами программы,
    заставляя их взаимодействовать косвенно, через специальный объект-посредник.
     */

    public static void main(String[] args) {

        SimpleTextChat chat = new SimpleTextChat();

        Role admin = new Admin(chat, "Admin");
        Role user1 = new User(chat, "User1");
        Role user2 = new User(chat, "User2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello I am User1");
        admin.sendMessage("Hello I am Admin");
    }
}
