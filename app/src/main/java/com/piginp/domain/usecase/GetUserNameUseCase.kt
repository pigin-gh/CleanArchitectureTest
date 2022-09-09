package com.piginp.domain.usecase

import com.piginp.domain.models.UserName

class GetUserNameUseCase {

    fun execute(): UserName {
        return UserName(firstname = "pavel", lastname = "test")
    }
}