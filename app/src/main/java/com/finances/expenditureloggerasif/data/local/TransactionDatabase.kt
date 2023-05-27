package com.finances.expenditureloggerasif.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.finances.expenditureloggerasif.data.local.TransactionDao
import com.finances.expenditureloggerasif.data.local.converter.DateConverter
import com.finances.expenditureloggerasif.data.local.entity.AccountDto
import com.finances.expenditureloggerasif.data.local.entity.TransactionDto

@TypeConverters(value = [DateConverter::class])
@Database(entities = [TransactionDto::class, AccountDto::class], exportSchema = true, version = 1)
abstract class TransactionDatabase: RoomDatabase() {
    abstract val transactionDao: TransactionDao
}