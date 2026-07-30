package io.github.govindtank.clipboard

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.ImageBitmap

/**
 * Composable that provides access to system clipboard.
 *
 * Usage:
 * ```kotlin
 * val clipboard = rememberClipboardManager()
 * clipboard.writeText("Hello")
 * val text = clipboard.readText()
 * ```
 */
@Composable
fun rememberClipboardManager(): ClipboardManager {
    val manager = remember { ClipboardManager() }
    return manager
}

/**
 * Platform-agnostic clipboard manager.
 * Wraps platform-specific implementations behind a uniform API.
 *
 * On Android, call `clipboardInit(context)` once before using,
 * typically in a `LaunchedEffect(Unit) { clipboardInit(context) }`.
 */
class ClipboardManager {
    fun readText(): String? = clipboardReadText()
    fun writeText(text: String) = clipboardWriteText(text)
    fun readImage(): ImageBitmap? = clipboardReadImage()
    fun writeImage(image: ImageBitmap) = clipboardWriteImage(image)
}
