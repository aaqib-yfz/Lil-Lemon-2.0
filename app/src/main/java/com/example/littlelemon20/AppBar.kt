package com.example.littlelemon20

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@ExperimentalMaterial3Api
@Composable
fun AppBar(drawerState: DrawerState? = null, scope:CoroutineScope?  = null ){
    Box(modifier = Modifier
        .fillMaxWidth()
    ){
        IconButton(
            onClick = {
                      scope?.launch { drawerState?.open() }
            },
            modifier = Modifier.align(Alignment.TopStart)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_hamburger_menu),
                contentDescription = null
            )
        }

        Image(
            painter = painterResource(id = R.drawable.littlelemonimgtxt_nobg),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .align(Alignment.Center)
        )

        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.align(Alignment.TopEnd)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_basket),
                contentDescription = null
            )
        }

    }
}

