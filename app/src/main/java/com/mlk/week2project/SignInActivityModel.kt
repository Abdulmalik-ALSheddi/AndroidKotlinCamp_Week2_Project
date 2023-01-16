package com.mlk.week2project

class SignInActivityModel {


    private val name = "Abdulmalik"
    private val name2 = "عبدالملك"

    fun checkName(inputName: String) = inputName == name || inputName == name2
    fun checkPassword(inputPassword: String) = inputPassword.length > 4
}