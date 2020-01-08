package com.asoit.attendance.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.asoit.attendance.R
import kotlinx.android.synthetic.main.add_details_fragment.*
import java.text.SimpleDateFormat
import java.util.*

class AddDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = AddDetailsFragment()
    }

    private lateinit var viewModel: AddDetailsViewModel
    lateinit var branchSpinner: Spinner
    lateinit var semSpinner: Spinner
    lateinit var lectureSpinner: Spinner
    lateinit var date: TextView
    lateinit var total: EditText
    lateinit var note: EditText


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AddDetailsViewModel::class.java)

        date = tv_date
        branchSpinner = spinner_branch
        semSpinner = spinner_sem
        lectureSpinner = spinner_lec
        total = et_total
        note = et_note
        lateinit var _date: String
        lateinit var _total: String
        lateinit var _note: String
        lateinit var _branch: String
        lateinit var _sem: String
        lateinit var _lecture: String


        val date_ = SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().time)

        date.text = "Date : " + date_

        //set date
        _date = date_

        val BranchOptions =
            arrayOf("SELECT BRANCH", "CE", "IT", "ME", "EC", "CIVIL", "AERONAUTICAl")
        val SemOptions = arrayOf("SELECT SEMESTER", "1", "2", "3", "4", "5", "6", "7", "8")
        val LectureOptions = arrayOf("SELECT LECTURE", "1", "2", "3", "4", "5", "6", "Lab")

        branchSpinner.adapter = ArrayAdapter<String>(
            this.requireContext(),
            android.R.layout.simple_list_item_1,
            BranchOptions
        )
        semSpinner.adapter = ArrayAdapter<String>(
            this.requireContext(),
            android.R.layout.simple_list_item_1,
            SemOptions
        )
        lectureSpinner.adapter = ArrayAdapter<String>(
            this.requireContext(),
            android.R.layout.simple_list_item_1,
            LectureOptions
        )


        //branch on click

        branchSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                _branch = BranchOptions.get(position)
            }


        }


        //sem on click

        semSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                _sem = SemOptions.get(position)
            }

        }


        //lecture on click

        lectureSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                _lecture = LectureOptions.get(position)
            }

        }


        btn_save.setOnClickListener {

            _total = total.text.toString()
            _note = note.text.toString()

            try {

                val tempCon = _total.toInt()


                if (_branch == "SELECT BRANCH" || _lecture == "SELECT LECTURE" || _sem == "SELECT SEMESTER" || _total.isNullOrEmpty()) {
                    Toast.makeText(
                        this.requireContext(),
                        "Please Select All Options",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    var action =
                        AddDetailsFragmentDirections.actionAddDetailsFragmentToAbsentPresentFragment(
                            _date,
                            _branch,
                            _lecture,
                            _sem,
                            _total,
                            _note
                        )
                    it.findNavController().navigate(action)
                }
            } catch (e: NumberFormatException) {
                Toast.makeText(
                    this.requireContext(),
                    "Please Enter only number",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }


    }

}
