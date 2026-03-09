# ♛ N Queen AI Challenge

A puzzle game based on the classic **N-Queens problem**, where players must place queens on a chessboard such that none attack each other.

This project is implemented as a **web application embedded inside an Android WebView**.

---

## 🎮 Gameplay

* Place queens on the board so that no two queens attack each other.
* Queens cannot share the same:

    * row
    * column
    * diagonal

Each level increases the board size, making the puzzle more challenging.

---

## ✨ Features

* Multiple difficulty levels
* Interactive chessboard UI
* Move counter and timer
* Hint system
* AI solver with time penalty
* Confetti animation on win
* Progress saving using `localStorage`
* Android APK built using WebView

---

## 📱 Android App

The web game runs inside an Android app using **WebView**, allowing it to be installed and played like a native application.

---

## 🛠 Tech Stack

**Frontend**

* HTML
* CSS
* JavaScript

**Mobile Wrapper**

* Android (Kotlin)
* WebView

---

## 🚀 How to Run

### Web Version

1. Clone the repository

```bash
git clone https://github.com/lissaintech/NQueenWebApp.git
```

2. Open `index.html` in a browser.

---

### Android Version

1. Open the project in **Android Studio**
2. Run the app on an emulator or device
3. The WebView will load the game from the `assets` folder

---

## 📂 Project Structure

```
NQueenWebApp
 ├ app
 │  ├ src
 │  │  ├ main
 │  │  │  ├ assets
 │  │  │  │  ├ index.html
 │  │  │  │  ├ script.js
 │  │  │  │  └ style.css
 │  │  │  ├ java
 │  │  │  │  └ MainActivity.kt
 │  │  │  └ res
 │  │  │     └ layouts
 └ README.md
```

---

## 🔮 Future Improvements

* React-based frontend
* Better animations and UI polish
* Leaderboard system
* Additional puzzle modes

---

## 👩‍💻 Author

**Lissa**

GitHub: https://github.com/lissaintech
