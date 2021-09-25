package guru.springframework.pnafrecipeapp.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    void setUp() {
        category = new Category();
    }

    @Test
    void getId() {
        Long idValue = 4L;

        category.setId(idValue);
        assertEquals(category.getId(), idValue);
    }

    @Test
    void getDescription() {
        String description = "testcategory";
        category.setDescription(description);

        assertEquals(category.getDescription(), description);
    }
}