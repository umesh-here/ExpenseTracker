package com.umesh.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umesh.expensetracker.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
