package mx.gerardo.examen_justo.ui.spacex

import android.os.Bundle
import android.renderscript.ScriptGroup
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import mx.gerardo.examen_justo.R
import mx.gerardo.examen_justo.databinding.FragmentSpaceXDetailBinding
import mx.gerardo.examen_justo.databinding.FragmentSpaceXListBinding

class SpaceXDetailFragment : Fragment() {

    //TODO: declarar ViewBinding
    private lateinit var binding: FragmentSpaceXDetailBinding
    //TODO: declarar VM
    //private lateinit var viewModel: SpaceXListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?
                              ,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_space_x_detail, container, false)


        //TODO: Inicializar VM
        //viewModel = ViewModelProvider(this).get(SpaceXListViewModel::class.java)
        //binding.lifecycleOwner = viewLifecycleOwner
        //unitUI()
        return  binding.root

    }


}