package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Page extends AppCompatActivity {

    ListView list;

    String page;

    private String[] name;
    private int[] image;
    private String[] url;

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        title = findViewById(R.id.title);
        list = findViewById(R.id.list);

        page = getIntent().getStringExtra("page");

        if (page.equals("shoulder")) {
            title.setText(page);
            Data data = new Data();
            name = data.getName();
            image = data.getImage();
            url = data.getUrl();
        } else if (page.equals("chest")) {
            title.setText(page);
            Chest data = new Chest();
            name = data.getName();
            image = data.getImage();
            url = data.getUrl();
        } else if (page.equals("biceps")) {
            title.setText(page);
            Biceps data = new Biceps();
            name = data.getName();
            image = data.getImage();
            url = data.getUrl();
        } else if (page.equals("Triceps")) {
            title.setText(page);
            Triceps data = new Triceps();
            name = data.getName();
            image = data.getImage();
            url = data.getUrl();
        } else if (page.equals("Forearms")) {
            title.setText(page);
            Forearms data = new Forearms();
            name = data.getName();
            image = data.getImage();
            url = data.getUrl();
        } else if (page.equals("Abdominals")) {
            title.setText(page);
            Abdominals data = new Abdominals();
            name = data.getName();
            image = data.getImage();
            url = data.getUrl();
        } else if (page.equals("Obliques")) {
            title.setText(page);
            Obliques data = new Obliques();
            name = data.getName();
            image = data.getImage();
            url = data.getUrl();
        } else if (page.equals("Quads")) {
            title.setText(page);
            Quads data = new Quads();
            name = data.getName();
            image = data.getImage();
            url = data.getUrl();
        } else if (page.equals("Calves")) {
            title.setText(page);
            Calves data = new Calves();
            name = data.getName();
            image = data.getImage();
            url = data.getUrl();
        }

        MyAdapter myAdapter = new MyAdapter();
        list.setAdapter(myAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), Player.class);
                intent.putExtra("url", url[i]);
                intent.putExtra("text", name[i]);
                startActivity(intent);
            }
        });

    }

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.card, viewGroup, false);
            ImageView mImageView = view.findViewById(R.id.item_image);
            TextView mTextView = view.findViewById(R.id.item_text);

            mTextView.setText(name[i]);
            mImageView.setImageResource(image[i]);

            return view;
        }
    }
}