<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibUtils/blob/master/preview/bg.jpg"/>
</p>

<h1 align="center">
    ShareErrorReportTo
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-1.0.0-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/kotlin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <br>
    <p>Simple Way to share with dialog.</p>
</p>

---
# Content List
* [Download](#download)
* [Feature List](#feature-list)
* [Tech stack and 3rd library](#tech-stack-and-3rd-library)
* [Usage](#usage)
* [Example Code/App](#example-codeapp)
* [Version](#version)
* [Contribution](#contribution)

---
# Download
Add maven `jitpack.io` and `dependencies` in `build.gradle (Project)` :
```gradle
// build.gradle project
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

// build.gradle app/module
dependencies {
  ...
  implementation 'com.github.gzeinnumer:ShareErrorReportTo:version'
}
```

---
# Feature List
- [x] [Share](#Share)

---
# Tech stack and 3rd library
- [DialogFragment](https://developer.android.com/guide/fragments/dialogs)

---
# Usage

### **Share.**
Share Error Via Wahatapps
```java
String error = "error";
new ShareErrorDialog(getSupportFragmentManager()).builder().setErrorMessage(error).show();
```

---
# Example Code/App

[Sample Code And App](https://github.com/gzeinnumer/ShareErrorReportTo/blob/master/app/src/main/java/com/gzeinnumer/shareerrorreportto/MainActivity.java)

---
# Version
- **1.0.0**
  - First Release

---
# Contribution
You can sent your constibution to `branch` `open-pull`.

### Fore More [All My Library](https://github.com/gzeinnumer#my-library-list)

---

```
Copyright 2021 M. Fadli Zein
```
