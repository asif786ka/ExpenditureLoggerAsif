package com.finances.expenditureloggerasif.domain.usecase.write_datastore

import com.finances.expenditureloggerasif.domain.repository.DatastoreRepository
import javax.inject.Inject

class EditLimitDurationUseCase @Inject constructor(
    private val datastoreRepository: DatastoreRepository
) {
    suspend operator fun invoke(duration: Int) {
        return datastoreRepository.writeLimitDurationToDataStore(duration)
    }
}