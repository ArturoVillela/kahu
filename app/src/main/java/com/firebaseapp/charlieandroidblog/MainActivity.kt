package com.firebaseapp.charlieandroidblog

import Ui
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.firebaseapp.charlieandroidblog.ui.theme.KahuTheme
import com.firebaseapp.charlieandroidblog.utils.UtilContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        UtilContext.initContext(this)
        setContent {
            init()

        }
    }
}

@Composable
fun init(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "screenLogin"){
        composable("screenMain"){Ui().screen1Main(navController)}
        composable("screenInfo"){Ui().screenInfo(navController)}
        composable("screenBreed4me"){Ui().screenBread4me(navController)}
        composable("screenLogin"){Ui().screenLogin(navController)}
        composable("screenBefore"){Ui().screenBefore(navController)}
        composable("screenDoAndDont"){Ui().screenDoDont(navController)}
        composable("screenFoods"){Ui().screenFoods(navController)}
        composable("screenTraining"){Ui().screenTraining(navController)}
    }
}

//TODO Training, ponerlo por tipos.. calm, tricks, socialization... etc.

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KahuTheme {
        Greeting("Android")
    }
}
