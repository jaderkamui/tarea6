package muni.jader_munoz_seccion6.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "infracciones")
data class Infraccion(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val rutInspector: String,
    val nombreLocal: String,
    val direccion: String,
    val infraccionCometida: String,
    val fecha: Date = Date()
)