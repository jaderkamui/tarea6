package muni.jader_munoz_seccion6.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import muni.jader_munoz_seccion6.data.InfraccionDao
import muni.jader_munoz_seccion6.data.InfraccionDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun provideInfraccionDatabase(application: Application): InfraccionDatabase =
        Room.databaseBuilder(application, InfraccionDatabase::class.java, "infracciones_db")
            .build()

    @Provides
    fun provideInfraccionDao(database: InfraccionDatabase): InfraccionDao = database.infraccionDao()
}