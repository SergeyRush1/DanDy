package com.example.dand.screens.mainSreen

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dand.handlers.EventHandler
import com.example.dand.screens.LoadingScreen
import com.example.dand.screens.mainSreen.models.MainEvent
import com.example.dand.screens.mainSreen.models.MainState
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject constructor(@ApplicationContext application: Context):
    ViewModel(), EventHandler<MainEvent> {
    val _mainViewState: MutableLiveData<MainState> = MutableLiveData(MainState.Loading)
    val mainState: LiveData<MainState> = _mainViewState
   // val firebaseHelper = FirebaseHelper(application)
  //  val settings = Settings(application)


    override fun obtainEvent(event: MainEvent) {
        when (val currentState = _mainViewState.value) {
            is MainState.Loading -> reduce(event,currentState)
            //is ProfileState.ProfileInfo -> reduce(event,currentState)
          //  is ProfileState.ChangeUserProfile->reduce(event,currentState)
            else -> {}
        }
    }

    private fun reduce(event: MainEvent, createState: MainState.Loading) {
        when (event) {
            is MainEvent.Loading -> load()
           // is ProfileEvent.ChangeClick -> _userProfileViewState.postValue(ProfileState.Loading)
            else -> {}
        }

    }
    private fun load(){
        //загрузка из БД данных из аккаунта
        // сравнение этой БД с серверной частью данных
        // не забыть об этом
        _mainViewState.postValue(MainState.MainView)

    }

}