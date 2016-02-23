package com.example.tacademy.projectdiner;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Menu_Settings_Fragment extends Fragment {

    ListView listView;
    Notice_Adapter mAdapter;

    static final int[] ICON_IDS = {R.drawable.sample_thumb_0,
            R.drawable.sample_thumb_1,
            R.drawable.sample_thumb_2,
            R.drawable.sample_thumb_3,
            R.drawable.sample_thumb_4,
            R.drawable.sample_thumb_5
    };

    static final String[] Notice_Menu = {"공지사항", "다이너란?", "Q&A", "알림 설정", "로그아웃", "회원탈퇴"};

    private static final int REQUEST_CODE_OTHER = 0;

    public Menu_Settings_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_settings, container, false);
        listView = (ListView) view.findViewById(R.id.listView);
        listView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);

        mAdapter = new Notice_Adapter();
        mAdapter.setOnAdapterItemClickListener(new Notice_Adapter.OnAdapterItemClickListener() {
            @Override
            public void onAdapterItemClickListener(Notice_Adapter adapter, Notice_View view, Notice_Item notice, int position) {
                Toast.makeText(getContext(), "ImageClick : " + notice.getName(), Toast.LENGTH_SHORT).show();

                if (adapter.getItemId(position) == 0) {
                    Intent intent = new Intent(getContext(), Other_Notice_Activity.class);
                    startActivityForResult(intent, REQUEST_CODE_OTHER);
                }

                if (adapter.getItemId(position) == 4) {
                    showDialogLogout(view);
                }

                if (adapter.getItemId(position) == 5) {
                    showDialogDelete(view);
                }
            }
        });

        listView.setAdapter(mAdapter);
        initData();

        return view;
    }

    private void initData() {
        for (int i = 0; i < 6; i++) {
            Drawable d = getResources().getDrawable(ICON_IDS[i]);
            Notice_Item n = new Notice_Item(d, Notice_Menu[i]);

            mAdapter.add(n);
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            getActivity().setTitle("공지사항");
        }
    }

    // 다이얼로그 띄우기
    public void showDialogLogout(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setMessage("로그아웃하시겠습니까?");
        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(), "Yes Click", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(), "No Click", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setCancelable(false);
        builder.create().show();
    }

    public void showDialogDelete (View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setMessage("회원탈퇴하시겠습니까?");
        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(), "Yes Click", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(), "No Click", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setCancelable(false);
        builder.create().show();
    }

}
