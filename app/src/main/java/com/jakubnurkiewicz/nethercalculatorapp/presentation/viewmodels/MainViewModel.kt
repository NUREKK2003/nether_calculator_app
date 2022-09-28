package com.jakubnurkiewicz.nethercalculatorapp.presentation.viewmodels

import android.text.Editable
import android.text.TextUtils
import androidx.lifecycle.ViewModel
import com.jakubnurkiewicz.nethercalculatorapp.common.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {



    fun checkIfTextIsntEmpty(text:String):Boolean{
        return TextUtils.isEmpty(text)
    }

    fun calculateNetherCords(overCord: Editable): String{
        return (Integer.parseInt(overCord.toString())/Constants.DISTANCE_MULTIPLIER).toString()
    }

    fun calculateOverworldCords(netherCord: Editable?): String{
        return (Integer.parseInt(netherCord.toString()).times(Constants.DISTANCE_MULTIPLIER)).toString()
    }
}