package com.piginp.data.repository

import com.piginp.data.storage.UserStorage
import com.piginp.data.storage.models.User
import com.piginp.domain.models.SaveUserNameParam
import com.piginp.domain.models.UserName
import com.piginp.domain.repository.UserRepository

class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {

    override fun saveName(saveParam: SaveUserNameParam): Boolean {
        val user = mapToStorage(saveParam)
        return userStorage.save(user)
    }

    override fun getName(): UserName {
        val user = userStorage.get()
        return mapToDomain(user)
    }

    private fun mapToDomain(user: User): UserName {
        return UserName(firstname = user.firstName, lastname = user.lastName)
    }

    private fun mapToStorage(saveParam: SaveUserNameParam): User {
        return User(firstName = saveParam.name, lastName = "")
    }

}