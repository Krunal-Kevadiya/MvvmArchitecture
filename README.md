[![API](https://img.shields.io/badge/API-16%2B-red.svg?style=flat)](https://android-arsenal.com/api?level=16)
[![Build Status](https://travis-ci.org/wupdigital/android-maven-publish.svg?branch=master)](https://github.com/Krunal-Kevadiya/MvvmArchitecture)
[ ![Download](https://api.bintray.com/packages/kevadiyakrunalk/MyFramework/mvvmarchitecture/images/download.svg) ](https://bintray.com/kevadiyakrunalk/MyFramework/mvvmarchitecture/_latestVersion) 
[![License](https://img.shields.io/badge/License-Apache%202.0-orange.svg)](https://opensource.org/licenses/Apache-2.0)

# Mvvm Architecture

* in this struct i have divided the whole project into four part 
  * ACTIVITY
  * FRAGMENT
  * VIEWMODEL
  * NAVIGATOR.
  
* all of you know about the activity, fragment and viewmodel but I have totally change this things like below.

* ACTIVITY will divid in two ways 
```java 
  MvvmActivity<BindObject, ViewModelObject> 

                  OR 

  NavigatingMvvmActivity<NavigatorObject, BindObject, ViewModelObject>
```

* FRAGMENT will divid in two ways 
```java 
  MvvmFragment<BindObject, ViewModelObject> 
              
              OR
              
  NavigatingMvvmFramgment<NavigatorObject, BindObject, ViewModelObject>
```

* DIALOGFRAGMENT will divid in two ways 
```java 
  NavigatingMvvmDialogFragment<BindObject, ViewModelObject> 
                
                OR
                
  NavigatingMvvmDialogFragment<NavigatorObject, BindObject, ViewModelObject>
```

* also it will handle the ACTIVITY AND FRAGMNET event for binding the other component for example you have display progressdialog and press back then dialog will automatically cancel at that time when you use activity or fragment dialog.

-> Gradle
```groovy
repositories {
    jcenter()
}
dependencies {
    compile 'com.kevadiyakrunalk:commonutils:1.1@aar'
    compile 'com.kevadiyakrunalk:mvvmarchitecture:1.1@aar'
}
```
-> Maven
```xml
<dependencies>
  <dependency>
    <groupId>com.kevadiyakrunalk</groupId>
    <artifactId>mvvmarchitecture</artifactId>
    <version>1.1</version>
    <type>pom</type>
  </dependency>
  <dependency>
    <groupId>com.kevadiyakrunalk</groupId>
    <artifactId>commonutils</artifactId>
    <version>1.1</version>
    <type>pom</type>
  </dependency>
</dependencies>
```
