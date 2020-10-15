package ragilputri.stematel.mytestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import java.lang.StringBuilder

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnSetValue: Button
    private lateinit var tvText : TextView
    private lateinit var imgPreview : ImageView
    private var names = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText = findViewById(R.id.tv_text)
        btnSetValue = findViewById(R.id.btn_set_value)
        btnSetValue.setOnClickListener(this)

        imgPreview = findViewById(R.id.img_preview)
        //imgPreview.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.mulan_big))
        Glide.with(this).load(R.drawable.mulan_big).into(imgPreview)

        names.add("Mulan (2020)")
        names.add("Sebuah film drama laga perang")
        names.add("Film ini menceritakan putri tertua dari seorang prajurit terhormat mengambil langkah untuk berperang menggantikan ayahnya yang sakit. ")
    }

    override fun onClick(view: View) {
        if(view.id == R.id.btn_set_value){
            Log.d("MainActivity", names.toString())
            val name = StringBuilder()
            for(i in 0..2){
                name.append(names[i]).append("\n")
            }
            tvText.text = name.toString()
        }
    }
}