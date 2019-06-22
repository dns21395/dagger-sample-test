package com.dagger.core_db_impl.api

import com.dagger.core_db_api.CoreDbApi
import com.dagger.core_db_api.UserDatabase
import javax.inject.Inject

class CoreDbApiImpl @Inject constructor(
    private val userDatabaseImpl: UserDatabase
) : CoreDbApi {
    override fun userDatabase(): UserDatabase = UserDatabaseImpl()
}