package com.finances.expenditureloggerasif.domain.usecase.write_database

import com.finances.expenditureloggerasif.data.local.entity.TransactionDto
import com.finances.expenditureloggerasif.domain.repository.TransactionRepository
import javax.inject.Inject

class InsertNewTransactionUseCase @Inject constructor(private val repo: TransactionRepository) {

    suspend operator fun invoke(dailyExpense: TransactionDto) {
        repo.insertTransaction(dailyExpense)
    }
}