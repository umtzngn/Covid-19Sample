package com.umtzngn.covid_19sample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.umtzngn.covid_19sample.databinding.CovidCardBinding
import com.umtzngn.covid_19sample.model.Case

class CasesAdapter (private  var casesList:ArrayList<Case>)
    : RecyclerView.Adapter<CasesAdapter.CaseCardDesign>() {

        class CaseCardDesign(val caseCardBinding: CovidCardBinding)
            :RecyclerView.ViewHolder(caseCardBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CaseCardDesign {
        val layoutInflater = LayoutInflater.from(parent.context)
        val caseCardBinding = CovidCardBinding.inflate(layoutInflater,parent,false)
        return CaseCardDesign(caseCardBinding)
    }

    override fun onBindViewHolder(holder: CaseCardDesign, position: Int) {
        val case = casesList[position]

        holder.caseCardBinding.apply {
            countryText.text = case.country
            totalCasesText.text = case.newCases
        }
    }

    override fun getItemCount(): Int {
        return casesList.size
    }
}