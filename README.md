# Readme file for the Serenity BDD Training Course

This repository contains the exercises for the Serenity BDD Training Course on testing web applications with Serenity BDD. 
If you want to learn Serenity BDD in depth, check out the [training course](https://expansion.serenity-dojo.com/courses/testing-web-applications-with-serenity-bdd) and the other courses on the [Serenity Dojo Expansion Platform](https://expansion.serenity-dojo.com/)

## Cloning and Running the Project

To clone the project, run the following command in your terminal:
```
git clone https://github.com/serenity-dojo/todomvc-tutorial.git
```

To run the project, you must have Maven installed. Once installed, navigate to the root directory of the cloned project in your terminal and run the following command:
```
mvn clean verify
```

## Tasks

In the course, you will be given a series of tasks to complete. The sample solutions are available in the `solutions` branch.

1. Open the `WhenAddingTasks` class and implement the `addingASingleTask()` method. Use a Serenity action class to implement the steps. Make sure the steps and assertions appear in the reports.

2. Open the `WhenAddingTasks` class and implement the `addingMultipleTasks()` method. You can reuse methods developed in the previous exercise.

3. Open the `WhenCompletingATask` class and implement the `activeTasksShouldNotShowCompletedTasks()` method.

4. Open the `WhenCompletingATask` class and implement the `completedTasksShouldNotShowActiveTasks()` method.

5. Open the `WhenDeletingATask` class and implement the `deletedItemsShouldDissapearFromTheList()` method.

6. Write a data-driven test to test the following scenarios:
    - When you add the items "Feed the cat" and "Walk the dog", and complete "Feed the cat", and then filter by "Completed", you should only see "Feed the cat".
    - When you add the items "Feed the cat" and "Walk the dog", and complete "Feed the cat", and then filter by "Active", you should only see "Walk the dog".
    - When you add the items "Feed the cat" and "Walk the dog", and complete "Feed the cat", and then filter by "All", you should see all the items.

Good luck with your exercises!
