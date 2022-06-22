package jp.techacademy.masaya.ishihara.kotlinlog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        val human= Human("長久保浩二", 42, hobby = "立てこもり")
        human.say()
        Log.d("kotlintest", "私の名前は" + human.name + "です。年は" + human.age + "歳" + "です。")
        val human2= Human("長久保浩二", 42, hobby = "立てこもり")
        human2.think()
        Log.d("kotlintest", "私は" + human2.hobby + "について考える。")


    }
}