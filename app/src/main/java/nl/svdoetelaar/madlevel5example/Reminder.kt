package nl.svdoetelaar.madlevel5example

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reminder")
data class Reminder(
    @PrimaryKey(autoGenerate = true)
    var id: Long? = null,

    var reminderText: String
)