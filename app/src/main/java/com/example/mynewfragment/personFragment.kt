package com.example.mynewfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController


class PersonFragment : Fragment(R.layout.fragment_person) {
private lateinit var editText: EditText
private lateinit var button:Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editText=view.findViewById(R.id.editText)
        button=view.findViewById(R.id.buttonSend)
        button.setOnClickListener {
        val name=editText.text.toString()
            val action=PersonFragmentDirections.actionPersonFragmentToNotificationsFragment(name)
            findNavController().navigate(action)
        }
    }
}