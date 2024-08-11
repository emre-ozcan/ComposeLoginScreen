package com.emreozcan.composeloginscreen.login.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview

/**
 * Created by @Emre Özcan on 11.08.2024
 */

@Composable
fun PasswordTextField(password: String, onValueChange: (String) -> Unit) {
    var passwordVisible by remember { mutableStateOf(false) }

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = password,
        onValueChange = onValueChange,
        label = { Text(text = "Password") },
        leadingIcon = { Icon(imageVector = Icons.Filled.Lock, contentDescription = null) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        singleLine = true,
        trailingIcon = {
            IconButton(onClick = { passwordVisible = passwordVisible.not() }) {
                Icon(imageVector = if(passwordVisible) Icons.Filled.VisibilityOff else Icons.Filled.Visibility, contentDescription = null)
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewPasswordTextField() {
    PasswordTextField("1234", {})
}