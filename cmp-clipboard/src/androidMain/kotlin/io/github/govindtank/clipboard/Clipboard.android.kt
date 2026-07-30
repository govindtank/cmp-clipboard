package io.github.govindtank.clipboard

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.compose.ui.graphics.ImageBitmap

private var appContext: Context? = null

actual fun clipboardInit(context: Any?) {
    appContext = context as? Context
}

actual fun clipboardReadText(): String? {
    val cm = appContext?.getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager ?: return null
    val clip = cm.primaryClip ?: return null
    return if (clip.itemCount > 0) clip.getItemAt(0).text?.toString() else null
}

actual fun clipboardWriteText(text: String) {
    val cm = appContext?.getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager ?: return
    cm.setPrimaryClip(ClipData.newPlainText(null, text))
}

actual fun clipboardReadImage(): ImageBitmap? = null

actual fun clipboardWriteImage(image: ImageBitmap) {
    // ponytail: requires MediaStore save + ClipData.newUri
    // add when image clipboard support is needed
}
