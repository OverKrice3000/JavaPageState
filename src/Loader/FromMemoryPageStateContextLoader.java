package Loader;

import Context.PageStateContext;

import java.util.HashMap;
import java.util.Map;

public class FromMemoryPageStateContextLoader implements PageStateContextLoader{

    @Override
    public PageStateContext loadContext() {
        Map<String, String> previousState = new HashMap<>();
        Map<String, String> currentState = new HashMap<>();
        previousState.put("A", "ABC");
        previousState.put("B", "ABC");
        previousState.put("C", "ABC");
        currentState.put("A", "ABC");
        currentState.put("B", "ABCD");
        currentState.put("D", "ABC");
        return new PageStateContext(previousState, currentState);
    }
}
