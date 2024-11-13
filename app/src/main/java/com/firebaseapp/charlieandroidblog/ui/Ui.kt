import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.firebaseapp.charlieandroidblog.R
import com.firebaseapp.charlieandroidblog.utils.UtilsUi

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

class Ui {


    @Composable
    fun mainScreen() {
        Column() {
            //getAppBar()
            //getLayout()
            getLogin()
        }
    }

    @Composable
    fun getLogin(){
        Column (modifier = Modifier.fillMaxSize()
            .padding(50.dp)){
            Image(
                painter = painterResource(R.drawable.login),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(5f)
                    .clip(RoundedCornerShape(15))
            )
            Column (modifier = Modifier.fillMaxWidth().weight(9f).padding(10.dp)) {
                Box (modifier = Modifier.fillMaxWidth()
                    .weight(10f)
                    //.background(color = UtilsUi.getColorBlue3())
                    ){
                    getLoginInfo()
                }
                Spacer(modifier = Modifier.weight(2f))
            }
        }
    }

    @Composable
    fun getLoginInfo() {
        // State for storing the entered values for name and password
        var name by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        // Layout: Column to align elements vertically
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp), // Padding around the content
            verticalArrangement = Arrangement.spacedBy(16.dp) // Spacing between elements
        ) {
            // Name TextField
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                label = { Text("Name") },
                modifier = Modifier.fillMaxWidth()
            )

            // Password TextField
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                visualTransformation = PasswordVisualTransformation(), // Hide password characters
                modifier = Modifier.fillMaxWidth()
            )

            // Login Button
            Button(
                onClick = {
                    // Handle login action here
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = CircleShape, // Rounded button
                colors = ButtonDefaults.buttonColors(Color.Blue) // Blue color
            ) {
                Text("Login", color = Color.White)
            }
        }
    }




    //region main ui
    @Composable
    fun getLayout() {
        val paddingCol = 20.dp
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingCol)) {
            for (r in 1..3) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    getColumn(r)
                }
            }
        }
    }

    @Composable
    fun getColumn(cont: Int) {
        Row(modifier = Modifier.fillMaxWidth()) {
            var indice = 2 * cont
            for (c in 1..2) {
                var indexUpdated = (indice + c) - 2
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .weight(1f)
                        .fillMaxHeight()
                        .background(color = UtilsUi.getColor4Layot(indexUpdated))
                ) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        val pair = UtilsUi.getResIdImageForLayout(indexUpdated)
                        Image(
                            painter = painterResource(pair.first),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(5f)
                                .clip(RoundedCornerShape(15))
                        )
                        Text(pair.second,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier.fillMaxWidth().padding(15.dp)
                        )
                    }
                }
            }
        }

    }
    //endregion

    //region appbar
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun getAppBar() {
        TopAppBar(
            title = {
                Text("Kahu App", maxLines = 1)
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = UtilsUi.getColorBlue1(),
                titleContentColor = UtilsUi.getColorWhite1(),
                navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
                actionIconContentColor = UtilsUi.getColorBlue3()
            ),
            navigationIcon = {
                IconButton(onClick = {
                    Log.d("zzz", "menu button clicked in composables")
                    // appViewModel.btnShowMenuClicked()
                }) {

                }
            }
        )
    }
    //endregion


}