# ActivityLifecycle

imple Android activity lifecycle example with two different activities 
to see how the lifecycle callbacks work.


Activity Lifecycle: Activity is one of the building blocks of Android OS. 

In simple words Activity is a screen that user interact with. Every Activity 

in android has lifecycle 

like created, started, resumed, paused, stopped or destroyed. 

![activity_lifecycle](https://user-images.githubusercontent.com/64752597/204076022-f1f6ae05-4669-46b0-8134-86b394e29a32.png)

A simplified illustration of the activity lifecycle.
https://developer.android.com/guide/components/activities/activity-lifecycle#java


These different states are known as Activity Lifecycle.

# onCreate()
# onStart()
# onResume()
# onPause()
# onStop()
# onDestroy()

Why activity life cycle is important?


The Activity lifecycle is especially important because 
whenever an activity leaves the screen, the activity can be destroyed. 
When an activity is destroyed, when the user returns to the activity, 
the activity will be re-created and the lifecycle methods will be called again.
