package com.asoit.attendance.add2

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class AbsentPresentFragmentArgs(
    val date: String,
    val branch: String,
    val lecture: String,
    val sem: String,
    val total: String,
    val note: String
) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("date", this.date)
        result.putString("branch", this.branch)
        result.putString("lecture", this.lecture)
        result.putString("sem", this.sem)
        result.putString("total", this.total)
        result.putString("note", this.note)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): AbsentPresentFragmentArgs {
            bundle.setClassLoader(AbsentPresentFragmentArgs::class.java.classLoader)
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
            val __sem : String?
            if (bundle.containsKey("sem")) {
                __sem = bundle.getString("sem")
                if (__sem == null) {
                    throw IllegalArgumentException("Argument \"sem\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"sem\" is missing and does not have an android:defaultValue")
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
            val __note : String?
            if (bundle.containsKey("note")) {
                __note = bundle.getString("note")
                if (__note == null) {
                    throw IllegalArgumentException("Argument \"note\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"note\" is missing and does not have an android:defaultValue")
            }
            return AbsentPresentFragmentArgs(__date, __branch, __lecture, __sem, __total, __note)
        }
    }
}
