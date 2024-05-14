import java.util.HashMap;
import java.util.Map;

/**
 * @Note: The class must be declared as final so that child classes can’t be created.
 */
final class ImmutablePerson {
    /**
     * @Note: Data members in the class must be declared private so that direct access is not allowed.
     * @Note: Data members in the class must be declared as final so that we can’t change the value of it after object creation.
     */

    private final Integer age;
    private final String name;

    private final Map<String, String> metaData;

    /**
     * A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.
     * @param age
     * @param name
     * @param metaData
     */
    public ImmutablePerson(Integer age, String name, Map<String, String> metaData) {
        this.age = age;
        this.name = name;
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : metaData.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        // or using this
        //tempMap.putAll(metaData);
        this.metaData = tempMap;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    /**
     * Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference).
     * @return
     */
    public Map<String, String> getMetaData() {
        Map<String, String> tempMap = new HashMap<>();
        tempMap.putAll(this.metaData);
        return tempMap;
    }
}
