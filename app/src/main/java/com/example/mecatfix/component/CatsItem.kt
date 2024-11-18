package com.example.mecatfix.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mecatfix.R
import com.example.mecatfix.model.Cats
import com.example.mecatfix.ui.theme.MeCatFIXTheme

@Composable
fun CatsItem(
    Cats: Cats,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
){
    Row (
        horizontalArrangement = Arrangement.Start,
        modifier = modifier
            .fillMaxSize()
            .clickable {
                onItemClicked(Cats.id)
            }
    ){
        Image(
            painter = painterResource(id = Cats.photo),
            contentDescription = Cats.jenis,
            modifier = Modifier.clip(CircleShape).size(80.dp)
        )
        Text(
            text = Cats.jenis,
            modifier = Modifier.padding(start = 16.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column{
            Text(
                text = Cats.jenis,
                style = MaterialTheme.typography.titleMedium,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.width(170.dp),
                maxLines = 1
            )
        }
    }
}
@Preview(showSystemUi = true)
@Composable
private fun CatsHorizontalPreview(){
    MeCatFIXTheme {
        CatsItem(
            Cats = Cats(id = 1, jenis = "Bengal", ciri_khas = "\"Bercorak seperti macan tutul dan tubuh atletis.\"", deskripsi = "Jenis kucing yang energik, cerdas, dan penuh rasa ingin tahu, cocok untuk pemilik yang aktif.", R.drawable.bengal),
            onItemClicked = {CatsId ->
                println("CatsId: $CatsId")
            }
        )
    }
}
