package com.finances.expenditureloggerasif.domain.usecase.write_datastore

import com.finances.expenditureloggerasif.domain.repository.DatastoreRepository
import javax.inject.Inject

class EraseDatastoreUseCase @Inject constructor(private val datastoreRepository: DatastoreRepository) {
    suspend operator fun invoke() {
        datastoreRepository.eraseDataStore()
    }
}