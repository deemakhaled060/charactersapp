package com.example.charactersapp.ui.characters

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.charactersapp.data.model.CharactersResponse
import com.example.charactersapp.data.repository.CharactersRepository
import com.example.charactersapp.ui.utils.Resource
import degger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlin.text.Typography.dagger

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val charactersRepository: CharactersRepository
) : ViewModel() {

    private val response: LiveData<Resource<CharactersResponse>> =
        charactersRepository.getCharactersResponse()

    init {
        getCharacters()
    }


    private fun getCharacters(){
        charactersRepository.getCharacters()
    }

    fun getCharactersResponse(): LiveData<Resource<CharactersResponse>> = response
}

annotation class HiltViewModel
