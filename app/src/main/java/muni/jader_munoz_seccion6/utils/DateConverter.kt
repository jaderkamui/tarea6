package muni.jader_munoz_seccion6.utils

import androidx.room.TypeConverter
import java.util.Date

class DateConverter {
    @TypeConverter
    fun toDate(value: Long): Date {
        return Date(value)
    }

    @TypeConverter
    fun toLong(value: Date): Long {
        return value.time
    }
}