# cmp-clipboard

Compose MultiPlatform clipboard library for Kotlin.

## Features

- Unified clipboard API for Android and iOS
- `readText()` / `writeText(text)` for text clipboard access
- `readImage()` / `writeImage(image)` for image clipboard (returns `null` on platforms without easy image clipboard support)
- Composable `rememberClipboardManager()` for Compose UI

## Usage

```kotlin
val clipboard = rememberClipboardManager()

// Text
clipboard.writeText("Hello, world!")
val text = clipboard.readText()

// Image (platform-dependent)
val image = clipboard.readImage()
clipboard.writeImage(image)
```

## Setup

```kotlin
// settings.gradle.kts
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

// build.gradle.kts (app)
dependencies {
    implementation("io.github.govindtank:cmp-clipboard:0.1.0")
}
```

## Requirements

- Kotlin 2.0.0+
- Compose Multiplatform 1.6.10+
- Android minSdk 21+
- iOS 12+

## License

MIT
