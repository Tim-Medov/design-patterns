
package enterprise.mediator.mediatorElements;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {

    private Role admin;
    private List<Role> members = new ArrayList<>();

    public void setAdmin(Role admin) {

        this.admin = admin;
    }

    public void addUserToChat(Role role) {

        this.members.add(role);
    }

    @Override
    public void sendMessage(String message, Role role) {

        for (Role r : members) {

            if (r != role) {

                r.getMessage(message);
            }
        }

        admin.getMessage(message);
    }
}
