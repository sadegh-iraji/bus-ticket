package ir.maktab.busticket.util;

import ir.maktab.busticket.model.User;

public class SecurityContext {

    private static User activeUser;

    public static void logOut(){
        activeUser = null;
    }

    public static User getActiveUser() {
        return activeUser;
    }

    public static void setActiveUser(User activeUser) {
        SecurityContext.activeUser = activeUser;
    }
}
