package JulioCesar.com.ui.Prestamos

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.compose.material.Icon as Icon


@Composable
fun RegistroPrestamoScreen(navHostController: NavHostController, viewModel: PrestamoViewModel = hiltViewModel()
){
    val context = LocalContext.current
    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "Registro") }) }
    ) {
        Column(modifier = Modifier.padding(8.dp)) {

            OutlinedTextField(
                value = viewModel.deudor,
                onValueChange = {viewModel.deudor = it},
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Deudor")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = null
                    )
                }
            )
            OutlinedTextField(
                value = viewModel.concepto,
                onValueChange = {viewModel.concepto = it},
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Concepto")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = null
                    )
                }
            )

            OutlinedTextField(
                label = { Text("Monto") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null
                    )
                },
                value = viewModel.monto,
                onValueChange = { viewModel.monto = it },
                modifier = Modifier.fillMaxWidth()
            )

            Button(
                onClick = {
                    if (validate(viewModel.monto)){
                        viewModel.Guardar()
                        navHostController.navigateUp()
                    }else{
                        Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 15.dp)
            ) {
                Text("Guardar ")

            }
        }
    }
}

fun validate(number:String): Boolean {
    val validation = number.toDouble()

    if (validation >= 1){
        return true
    }else{
        return false
    }
}

