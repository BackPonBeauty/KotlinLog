package jp.techacademy.masaya.ishihara.kotlinlog
import android.util.Log
open class Human: Animal,Thinkable{
    // プロパティ

   var hobby: String
    constructor(name: String, age: Int,hobby: String) : super(name,age) {
        this.hobby = hobby
    }
    // 引数付きコンストラクタ
  //  constructor(name: String, age: Int) : super(name,age) {}
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳" + "です。")
    }
   override fun think() {
       Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }
}
