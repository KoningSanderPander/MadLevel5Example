package nl.svdoetelaar.madlevel5example.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import nl.svdoetelaar.madlevel5example.model.Reminder

@Dao
interface ReminderDao {

    @Query("SELECT * FROM reminder")
    fun getAllReminders(): LiveData<List<Reminder>>

    @Insert
    suspend fun insertReminder(reminder: Reminder)

    @Update
    suspend fun updateReminder(reminder: Reminder)

    @Delete
    suspend fun deleteReminder(reminder: Reminder)

}