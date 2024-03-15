package com.withus.withus_android

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.withus.withus_android.ui.navigation.NavigationMain
import com.withus.withus_android.ui.theme.WithUs_AndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WithUs_AndroidTheme(
                dynamicColor = false,
            ) {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//                    Greeting("Android")
                    NavigationMain()
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colorScheme.surface
    ) {
        Text(text = "Hello $name!")
    }

}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "DefaultPreviewDark",
    showBackground = true

)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "DefaultPreviewLight",
    showBackground = true
)
@Composable
fun DefaultPreview() {
    WithUs_AndroidTheme(dynamicColor = false) {
        Greeting("Test Test")
    }
}