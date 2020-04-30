package com.asligresik.miaumerah

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_front.*

class FrontActivity : AppCompatActivity() {
    val imageBanner = arrayOf("bg3.jpg", "bg4.jpg", "bg3.jpg", "bg4.jpg")
    private val imageBannerPath = "http://miaumerah.desa.id/desa/banner/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front)

        cvPortalDesa.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(MainActivity.PAGE_URL, "http://miaumerah.desa.id")
            startActivity(intent)
        }

        cvPin.setOnClickListener {
            val url = "https://wa.me/6285845143361?text=Daftar%20PIN%20layanan%20mandiri"
            val sendIntent = Intent(Intent.ACTION_VIEW)
            sendIntent.data = Uri.parse(url)
            startActivity(sendIntent)
        }

        cvLayanan.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(MainActivity.PAGE_URL, "http://miaumerah.desa.id/layanan_mandiri/masuk")
            startActivity(intent)
        }
        cvPengumuman.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(MainActivity.PAGE_URL, "http://miaumerah.desa.id/berita/kategori/pengumuman")
            startActivity(intent)
        }

        cvSop.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(MainActivity.PAGE_URL, "http://miaumerah.desa.id/sop")
            startActivity(intent)
        }

        cvPanduan.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(MainActivity.PAGE_URL, "http://miaumerah.desa.id/panduan")
            startActivity(intent)
        }

        cvAdminDesa.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(MainActivity.PAGE_URL, "http://miaumerah.desa.id/siteman")
            startActivity(intent)
        }

        cvCovid.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(MainActivity.PAGE_URL, "http://miaumerah.desa.id/siteman")
            startActivity(intent)
        }

        cvJadwal.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(MainActivity.PAGE_URL, "http://miaumerah.desa.id/siteman")
            startActivity(intent)
        }

        carouselView.pageCount = imageBanner.size
        carouselView.setImageListener { position, imageView ->
            Glide
                .with(this)
                .load(imageBannerPath + imageBanner[position])
                //    .centerCrop()
                .placeholder(R.drawable.ic_launcher_loading_foreground)
                .into(imageView);
        }
    }
}
