package io.github.govindtank.clipboard

import androidx.compose.ui.graphics.ImageBitmap
import platform.UIKit.UIPasteboard

actual fun clipboardInit(context: Any?) { }

actual fun clipboardReadText(): String? {
    return UIPasteboard.generalPasteboard.string
}

actual fun clipboardWriteText(text: String) {
    UIPasteboard.generalPasteboard.string = text
}

actual fun clipboardReadImage(): ImageBitmap? = null

actual fun clipboardWriteImage(image: ImageBitmap) {
    // ponytail: requires UIImage conversion from ImageBitmap
    // add when image clipboard support is needed
}
