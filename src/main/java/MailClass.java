public class MailClass {
    public static void main(String[] args) {
        UseDBforCheckLoginPassword useDBforCheckLoginPassword = new UseDBforCheckLoginPassword();

        // Искусственно создаеи пользователя
        boolean ff = useDBforCheckLoginPassword.newUserRegistration("vitos1", "12345",
                "Виталий", "Привалов");
        if (ff) {
            System.out.println("Пользователь создан");
        } else {
            System.out.println("Пользователь не добавлен или уже есть");
        }

        ff = useDBforCheckLoginPassword.checkLoginAndPasswordAtIdentification("vitos2", "12345");

        if (ff) {
            System.out.println("Вы вошли в свой аккаунт");
        } else {
            System.out.println("Нет такого пользователя");
        }

        useDBforCheckLoginPassword.closeDB();
    }
}
