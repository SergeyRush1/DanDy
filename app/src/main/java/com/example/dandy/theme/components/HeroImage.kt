import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.dand.UI.theme.DanDTheme
import com.example.dandy.R

@Composable
fun HeroImage(imageSize: Dp,borderColor:Color,onClickImage:(Int)->Unit){
    val bordrt = 4.dp
Box(modifier = Modifier.padding(end = 5.dp)) {


    Image(painter = painterResource(id = R.drawable.hero_example),
        contentDescription = "Hero massages",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(imageSize)
            .border(
                BorderStroke(bordrt, DanDTheme.color.selectedHero), CircleShape
            )
            .padding(4.dp)
            .clip(CircleShape)
            .clickable { onClickImage(7) })

}
}