# cmp-clipboard

<p align="center">
  <a href="https://jitpack.io/#govindtank/cmp-clipboard"><img src="https://jitpack.io/v/govindtank/cmp-clipboard.svg?style=flat-square" alt="JitPack"></a>
  <a href="https://github.com/govindtank/cmp-clipboard/actions"><img src="https://img.shields.io/github/actions/workflow/status/govindtank/cmp-clipboard/build.yml?branch=main&style=flat-square&label=build" alt="Build Status"></a>
  <img src="https://img.shields.io/badge/Platform-Android%20%7C%20iOS%20%7C%20CMP-blue?style=flat-square" alt="Platform">
  <img src="https://img.shields.io/badge/Kotlin-2.0.0-purple?style=flat-square" alt="Kotlin">
  <a href="LICENSE"><img src="https://img.shields.io/badge/License-Apache%202.0-green.svg?style=flat-square" alt="License"></a>
  <a href="https://github.com/govindtank"><img src="https://img.shields.io/badge/Author-Govind%20Tank-orange?style=flat-square" alt="Author"></a>
</p>

<p align="center">
  <b>Compose Multiplatform clipboard library for Kotlin — unified clipboard API for Android and iOS.</b><br>
  <i>Architected &amp; Crafted with ❤️ by <a href="https://github.com/govindtank">Govind Tank</a></i>
</p>

<p align="center">
  <img src="./screenshot.svg" width="390" alt="cmp-clipboard demo" style="border-radius: 14px;" />
</p>

---

## ⚡ Features

- 📱 **Unified API** — single `ClipboardManager` interface works seamlessly on Android and iOS.
- 📝 **Text Clipboard** — `readText()` / `writeText(text)` for plain text manipulation.
- 🖼️ **Image Clipboard** — `readImage()` / `writeImage(image)` for rich visual clipboard payloads.
- 🎨 **Composable** — `rememberClipboardManager()` hook for Compose Multiplatform UI.

---

## 📦 Installation

Add the JitPack repository and dependency to your `build.gradle.kts`:

```kotlin
repositories {
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("com.github.govindtank:cmp-clipboard:1.0.0")
}
```

---

## 🚀 Usage

```kotlin
import androidx.compose.material3.*
import androidx.compose.runtime.*
import io.github.govindtank.clipboard.rememberClipboardManager

@Composable
fun ClipboardDemoScreen() {
    val clipboard = rememberClipboardManager()
    var pastedText by remember { mutableStateOf("") }
    
    Button(onClick = { clipboard.writeText("Hello from Compose Multiplatform!") }) {
        Text("Copy to Clipboard")
    }
    
    Button(onClick = { 
        pastedText = clipboard.readText() ?: "(Clipboard is empty)" 
    }) {
        Text("Paste from Clipboard")
    }

    Text("Current Clipboard: $pastedText")
}
```

---

## 📱 Platform Implementation Details

| Platform | Underlying API | Notes |
| :--- | :--- | :--- |
| **Android** | `android.content.ClipboardManager` | Initialized with `clipboardInit(context)` |
| **iOS** | `platform.UIKit.UIPasteboard` | Works out of the box without context |

---

## 💖 Support & Sponsorship

If you find this library helpful for your Compose Multiplatform applications, consider supporting continuous development:

<p align="left">
  <a href="https://www.patreon.com/govindtank"><img src="https://img.shields.io/badge/Patreon-Support%20Creator-F96854?style=for-the-badge&logo=patreon&logoColor=white" alt="Patreon"></a>
  <a href="https://github.com/sponsors/govindtank"><img src="https://img.shields.io/badge/GitHub%20Sponsors-Sponsor-EA4AAA?style=for-the-badge&logo=github&logoColor=white" alt="GitHub Sponsors"></a>
  <a href="https://buymeacoffee.com/govindtanko"><img src="https://img.shields.io/badge/Buy%20Me%20A%20Coffee-Donate-FFDD00?style=for-the-badge&logo=buy-me-a-coffee&logoColor=black" alt="Buy Me A Coffee"></a>
</p>

- **Patreon**: [patreon.com/govindtank](https://www.patreon.com/govindtank)
- **GitHub Sponsors**: [github.com/sponsors/govindtank](https://github.com/sponsors/govindtank)
- **Buy Me a Coffee**: [buymeacoffee.com/govindtanko](https://buymeacoffee.com/govindtanko)

Your sponsorship fuels new features, bug fixes, and continuous KMP multiplatform library releases!

---

## 👨💻 Author

**Govind Tank**
- **GitHub**: [@govindtank](https://github.com/govindtank)
- **Website**: [govindtank.github.io](https://govindtank.github.io)
- **LinkedIn**: [linkedin.com/in/govind-tank](https://linkedin.com/in/govind-tank)

---

## 📄 License

Apache License 2.0
