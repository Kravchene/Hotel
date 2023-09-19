package com.example.hotel

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.hotel.databinding.FragmentHotelBinding
import com.smarteist.autoimageslider.SliderView

class Hotel : Fragment() {
   lateinit var imageUrl:ArrayList<String>
   lateinit var sliderView:SliderView
   lateinit var sliderAdapter: SliderAdapter
   private lateinit var binding: FragmentHotelBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHotelBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        super.onCreate(savedInstanceState)
        sliderView=requireActivity().findViewById(R.id.imageSlider)
        imageUrl= ArrayList()
        imageUrl.add("https://www.atorus.ru/sites/default/files/upload/image/News/56149/Club_Priv%C3%A9_by_Belek_Club_House.jpg")
        imageUrl.add("https://deluxe.voyage/useruploads/articles/The_Makadi_Spa_Hotel_02.jpg")
        imageUrl.add("https://deluxe.voyage/useruploads/articles/article_1eb0a64d00.jpg")

        sliderAdapter=SliderAdapter(imageUrl)
        sliderView.autoCycleDirection=SliderView.LAYOUT_DIRECTION_LTR
        sliderView.setSliderAdapter(sliderAdapter)
        sliderView.scrollTimeInSec=3
        sliderView.isAutoCycle=true
        sliderView.startAutoCycle()
    }
}