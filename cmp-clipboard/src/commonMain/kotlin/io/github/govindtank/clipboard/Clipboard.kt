package io.github.govindtank.clipboard

import androidx.compose.ui.graphics.ImageBitmap

// Platform functions — initialized once, then called imperatively.

expect fun clipboardInit(context: Any? = null)
expect fun clipboardReadText(): String?
expect fun clipboardWriteText(text: String)
expect fun clipboardReadImage(): ImageBitmap?
expect fun clipboardWriteImage(image: ImageBitmap)
