package JulioCesar.com.utils

sealed class Screen(val route :String) {
    object RegristroScreen: Screen("Registro")
    object ConsultaScreen: Screen ("Consulta")
}