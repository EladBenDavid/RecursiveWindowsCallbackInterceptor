# Recursive WindowsCallback Interceptor
Demonstrate recursive  windows interceptor issue 
When you have more than one SDK that replaces the window call back, you can get into of issue when each SDK sets more than one interceptor.
You can see it happened using the log cat.

Step to simulate:
1. run the application
2. go to the next activity by click on the button.
3. back to the first activity. 

Each time you back to the activity you add new Interceptors to the activity.
Since we have a few interceptors for each screen you handle a few times for each event
