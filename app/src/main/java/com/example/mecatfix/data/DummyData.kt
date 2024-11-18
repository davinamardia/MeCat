package com.example.mecatfix.data

import com.example.mecatfix.R
import com.example.mecatfix.model.Cats

object DummyData {
    val jenisKucing = listOf(
        Cats(
            id = 1,
            jenis = "Bengal",
            ciri_khas = "Bercorak seperti macan tutul dan tubuh atletis.",
            deskripsi = "Jenis kucing yang energik, cerdas, dan penuh rasa ingin tahu, cocok untuk pemilik yang aktif.",
            photo = R.drawable.bengal
        ),
        Cats(
            id = 2,
            jenis = "British Short Hair",
            ciri_khas = "Bertubuh kekar dan bulu lembut",
            deskripsi = "kucing yang tenang, cerdas, dan penuh pesona, menjadikannya teman ideal yang setia namun mandiri.",
            photo = R.drawable.britishshorthair
        ),
        Cats(
            id = 3,
            jenis = "Maine Coon",
            ciri_khas = "Kucing besar dengan bulu panjang dan ekor berbulu lebat.",
            deskripsi = "Dikenal ramah, cerdas, dan suka berinteraksi, menjadikannya teman keluarga yang sempurna.",
            photo = R.drawable.mainecoon
        ),
        Cats(
            id = 4,
            jenis = "Munchkin",
            ciri_khas = "Memiliki tubuh kecil dan kaki pendek",
            deskripsi = "Sifat ceria, aktif, dan penuh rasa ingin tahu, membuatnya sangat menggemaskan dan menyenangkan sebagai teman.",
            photo = R.drawable.munchkin
        ),
        Cats(
            id = 5,
            jenis = "Norwegian Forest",
            ciri_khas = "Dengan bulu tebal dan ekor lebat.",
            deskripsi = "Kucing yang tangguh, cerdas, dan mandiri, serta sangat menyukai petualangan di luar ruangan.",
            photo = R.drawable.norwegianforest
        ),
        Cats(
            id = 6,
            jenis = "Persian",
            ciri_khas = "Wajah bulat dan bulu panjang yang lebat.",
            deskripsi = "Memiliki sifat tenang, penyayang, dan suka beristirahat, menjadikannya teman rumah yang elegan",
            photo = R.drawable.persian
        ),
        Cats(
            id = 7,
            jenis = "Scottish Fold",
            ciri_khas = "Kucing dengan telinga terlipat ke depan dan ke bawah.",
            deskripsi = "Kucing jenis ini dikenal karena penampilannya yang menggemaskan dan sifatnya yang ramah.",
            photo = R.drawable.scottishfold
        ),
        Cats(
            id = 8,
            jenis = "Siamese",
            ciri_khas = "ras kucing yang warna gelap di bagian telinga, wajah, kaki, dan ekor.",
            deskripsi = "Jenis kucing yang cerdas, vokal, sosial, dan setia, sangat terikat pada pemiliknya dan suka berinteraksi.",
            photo = R.drawable.siamese
        ),
        Cats(
            id = 9,
            jenis = "Sphynx",
            ciri_khas = "Kucing tanpa bulu dengan kulit keriput dan tubuh ramping yang terlihat elegan.",
            deskripsi = "Mereka dikenal sebagai kucing yang sangat ramah, aktif, dan suka perhatian",
            photo = R.drawable.sphynx
        ),
        Cats(
            id = 10,
            jenis = "Tabby",
            ciri_khas = "Memiliki pola garis-garis, berbentuk \"M\" di dahi, dengan warna bulu yang bervariasi",
            deskripsi = "Sifatnya cenderung ramah, penyayang, dan mudah beradaptasi dengan lingkungan sekitar.",
            photo = R.drawable.tabby
        )
    )
    val profilKucing = listOf(
        profileCats(
            id = 1,
            jenis = "Bengal",
            photo = R.drawable.bengal
        ),
        profileCats(
            id = 2,
            jenis = "British Short Hari",
            photo = R.drawable.britishshorthair
        ),
        profileCats(
            id = 3,
            jenis = "Maine Coon",
            photo = R.drawable.mainecoon
        ),
        profileCats(
            id = 4,
            jenis = "Munchkin",
            photo = R.drawable.munchkin
        ),
        profileCats(
            id = 5,
            jenis = "Norwegian Forest",
            photo = R.drawable.norwegianforest
        ),
        profileCats(
            id = 6,
            jenis = "Persian",
            photo = R.drawable.persian
        ),
        profileCats(
            id = 7,
            jenis = "Scottish Fold",
            photo = R.drawable.scottishfold
        ),
        profileCats(
            id = 8,
            jenis = "Siamese",
            photo = R.drawable.siamese
        ),
        profileCats(
            id = 9,
            jenis = "Sphynx",
            photo = R.drawable.sphynx
        ),
        profileCats(
            id = 10,
            jenis = "Tabby",
            photo = R.drawable.tabby
        )
    )
}