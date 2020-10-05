package com.example.madlevel3example.interfaces

import androidx.room.*
import com.example.madlevel3example.classes.Reminder

@Dao
interface ReminderDao {

    @Query("SELECT * FROM reminderTable")
    fun getAllReminders(): List<Reminder>

    @Insert
    fun insertReminder(reminder: Reminder)

    @Delete
    fun deleteReminder(reminder: Reminder)

    @Update
    fun updateReminder(reminder: Reminder)
}
