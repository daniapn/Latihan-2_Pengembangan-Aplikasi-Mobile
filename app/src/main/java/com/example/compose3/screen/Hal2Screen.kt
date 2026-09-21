package com.example.compose3.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Hal2(onNavigateToHal1: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "NIM: 245150400111027")
        Text(text = "Nama: Dania Pujiarum Nafisah")

        Spacer(modifier = Modifier.size(20.dp))

        Text(text = "Screen 2")
    }
}

@Preview
@Composable
fun PreviewHal2() {
    Hal2(onNavigateToHal1 = {})
}