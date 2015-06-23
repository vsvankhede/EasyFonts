![alt tag](https://github.com/vsvankhede/easyfonts/blob/master/images/banner.png)
# EasyFonts

A simple and useful android library to use custom fonts in android apps without adding fonts into asset/resource folder.Also by using this library developer should not have to worry about `Typeface` object creation for every new font that he use.

EasyFonts will handle all this for you.

Type of fonts available:
* Roboto
* Droid Serif
* Droid Robot
* Freedom
* Fun Raiser
* Android Nation
* Green Avocado
* Recognition

## Getting Started

### Installation
Add gradle dependency with command:
```
dependencies {
        compile 'com.vstechlab.easyfonts:easyfonts:0.9.0'
    }
```
for Maven:
```
repositories {
    maven {
        url 'https://dl.bintray.com/vsvankhede/maven/'
    }
}
dependencies {
        compile 'com.vstechlab.easyfonts:easyfonts:0.9.0'
    }
```

### Usage
You can set number of font face provided by EasyFont to your `TextView` by passing `EasyFonts.yourFont(Context context)` to `setTypeface()`.
```
TextView tv_hello = (TextView) findViewById(R.id.tv_hello);
tv_hello_world.setTypeface(EasyFonts.robotoThin(this));
```
You can also check sample project created in app directory.

## Version: 0.9.0
Initial build

## License
```
Copyright 2015, Vijay Vankhede

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
