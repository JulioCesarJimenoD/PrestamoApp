package JulioCesar.com.di

import JulioCesar.com.data.PrestamoDao
import JulioCesar.com.data.PrestamosDb
import JulioCesar.com.data.Repository.PrestamoRepository
import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object AppModule {
    @Singleton
    @Provides
    fun ProvidePrestamosDb(@ApplicationContext context: Context) : PrestamosDb {
        val DATABASE_NAME = "PrestamosDb"
        return Room.databaseBuilder(
            context,
            PrestamosDb::class.java,
            DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun ProvidePrestamoDAO(prestamosDb: PrestamosDb) : PrestamoDao {
        return prestamosDb.PrestamosDao
    }

    @Provides
    fun ProvidePrestamoRepository(prestamoDao: PrestamoDao) : PrestamoRepository {
        return PrestamoRepository(prestamoDao)
    }



}