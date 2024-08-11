package com.emreozcan.composeloginscreen.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.emreozcan.composeloginscreen.R
import com.emreozcan.composeloginscreen.login.components.EmailTextField
import com.emreozcan.composeloginscreen.login.components.MediumSpace
import com.emreozcan.composeloginscreen.login.components.PasswordTextField
import com.emreozcan.composeloginscreen.login.components.RegisterText
import com.emreozcan.composeloginscreen.login.components.SmallSpace

/**
 * Created by @Emre Özcan on 11.08.2024
 */

@Composable
fun LoginScreen() {
    Login()
}

@Composable
fun Login() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            modifier = Modifier
                .weight(1f)
                .padding(32.dp),
            painter = painterResource(id = R.drawable.compose_logo),
            contentDescription = null
        )
        Column(
            modifier = Modifier
                .weight(3f)
                .padding(32.dp), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Login",
                style = MaterialTheme.typography.headlineLarge
            )
            MediumSpace()
            EmailTextField(email = email) {
                email = it
            }
            SmallSpace()
            PasswordTextField(password = password) {
                password = it
            }
            MediumSpace()
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                FilledTonalButton(onClick = {  }) {
                    Text(modifier = Modifier.padding(horizontal = 16.dp),text = "Login")
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            RegisterText(modifier = Modifier.clickable {  })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen() {
    LoginScreen()
}

