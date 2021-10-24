package com.umtzngn.covid_19sample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.umtzngn.covid_19sample.databinding.FragmentAnasayfaBinding
import com.umtzngn.covid_19sample.model.Case
import com.umtzngn.covid_19sample.network.ApiUtils
import com.umtzngn.covid_19sample.response.CaseResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class AnasayfaFragment : Fragment() {
    private var _binding : FragmentAnasayfaBinding? = null
    private  val binding get() = _binding!!

    var casesList : ArrayList<Case> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAnasayfaBinding.inflate(inflater)

        casesGetir()
        return binding.root
    }

    private  fun casesGetir(){
        ApiUtils.caseDAOInterfaceGetir().getCase().enqueue(
            object  : Callback<CaseResponse>{
                override fun onResponse(
                    call: Call<CaseResponse>,
                    response: Response<CaseResponse>
                ) {
                    val tempList = response.body()?.cases

                    tempList?.let {
                        casesList = it as ArrayList<Case>
                    }

                    val casesAdapter = CasesAdapter(casesList)
                    binding.caseRV.adapter = casesAdapter
                    binding.caseRV.layoutManager = GridLayoutManager(context,1)
                    binding.caseRV.setHasFixedSize(true)
                }

                override fun onFailure(call: Call<CaseResponse>, t: Throwable) {

                }

            }
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}