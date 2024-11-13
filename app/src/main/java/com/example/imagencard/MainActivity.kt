package com.example.imagencard

import android.icu.text.ListFormatter.Width
import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.example.imagencard.ui.theme.ImagenCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImagenCardTheme{
                Surface {
                    Modifier .fillMaxSize()
                    MaterialTheme.colorScheme.background
                   FilledCardExample()
                }

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun FilledCardExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(title = { Text(stringResource(R.string.main_title)) } )
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp) // Espacio entre tarjetas
        ) {
            item {
                ElevatedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Black
                    ),
                    modifier = Modifier.size(width = 600.dp, height = 400.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Favorite,
                            contentDescription = "Favorite Icon",
                            tint = Color.White,
                            modifier = Modifier.size(25.dp)
                        )
                        Spacer(modifier = Modifier.width(1.dp))


                        Text(
                            text = "Nirvana: IN UTERO",
                            modifier = Modifier.padding(16.dp),
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )

                        AsyncImage(
                            model = "https://i.scdn.co/image/ab67616d0000b273c4f52ef8782f0e8ede4c1aaf",
                            contentDescription = null,
                            /*contentScale = ContentScale.Inside,
                            modifier = Modifier.fillMaxWidth()*/
                        )

                        Text(
                            text = "In Utero es el tercer y último álbum de estudio de la banda estadounidense de grunge Nirvana, lanzado en septiembre de 1993 por DGC Records.",
                            modifier = Modifier.padding(16.dp),
                            color = Color.White,
                            textAlign = TextAlign.Left
                        )
                    }
                }
            }

            item {
                ElevatedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Black
                    ),
                    modifier = Modifier.size(width = 600.dp, height = 400.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Nirvana: BLEACH",
                            modifier = Modifier.padding(16.dp),
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )
                        Image(
                            painter = painterResource(R.drawable.xd3),
                            contentDescription = "Card 2"
                        )

                        Text(
                            text = "Bleach es el álbum de estudio debut de la banda de rock estadounidense Nirvana, lanzado el 15 de junio de 1989 por Sub Pop.",
                            modifier = Modifier.padding(16.dp),
                            color = Color.White,
                            textAlign = TextAlign.Left
                        )
                    }
                }
            }

            item {
                ElevatedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Black
                    ),
                    modifier = Modifier.size(width = 600.dp, height = 400.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        Text(
                            text = "Nirvina: NEVERMIND",
                            modifier = Modifier.padding(16.dp),
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )
                        AsyncImage(
                            model = "https://i.scdn.co/image/ab67616d0000b273e175a19e530c898d167d39bf",
                            contentDescription = null,
                        )
                    }
                }
            }
        }
    }
}

