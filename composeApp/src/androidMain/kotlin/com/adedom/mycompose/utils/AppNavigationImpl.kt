package com.adedom.mycompose.utils

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast

class AppNavigationImpl(
    private val context: Context,
) : AppNavigation {

    override fun openWebOrDeeplink(url: String?) {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            val uri = Uri.parse(url)
            val contentUrl = uri?.getQueryParameter("content_url")
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(contentUrl))
            context.startActivity(intent)
        } catch (e: Throwable) {
            e.printStackTrace()
            Toast.makeText(context, e.message, Toast.LENGTH_SHORT).show()
        }
    }
}
