//package com.example.littlelemon20
//
//import androidx.compose.material3.Icon
//import androidx.compose.material3.NavigationBar
//import androidx.compose.material3.NavigationBarItem
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.saveable.rememberSaveable
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.navigation.NavController
//
//@Composable
//fun BottomBar( navController: NavController){
//    val destinationslist = listOf<Destinations>(
//        HomeScreen,
//        MenuScreen
//    )
//    val selectedIndex =  rememberSaveable {
//        mutableStateOf(0)
//    }
//
//    NavigationBar {
//        destinationslist.forEachIndexed { index, destinations ->
//            NavigationBarItem(
//                label = { Text(text = destinations.title)},
//                selected =  index == selectedIndex.value ,
//                onClick = {
//                          selectedIndex.value = index
//                    navController.navigate(destinationslist[index].route) {
//                        popUpTo(HomeScreen.route)
//                        launchSingleTop = true
//                    }
//                          },
//                icon = {
//                        Icon(
//                            painterResource(id = destinations.icon),
//                            contentDescription = destinations.title)
//                })
//        }
//    }
//
//}
