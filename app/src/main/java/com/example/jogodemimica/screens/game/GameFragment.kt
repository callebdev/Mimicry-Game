package com.example.jogodemimica.screens.game


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

import com.example.jogodemimica.R
import com.example.jogodemimica.databinding.GameFragmentBinding

/**
 * A simple [Fragment] subclass.
 */
class GameFragment : Fragment()
{

  private lateinit var binding: GameFragmentBinding
  lateinit var viewModel: GameViewModel
  override fun onCreateView(
          inflater: LayoutInflater, container: ViewGroup?,
          savedInstanceState: Bundle?
  ): View?
  {

    // Inflate the layout for this fragment
    binding = DataBindingUtil.inflate(inflater, R.layout.game_fragment, container, false)

    viewModel = ViewModelProvider(this).get(GameViewModel::class.java)

    /** DataBinding*/
    binding.gameViewModel = viewModel
    binding.lifecycleOwner = this

    return binding.root
  }


}
