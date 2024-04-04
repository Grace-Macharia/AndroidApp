package com.example.androidprojectone

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidprojectone.ui.theme.AndroidProjectOneTheme

class TopBarActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectOneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   TopBar()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(){

    val context = LocalContext.current.applicationContext

    TopAppBar(title = { Text(text = "iPhone")},
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Home, contentDescription = "Home", tint = Color.White)
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Black,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White
        ),
        actions = {
            IconButton(onClick = {Toast.makeText(context,"You have clicked a search Icon",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search", tint = Color.White)
            }
            IconButton(onClick = {Toast.makeText(context,"You have clicked a share Icon",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Share, contentDescription = "Share", tint = Color.White)
            }
            IconButton(onClick = {Toast.makeText(context,"You have clicked a search Icon",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Search", tint = Color.White)
            }
            IconButton(onClick = {Toast.makeText(context,"You have clicked a shopping cart Icon",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.ShoppingCart, contentDescription = "ShoppingCart", tint = Color.White)

            }
        }
    )
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TopBarPreview(){
    TopBar()
}