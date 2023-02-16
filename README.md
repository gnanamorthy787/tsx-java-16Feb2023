# tsx-java-16Jan2022

Step1: Your have to create Repository in github.

step2: Then create a spring boot project with gradle.

step3: After that in the controll class add method for postmapping to read the payload and add log file to trace your repo after that run the code.

step4: Download ngrok and execute commend ngrok http your localportnumber then enter.

step5: After that you will receive one ngrok https url copy that link.

step6: in your repo goto setting click webhook and add webhook then past that copied link with your    post method value like /webhook and click the events what you want to create push, pull ,commit etc. Then leave all the else as same then add webhook.

Step7: Clone your repository and execute pull,push commends.

step8: you can see the payload in log .
