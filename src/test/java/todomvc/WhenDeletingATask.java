package todomvc;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenDeletingATask {
    // TODO: Exercise 5
    @Test
    public void deletedItemsShouldDissapearFromTheList() {
        // Add "Feed the cat" and "Walk the dog" to the list
        // Delete "Feed the cat"
        // Check that only "Walk the dog" appears
    }
}
