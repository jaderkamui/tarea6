package muni.jader_munoz_seccion6.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import muni.jader_munoz_seccion6.utils.DateConverter

@Database(entities = [Infraccion::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class)
abstract class InfraccionDatabase : RoomDatabase() {
    abstract fun infraccionDao(): InfraccionDao
}