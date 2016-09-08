[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-AndroidCustomView-green.svg?style=true)](https://android-arsenal.com/details/1/4166) 
[ ![Download](https://api.bintray.com/packages/allencoder/maven/compareindicator/images/download.svg) ](https://bintray.com/allencoder/maven/compareindicator/_latestVersion)
# 简介(投票 ,排名对比图)
------------------------

1.  一个简单的自定义 View 可高度定制
2.  支持设置替换 支持 ,和反对的图标



3.  支持自定义线宽和支持反对线的字体颜色

# 设置比分值
**效果图**

<img src="https://github.com/AllenCoder/AndroidCustomView/blob/master/gif/device-2016-09-08-213022.png" width=300 />

| 字段    | 属性   |   
| ----------------- | ---------- | 
| OppositeBitmap    | 反对图标   | |
| mApproveBitmap    | 支持图标   |    
| approveLineColor  | 支持线颜色 |    
| oppositeLineColor |    反对线颜色    |    
## Dependency


Add dependency in your app module





```
dependencies {
	compile 'com.allen.comparsechart:comparsechart:1.0.1'
}
```




## Maven
```
<dependency>
  <groupId>com.allen.comparsechart</groupId>
  <artifactId>comparsechart</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```

## Usage

### Java
```
    <com.allen.comparsechart.CompareIndicator
            android:id="@+id/CompareIndicator3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="50dp"
            app:approve_line_color="@android:color/holo_green_light"
            app:approve_res="@mipmap/approve"
            app:oppose_line_color="@android:color/holo_red_dark"
            app:opposite_res="@mipmap/opposite"
            />
```
```
CompareIndicator1.updateView(10,90);
```
[股票走势图](https://github.com/AllenCoder/AndroidDevCoder)

<img src="https://github.com/AllenCoder/AndroidDevCoder/blob/master/gif/linechart.gif" width=300 />

### [ Apk 下载地址](http://fir.im/5kvu)

## License
```
Copyright 2016 AllenCoder

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
