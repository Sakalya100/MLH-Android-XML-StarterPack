# MLH-Android-XML-StarterPack
This is a super simple starter pack to start with XML.

Starting from the basics, this repo will explain you on how to build a basic app in Android Studio and How to explore the various folders in Android Studio

## Creating a project
The very first step towards creating a project. When you open your android studio you will see a screen for choosing an activity. As a beginner I suggest to choose empty activity and proceed forward.
- Click on Empty Activity
- Then Click Finish

![Home](https://github.com/Sakalya100/MLH-Android-XML-StarterPack/blob/main/Images/Activity%20Choose.png)

## Naming and Setting up the Project
Now after you have selected the template. You will be redirected to a screen as below. Here you have to perform the following functions
- Add name to your app as shown in picture below
- Select the location where your all files will be saved on your local system
- Select your preferred language to code, Java or Kotlin
-  Select the API version. Now this can be a bit tricky but a simple trick. The lower your API version, the more number of devices it will run on.
      - If you sleect anythin like Android 11 then it will run on very less devices because it not intreoduced at all.
      - If you select the lowest version, then it will run on 99.8% devices but its a lot older version and can cause problem as no one has that API as of today.
      - So I recommend to use an API in between like Marshmellow or Nougat which will run on most devices.

![Setup](https://github.com/Sakalya100/MLH-Android-XML-StarterPack/blob/main/Images/Creating%20Project.png)


## Exploring Android Studio
After performing the above steps you will see a screen open. It will contain two files already opened. One is **activity_main.xml** and other is **MainActivity.java or MainActivity.kt** based on your language chosen. Now initially you will see some processes running in the bottom like Gradle:Build. So make sure you dont perform any action inside Android Studio during that period and let it finish.

Now that Gradle build is finished you are ready to jump in and explore Android Studio.
You will see some files on the left hand side of your tab. Those are all the files that your app will need. Lets Talk about each one of them in brief.

![All options on left](https://github.com/Sakalya100/MLH-Android-XML-StarterPack/blob/main/Images/All%20option%20on%20left.png)


### manifests
Under this section you will find a xml file named AndroidManifest. You can understand that this file is like the heart of your Android project. It is used by the android studio to build some basic structures and layout required for every app.


![manifests](https://github.com/Sakalya100/MLH-Android-XML-StarterPack/blob/main/Images/Manifest.png)

### java
Under this section you will find 3 sub folders. But the first folder named com.example.(yourappname) is the folder inside which all your activities will be stored.
When you go inside the folder you will see the activites like mainActivity.java or kt. Now here I have used two activites to make a 2 screen app. So any activity you create you will find it inside this folder.


![java](https://github.com/Sakalya100/MLH-Android-XML-StarterPack/blob/main/Images/Java%20Activities.png)

### res
Under this folder will be all your resources. By resources I mean the images, the xml files and many more. Now when you open the res folder there are many sub folders. Among them the most important ones are the **layout and drawable** folders.
-layout- This folder contains the front end codes of your app. The XML files associated with each activity is stored here. You can clearly see that I had 2 activites and here under layout I have 2 XML files. The one open is the activity-main.xml which is used to design the page visible on the right tab.


![layout](https://github.com/Sakalya100/MLH-Android-XML-StarterPack/blob/main/Images/Layout%20xml.png)


- drawable- This folder contains all your images you use in the app. It also contains 2 xml files initially which is basically used to determine the look of your app icon whe you install it in your mobile phone. If you want to use any image in the app, just paste those images inside this folder.

![drawable](https://github.com/Sakalya100/MLH-Android-XML-StarterPack/blob/main/Images/Drawable.png)



# Basics Cleared :sparkles:
You are now acquainted with Android Studio basics and can start buidling your first project.

Now how can you build your project might be your question.

you will see all the code samples in this repo. So follow these steps:-
- Fork this repo
- Clon the repo to your local system using this command
```bash
  git clone git@github.com:Sakalya100/MLH-Android-XML-StarterPack.git
```
- open your android studio and open this project there from Files option on top left.
- Boom:boom: You have the project on your Android Studio and ready to run.
- You can explore various fields and about various XML basics by visiting to the official [android documentation](https://developer.android.com/docs)


# Running the App
You can run the app in two modes.
- Using Virtual Device provided by Android Studio. You dont need an android device and the app will run on your system. Read about it [here](https://developer.android.com/training/basics/firstapp/running-app)
- Using your personal android device. Watch [this](https://www.youtube.com/watch?v=CnAnOXqxQsc) for understanding the process.


# Congratulations :clap:
You are now ready to explore the field of Android and make some awesome apps

