package com.example.mynewfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController


class NotificationsFragment : Fragment(R.layout.fragment_notifications) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.textName).text=NotificationsFragmentArgs.fromBundle(requireArguments()).name
        if (NotificationsFragmentArgs.fromBundle(requireArguments()).name.isBlank()) view.findViewById<TextView>(R.id.textName).text="DATO"
    }
    }