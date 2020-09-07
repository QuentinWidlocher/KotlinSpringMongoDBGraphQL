package com.widlocher.kotlintest01.models

import org.springframework.data.annotation.Id

data class Person(@Id var id: String?, var firstName: String, var lastName: String)