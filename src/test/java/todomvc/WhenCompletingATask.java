package todomvc;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import net.thucydides.core.annotations.Steps;
import todomvc.actions.TodoListActions;

import static net.serenitybdd.core.Serenity.reportThat;
import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SerenityJUnit5Extension.class)
public class WhenCompletingATask {
    // TODO: Exercise 3


    @BeforeEach
    public void openApp() {
        todoList.openApplication();
    }

    @Steps
    TodoListActions todoList;

    @Test
    public void activeTasksShouldNotShowCompletedTasks() {
        todoList.addItems("Feed The Cat", "Walk the dog");

        todoList.completeItem("Feed The Cat");

        todoList.filterBy("Active");

        assertThat(todoList.items()).containsExactly("Walk the dog");
    }

    @Test
    public void completedTasksShouldNotShowActiveTasks() {
        todoList.addItems("Feed The Cat", "Walk the dog");

        todoList.completeItem("Feed The Cat");

        todoList.filterBy("Completed");

        reportThat("The todo list should contain only uncompleted items",
                () -> assertThat(todoList.items()).containsExactly("Feed The Cat")
        );
    }
}
