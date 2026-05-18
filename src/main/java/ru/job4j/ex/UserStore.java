package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                return users[i];
            }
        }
        throw new UserNotFoundException("Пользователь " + login + " не найден");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid()) {
            if (user.getUsername().length() < 3) {
                throw new UserInvalidException(user.getUsername() + " не валидный");
            }
        } else {
            throw new UserInvalidException(user.getUsername() + " не валидный");
        }
        return user.isValid();
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            System.out.println(ei.getMessage());
        } catch (UserNotFoundException ef) {
            System.out.println(ef.getMessage());
        }
    }
}
