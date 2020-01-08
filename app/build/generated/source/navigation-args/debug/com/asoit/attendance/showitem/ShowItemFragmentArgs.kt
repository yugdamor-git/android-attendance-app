package com.asoit.attendance.showitem

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmStatic

data class ShowItemFragmentArgs(
    val date: String,
    val branch: String,
    val lecture: String,
    val absent: String,
    val total: String,
    val sem: String,
    val note: String,
    val id: Int
) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("date", this.date)
        result.putString("branch", this.branch)
        result.putString("lecture", this.lecture)
        result.putString("absent", this.absent)
        result.putString("total", this.total)
        result.putString("sem", this.sem)
        result.putString("note", this.note)
        result.putInt("id", this.id)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): ShowItemFragmentArgs {
            bundle.setClassLoader(ShowItemFragmentArgs::class.java.classLoader)
            val __date : String?
            if (bundle.containsKey("date")) {
                __date = bundle.getString("date")
                if (__date == null) {
                    throw IllegalArgumentException("Argument \"date\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"date\" is missing and does not have an android:defaultValue")
            }
            val __branch : String?
            if (bundle.containsKey("branch")) {
                __branch = bundle.getString("branch")
                if (__branch == null) {
                    throw IllegalArgumentException("Argument \"branch\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"branch\" is missing and does not have an android:defaultValue")
            }
            val __lecture : String?
            if (bundle.containsKey("lecture")) {
                __lecture = bundle.getString("lecture")
                if (__lecture == null) {
                    throw IllegalArgumentException("Argument \"lecture\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"lecture\" is missing and does not have an android:defaultValue")
            }
            val __absent : String?
            if (bundle.containsKey("absent")) {
                __absent = bundle.getString("absent")
                if (__absent == null) {
                    throw IllegalArgumentException("Argument \"absent\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"absent\" is missing and does not have an android:defaultValue")
            }
            val __total : String?
            if (bundle.containsKey("total")) {
                __total = bundle.getString("total")
                if (__total == null) {
                    throw IllegalArgumentException("Argument \"total\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"total\" is missing and does not have an android:defaultValue")
            }
            val __sem : String?
            if (bundle.containsKey("sem")) {
                __sem = bundle.getString("sem")
                if (__sem == null) {
                    throw IllegalArgumentException("Argument \"sem\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"sem\" is missing and does not have an android:defaultValue")
            }
            val __note : String?
            if (bundle.containsKey("note")) {
                __note = bundle.getString("note")
                if (__note == null) {
                    throw IllegalArgumentException("Argument \"note\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"note\" is missing and does not have an android:defaultValue")
            }
            val __id : Int
            if (bundle.containsKey("id")) {
                __id = bundle.getInt("id")
            } else {
                throw IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue")
            }
            return ShowItemFragmentArgs(__date, __branch, __lecture, __absent, __total, __sem,
                    __note, __id)
        }
    }
}
