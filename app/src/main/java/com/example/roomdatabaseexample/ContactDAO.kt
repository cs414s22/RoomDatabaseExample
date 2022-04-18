package com.example.roomdatabaseexample

import androidx.room.*


// Defines a DAO (Data Access Object) called ContactDao.
// ContactDao provides the methods that the rest of the app uses to interact with data in the contact table.
// You can add as many method as you need
@Dao
interface ContactDAO {

    // OnConflictStrategy is optional, but good idea to specify
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContact(contact: ContactEntity)


    // Enable this version if you want to use Coroutine version instead of Thread
    //@Insert(onConflict = OnConflictStrategy.REPLACE)
    //suspend fun insertContact(contact: ContactEntity)

    // Updates the contact
    @Update
    fun updateContact(contact: ContactEntity)

    // Deletes the contact
    @Delete
    fun deleteContact(contact: ContactEntity)

    // Selects all the records
    @Query("SELECT * FROM contact_table")
    fun viewAllContacts() : List<ContactEntity>

    // Selects a record based on id
    @Query("SELECT * FROM contact_table WHERE id LIKE :contactId")
    fun findContact(contactId: Int) : ContactEntity

    // Selects all record where name field matches with the name provided
    @Query("SELECT * FROM contact_table WHERE name LIKE :name ")
    fun findPeople(name: String): List<ContactEntity>

}