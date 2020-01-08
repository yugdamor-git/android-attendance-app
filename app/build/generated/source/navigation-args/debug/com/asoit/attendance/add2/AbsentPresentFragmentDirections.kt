package com.asoit.attendance.add2

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.asoit.attendance.R

class AbsentPresentFragmentDirections private constructor() {
    companion object {
        fun actionAbsentPresentFragmentToHomeFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_absentPresentFragment_to_homeFragment)
    }
}
