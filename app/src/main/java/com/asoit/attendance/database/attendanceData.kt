package com.asoit.attendance.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "attendanceData")
data class attendanceData(

    var date: String,
    var branch: String,
    var sem: String,
    var lecture: String,
    var total: String,
    var absent: String,
    var note: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}

