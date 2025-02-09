package muni.jader_munoz_seccion6.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface InfraccionDao {
    @Query("SELECT * FROM infracciones")
    fun getAllInfracciones(): Flow<List<Infraccion>>

    @Query("SELECT * FROM infracciones WHERE id = :id")
    fun getInfraccionById(id: Long): Flow<Infraccion>

    @Insert
    suspend fun insertInfraccion(infraccion: Infraccion)

    @Update
    suspend fun updateInfraccion(infraccion: Infraccion)

    @Delete
    suspend fun deleteInfraccion(infraccion: Infraccion)
}