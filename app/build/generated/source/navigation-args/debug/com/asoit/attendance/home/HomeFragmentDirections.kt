package com.asoit.attendance.home

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.asoit.attendance.R
import kotlin.Int
import kotlin.String

class HomeFragmentDirections private constructor() {
    private data class ActionHomeFragmentToShowItemFragment(
        val date: String,
        val branch: String,
        val lecture: String,
        val absent: String,
        val total: String,
        val sem: String,
        val note: String,
        val id: Int
    ) : NavDirections {
        override fun getActionId(): Int = R.id.action_homeFragment_to_showItemFragment

        override fun getArguments(): Bundle {
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
    }

    companion object {
        fun actionHomeFragmentToAddDetailsFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_homeFragment_to_addDetailsFragment)

        fun actionHomeFragmentToShowItemFragment(
            date: String,
            branch: String,
            lecture: String,
            absent: String,
            total: String,
            sem: String,
            note: String,
            id: Int
        ): NavDirections = ActionHomeFragmentToShowItemFragment(date, branch, lecture, absent,
                total, sem, note, id)
    }
}
