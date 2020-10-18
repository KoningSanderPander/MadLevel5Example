package nl.svdoetelaar.madlevel5example.repository

import android.content.Context
import androidx.lifecycle.LiveData
import nl.svdoetelaar.madlevel5example.dao.ReminderDao
import nl.svdoetelaar.madlevel5example.database.ReminderRoomDatabase
import nl.svdoetelaar.madlevel5example.model.Reminder

class ReminderRepository(context: Context) {
    private var reminderDao: ReminderDao

    init {
        val reminderRoomDatabase = ReminderRoomDatabase.getDatabase(context)
        reminderDao = reminderRoomDatabase!!.reminderDao()
    }

    suspend fun getAllReminders(): LiveData<List<Reminder>> {
        return reminderDao.getAllReminders()
    }

    suspend fun insertReminder(reminder: Reminder) {
        reminderDao.insertReminder(reminder)
    }

    suspend fun updateReminder(reminder: Reminder) {
        reminderDao.updateReminder(reminder)
    }

    suspend fun deleteReminder(reminder: Reminder) {
        reminderDao.deleteReminder(reminder)
    }
}