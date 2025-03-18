import android.app.Activity
import android.util.Log
import android.widget.Toast
import androidx.compose.animation.core.animateIntOffsetAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.firebaseapp.charlieandroidblog.R
import com.firebaseapp.charlieandroidblog.utils.UtilsUi

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Observer
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.firebaseapp.charlieandroidblog.MainActivity
import com.firebaseapp.charlieandroidblog.utils.UtilContext
import com.firebaseapp.charlieandroidblog.utils.UtilsContent
import com.firebaseapp.charlieandroidblog.vm.VMRecords
import kotlin.math.roundToInt

class Ui {



    @Composable
    fun screen1Main(navController: NavHostController) {
        Column (modifier = Modifier.fillMaxWidth()) {
            getAppBar("Kahu App",navController)
            getLayout()
        }
    }

    @Composable
    fun screenLogin(navController: NavHostController){
        Column (modifier = Modifier.fillMaxWidth()) {
            getAppBar("Kahu App Login", navController)
            getLogin()
        }
    }

    @Composable
    fun screenInfo(controller: NavHostController) {}

    @Composable
    fun screenBread4me(controller: NavHostController) {

        var random = remember { mutableStateOf(1) }
        Column(modifier = Modifier.fillMaxSize()) {
            getAppBar("Breed For Me",controller)
            Column(modifier = Modifier
                .fillMaxSize()
                ) {
                Box(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth() // adjust size as needed
                        .clip(RoundedCornerShape(16.dp)) // adjust corner radius as needed
                        .background(color = UtilsUi.getColorAlmostBlue())
                        .border(
                            1.dp,
                            color = UtilsUi.getColorAlmostBlack(),
                            RoundedCornerShape(16.dp)
                        )
                ) {

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)) {
                        Text(
                            text = UtilsContent.getRandomBreed4meInfo(random.value),
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                            ),
                            modifier = Modifier
                                .weight(10f)
                                .padding(10.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.arrow_next),
                            contentDescription = "Background Image",
                            modifier = Modifier
                                .weight(2f)
                                .padding(10.dp)
                                .clickable
                                {
                                    random.value = (1..10).random()
                                },
                            )
                    }
                }
                val list = UtilsContent.getListOfBreeds()
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(-25.dp)
                ) {
                    items(list.size) {
                        Box (modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                            .clip(RoundedCornerShape(16.dp)) // adjust corner radius as needed
                            .background(color = UtilsUi.getRandomColor())) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp)
                            ) {
                                Text(  //title
                                    text = list.get(it).name,
                                    style = TextStyle(
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White,
                                        fontSize = 18.sp
                                    )
                                )
                                Text(  //title
                                    text = list.get(it).type.toString(),
                                    style = TextStyle(
                                        color = Color.White,
                                        fontSize = 14.sp
                                    )
                                )
                                Text(  //title
                                    text = list.get(it).exerciseNeeds,
                                    style = TextStyle(
                                        color = Color.White,
                                        fontSize = 14.sp
                                    )
                                )
                                Text(  //title
                                    text = list.get(it).whoShouldOwn,
                                    style = TextStyle(
                                        color = Color.White,
                                        fontSize = 13.sp
                                    )
                                )
                            }
                        }

                    }

                }
            }
        }
    }

    @Composable
    fun screenBefore(controller: NavHostController) {

        Column(modifier = Modifier.fillMaxSize()) {
            getAppBar("Before The Dog", controller)

            val listTuple = UtilsContent.getListOfBeforeGettingADog()
            LazyColumn {
                items(listTuple.size) {
                    Box(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth() // adjust size as needed
                            .clip(RoundedCornerShape(16.dp)) // adjust corner radius as needed
                            .background(color = UtilsUi.getRandomColor())
                            .border(
                                1.dp,
                                color = UtilsUi.getColorAlmostBlack(),
                                RoundedCornerShape(16.dp)
                            )
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            val title = " º " + listTuple.get(it).first
                            val subTitle = "  " + listTuple.get(it).second
                            Text(
                                text = title,
                                style = TextStyle(
                                    color = Color.White,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            )
                            Spacer(modifier = Modifier
                                .fillMaxWidth()
                                .height(4.dp))
                            Text(
                                text = subTitle,
                                style = TextStyle(
                                    color = Color.White,
                                    fontSize = 12.sp,
                                )
                            )
                        }
                    }
                }

            }
        }
    }

    @Composable
    fun screenFoods(controller: NavHostController){
        Column(modifier = Modifier.fillMaxSize()) {
            //getAppBar("Do & Don't", controller)
            val listTuple = UtilsContent.getListFoods()
            val indexStartSecondArray = listTuple.get(0).size
            val arrayList = arrayListOf<String>().apply {
                addAll(listTuple.get(0))
                addAll(listTuple.get(1))
            }
            LazyColumn (modifier = Modifier.padding(1.dp)
                .background(color = UtilsUi.getColorAlmostWhite2())
                ,verticalArrangement = Arrangement.SpaceEvenly
            ){
                items(arrayList.size) { index ->
                    when(index){
                        0,indexStartSecondArray-> {
                            Column (Modifier.padding(0.dp, 5.dp)){
                                //val color = if (index == 0) Color(0xFF1553AB) else Color(0xFF70000A)
                                Box(
                                    modifier = Modifier.fillMaxWidth()
                                        .background(color = Color(0xFF1553AB))
                                        .padding(10.dp)
                                        .height(25.dp)
                                ) {
                                    Text(
                                        UtilsContent.getTitleFoodByIndex(index),
                                        style = TextStyle(
                                            color = Color.White,
                                            fontSize = 22.sp,
                                            fontWeight = FontWeight.Bold,
                                        )
                                    )
                                }
                            }
                        }
                    }
                    Box(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth() // adjust size as needed
                            .clip(RoundedCornerShape(16.dp)) // adjust corner radius as needed
                            .background(color = UtilsUi.getGoodOrBadColor(index,indexStartSecondArray))
                            .border(
                                1.dp,
                                color = UtilsUi.getColorAlmostBlack(),
                                RoundedCornerShape(16.dp)
                            )
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            val title = " >> " + arrayList.get(index)
                            Text(
                                text = title,
                                style = TextStyle(
                                    color = Color.White,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            )
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun screenDoDont(controller: NavHostController){
        Column(modifier = Modifier.fillMaxSize()) {
            //getAppBar("Do & Don't", controller)
            val listTuple = UtilsContent.getListOfDoAndDont()
            LazyColumn {
                items(listTuple.size) { index ->
                     when(index){
                         0,5-> {
                             Column {
                                 Box(
                                     modifier = Modifier.fillMaxWidth()
                                         .background(color = UtilsUi.getRandomColor())
                                         .padding(10.dp)
                                         .height(25.dp)
                                 ) {
                                     Text(
                                         UtilsContent.getSubtitleByIndex(index),
                                         style = TextStyle(
                                             color = Color.White,
                                             fontSize = 22.sp,
                                             fontWeight = FontWeight.Bold,
                                         )
                                     )
                                 }

                             }
                         }
                     }
                    Box(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth() // adjust size as needed
                            .clip(RoundedCornerShape(16.dp)) // adjust corner radius as needed
                            .background(color = UtilsUi.getRandomColor())
                            .border(
                                1.dp,
                                color = UtilsUi.getColorAlmostBlack(),
                                RoundedCornerShape(16.dp)
                            )
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            val title = " º " + listTuple.get(index).first
                            val subTitle = "  " + listTuple.get(index).second
                            Text(
                                text = title,
                                style = TextStyle(
                                    color = Color.White,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            )
                            Spacer(modifier = Modifier
                                .fillMaxWidth()
                                .height(4.dp))
                            Text(
                                text = subTitle,
                                style = TextStyle(
                                    color = Color.White,
                                    fontSize = 12.sp,
                                )
                            )
                        }
                    }


                }
            }
        }
    }

    @Composable
    fun screenTraining(controller: NavHostController){
        Column (modifier = Modifier.fillMaxWidth()) {
            getAppBar("Training", controller)
            getTraining()
        }
    }

    @Composable
    fun screenRecord(controller: NavHostController){
        Column (modifier = Modifier.fillMaxWidth()) {
            getAppBar("Health Records", controller)
            getRecords()
        }
    }

    @Composable
    fun getRecords() {
        val std_height = 50.dp
        var record = remember { mutableStateOf("") }
        var list = ArrayList<String>()
        var vm:VMRecords = viewModel()
        vm.listRecords.observe(UtilContext.getContext() as MainActivity, Observer {
            vm.listRecords.value?.let{
                list = it
            }
        })

        Column(modifier = Modifier.fillMaxSize().padding(5.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth()
                    .height(52.dp)
                    .padding(1.dp)
                    .background(color = Color.Gray)
            ) {
                Box(
                    modifier = Modifier.weight(2f)
                        .height(std_height)
                        .background(color = Color.Blue)
                ) {}
                TextField(
                    value = record.value,
                    onValueChange = {
                        record.value = it
                    },
                    label = { Text(text = "record") }, // hint, texto inicial k desaparece o se pone como titulo arriba en letras chikitas
                    placeholder = { Text(text = "record") } //texto k aparece cuando empiezas a escribir
                )
                Button(
                    onClick = {
                        Log.d("zzz", "add element: ")
                    },
                    modifier = Modifier.weight(3f),
                    colors = ButtonDefaults.buttonColors(containerColor = UtilsUi.getColorBlue1())
                ) {
                    Text("Add", color = Color.White)
                }
            }
            Spacer(modifier = Modifier.height(5.dp))
            LazyColumn (modifier = Modifier.fillMaxSize().padding(10.dp)){
                items(list.size) {
                    Text(">> "+list.get(it))
                }
            }
        }

    }

    @Composable
    fun getTraining(){
        val listTraining = UtilsContent.getListTraining()
        val type = listTraining.get(0).type
        LazyColumn{
            items(listTraining.size) {
                Box (modifier = Modifier.fillMaxWidth().padding(10.dp)){
                    Column(
                        modifier = Modifier
                            .fillMaxWidth() // adjust size as needed
                            .clip(RoundedCornerShape(16.dp)) // adjust corner radius as needed
                            .background(color = UtilsUi.getRandomColor())
                            .padding(10.dp)

                    ) {
                            Text(
                                text = listTraining.get(it).title,
                                style = TextStyle(
                                    color = Color.White,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            )
                            Spacer(modifier = Modifier
                                .fillMaxWidth()
                                .height(4.dp))
                            Text(
                                text = listTraining.get(it).subTitle,
                                style = TextStyle(
                                    color = Color.White,
                                    fontSize = 12.sp,
                                )
                            )

                    }
                }

            }
        }
    }

    //region Login Screen
    @Composable
    fun getLogin() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(50.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.login),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(5f)
                    .clip(RoundedCornerShape(15))
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(9f)
                    .padding(10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(12f)
                        .clip(RoundedCornerShape(10.dp))
                        .background(color = UtilsUi.getColorAlmostWhite())
                ) {
                    getLoginType()
                }
            }
        }
    }

    @Composable
    fun getLoginType() {
        var inLogged = remember { mutableStateOf(false) }
        val pxToMove = with(LocalDensity.current) { 140.dp.toPx().roundToInt() }
        val offset by animateIntOffsetAsState(
            targetValue = if (inLogged.value) IntOffset(pxToMove, 0)
            else IntOffset.Zero
        )
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier
                .offset { offset }
                .clip(RoundedCornerShape(10.dp))
                .background(brush = UtilsUi.getBrushGradient())
                .width(125.dp)
                .padding(10.dp)
                .height(30.dp)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null
                ) {
                    inLogged.value = !inLogged.value
                }
            ) {
                var text = if (!inLogged.value) "Login" else "Sign In"
                Text(
                    text,
                    color = Color.White, // Set text color to white
                    fontSize = 22.sp, // Optional: set font size
                    fontWeight = FontWeight.Bold, modifier = Modifier.align(Alignment.Center)
                )
            }
            if (!inLogged.value)
                getLoginElements()
            else
                getSignUpElements()
        }
    }

    @Composable
    fun getLoginElements() {
        var name = remember { mutableStateOf("") }
        var password = remember { mutableStateOf("") }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            TextField(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                value = name.value,
                onValueChange = {
                    name.value = it
                },
                label = { Text(text = "E - mail") },
                placeholder = { Text(text = "E-mail") }
            )
            TextField(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                value = name.value,
                onValueChange = {
                    name.value = it
                },
                label = { Text(text = "Password") },
                placeholder = { Text(text = "Password.") }
            )

            Button(
                onClick = {
                    Log.d("zzz", "getLoginElements: ")
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = UtilsUi.getColorBlue1())
            ) {
                Text("Login", color = Color.White)
            }
            Button(
                onClick = {
                    Log.d("zzz", "getLoginElements: ")
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = UtilsUi.getColorBlue1())
            ) {
                Text("Enter No Login", color = Color.White)
            }


        }
    }

    @Composable
    fun getSignUpElements() {
        var name = remember { mutableStateOf("") }
        var password = remember { mutableStateOf("") }
        var rPassword = remember { mutableStateOf("") }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            TextField(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                value = name.value,
                onValueChange = {
                    name.value = it
                },
                label = { Text(text = "E - mail") },
                placeholder = { Text(text = "E-mail") }
            )
            TextField(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                value = password.value,
                onValueChange = {
                    password.value = it
                },
                label = { Text(text = "Password") },
                placeholder = { Text(text = "Password.") }
            )
            TextField(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                value = rPassword.value,
                onValueChange = {
                    rPassword.value = it
                },
                label = { Text(text = "Repeat Password") },
                placeholder = { Text(text = "Repeat Password.") }
            )
            Row(horizontalArrangement = Arrangement.spacedBy(15.dp)) {
                Button(
                    onClick = {
                        Log.d("zzz", "sign-up: ")
                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = UtilsUi.getColorBlue1())
                ) {
                    Text("Sign Up", color = Color.White)
                }
            }
        }
    }
    //endregion

    //region main ui
    @Composable
    fun getLayout() {
        val paddingCol = 20.dp
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingCol)
        ) {
            for (r in 1..4) {
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
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .clickable(onClick = {
                            Toast
                                .makeText(
                                    UtilContext.getContext(),
                                    "index: $indexUpdated",
                                    Toast.LENGTH_SHORT
                                )
                                .show()
                        })) {
                        val pair = UtilsUi.getResIdImageForLayout(indexUpdated)

                        Image(
                            painter = painterResource(pair.first),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(5f)
                                .clip(RoundedCornerShape(15))
                        )
                        Text(
                            pair.second,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(15.dp)
                        )
                    }
                }
            }
        }

    }
    //endregion

    //region Appbar
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun getAppBar(titleAppBar: String, navController: NavHostController) {
        TopAppBar(
            title = {
                Text(titleAppBar, maxLines = 1)
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
                    navController.navigate("screenInfo")
                }) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "testing123"
                    )
                }
            }
        )
    }




    //endregion

}