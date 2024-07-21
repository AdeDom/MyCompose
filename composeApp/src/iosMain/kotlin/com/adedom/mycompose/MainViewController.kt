package com.adedom.mycompose

import androidx.compose.ui.window.ComposeUIViewController
import com.adedom.mycompose.ui.theme.MyComposeTheme
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

fun MainViewController() = ComposeUIViewController {
    val isDarkTheme =
        UIScreen.mainScreen.traitCollection.userInterfaceStyle ==
            UIUserInterfaceStyle.UIUserInterfaceStyleDark
    MyComposeTheme(
        darkTheme = isDarkTheme,
        dynamicColor = false,
    ) {
        App()
    }
}
