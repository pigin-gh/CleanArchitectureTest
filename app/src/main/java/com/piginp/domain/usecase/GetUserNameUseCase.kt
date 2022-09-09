package com.piginp.domain.usecase

import com.piginp.domain.models.UserName
import com.piginp.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()
    }
}