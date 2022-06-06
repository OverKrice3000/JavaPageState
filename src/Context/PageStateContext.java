package Context;

import java.util.List;
import java.util.Map;

public class PageStateContext {
    private Map<String, String> previousState;
    private Map<String, String> currentState;

    public PageStateContext(Map<String, String> previousState, Map<String, String> currentState){
        this.previousState = previousState;
        this.currentState = currentState;
    }

    public List<String> getDeletedPagesUrls(){
        return previousState.keySet().stream().filter((url) -> !currentState.containsKey(url)).toList();
    }

    public List<String> getAddedPagesUrls(){
        return currentState.keySet().stream().filter((url) -> !previousState.containsKey(url)).toList();
    }

    public List<String> getChangedPagesUrls(){
        return previousState.entrySet().stream().filter((entry) -> {
            String value = currentState.get(entry.getKey());
            if(value == null)
                return false;
            return !value.equals(entry.getValue());
        }).map(Map.Entry::getKey).toList();
    }

}
