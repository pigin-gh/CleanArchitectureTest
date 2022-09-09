package com.piginp.domain.usecase

import com.piginp.domain.models.SaveUserNameParam
import com.piginp.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(saveUserNameParam: SaveUserNameParam): Boolean {

        val oldUserName = userRepository.getName()

        if (oldUserName.firstname == saveUserNameParam.name) return true

        val result = userRepository.saveName(saveParam = saveUserNameParam)
        return result
    }
}