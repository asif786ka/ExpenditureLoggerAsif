package com.finances.expenditureloggerasif.domain.usecase.write_database

import com.finances.expenditureloggerasif.data.local.entity.AccountDto
import com.finances.expenditureloggerasif.domain.repository.TransactionRepository
import javax.inject.Inject

class InsertAccountsUseCase @Inject constructor(private val repo: TransactionRepository) {

    suspend operator fun invoke(account: List<AccountDto>) {
        repo.insertAccount(account)
    }
}