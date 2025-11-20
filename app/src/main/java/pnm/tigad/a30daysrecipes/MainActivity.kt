package pnm.tigad.a30daysrecipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pnm.tigad.a30daysrecipes.ui.theme.A30DaysRecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            A30DaysRecipesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFFFF8DE)
                ) {
                    RecipeApp()
                }
            }
        }
    }
}

@Composable
fun RecipeApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF8DE))
    ) {


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFA239))
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "30 Days Recipes",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Masakan rumahan yang simple dan enak untuk keluarga",
                fontSize = 15.sp,
                color = Color.Black
            )
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
        ) {
            items(foodList) { item ->
                RecipeItem(item)
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }
}

@Composable
fun RecipeItem(food: FoodData) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFE08F), RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {


        Image(
            painter = painterResource(id = food.imageRes),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp)
                .padding(bottom = 10.dp),
            contentScale = ContentScale.Crop
        )

        Text(
            text = food.dayTitle,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = food.description,
            fontSize = 14.sp,
            color = Color.Black
        )
    }
}



data class FoodData(
    val dayTitle: String,
    val description: String,
    val imageRes: Int
)

val foodList = listOf(
    FoodData("Day 1 – Soto Ayam",
        "Soto ayam adalah sup ayam bening dengan koya dan sambal yang segar. Cara memasaknya cukup dengan merebus ayam bersama bumbu sederhana hingga kuah gurih, lalu disajikan dengan suwiran ayam, koya, dan sedikit sambal untuk rasa pedas.",
        R.drawable.day1),

    FoodData("Day 2 – Nasi Goreng Rumahan",
        "Nasi goreng rumahan ini dibuat dari nasi kecap sederhana dengan telur. Cukup tumis bawang, masukkan telur, lalu tambahkan nasi dan kecap hingga tercampur rata dan harum.",
        R.drawable.day2),

    FoodData("Day 3 – Ayam Geprek",
        "Ayam geprek adalah ayam crispy yang digeprek dengan sambal bawang pedas. Caranya, goreng ayam hingga renyah, lalu lumuri sambal bawang yang ditumbuk kasar dan sajikan panas-panas.",
        R.drawable.day3),

    FoodData("Day 4 – Mie Goreng Jawa",
        "Mie goreng Jawa memiliki rasa manis gurih ala rumahan. Tumis bumbu, masukkan mie, beri kecap dan sedikit cabai, lalu aduk hingga meresap dan aromanya keluar.",
        R.drawable.day4),

    FoodData("Day 5 – Tumis Kangkung",
        "Tumis kangkung adalah masakan cepat 5 menit yang sederhana. Kangkung ditumis bersama bawang putih dan cabai hingga layu, menghasilkan aroma wangi dan rasa gurih ringan.",
        R.drawable.day5),

    FoodData("Day 6 – Telur Balado",
        "Telur balado adalah telur rebus yang dimasak dengan sambal merah pedas. Goreng telur sebentar lalu balut dengan bumbu balado hingga meresap.",
        R.drawable.day6),

    FoodData("Day 7 – Sayur Sop",
        "Sayur sop berisi wortel, kentang, kol, dan sosis dalam kuah ringan yang segar. Masak semua sayuran dalam kaldu sederhana hingga empuk dan sajikan hangat.",
        R.drawable.day7),

    FoodData("Day 8 – Tempe Orek",
        "Tempe orek adalah tempe dengan rasa manis pedas gurih. Tumis tempe dengan bumbu kecap dan cabai hingga bumbunya meresap dan sedikit mengering.",
        R.drawable.day8),

    FoodData("Day 9 – Ayam Kecap",
        "Ayam kecap dimasak dengan kecap manis dan bawang bombay. Tumis ayam hingga berubah warna, tambahkan kecap dan sedikit jahe, lalu masak hingga kuah menyusut dan harum.",
        R.drawable.day9),

    FoodData("Day 10 – Capcay",
        "Capcay berisi sayuran campur yang sehat dan mudah dibuat. Tumis sayuran dengan bawang lalu beri sedikit kuah atau kecap sesuai selera sampai matang.",
        R.drawable.day10),

    FoodData("Day 11 – Spaghetti Aglio Olio",
        "Aglio olio adalah spaghetti tumis bawang putih dengan sedikit cabai. Tumis bawang dalam minyak, masukkan spaghetti, aduk rata hingga aromanya wangi.",
        R.drawable.day11),

    FoodData("Day 12 – Perkedel Kentang",
        "Perkedel kentang dibuat dari kentang tumbuk yang digoreng hingga lembut di dalam. Bentuk adonan lalu goreng sampai kecokelatan.",
        R.drawable.day12),

    FoodData("Day 13 – Sambal Goreng Kentang",
        "Sambal goreng kentang adalah kentang dadu yang dimasak dengan sambal merah. Goreng kentang lalu campur dengan bumbu hingga meresap dan sedikit berminyak.",
        R.drawable.day13),

    FoodData("Day 14 – Udang Saus Mentega",
        "Udang saus mentega dibuat dengan menumis udang bersama bawang dan mentega. Tambahkan sedikit kecap untuk rasa gurih manis.",
        R.drawable.day14),

    FoodData("Day 15 – Bakwan Sayur",
        "Bakwan sayur adalah gorengan renyah berisi sayuran. Campur sayur dengan adonan tepung lalu goreng hingga cokelat keemasan.",
        R.drawable.day15),

    FoodData("Day 16 – Omelet Telur",
        "Omelet telur lembut ini berisi sayuran sederhana. Kocok telur, masukkan sayur cincang, lalu masak hingga kedua sisi matang.",
        R.drawable.day16),

    FoodData("Day 17 – Ayam Bakar Madu",
        "Ayam bakar madu dimarinasi dengan kecap dan madu hingga manis gurih. Bakar atau panggang sampai warnanya kecokelatan dan aromanya keluar.",
        R.drawable.day17),

    FoodData("Day 18 – Ayam Teriyaki",
        "Ayam teriyaki dimasak dengan saus teriyaki yang manis gurih. Tumis ayam lalu tambahkan saus hingga mengental dan melapisi ayam dengan baik.",
        R.drawable.day18),

    FoodData("Day 19 – Cah Brokoli",
        "Cah brokoli adalah brokoli tumis bawang putih yang ringan dan segar. Tumis bawang, masukkan brokoli, tambahkan sedikit saus tiram, dan masak cepat.",
        R.drawable.day19),

    FoodData("Day 20 – Tahu Crispy",
        "Tahu crispy adalah tahu renyah berbumbu bawang. Lumuri tahu dengan tepung lalu goreng hingga garing dan kuning keemasan.",
        R.drawable.day20),

    FoodData("Day 21 – Sapo Tahu",
        "Sapo tahu menggunakan tahu sutra yang dimasak dengan kuah kental dan sayuran. Tumis bahan, masukkan tahu, lalu beri sedikit tepung maizena untuk mengentalkan kuah.",
        R.drawable.day21),

    FoodData("Day 22 – Ikan Goreng Krispi",
        "Ikan goreng krispi dibuat dengan melumuri ikan bumbu ringan lalu menggorengnya hingga renyah dan kering.",
        R.drawable.day22),

    FoodData("Day 23 – Ayam Rica-Rica",
        "Ayam rica-rica dimasak dengan sambal rica pedas khas Manado. Tumis bumbu pedas hingga harum lalu masukkan ayam dan masak sampai bumbunya meresap.",
        R.drawable.day23),

    FoodData("Day 24 – Mie Rebus Telur",
        "Mie rebus telur adalah mie kuah simple ala warkop. Rebus mie bersama telur, beri bawang goreng, dan sajikan hangat.",
        R.drawable.day24),

    FoodData("Day 25 – Sate Ayam Teflon",
        "Sate ayam teflon dibuat tanpa arang, hanya dipanggang di teflon. Sajikan dengan bumbu kacang sederhana yang gurih.",
        R.drawable.day25),

    FoodData("Day 26 – Nugget Homemade",
        "Nugget homemade adalah nugget ayam buatan sendiri yang lembut di dalam dan renyah di luar. Bentuk adonan, baluri tepung, lalu goreng hingga cokelat.",
        R.drawable.day26),

    FoodData("Day 27 – Cah Sawi Putih",
        "Cah sawi putih adalah tumisan sawi dengan bawang putih sederhana. Masak cepat hingga sawi layu dan kuah sedikit meresap.",
        R.drawable.day27),

    FoodData("Day 28 – Sambal Terasi",
        "Sambal terasi adalah sambal merah wangi dengan aroma terasi. Ulek cabai dan tomat lalu tumis sebentar agar lebih harum.",
        R.drawable.day28),

    FoodData("Day 29 – Chicken Katsu",
        "Chicken katsu adalah ayam tepung krispi ala Jepang. Lapisi ayam dengan tepung dan telur lalu goreng hingga renyah dan juicy.",
        R.drawable.day29),

    FoodData("Day 30 – Sup Jagung Telur",
        "Sup jagung telur adalah sup ringan dengan jagung manis dan telur serabut. Masak jagung dalam kuah lalu tuang telur sambil diaduk hingga membentuk serabut lembut.",
        R.drawable.day30)
)