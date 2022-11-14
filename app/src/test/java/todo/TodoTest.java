package todo;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class TodoTest {
  @Test 
    public void  ShouldStartWithEmptyList() {
      Todo todo = new Todo();
      assertTrue("Initial task list should be empty", todo.tasks.isEmpty());
  }

  @Test
    public void ShouldAddTask() {
      Todo todo = new Todo();
      ArrayList<String> expectedList = new ArrayList<String>();
      expectedList.add("Buy Milk");

      assertEquals("Should reflect new task added", expectedList, todo.addTask("Buy Milk"));

    }

  @Test
  public void ShouldGetTasksList() {
    Todo todo = new Todo();
    ArrayList<String> list = new ArrayList<String>();
    list.add("Buy Milk");
    list.add("Buy Coffee");

    todo.addTask("Buy Milk");
    todo.addTask("Buy Coffee");

    assertEquals("It should return the list of tasks", list, todo.getTasks());
  }
}