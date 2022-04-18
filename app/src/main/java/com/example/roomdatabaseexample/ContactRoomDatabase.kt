package com.example.roomdatabaseexample

import androidx.room.Database
import androidx.room.RoomDatabase

// Defines an ContactRoomDatabase class to hold the database.
// ContactRoomDatabase defines the database configuration and
// serves as the app's main access point to the persisted data.
// The class must be annotated with a @Database annotation
// The class must define an abstract method that has zero arguments and returns an instance of the DAO class.
@Database(entities = [ContactEntity::class], version = 1)
abstract class ContactRoomDatabase : RoomDatabase() {
    abstract fun contactDAO() : ContactDAO
}