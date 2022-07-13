package JulioCesar.com.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Prestamos")

data class Prestamo(
    @PrimaryKey (autoGenerate = true)
    val  PrestamoId : Int=0,
    val deudor: String,
    val concepto: String,
    val monto: Float
)