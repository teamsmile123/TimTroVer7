package example.com.timtro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import example.com.timtro.adapters.FragmentAdapter;
import example.com.timtro.views.Fragment1;
import example.com.timtro.views.Fragment2;

public class MainActivityChiTietTro extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
   /*
    private ArrayList<TimNguoiOGhep> mlist;*/
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitiettro);

        //tao chu tren thanh toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //tao thanh menu va su kien khi click no
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        add();
    }


    private void add(){
        viewPager = (ViewPager) findViewById(R.id.vp1);
        tabLayout = (TabLayout) findViewById(R.id.tl1);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentAdapter fragmentAdapter= new FragmentAdapter(fragmentManager);
        fragmentAdapter.insertFragment(new Fragment1());
        fragmentAdapter.insertFragment(new Fragment2());
        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
   //ham xu li mục setting
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.search_view) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.tim_phong) {
            Intent intent = new Intent(MainActivityChiTietTro.this, MainActivity.class);
            startActivity(intent);

        } else if (id == R.id.tim_ghep) {
            Intent intent = new Intent(MainActivityChiTietTro.this, MainActivity2.class);
            startActivity(intent);

        } else if (id == R.id.dang_cho_thue) {
            Intent intent = new Intent(MainActivityChiTietTro.this, MainActivity4.class);
            startActivity(intent);

        } else if (id == R.id.dang_tim_ghep) {
            Intent intent = new Intent(MainActivityChiTietTro.this, MainActivity4.class);
            startActivity(intent);

        } else if (id == R.id.tro_giup) {

        } else if (id == R.id.bao_cao) {
            Intent intent = new Intent(MainActivityChiTietTro.this, MainActivityBaoCao.class);
            startActivity(intent);
        }
        //cau lenh de quay ve man hinh chinh
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
