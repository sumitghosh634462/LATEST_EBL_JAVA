package com.wecp.progressive.service;

import com.wecp.progressive.dao.TransactionDAO;
import com.wecp.progressive.entity.Transactions;

import java.sql.SQLException;
import java.util.List;

public class TransactionServiceImpl implements TransactionService {

    private TransactionDAO transactionDAO;

    public TransactionServiceImpl(TransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }

    @Override
    public List<Transactions> getAllTransactions() throws SQLException {
        return null;
    }

    @Override
    public Transactions getTransactionById(int transactionId) throws SQLException {
        return null;
    }

    @Override
    public int addTransaction(Transactions transaction) throws SQLException {
        return -1;
    }

    @Override
    public void updateTransaction(Transactions transaction) throws SQLException {

    }

    @Override
    public void deleteTransaction(int transactionId) throws SQLException {

    }

    @Override
    public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
        return null;
    }
}