package com.example.GameApp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;//SDKからクラスを読み込むのがimport
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);//mainxmlを読み込む
        // ボタンのオブジェクトを取得.
        Button btn = (Button)findViewById(R.id.button);//ボタンオブジェクトを取得

        // クリックイベントを受け取れるようにする
        btn.setOnClickListener(new View.OnClickListener() {
            // このメソッドがクリック毎に呼び出される
            public void onClick(View v) {
                // ここにクリックされたときの処理を記述
                Log.d("test", "onclick");
            }
        });
    }
}
