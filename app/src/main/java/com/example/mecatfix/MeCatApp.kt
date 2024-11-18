package com.example.mecatfix

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PersonPin
import androidx.compose.material.icons.filled.Photo
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mecatfix.component.BottomBar
import com.example.mecatfix.component.CatsItem
import com.example.mecatfix.data.DummyData
import com.example.mecatfix.data.DummyData.jenisKucing
import com.example.mecatfix.model.Cats
import com.example.mecatfix.navigation_bottomnavItem.Screen.GalleryScreen
import com.example.mecatfix.navigation_bottomnavItem.navigation.NavigationItem
import com.example.mecatfix.navigation_bottomnavItem.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MeCatApp(
    Cats: List<Cats>,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
){
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow (
                contentPadding = PaddingValues(16.dp),
                modifier = modifier
            ){
                items(Cats, key= it.id){
                    Cats(Cats = it)
                    val context = LocalContext.current
                }
            }
        }
    }
        Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Me Cat!")},
            )
        },
        bottomBar = {
            BottomBar(navController)
        },
            modifier = modifier
    ) {
        contentPadding ->
        NavHost(
            navController = navController,
                startDestination = Screen.Home.route,
                modifier = modifier.padding(contentPadding)

        ){
            composable(Screen.Home.route){
                HomeScreen(navController)
            }
            composable(Screen.Detail.route){
                DetailScreen()
            }
            composable(Screen.About.route){
                AboutScreen()
            }
            composable(Screen.Detail.route+"/CatsId",
                arguments = listOf(navArgument("CatsId") {type= NavType.IntType
                })
            ){navBackStackEntry ->
                DetailCatsScreen(navController = navController,
                    CatsId = navBackStackEntry.arguments?.getInt("CatsId"))
            }
        }
    }
}
@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavigationBar (
        modifier = modifier
    ){
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_detail),
                icon = Icons.Default.Photo,
                screen = Screen.Detail
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_about),
                icon = Icons.Default.PersonPin,
                screen = Screen.About
            )
        )
        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route){
                        popUpTo(navController.graph.findStartDestination().id){
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
private fun MeCatAppPreview(){
    MeCatApp(
        Cats = DummyData.jenisKucing
    )
}