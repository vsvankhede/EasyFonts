![alt tag](https://github.com/vsvankhede/easyfonts/blob/master/images/banner.png)
# EasyFonts
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-EasyFonts-green.svg?style=flat)](https://android-arsenal.com/details/1/2044)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)


A simple and useful android library to use custom fonts in android apps without adding fonts into asset/resource folder.Also by using this library developer should not have to worry about `Typeface` object creation for every new font that he use.

EasyFonts will handle all this for you.

###Type of fonts available:

![alt tag](https://github.com/vsvankhede/easyfonts/blob/master/images/fontface_list.png)

## Getting Started

### Installation
Add gradle dependency with command:
```groovy
dependencies {
        compile 'com.vstechlab.easyfonts:easyfonts:1.0.0'
    }
```
for Maven:
```groovy
repositories {
    maven {
        url 'https://dl.bintray.com/vsvankhede/maven/'
    }
}
dependencies {
        compile 'com.vstechlab.easyfonts:easyfonts:1.0.0'
    }
```

### Usage
You can set number of font face provided by EasyFont to your `TextView` by passing `EasyFonts.yourFont(Context context)` to `setTypeface()`.
```java
TextView tv_hello = (TextView) findViewById(R.id.tv_hello);
tv_hello.setTypeface(EasyFonts.robotoThin(this));
```
You can also check sample project created in app directory.

## Version: 1.0.0
Stable release

## License
```
Copyright 2016, Vijay Vankhede

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```


[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/vsvankhede/easyfonts/trend.png)](https://bitdeli.com/free "Bitdeli Badge")

