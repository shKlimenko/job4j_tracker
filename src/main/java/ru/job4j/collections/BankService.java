package ru.job4j.collections;

import java.util.*;

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
        Optional<User> foundUser = findByPassport(passport);
        if (foundUser.isPresent() && users.containsKey(foundUser.get())
                && !users.get(foundUser.get()).contains(account)) {
            users.get(foundUser.get()).add(account);
        }
    }

    /**
     * Метод находит пользователя по его данным
     * @param passport данные пользователя, по которым его нужно найти
     * @return возвращает пользователя, если ой найден и возвращает null, если не найден
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(el -> el.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод находит счет пользователя по его данным и по реквизитам
     * @param passport данные пользователя, по которым его нужно найти
     * @param requisite реквизиты аккаунта
     * @return возвращает счет, если пользователь найден и рекуизиты совпали
     * в противном случае возвращет null
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> foundUser = findByPassport(passport);
        if (foundUser.isPresent()) {
            return users.get(foundUser.get())
                    .stream()
                    .filter(el -> el.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
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
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isEmpty()
                || srcAccount.get().getBalance() < amount
                || destAccount.isEmpty()) {
            return false;
        }
        srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
        destAccount.get().setBalance(destAccount.get().getBalance() + amount);
        return true;
    }
}