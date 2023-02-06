package com.example.vknewsclient.samples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

var result = 0

fun sum(a: Int, b: Int): Int {
    result = a + b
    return result
}

@Composable
fun SideEffectTest(number: MyNumber) {
    Column() {
        LazyColumn {
            repeat(5) {
                item {
                    Text(text = "Number: ${number.a}")
                }
            }
        }
        android.os.Handler().postDelayed({
            number.a = 5
        }, 3)
        LazyColumn {
            repeat(5) {
                item {
                    Text(text = "Number: ${number.a}")
                }
            }
        }
    }
}

data class MyNumber(var a: Int)