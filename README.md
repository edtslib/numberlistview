# NumberListView

![NumberListView](https://i.ibb.co/PWTHMWh/numberlistview.png)
## Setup
### Gradle

Add this to your project level `build.gradle`:
```groovy
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
Add this to your app `build.gradle`:
```groovy
dependencies {
    implementation 'com.github.edtslib:numberlistview:latest'
}
```

### Usage

To show bottom view, just add NumberListView on your layout

```xml
    /*
<id.co.edtslib.numberlistview.NumberListView
    android:id="@+id/numberListView"
    android:layout_marginStart="16dp"
    android:layout_marginEnd="16dp"
    android:layout_width="0dp"
    android:layout_height="wrap_content" />
    */
```
For add list you can using add method. For example

```kotlin
    /*
        val numberListView = findViewById<NumberListView>(R.id.numberListView)
        numberListView.add("Tap <b>Pay Now with GoPay</b>.")
        numberListView.add("<b>Gojek</b> app will open. ")
        numberListView.add("Check Your Payment Detail then tap <b>Next.</b>")
    */
```

### Attributes information

##### _app:symbol_
[string]: list numbering symbol

##### _app:space_
[dimension]: line spacing