package jp.techacademy.masaya.ishihara.kotlinlog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        val human= Human("ゼレンスキー", 44, hobby = "ロシア")
        human.say()
        human.think()
        val human2= Human("プーチン", 70, hobby = "ウクライナ")
        human2.say()
        human2.think()



    }
}