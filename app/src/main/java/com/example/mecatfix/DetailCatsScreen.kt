package com.example.mecatfix

import android.adservices.adid.AdId
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.mecatfix.data.DummyData
import com.example.mecatfix.model.Cats

@Composable
fun DetailCatsScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    CatsId: Int?
){
    val newCatsList = DummyData.jenisKucing.filter { Cats ->
        Cats.id== CatsId
    }
    Column(
        modifier = Modifier
    ){
        DetailCatsContent(newCatsList = newCatsList)
    }
}
@Composable
private fun DetailCatsContent(
    newCatsList: List<Cats>,
    modifier: Modifier = Modifier
){
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(16.dp)
    ){
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
            .data(data = newCatsList[0].photo)
            .build(),
        contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height = 250.dp, width = 170.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "Cats Image"
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier= Modifier.padding(4.dp)){
            Text(
                text = newCatsList[0].jenis,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "(${newCatsList[0].ciri_khas}",
                style = MaterialTheme.typography.titleSmall
            )
            Text(
                text = "deskripsi: ${newCatsList[0].deskripsi}",
                style = MaterialTheme.typography.titleSmall
            )
        }
    }
}
@Preview(showSystemUi = true)
@Composable
private fun DetailCatsScreenPreview(){
    DetailCatsContent(newCatsList = DummyData.jenisKucing)
}