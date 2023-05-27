package com.finances.expenditureloggerasif.di

import android.content.Context
import androidx.room.Room
import com.finances.expenditureloggerasif.data.local.TransactionDao
import com.finances.expenditureloggerasif.data.local.TransactionDatabase
import com.finances.expenditureloggerasif.data.repository.DatastoreRepositoryImpl
import com.finances.expenditureloggerasif.data.repository.TransactionRepositoryImpl
import com.finances.expenditureloggerasif.domain.repository.DatastoreRepository
import com.finances.expenditureloggerasif.domain.repository.TransactionRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object XpenseModule {

    @Provides
    @Singleton
    fun provideDatastoreRepository(@ApplicationContext context: Context) : DatastoreRepository {
        return DatastoreRepositoryImpl(context)
    }

    @Provides
    @Singleton
    fun provideExpenseRepository(transactionDao: TransactionDao) : TransactionRepository
        = TransactionRepositoryImpl(transactionDao)

    @Provides
    @Singleton
    fun provideExpenseDatabase(@ApplicationContext context: Context) : TransactionDatabase {
        return Room.databaseBuilder(context, TransactionDatabase::class.java, "transactionDB")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideExpenseDao(database: TransactionDatabase) = database.transactionDao

}