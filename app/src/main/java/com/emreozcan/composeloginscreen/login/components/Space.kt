package com.emreozcan.composeloginscreen.login.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Created by @Emre Özcan on 11.08.2024
 */

@Composable
fun SmallSpace() {
    Spacer(modifier = Modifier.height(4.dp))
}

@Composable
fun MediumSpace() {
    Spacer(modifier = Modifier.height(16.dp))
}

@Composable
fun LargeSpace() {
    Spacer(modifier = Modifier.height(32.dp))
}