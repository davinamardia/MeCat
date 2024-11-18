package com.example.mecatfix

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.mecatfix.component.CatsItem
import com.example.mecatfix.data.DummyData
import com.example.mecatfix.data.DummyData.jenisKucing
import com.example.mecatfix.model.Cats
import com.example.mecatfix.navigation_bottomnavItem.navigation.Screen

@Composable
fun HomeScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    jenisKucing: List<Cats> = DummyData.jenisKucing
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                modifier = Modifier
            ) {
                items(Cats, key = { it.id }) {
                    CatsItem(Cats = it) { CatsId ->
                        navController.navigate(Screen.Detail.route)
                    }
                }
            }
        }
        items(Cats, key = { it.id }) {
            CatsItem(Cats = it, modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
}
