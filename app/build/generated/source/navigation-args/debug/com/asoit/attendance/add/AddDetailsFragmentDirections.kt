package com.asoit.attendance.add

import android.os.Bundle
import androidx.navigation.NavDirections
import com.asoit.attendance.R
import kotlin.Int
import kotlin.String

class AddDetailsFragmentDirections private constructor() {
    private data class ActionAddDetailsFragmentToAbsentPresentFragment(
        val date: String,
        val branch: String,
        val lecture: String,
        val sem: String,
        val total: String,
        val note: String
    ) : NavDirections {
        override fun getActionId(): Int = R.id.action_addDetailsFragment_to_absentPresentFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("date", this.date)
            result.putString("branch", this.branch)
            result.putString("lecture", this.lecture)
            result.putString("sem", this.sem)
            result.putString("total", this.total)
            result.putString("note", this.note)
            return result
        }
    }

    companion object {
        fun actionAddDetailsFragmentToAbsentPresentFragment(
            date: String,
            branch: String,
            lecture: String,
            sem: String,
            total: String,
            note: String
        ): NavDirections = ActionAddDetailsFragmentToAbsentPresentFragment(date, branch, lecture,
                sem, total, note)
    }
}
