package com.dagger.core_db_impl.di

import com.dagger.core_db_api.CoreDbApi
import com.dagger.core_db_api.UserDatabase
import com.dagger.core_db_impl.api.CoreDbApiImpl
import com.dagger.core_db_impl.api.UserDatabaseImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DbModule {

    @Provides
    @Singleton
    fun provideUserDatabase(): UserDatabase = UserDatabaseImpl()

    @Provides
    @Singleton
    fun provideCoreDbApi(userDatabase: UserDatabase): CoreDbApi = CoreDbApiImpl(userDatabase)
}