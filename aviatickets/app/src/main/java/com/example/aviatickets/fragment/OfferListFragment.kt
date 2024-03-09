package com.example.aviatickets.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.aviatickets.R
import com.example.aviatickets.adapter.OfferListAdapter
import com.example.aviatickets.databinding.FragmentOfferListBinding
import com.example.aviatickets.model.entity.ApiOfferResponse
import com.example.aviatickets.model.entity.Offer
import com.example.aviatickets.model.network.ApiClient
import com.example.aviatickets.model.service.FakeService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class OfferListFragment : Fragment() {

    companion object {
        fun newInstance() = OfferListFragment()
    }

    private var _binding: FragmentOfferListBinding? = null
    private val binding
        get() = _binding!!

    private val adapter: OfferListAdapter by lazy {
        OfferListAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOfferListBinding.inflate(layoutInflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUI()
        adapter.setItems(FakeService.offerList)
    }
    private fun fetchOfferList() {
        val apiService = ApiClient.apiService
        val call = apiService.getOffers()

        call.enqueue(object : Callback<ApiOfferResponse> {
            override fun onResponse(
                call: Call<ApiOfferResponse>,
                response: Response<ApiOfferResponse>
            ) {
                if (response.isSuccessful) {
                    val apiOfferResponse = response.body()
                    apiOfferResponse?.let { showOfferList(it.offerList) }
                } else {
                    // Handle error
                    handleError(response.code())
                }
            }

            override fun onFailure(call: Call<ApiOfferResponse>, t: Throwable) {
                // Handle failure
                handleError(-1)
            }
        })
    }

    private fun setupUI() {
        with(binding) {
            offerList.adapter = adapter

            sortRadioGroup.setOnCheckedChangeListener { _, checkedId ->
                when (checkedId) {
                    R.id.sort_by_price -> {
                        /**
                         * implement sorting by price
                         */
                        showOfferList(sortByPrice(FakeService.offerList))
                    }

                    R.id.sort_by_duration -> {
                        /**
                         * implement sorting by duration
                         */
                        showOfferList(sortByDuration(FakeService.offerList))
                    }
                }
            }
        }
    }

    private fun showOfferList(offers: List<Offer>) {
        adapter.setItems(offers)
    }

    private fun sortByPrice(offerList: List<Offer>): List<Offer> {
        return offerList.sortedBy { it.price }
    }

    private fun sortByDuration(offerList: List<Offer>): List<Offer> {
        return offerList.sortedBy { it.flight.duration }
    }

    private fun handleError(errorCode: Int) {
        showErrorMessage("Error: $errorCode")
    }

    private fun showErrorMessage(message: String) {
        showToast(message)
    }

    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

}