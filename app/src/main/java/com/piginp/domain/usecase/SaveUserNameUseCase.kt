package com.piginp.domain.usecase

import com.piginp.domain.models.SaveUserNameParam

class SaveUserNameUseCase {

    fun execute(saveUserNameParam: SaveUserNameParam): Boolean {
        if (saveUserNameParam.name.isEmpty()) {
            return false
        } else {
            return true
        }
    }
}