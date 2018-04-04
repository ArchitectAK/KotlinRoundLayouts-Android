# KotlinRoundLayouts-Android

Its a simple way to use layouts with rounded corners

what you need to do is just Add to app level build.gradle

     compile 'com.freeankit.roundlayouts:roundlayout:1.0.1'
     
If you are using maven, here is the dependency 
    
       <dependency>
         <groupId>com.freeankit.roundlayouts</groupId>
         <artifactId>roundlayout</artifactId>
         <version>1.0.1</version>
         <type>pom</type>
       </dependency>


Now add layout to your layout.xml

     <com.freeankit.roundlayouts.RoundFrameLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_vertical"
                android:layout_margin="8dp"
                app:corner_radius="100dp">
                // Views inside can be added here/.. see next example
     </com.freeankit.roundlayouts.RoundFrameLayout>
     
     
 Example
 
    
        <com.freeankit.roundlayouts.RoundFrameLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_vertical"
            android:layout_margin="8dp"
            app:corner_radius="100dp">

            <ImageView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="centerInside"
                android:src="@drawable/new_pic" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="bottom"
                android:background="@color/translucent"
                android:gravity="center"
                android:padding="8dp"
                android:text="Numbers"
                android:textColor="@android:color/white" />
        </com.freeankit.roundlayouts.RoundFrameLayout>



And that's it. You are good to go.


 that's how it will look
 
 <img src="https://github.com/AnkitDroidGit/KotlinRoundLayouts-Android/blob/master/art/screeshot.png" width="400" height="720">


### Contact - Let's connect to learn together
- [Twitter](https://twitter.com/KumarAnkitRKE)
- [Github](https://github.com/AnkitDroidGit)
- [LinkedIn](https://www.linkedin.com/in/kumarankitkumar/)
- [Facebook](https://www.facebook.com/freeankit)
- [Slack](https://ankitdroid.slack.com)
- [Stackoverflow](https://stackoverflow.com/users/3282461/android)
- [Android App](https://play.google.com/store/apps/details?id=com.freeankit.ankitprofile)


### License

    Copyright 2018 Ankit Kumar
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
