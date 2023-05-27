package com.finances.expenditureloggerasif.domain.usecase.read_database

import com.finances.expenditureloggerasif.data.local.entity.TransactionDto
import com.finances.expenditureloggerasif.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTransactionByTypeUseCase @Inject constructor(private val repo: TransactionRepository) {
    operator fun invoke(transactionType: String): Flow<List<TransactionDto>> {
        return repo.getTransactionByType(transactionType)
    }
}