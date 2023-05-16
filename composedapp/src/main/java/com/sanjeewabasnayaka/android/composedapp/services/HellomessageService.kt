package com.sanjeewabasnayaka.android.composedapp.services

class HellomessageService {
    fun showMessage(name:String,age:String): String {
        if (name==" "){
            return "Name cannot be empty"
        }else if (   age==" "){

            return "Age cannot be empty"
        }else{
            return "Hello "+name+ " , You are "+age+" years old."
        }
    }
}