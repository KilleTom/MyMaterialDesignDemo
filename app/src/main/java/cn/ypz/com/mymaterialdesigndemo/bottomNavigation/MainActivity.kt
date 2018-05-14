package cn.ypz.com.mymaterialdesigndemo.bottomNavigation

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MenuItem
import cn.ypz.com.mymaterialdesigndemo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        Log.i("ypz",item.itemId.toString())
        when (item.itemId) {
            R.id.navigation_home -> {
                vp.currentItem = 0
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                vp.currentItem = 1
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                vp.currentItem = 2
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_camera->{
                vp.currentItem = 3
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BottomNavigationViewHelper.disableShiftMode(navigation)
        tab.setupWithViewPager(vp)
        var menuItem :MenuItem ?= null
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        vp.addOnPageChangeListener(object: ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                runOnUiThread {
                    if (menuItem != null) {
                        menuItem!!.setChecked(false)
                    } else {
                        navigation.getMenu().getItem(0).setChecked(false)
                    }
                    menuItem = navigation.getMenu().getItem(position)
                    menuItem!!.setChecked(true)
                }
            }
        })

        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter.addFragment(BaseFragment.newInstance("主页"))
        viewPagerAdapter.addFragment(BaseFragment.newInstance("dashboard"))
        viewPagerAdapter.addFragment(BaseFragment.newInstance("通知栏"))
        viewPagerAdapter.addFragment(BaseFragment.newInstance("照相机"))
        vp.adapter = viewPagerAdapter

    }
}
