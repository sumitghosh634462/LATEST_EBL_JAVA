package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Accounts;

public class AccountDAOImpl implements AccountDAO {

    @Override
    public List<Accounts> getAllAccounts() {
        return null;

    }

    public List<Accounts> getAllAccountsByCustomer(int customer_id) {
        List<Accounts> accounts = new ArrayList<>();
        return accounts;
    }

    @Override
    public Accounts getAccountById(int accountId) {
        return null;
    }

    @Override
    public int addAccount(Accounts accounts) {
        int generatedID = -1;
        return generatedID;
    }

    @Override
    public void updateAccount(Accounts accounts) {

    }

    @Override
    public void deleteAccount(int accountId) {

    }

}