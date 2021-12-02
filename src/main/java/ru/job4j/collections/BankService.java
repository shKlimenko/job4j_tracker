package ru.job4j.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу сервиса банковских переводов.
 * @author Alexey Klimenko
 * @version 1.0
 */
public class BankService {
    /**
     *  Поле содержит всех пользователей системы с привязанными к ним счетами
     *  Хранение осуществляется в коллекции типа Map.
     *  Ключом является пользователь, значением - список его счетов.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод позволяет получить пользователей в банковской системе
     * @return возвращает длину коллекции
     */
    public int size() {
        return users.size();
    }

    /**
     * Метод принимает на вход пользователя и добавляет его в систему
     * Если его там еще не было
     * @param user пользователь, которого необходимо добавить
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод по данным пользователя находит его в системе и привязывает к нему счет
     * @param passport данные пользователя, по которым его нужно найти
     * @param account счет, который будет привязан к пользователю, если он будет найден
     */
    public void addAccount(String passport, Account account) {
        User foundUser = findByPassport(passport);
        if (foundUser != null && users.containsKey(foundUser)
                && !users.get(foundUser).contains(account)) {
            users.get(foundUser).add(account);
        }
    }

    /**
     * Метод находит пользователя по его данным
     * @param passport данные пользователя, по которым его нужно найти
     * @return возвращает пользователя, если ой найден и возвращает null, если не найден
     */
    public User findByPassport(String passport) {
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                return key;
            }
        }
        return null;
    }

    /**
     * Метод находит счет пользователя по его данным и по реквизитам
     * @param passport данные пользователя, по которым его нужно найти
     * @param requisite реквизиты аккаунта
     * @return возвращает счет, если пользователь найден и рекуизиты совпали
     * в противном случае возвращет null
     */
    public Account findByRequisite(String passport, String requisite) {
        User foundUser = findByPassport(passport);
        if (foundUser != null) {
            for (Account acc : users.get(foundUser)) {
                if (acc.getRequisite().equals(requisite)) {
                    return acc;
                }
            }
        }
        return null;
    }

    /**
     * Метод переводит деньги (если они есть и их хватает) с обного счета на другой
     * @param srcPassport данные пользователя, с которого списываются деньги
     * @param srcRequisite реквизиты счета, с которого списываются деньги
     * @param destPassport данные пользователя, которому зачисляются деньги
     * @param destRequisite реквизиты счета, на который зачисляются деньги
     * @param amount сумма, которую нужно перевести
     * @return возвращает boolean значение как прошла транзакция, успешно или нет
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || srcAccount.getBalance() < amount || destAccount == null) {
            return false;
        }
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);
        return true;
    }
}