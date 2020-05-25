package com.deepak.coronaapp.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.firebase.analytics.FirebaseAnalytics

import javax.inject.Inject

abstract class BaseFragment: Fragment() {

    @Inject
    lateinit var apiClient: ApiClient

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    @Inject
    lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoronaApp.component.inject(this)
    }
}