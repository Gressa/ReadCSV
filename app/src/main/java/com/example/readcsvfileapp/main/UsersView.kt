package com.example.readcsvfileapp.main

interface UsersView{
    fun reloadContentView()

    fun showProgressBar()

    fun dismissProgressBar()

    fun showErrorView(message: String)

    fun showSnackbar(message: String)

    fun dismissSwipeRefresh()

    fun showSwipeRefresh()

    fun getUserItemView(): UserItemView?
}
