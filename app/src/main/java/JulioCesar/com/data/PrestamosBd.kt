package JulioCesar.com.data

import JulioCesar.com.model.Prestamo
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        Prestamo::class
    ],
    exportSchema = false,
    version = 1
)
abstract class PrestamosDb : RoomDatabase(){
    abstract val PrestamosDao : PrestamoDao

}
