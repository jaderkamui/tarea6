package muni.jader_munoz_seccion6.model

import androidx.lifecycle.*
import kotlinx.coroutines.launch
import muni.jader_munoz_seccion6.data.Infraccion
import muni.jader_munoz_seccion6.data.InfraccionDao

class InfraccionViewModel(private val infraccionDao: InfraccionDao) : ViewModel() {

    val allInfracciones: LiveData<List<Infraccion>> = infraccionDao.getAllInfracciones().asLiveData()
    fun insertInfraccion(infraccion: Infraccion) = viewModelScope.launch {
        infraccionDao.insertInfraccion(infraccion)
    }

    fun updateInfraccion(infraccion: Infraccion) = viewModelScope.launch {
        infraccionDao.updateInfraccion(infraccion)
    }

    fun deleteInfraccion(infraccion: Infraccion) = viewModelScope.launch {
        infraccionDao.deleteInfraccion(infraccion)
    }
}