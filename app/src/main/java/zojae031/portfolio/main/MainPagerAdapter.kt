package zojae031.portfolio.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import zojae031.portfolio.profile.ProfileFragment
import zojae031.portfolio.project.ProjectFragment
import zojae031.portfolio.tec.FragmentTec

class MainPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val fragments = listOf(
        ProfileFragment(),
        ProjectFragment(),
        FragmentTec()
    )

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int = fragments.size
}