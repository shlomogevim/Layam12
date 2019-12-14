package com.example.layam12.view


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.layam12.R
import com.example.layam12.model.Mad
import kotlinx.android.synthetic.main.fragment_details.*


class DetailsFragment : Fragment() {

    var mad: Mad?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            mad=DetailsFragmentArgs.fromBundle(it).mad

        }

        //activity?.actionBar?.setTitle("Layam12")

         // val actionBar=supportActionBar
      //  actionBar!!.title="Layam12"

        webView.settings.javaScriptEnabled=true
        webView.webViewClient= WebViewClient()
        webView.loadUrl(mad?.adress)

       /* webView.webViewClient=object :WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?,url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        webView.loadUrl(mad?.adress)*/

    }



}

