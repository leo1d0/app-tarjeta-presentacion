package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TarjetaPresentacion()
        }
    }
}

@Composable
fun TarjetaPresentacion() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0D1B2A))
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // PARTE PRINCIPAL
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Símbolo de programación
            Text(
                text = "</>",
                color = Color(0xFF5BC0EB),
                fontSize = 65.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(25.dp))

            // Nombre
            Text(
                text = "LEONARDO ORTIZ",
                color = Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Carrera
            Text(
                text = "Estudiante de Ingeniería de Software",
                color = Color(0xFF5BC0EB),
                fontSize = 17.sp,
                textAlign = TextAlign.Center
            )

            // Descripción
            Text(
                text = "Desarrollador en formación",
                color = Color.LightGray,
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 6.dp)
            )
        }

        // INFORMACIÓN DE CONTACTO
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 35.dp)
        ) {

            InformacionContacto(
                icono = ImageVector.vectorResource(R.drawable.ic_phone),
                descripcion = "Teléfono",
                texto = "0963978770"
            )

            InformacionContacto(
                icono = ImageVector.vectorResource(R.drawable.ic_email),
                descripcion = "Correo electrónico",
                texto = "xleo1d0@gmail.com"
            )

            InformacionContacto(
                icono = ImageVector.vectorResource(R.drawable.ic_location),
                descripcion = "Ubicación",
                texto = "Manta, Ecuador"
            )

            InformacionGitHub(
                texto = "github.com/leo1d0"
            )
        }
    }
}

@Composable
fun InformacionContacto(
    icono: ImageVector,
    descripcion: String,
    texto: String
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            imageVector = icono,
            contentDescription = descripcion,
            tint = Color(0xFF5BC0EB),
            modifier = Modifier.size(24.dp)
        )

        Text(
            text = texto,
            color = Color.White,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 20.dp)
        )
    }
}

@Composable
fun InformacionGitHub(
    texto: String
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = "GH",
            color = Color(0xFF5BC0EB),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.size(
                width = 24.dp,
                height = 24.dp
            )
        )

        Text(
            text = texto,
            color = Color.White,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 20.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaPreview() {
    TarjetaPresentacion()
}