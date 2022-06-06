package Loader;

import Context.PageStateContext;

import java.util.HashMap;
import java.util.Map;

public class FromMemoryPageStateContextLoader implements PageStateContextLoader{

    @Override
    public PageStateContext loadContext() {
        Map<String, String> previousState = new HashMap<>();
        Map<String, String> currentState = new HashMap<>();
        previousState.put("www.google.com", "ABC");
        previousState.put("yandex.ru", "ABC");
        previousState.put("www4.bing.com", "ABC");
        currentState.put("www.google.com", "ABC");
        currentState.put("yandex.ru", "ABCD");
        currentState.put("github.com", "ABC");
        currentState.put("gitlab.com", "ABC");
        return new PageStateContext(previousState, currentState);
    }
}
