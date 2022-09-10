package com.piginp.data.storage

import com.piginp.data.storage.models.User

interface UserStorage {

    fun save(user: User): Boolean

    fun get(): User
}