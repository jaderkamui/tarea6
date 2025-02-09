package muni.jader_munoz_seccion6.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import muni.jader_munoz_seccion6.data.InfraccionDao
import muni.jader_munoz_seccion6.model.InfraccionViewModel

@Module
@InstallIn(ViewModelComponent::class)
class ViewModelModule {

    @ViewModelScoped
    @Provides
    fun provideInfraccionViewModel(infraccionDao: InfraccionDao): InfraccionViewModel =
        InfraccionViewModel(infraccionDao)
}