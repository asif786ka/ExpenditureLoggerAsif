package com.finances.expenditureloggerasif.domain.usecase.read_database

import com.finances.expenditureloggerasif.data.local.entity.AccountDto
import com.finances.expenditureloggerasif.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAccountsUseCase @Inject constructor(private val repo: TransactionRepository) {
    operator fun invoke(): Flow<List<AccountDto>> {
        return repo.getAccounts()
    }
}