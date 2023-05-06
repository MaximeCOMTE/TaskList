import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskTest {

    @Test
    public void TestCreationTask() {
        int id = 1;
        String description = "Tâche de test";
        Task task = new Task(id, description);

        assertEquals(id, task.getId(), "L'identifiant de la tâche doit correspondre à celui fourni.");
        assertEquals(description, task.getDescription(), "La description de la tâche doit correspondre à celle fournie.");
        assertFalse(task.isCompleted(), "L'état de la tâche doit être 'non terminée' par défaut.");
    }

    @Test
    public void TestTermineTask() {
        int id = 1;
        String description = "Tâche de test";
        Task task = new Task(id, description);

        task.setCompleted(true);

        assertTrue(task.isCompleted(), "L'état de la tâche doit être 'terminée' après avoir été défini comme tel.");
    }

   
}
