package com.example.roomdatabaseexample

import androidx.room.Entity
import androidx.room.PrimaryKey


// Defines a Contact data entity.
// Each instance of Contact represents a row in a contact_table in the app's database.
@Entity(tableName = "contact_table")
data class ContactEntity(
    @PrimaryKey(autoGenerate = true)
    var id : Int,
    var name : String,
    var email: String
    // The following can be used to give different name (different than your varible name) to a column
    //@ColumnInfo(name = "last_name") val lastName: String?
)