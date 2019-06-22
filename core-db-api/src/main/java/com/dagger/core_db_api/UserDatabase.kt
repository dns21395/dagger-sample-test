package com.dagger.core_db_api

interface UserDatabase {
    fun updateUser(user: User)

    fun getAllusers(): List<User>
}