package todomvc;

import com.google.common.base.Splitter;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import todomvc.actions.TodoListActions;

import java.util.List;

import static java.util.Arrays.asList;
import static net.serenitybdd.core.Serenity.reportThat;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenFilteringTasks {

    @Steps
    TodoListActions todoList;

    @ParameterizedTest
    @CsvSource(value = {
            "Active     , Feed the cat;Walk the dog , Feed the cat , Walk the dog",
            "Completed  , Feed the cat;Walk the dog , Feed the cat , Feed the cat",
            "All        , Feed the cat;Walk the dog , Feed the cat , Feed the cat;Walk the dog"
    })
    public void shouldShowCorrectlyFilteredItems(String filterBy,
                                                 String todoItemsList,
                                                 String completeItem,
                                                 String filteredItemsList) {

        List<String> todoItems = Splitter.on(";").trimResults().splitToList(todoItemsList);
        List<String> filteredItems = Splitter.on(";").trimResults().splitToList(filteredItemsList);

        todoList.openApplication();
        todoList.addItems(todoItems);
        todoList.completeItem(completeItem);
        todoList.filterBy(filterBy);

        reportThat("The todo list should contain the expected items",
                () -> assertThat(todoList.items()).hasSameElementsAs(filteredItems)
        );
    }

}
