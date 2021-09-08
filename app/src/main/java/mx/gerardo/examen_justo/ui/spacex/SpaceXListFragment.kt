package mx.gerardo.examen_justo.ui.spacex

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import mx.gerardo.examen_justo.R
import mx.gerardo.examen_justo.databinding.FragmentSpaceXListBinding

class SpaceXListFragment : Fragment() {

    //TODO: declarar ViewBinding
    private lateinit var binding: FragmentSpaceXListBinding
    //TODO: declarar VM
    private lateinit var viewModel: SpaceXListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?
                              ,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_space_x_list, container, false)


        //TODO: Inicializar VM
        viewModel = ViewModelProvider(this).get(SpaceXListViewModel::class.java)
        binding.lifecycleOwner = viewLifecycleOwner

        unitUI()

        return  binding.root

    }

    private fun unitUI() {

        binding.spacelistRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.spacelistRecyclerView.adapter = SpaceXListAdapter {
            //intent to next view
            Toast.makeText(context, "Click id $it", Toast.LENGTH_SHORT).show()
            Log.d("Data", viewModel.spaceList.toString())
        }

        //todo: solicitar lista desde retrofit
        viewModel.getRockets()

        //todo: observar cambios en la lista
        viewModel.spaceList.observe(this@SpaceXListFragment, { list ->
            (binding.spacelistRecyclerView.adapter as SpaceXListAdapter).setData(list)
        })
    }

}