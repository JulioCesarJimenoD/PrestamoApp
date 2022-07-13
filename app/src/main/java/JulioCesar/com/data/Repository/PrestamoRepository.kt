package JulioCesar.com.data.Repository

import JulioCesar.com.data.PrestamoDao
import JulioCesar.com.model.Prestamo
import kotlinx.coroutines.flow.Flow
import java.sql.RowId
import javax.inject.Inject

class PrestamoRepository @Inject constructor(
     val prestamoDao: PrestamoDao
){
    suspend fun insertar(prestamos: Prestamo){
        prestamoDao.insertar(prestamos = prestamos)
    }
    suspend fun eliminar (prestamos: Prestamo ){
        prestamoDao.eliminar(prestamos=prestamos)
    }
    fun buscar(prestamoId: Int): Flow<Prestamo> {
        return prestamoDao.buscar(prestamoId=prestamoId)
    }

    fun getList() : Flow<List<Prestamo>>{
        return prestamoDao.getList()
    }
}
