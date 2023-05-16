package com.sanjeewabasnayaka.android.composedapp.services

class HellomessageService {
    fun showMessage(name:String,age:String): String {
        return if (name==""){
            "Name cannot be empty"
        }else if (   age==""){
            "Age cannot be empty"
        }else{
            "Hello "+name+ " , You are "+age+" years old."
        }
    }
}