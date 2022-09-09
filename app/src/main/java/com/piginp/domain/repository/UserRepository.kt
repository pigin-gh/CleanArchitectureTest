package com.piginp.domain.repository

import com.piginp.domain.models.SaveUserNameParam
import com.piginp.domain.models.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName
}