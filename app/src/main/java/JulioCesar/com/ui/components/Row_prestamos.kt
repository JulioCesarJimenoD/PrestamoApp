package JulioCesar.com.ui.components

import JulioCesar.com.model.Prestamo
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RowPrestamo(prestamo: Prestamo){
    Column(modifier = Modifier.fillMaxWidth()
    ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(30.dp)
            .padding(2.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = prestamo.deudor)
            Text(text = prestamo.monto.toString(),
                style = MaterialTheme.typography.h5
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Text(text = prestamo.concepto,
                style = MaterialTheme.typography.caption
            )
        }
    }
}