package com.example.mecatfix.navigation_bottomnavItem.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mecatfix.data.DummyData
import com.example.mecatfix.ui.theme.MeCatFIXTheme

@Composable
fun GalleryScreen(
    galleries: List<Gallery>,
    modifier: Modifier=Modifier,
    galleries: List<Gallery> = DummyData.jenisKucing
){
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(160.dp),
        verticalItemSpacing = 4.dp,
        modifier = Modifier.fillMaxSize()
    ) {
        items(galleries, key = {it.id}){
            Image(
                painter = painterResource(id=it.photo),
                contentDescription = it.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
        }
    }
}
@Preview(showSystemUi = true)
@Composable
private fun GalleryScreenPreview(){
    MeCatFIXTheme {
        GalleryScreen(galleries = DummyData.jenisKucing)
    }
}