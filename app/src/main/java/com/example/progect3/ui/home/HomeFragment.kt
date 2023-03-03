package com.example.progect3.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.progect3.R
import com.example.progect3.databinding.FragmentHomeBinding
import com.example.progect3.ui.recadapters.MyState
import com.example.progect3.ui.recadapters.StateRecycler

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root: View = inflater.inflate(R.layout.fragment_home, container, false)
        val state_Rec : RecyclerView = root.findViewById(R.id.stateRecycler)
        state_Rec.adapter = StateRecycler(requireContext(), MyState().list)
        return root
    }
}