package com.example.tacademy.projectdiner;

import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.example.tacademy.projectdiner.InLocalPage.InLocal_Tab1_Fragment;
import com.example.tacademy.projectdiner.MainPage.MainFragment;
import com.example.tacademy.projectdiner.QrPage.QrActivity;
import com.example.tacademy.projectdiner.QrPage.Qr_Fragment;
import com.example.tacademy.projectdiner.ReservationPage.Reservation_Activity;
import com.example.tacademy.projectdiner.SlidingMenuPage.Menu_Settings_Fragment;
import com.example.tacademy.projectdiner.SlidingMenuPage.Change_MyPageActivity;
import com.example.tacademy.projectdiner.SlidingMenuPage.MyPage_Fragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    // Drawerble Layout
    private NavigationView menuView;
    private DrawerLayout drawer;
    private InLocal_Tab1_Fragment inLocal_tab1_fragment;


    public static final String EXTRA_MESSAGE = "region_id";


    //InLocal_Tab1_Fragment tab1 = (InLocal_Tab1_Fragment)getFragmentManager().findFragmentById()
    public void test(int regionId){
        if(inLocal_tab1_fragment !=null){
            inLocal_tab1_fragment.setId(regionId);
        }else{
            System.out.println("ta1 널입니다.");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new MainFragment())
                    .commit();
        }

        startActivity(new Intent(MainActivity.this, Reservation_Activity.class));

        setTitle("");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Draweble Menu
        drawer = (DrawerLayout)findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        menuView = (NavigationView)findViewById(R.id.navigation_menu);
        menuView.setNavigationItemSelectedListener(this);

        View headerView = menuView.getHeaderView(0);
        Button btn = (Button)headerView.findViewById(R.id.btn_edit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Change_MyPageActivity.class));
            }
        });

//        Intent intent = getIntent();
//        String message = intent.getStringExtra(EXTRA_MESSAGE);

//        Toast.makeText(MainActivity.this, "message " + message, Toast.LENGTH_SHORT).show();

        inLocal_tab1_fragment = new InLocal_Tab1_Fragment();
//        Bundle extra = new Bundle();
//
//        extra.putInt(EXTRA_MESSAGE, Integer.parseInt(message));
//        inLocal_tab1_fragment.setArguments(extra);


//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        ft.add(inLocal_tab1_fragment, "region_id");
//        ft.commit();


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_mypage : {
                getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new MyPage_Fragment())
                        .addToBackStack(null)
                        .commit();
                break;
            }

            case R.id.menu_settings :{
                getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new Menu_Settings_Fragment())
                        .addToBackStack(null)
                        .commit();
                }
                break;

            case R.id.menu_qr : {

                startActivity(new Intent(MainActivity.this, QrActivity.class));
            }

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.item) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
