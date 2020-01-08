package com.asoit.attendance.showitem

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.asoit.attendance.R

class ShowItemFragmentDirections private constructor() {
    companion object {
        fun actionShowItemFragmentToHomeFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_showItemFragment_to_homeFragment)
    }
}
