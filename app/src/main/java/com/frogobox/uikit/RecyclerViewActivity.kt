package com.frogobox.uikit

import android.os.Bundle
import com.frogobox.uikit.core.BaseActivity
import com.frogobox.uikit.core.BasePagerAdapter

class RecyclerViewActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(recyclerViewBinding.root)
        setupDetailActivity("List UI RecyclerView")
        setupViewPager()
    }

    private fun setupViewPager() {
        val pagerAdapter = BasePagerAdapter(this)
        pagerAdapter.setupPagerFragment(RecyclerListFragment(), "List")
        pagerAdapter.setupPagerFragment(RecyclerGridFragment(),"Grid")

        recyclerViewBinding.apply {
            viewpager.adapter = pagerAdapter
            setupTabTitles(tablayout, viewpager, pagerAdapter.titles)
        }
    }

}