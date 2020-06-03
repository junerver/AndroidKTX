package com.lxj.androidktxdemo.fragment

import com.blankj.utilcode.util.LogUtils
import com.lxj.androidktx.base.StateFragment

/**
 * Description:
 * Create by lxj, at 2018/12/4
 */
abstract class BaseFragment: StateFragment(){
    override fun initView() {
        LogUtils.e("${javaClass::getSimpleName} initView")
    }
    override fun initData() {
        LogUtils.e("${javaClass::getSimpleName} initData")

    }
}