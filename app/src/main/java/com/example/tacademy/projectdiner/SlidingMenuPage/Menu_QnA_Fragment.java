package com.example.tacademy.projectdiner.SlidingMenuPage;


import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tacademy.projectdiner.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Menu_QnA_Fragment extends Fragment {

    ImageView imageView1, imageView2, imageView3, imageView4, imageView5;
    TextView textView1, textView2, textView3, textView4, textView5;
    RelativeLayout layout1, layout2, layout3, layout4, layout5, layout_1, layout_2, layout_3, layout_4, layout_5;

    public Menu_QnA_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_qna, container, false);

        layout1 = (RelativeLayout) view.findViewById(R.id.RLayout1);
        layout_1 = (RelativeLayout) view.findViewById(R.id.layout_1);
        imageView1 = (ImageView)view.findViewById(R.id.imageView1);
        textView1 = (TextView)view.findViewById(R.id.textView1);
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (layout_1.getVisibility() == View.VISIBLE) {
                            layout1.setBackgroundColor(Color.WHITE);
                            textView1.setTextColor(Color.BLACK);
                            layout_1.setVisibility(View.GONE);
                        } else {
                            layout1.setBackgroundColor(getResources().getColor(R.color.nRed));
                            textView1.setTextColor(Color.WHITE);
                            layout_1.setVisibility(View.VISIBLE);
                        }
                    }
                });
            }
        });

        layout2 = (RelativeLayout) view.findViewById(R.id.RLayout2);
        layout_2 = (RelativeLayout) view.findViewById(R.id.layout_2);
        imageView2 = (ImageView)view.findViewById(R.id.imageView2);
        textView2 = (TextView)view.findViewById(R.id.textView2);
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (layout_2.getVisibility() == View.VISIBLE) {
                            layout2.setBackgroundColor(Color.WHITE);
                            textView2.setTextColor(Color.BLACK);
                            layout_2.setVisibility(View.GONE);
                        } else {
                            layout2.setBackgroundColor(getResources().getColor(R.color.nRed));
                            textView2.setTextColor(Color.WHITE);
                            layout_2.setVisibility(View.VISIBLE);
                        }
                    }
                });
            }
        });


        layout3 = (RelativeLayout) view.findViewById(R.id.RLayout3);
        layout_3 = (RelativeLayout) view.findViewById(R.id.layout_3);
        imageView3 = (ImageView)view.findViewById(R.id.imageView3);
        textView3 = (TextView)view.findViewById(R.id.textView3);
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (layout_3.getVisibility() == View.VISIBLE) {
                            layout3.setBackgroundColor(Color.WHITE);
                            textView3.setTextColor(Color.BLACK);
                            layout_3.setVisibility(View.GONE);
                        } else {
                            layout3.setBackgroundColor(getResources().getColor(R.color.nRed));
                            textView3.setTextColor(Color.WHITE);
                            layout_3.setVisibility(View.VISIBLE);
                        }
                    }
                });
            }
        });

        layout4 = (RelativeLayout) view.findViewById(R.id.RLayout4);
        layout_4 = (RelativeLayout) view.findViewById(R.id.layout_4);
        imageView4 = (ImageView)view.findViewById(R.id.imageView4);
        textView4 = (TextView)view.findViewById(R.id.textView4);
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (layout_4.getVisibility() == View.VISIBLE) {
                            layout4.setBackgroundColor(Color.WHITE);
                            textView4.setTextColor(Color.BLACK);
                            layout_4.setVisibility(View.GONE);
                        } else {
                            layout4.setBackgroundColor(getResources().getColor(R.color.nRed));
                            textView4.setTextColor(Color.WHITE);
                            layout_4.setVisibility(View.VISIBLE);
                        }
                    }
                });
            }
        });

        layout5 = (RelativeLayout) view.findViewById(R.id.RLayout5);
        layout_5 = (RelativeLayout) view.findViewById(R.id.layout_5);
        imageView5 = (ImageView)view.findViewById(R.id.imageView5);
        textView5 = (TextView)view.findViewById(R.id.textView5);
        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (layout_5.getVisibility() == View.VISIBLE) {
                            layout5.setBackgroundColor(Color.WHITE);
                            textView5.setTextColor(Color.BLACK);
                            layout_5.setVisibility(View.INVISIBLE);
                        } else {
                            layout5.setBackgroundColor(getResources().getColor(R.color.nRed));
                            textView5.setTextColor(Color.WHITE);
                            layout_5.setVisibility(View.VISIBLE);
                        }
                    }
                });
            }
        });
        return view;
    }
}
