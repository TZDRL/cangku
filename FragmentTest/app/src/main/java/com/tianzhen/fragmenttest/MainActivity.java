package com.tianzhen.fragmenttest;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                AnotherRightFragment fragment = new AnotherRightFragment();     //碎片实例
                FragmentManager fragmentManager = getFragmentManager();     //事务实例
                FragmentTransaction transaction = fragmentManager.beginTransaction();   //开启事务
                transaction.replace(R.id.right_layout, fragment);   //添加碎片
                transaction.addToBackStack(null);   //添加一个事务到返回栈中
                transaction.commit();   //提交事务
                break;
            default:
                break;
        }
    }
}
