package com.example.littlelemon20

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.littlelemon20.DishRepository.dishes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LowerPanel(navController: NavHostController?,dishes : List<Dish> = listOf()) {
    Column(
    ) {
        WeeklySpecial()
        LazyColumn{
            itemsIndexed(dishes){ _, dish ->
                MenuDish(navController, dish)

            }
        }
    }
}
@Composable
fun WeeklySpecial(){
    Card (modifier = Modifier.fillMaxWidth()){
        Text(
            text = "Weekly Special",
            modifier = Modifier.padding(start = 10.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp

        )
    }
}
@ExperimentalMaterial3Api
@Composable
fun MenuDish(navController: NavHostController? = null, dish: Dish) {
    Card(

        onClick = {
            Log.d("AAA", "Click ${dish.id}")
            navController?.navigate(DishDetails.route + "/${dish.id}")
        }) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            Column {
                Text(text =  dish.name)
                Text(text =dish.description,
                    modifier = Modifier
                        .fillMaxWidth(0.5F)
                        .padding(top = 5.dp, bottom = 5.dp))
                Text(text = "${dish.price}" )
            }
            Image(painter = painterResource(id =dish.imageResource) , contentDescription = null, Modifier.clip(
                RoundedCornerShape(1.dp)
            ))
        }
    }
    Divider(
        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        thickness = 1.dp,
    )
}
