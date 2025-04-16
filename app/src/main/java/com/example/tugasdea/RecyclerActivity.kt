package com.example.tugasdea

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasdea.DetailActivity

class RecyclerActivity : AppCompatActivity() {
    private lateinit var bonekaRecyclerView: RecyclerView
    private lateinit var bonekaAdapter: MyAdapter
    private lateinit var listBoneka: ArrayList<ItemData>

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bonekaRecyclerView = findViewById(R.id.bonekaRV)
        listBoneka = ArrayList()

            listBoneka.add(ItemData(R.drawable.image1, "Boneka Racconn", "Rp. 85.000",
                "Boneka Raccoon adalah boneka berbentuk hewan rakun yang menggemaskan, dikenal dengan ciri khas wajahnya yang seperti memakai topeng dan ekor bergaris-garis. \n" +
                        "Boneka ini biasanya dibuat dari bahan lembut seperti velboa atau katun premium, memberikan sentuhan halus dan nyaman saat dipeluk. \n" +
                        "Dengan warna abu-abu khas rakun, lengkap dengan mata bulat besar dan ekspresi lucu, boneka ini sangat cocok dijadikan teman tidur, hadiah, atau koleksi pribadi. Ukurannya beragam, mulai dari kecil hingga jumbo, menjadikannya fleksibel untuk segala usia."))

            listBoneka.add(ItemData(R.drawable.image2, "Boneka Teddy Bear", "Rp. 80.000 ",
                "Boneka Teddy Bear adalah boneka beruang klasik yang dikenal karena bentuknya yang menggemaskan dan kesan hangat yang ditawarkan. \n" +
                        "Terbuat dari bahan lembut seperti velboa atau katun premium, boneka ini empuk dan nyaman dipeluk.\n" +
                        "Dengan warna-warna hangat seperti cokelat, krem, atau pastel, serta wajah manis dengan mata bulat dan hidung mungil, Teddy Bear cocok dijadikan teman tidur, hadiah spesial, atau koleksi pribadi.\n" +
                        "Desainnya yang timeless menjadikannya simbol kasih sayang dan kenyamanan bagi semua usia.\n" +
                        "\n"))

            listBoneka.add(ItemData(R.drawable.image3, "Boneka Ddung", "Rp. 105.000",
                "Boneka Ddung adalah boneka imut asal Korea Selatan yang terkenal dengan wajah mungil, mata besar berkilau, dan pipi merona.\n" +
                        "Ciri khasnya adalah rambut panjang yang tebal dan pakaian lucu bergaya ala gadis kecil. \n" +
                        "Terbuat dari bahan berkualitas tinggi, baik untuk rambut sintetis maupun bajunya yang detail dan halus, boneka Ddung cocok untuk koleksi, hadiah, maupun pajangan. \n" +
                        "Dengan berbagai tema kostum dan ekspresi menggemaskan, Ddung menjadi favorit para kolektor dan pecinta boneka di berbagai usia."))

            listBoneka.add(ItemData(R.drawable.image4, "Boneka Reversible Octopus Plushie", "Rp. 100.000 ",
                "Boneka Reversible Octopus Plushie adalah boneka gurita dua sisi yang lucu dan unik, bisa dibalik untuk menunjukkan dua ekspresi berbeda—biasanya satu sisi tersenyum ceria, dan sisi lainnya cemberut atau sedih. \n" +
                        "Terbuat dari bahan plush yang super lembut dan empuk, boneka ini tidak hanya menggemaskan tapi juga seru dimainkan.\n" +
                        "Dengan pilihan warna-warna cerah dan pastel yang menarik, boneka ini cocok untuk anak-anak, remaja, hingga dewasa sebagai teman bermain, pereda stres, atau bahkan penanda suasana hati!"))

            listBoneka.add(ItemData(R.drawable.image5, "Boneka Bugs Bunny", "Rp. 95.000",
                "Boneka Bugs Bunny adalah boneka karakter ikonik dari seri kartun Looney Tunes, terkenal dengan telinga panjang, gigi kelinci khas, dan ekspresi jahil yang menggemaskan. \n" +
                        "Dibuat dari bahan lembut dan berkualitas, boneka ini nyaman dipeluk dan aman untuk anak-anak. Dengan detail yang menyerupai karakter aslinya—mulai dari mata cerdas hingga pose santainya—boneka ini cocok untuk koleksi, hadiah, atau teman bermain bagi penggemar kartun klasik. \n" +
                        "Siap jadi teman seru sambil berkata, “Eh… what’s up, doc?”\n" +
                        "\n"))

            listBoneka.add(ItemData(R.drawable.image6, "Boneka Panda Plushie", "Rp. 90.000",
                "Boneka Panda Plushie adalah boneka berbentuk panda yang menggemaskan, dengan bulu hitam-putih khas dan wajah lucu yang bikin gemas siapa saja yang melihatnya. \n" +
                        "Terbuat dari bahan plush super lembut dan empuk, boneka ini sangat nyaman untuk dipeluk, cocok untuk teman tidur, hadiah ulang tahun, atau hiasan kamar. \n" +
                        "Dengan mata bulat, telinga kecil, dan ekspresi manis, boneka panda ini jadi simbol kehangatan dan kasih sayang yang tak lekang oleh waktu."))

            listBoneka.add(ItemData(R.drawable.image7, "Boneka Teddy Tales Bear Doll", "Rp. 85.000",
                "Boneka Teddy Tales Bear Doll adalah boneka beruang teddy yang penuh dengan pesona dan kehangatan. \n" +
                        "Terbuat dari bahan plush lembut yang nyaman, boneka ini memiliki desain yang elegan dengan ekspresi wajah yang penuh kelembutan. \n" +
                        "Dikenal dengan pakaian lucu yang sering kali bergaya klasik, setiap Teddy Tales Bear Doll dilengkapi dengan aksesoris khas, menambah sentuhan unik yang membuatnya semakin menggemaskan. \n" +
                        "Cocok untuk koleksi, hadiah, atau sebagai teman tidur yang penuh kasih, boneka ini selalu mengundang senyuman bagi siapa saja yang melihatnya.\n" +
                        "\n"))

            listBoneka.add(ItemData(R.drawable.image8, "Boneka Lovioli Rora", "Rp. 100.000",
                "Boneka Lovioli Rora adalah boneka karakter yang memikat hati dengan desain imut dan penuh warna. \n" +
                        "Dengan mata besar yang cerah, rambut cantik, dan pakaian modis, Lovioli Rora menawarkan pesona unik yang bisa membuat siapa pun terpesona. \n" +
                        "Terbuat dari bahan plush berkualitas tinggi yang lembut dan nyaman, boneka ini sangat cocok untuk dipeluk atau dijadikan koleksi. \n" +
                        "Karakter Lovioli Rora yang ceria dan penuh gaya menjadikannya teman sempurna untuk anak-anak maupun penggemar boneka yang ingin menambahkan sentuhan ceria di ruang mereka.\n" +
                        "\n"))

            listBoneka.add(ItemData(R.drawable.image9, "Boneka Pingiun Tsumtsum", "Rp. 95.000",
                "Boneka Penguin Tsum Tsum adalah boneka lucu berbentuk penguin dengan desain khas Tsum Tsum yang menggemaskan.\n" +
                        "Dikenal dengan tubuhnya yang bulat dan pipih, boneka ini terbuat dari bahan plush yang super lembut dan empuk, menjadikannya sempurna untuk dipeluk. \n" +
                        "Dengan wajah penguin yang imut dan ekspresi ceria, boneka ini hadir dalam warna-warna cerah yang menambah kesan menyenangkan. \n" +
                        "Cocok untuk koleksi, hadiah, atau teman bermain, Boneka Penguin Tsum Tsum akan membawa keceriaan dan kehangatan pada siapa saja yang memilikinya."))

            listBoneka.add(ItemData(R.drawable.image10, "Boneka Baby Duck", "Rp. 75.000",
                "Boneka Baby Duck adalah boneka bebek kecil yang menggemaskan dengan tubuh bulat dan lembut.\n" +
                        "Dikenal dengan warna kuning cerah yang khas, boneka ini dibuat dari bahan plush berkualitas yang sangat empuk, memberikan kenyamanan saat dipeluk. \n" +
                        "Wajah baby duck yang lucu dengan mata bulat besar dan paruh kecil menambah kesan imut dan mengundang senyuman.\n" +
                        "Cocok untuk dijadikan teman tidur, hadiah ulang tahun, atau koleksi pribadi, boneka Baby Duck membawa keceriaan dan kehangatan bagi siapa saja yang memilikinya."))

        bonekaRecyclerView.layoutManager = LinearLayoutManager(this)
        bonekaRecyclerView.setHasFixedSize(true)
        bonekaAdapter = MyAdapter(listBoneka)
        bonekaRecyclerView.adapter = bonekaAdapter

        bonekaAdapter.onItemClick = { selectedItem ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("item", selectedItem)
            startActivity(intent)

        }
    }
}