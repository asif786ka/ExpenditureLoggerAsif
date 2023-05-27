package com.finances.expenditureloggerasif.domain.usecase.write_datastore

import com.finances.expenditureloggerasif.domain.repository.DatastoreRepository
import javax.inject.Inject

class EditOnBoardingUseCase @Inject constructor(private val datastoreRepository: DatastoreRepository) {
    suspend operator fun invoke(completed: Boolean) {
        datastoreRepository.writeOnboardingKeyToDataStore(completed)
    }
}