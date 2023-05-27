package com.finances.expenditureloggerasif.domain.usecase.write_database

import com.finances.expenditureloggerasif.domain.repository.TransactionRepository
import javax.inject.Inject

class EraseTransactionUseCase @Inject constructor(
    private val repository: TransactionRepository
) {
    operator fun invoke() {
        repository.eraseTransaction()
    }
}