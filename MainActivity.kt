package com.example.meuprimeiroapp
import android.R
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meuprimeiroapp.ui.theme.MeuPrimeiroAppTheme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MeuPrimeiroAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    cardProduto("Chimarrao", "Dançar")

                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun linhaChat( modifier: Modifier = Modifier){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .size(height = 100.dp, width = 160.dp)
            .padding(16.dp)
            .border(2.dp, color = Color.Black, shape = RoundedCornerShape(16.dp))
    ) {
        Spacer(Modifier.width(12.dp))
        Box(
            Modifier
                .size(50.dp)

                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFF103A5E))
                .padding(horizontal = 10.dp)
                .border(2.dp, color = Color(0xFF103A5E), shape = RoundedCornerShape(12.dp)),
            contentAlignment = Alignment.Center
        ){
            Text("A", color = Color.White)
        }
        Spacer(Modifier.width(12.dp))

        Column(Modifier.weight(1f)) {
            Text("pinto", fontWeight = FontWeight.Bold)
            Text("funcao", fontSize = 12.sp)
        }
        Text("14:32", modifier.padding(horizontal = 10.dp), color = Color(0xFF2E7D32))
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun cardProduto(nome: String, funcao: String, modifier: Modifier = Modifier){
    Box(Modifier
        .padding(10.dp)
        .fillMaxWidth()) {
        Column(
            Modifier
                .clip(shape = RoundedCornerShape(12.dp))
                .border(5.dp, color = Color.Black, shape = RoundedCornerShape(10.dp))
                .padding(10.dp)
        ) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .border(20.dp, color = Color.Gray, shape = RoundedCornerShape(1.dp))
                    .padding(10.dp)
                    .background(color = Color.Gray),
                contentAlignment = Alignment.Center
            ) {
            }



            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 15.dp),
            ) {
                Text("Fone de Ouvido")
            }



            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("R$ 200", color = Color.Black)
                Button(
                    onClick = {},
                    Modifier
                        .size(width = 150.dp, height = 60.dp)
                        .clip(RectangleShape)
                        .padding(5.dp)
                        .clip(RoundedCornerShape(12.dp)),
                    colors = ButtonColors(
                        containerColor = Color.Blue,
                        contentColor = Color.White,
                        disabledContainerColor = Color.White,
                        disabledContentColor = Color.White
                    ),
                    shape = RectangleShape

                ) {
                    Text("Comprar")
                }
            }
        }
    }

}

@Composable
fun bug(modifier: Modifier = Modifier) {

    // 1
    Row(
        Modifier.fillMaxWidth(),
    ) {
        Text("Total", Modifier.weight(10f))
        Text("42,90", Modifier.weight(1f).background(color = Color.Gray))
        // o weight dividiu a largura da tela proporcionalmente entre os elementos
        // de aordo com seu proprio valor
    }
// 2
   Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Total", )
        Text("42,90", Modifier.background(color = Color.Gray))
        // o weight dividiu a largura da tela proporcionalmente entre os elementos
        // de aordo com seu proprio valor
    }

}

@Preview(showBackground = true)
@Composable
fun cartaoPreview(){
    linhaChat()
}


