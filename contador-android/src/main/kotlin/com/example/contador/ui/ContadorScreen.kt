package com.example.contador.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contador.ui.theme.ContadorTheme

@Composable
fun ContadorScreen() {
    // RT1: Estado declarado com remember { mutableStateOf(...) }
    val contador = remember { mutableStateOf(0) }

    // RT2: Scaffold com TopAppBar
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Contador") })
        }
    ) { paddingValues ->
        // RT5: Espaçamento com padding
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Exibição do contador
            Text(
                text = contador.value.toString(),
                fontSize = 72.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            // RT5: Espaçamento com spacedBy
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally)
            ) {
                // RT3: Botões Material 3
                OutlinedButton(onClick = {
                    if (contador.value > 0) {
                        contador.value--
                    }
                }) {
                    Text("−", fontSize = 24.sp)
                }

                FilledTonalButton(onClick = {
                    contador.value++
                }) {
                    Text("+", fontSize = 24.sp)
                }
            }

            // Botão Resetar
            Button(
                onClick = { contador.value = 0 },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Resetar", fontSize = 16.sp)
            }
        }
    }
}

// RT7: Preview funcionando
@Preview(showBackground = true)
@Composable
fun ContadorScreenPreview() {
    ContadorTheme {
        ContadorScreen()
    }
}
