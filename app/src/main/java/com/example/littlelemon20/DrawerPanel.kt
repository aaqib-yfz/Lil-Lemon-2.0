package com.example.littlelemon20

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DrawerPanel(){
    Column {
        IconButton(
            onClick = { /*TODO*/ }
        ) {
            Icon(imageVector = Icons.Default.ExitToApp, contentDescription = null )
        }
    }
}

@Preview(showBackground = true )
@Composable
fun DrawerPanelPreview(){
    DrawerPanel()
}