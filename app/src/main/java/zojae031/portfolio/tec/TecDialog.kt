package zojae031.portfolio.tec

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.bumptech.glide.Glide
import com.google.gson.JsonParser
import kotlinx.android.synthetic.main.dialog.*
import zojae031.portfolio.R
import zojae031.portfolio.data.dao.tec.TecEntity

class TecDialog(context: Context, private val data: TecEntity) : Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog)

        Glide
            .with(context)
            .load(data.image)
            .error(R.drawable.ic_launcher_foreground)
            .override(150, 150)
            .into(project_image)

        title.text = data.name
        outer.removeView(text)

        //TODO UI 생각해보기!
        //TODO TecActivity 는 WebView만 뿌려주기!!!
        //TODO LEFT, Right 데이터 파싱 만들기


        JsonParser().parse(data.source).asJsonArray.let { arr ->
            val source = arr[0].asJsonObject
            left.apply {
                text = source.get("left").asString
                setOnClickListener {
                    context.startActivity(
                        TecActivity.getIntent(
                            context,
                            source.asJsonObject.get("data1").asString
                        )
                    )
                }
            }

            right.apply {
                text = source.get("right").asString
                setOnClickListener {
                    context.startActivity(
                        TecActivity.getIntent(
                            context,
                            source.get("data2").asString
                        )
                    )
                }
            }
        }


    }

}