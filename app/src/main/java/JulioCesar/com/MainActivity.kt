package JulioCesar.com

import JulioCesar.com.ui.Prestamos.ConsultaPrestamoScreen
import JulioCesar.com.ui.Prestamos.RegistroPrestamoScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import JulioCesar.com.ui.theme.PrestamoAppTheme
import JulioCesar.com.utils.Screen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrestamoAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyApp()
                }
            }
        }
    }
}
@Composable
fun MyApp() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = Screen.ConsultaScreen.route){
        composable(Screen.ConsultaScreen.route){
            ConsultaPrestamoScreen(navHostController = navHostController)
        }
        composable(Screen.RegristroScreen.route){
            RegistroPrestamoScreen(navHostController = navHostController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PrestamoAppTheme {
        MyApp()
    }
}