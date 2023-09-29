package com.example.littlelemon20

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon20.ui.theme.CustomGreen
import com.example.littlelemon20.ui.theme.CustomYellow

@Composable
fun UpperPanel() {
    Column {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(CustomGreen)
                .padding(10.dp)
        ) {
            Text(
                text = stringResource(id = R.string.title),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = CustomYellow
            )
            Text(
                text = stringResource(id = R.string.location),
                fontSize = 38.sp,
                color = Color.White
            )
            Box(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = stringResource(id = R.string.description),
                    fontSize = 15.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                )
                Image(
                    painter = painterResource(id = R.drawable.upperpanelimage),
                    contentDescription = null,
                    modifier = Modifier
                        .size(150.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .align(Alignment.TopEnd)
                        .padding(end = 10.dp)
                )
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(CustomYellow),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.orderbuttontext),
                    color = Color.Black,
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun UpperPanelPreview(){
    UpperPanel()
}