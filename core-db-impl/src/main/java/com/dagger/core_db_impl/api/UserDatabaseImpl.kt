package com.dagger.core_db_impl.api

import android.util.Log
import com.dagger.core_db_api.User
import com.dagger.core_db_api.UserDatabase

class UserDatabaseImpl : UserDatabase {
    override fun updateUser(user: User) {
        Log.d("GTA5", "user updated : $user")
    }

    override fun getAllusers(): List<User> = listOf(
        User(0, 1, "John"),
        User(0, 2, "James")
    )
}