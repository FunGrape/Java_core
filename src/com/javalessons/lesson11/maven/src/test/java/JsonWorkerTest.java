import org.example.JsonWorker;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class JsonWorkerTest {
    @Test
    void testToJson() {
        JsonWorker worker = new JsonWorker();

        String actual = worker.toJson();
        String expected = "{\"student\":{\"name\":\"Оля Прокрастиненко\",\"age\":19,\"major\":\"Мистецтво Виживання\",\"skills\":[\"здача дедлайнів в останню хвилину\",\"читання конспектів уві сні\"],\"fridge\":[\"вода\",\"шматок сиру\",\"порожній контейнер\"],\"grades\":{\"історія\":\"B\",\"англійська\":\"A-\"},\"quote\":\"Посплю 5 хвилин і почну вчитись\"}}";

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testWhenIncomeNull() {
        JsonWorker worker = new JsonWorker();

        String actual = worker.toJson();
        String expected = "";

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testToObject() {
        JsonWorker worker = new JsonWorker();
        String json = "{\"student\":{\"name\":\"Оля Прокрастиненко\",\"age\":19,\"major\":\"Мистецтво Виживання\",\"skills\":[\"здача дедлайнів в останню хвилину\",\"читання конспектів уві сні\"],\"fridge\":[\"вода\",\"шматок сиру\",\"порожній контейнер\"],\"grades\":{\"історія\":\"B\",\"англійська\":\"A-\"},\"quote\":\"Посплю 5 хвилин і почну вчитись\"}}";

        String actual = worker.toObject(json);
        String expected = "{\"name\":\"Оля Прокрастиненко\",\"age\":19,\"major\":\"Мистецтво Виживання\",\"skills\":[\"здача дедлайнів в останню хвилину\",\"читання конспектів уві сні\"],\"fridge\":[\"вода\",\"шматок сиру\",\"порожній контейнер\"],\"grades\":{\"історія\":\"B\",\"англійська\":\"A-\"},\"quote\":\"Посплю 5 хвилин і почну вчитись\"}";

        Assertions.assertEquals(expected, actual);

        System.out.println("Actual: " + actual);
        System.out.println("Expected: " + expected);
    }
    @Test
    void testToObjectWithWrongDefinitions() {
        JsonWorker worker = new JsonWorker();
        String json = "{\"student\":{\"name\":\"Оля Прокрастиненко\",\"age\":20,\"major\":\"Мистецтво Виживання\",\"skills\":[\"здача дедлайнів в останню хвилину\",\"читання конспектів уві сні\"],\"fridge\":[\"вода\",\"шматок сиру\",\"порожній контейнер\"],\"grades\":{\"історія\":\"B\",\"англійська\":\"A-\"},\"quote\":\"Посплю 5 хвилин і почну вчитись\"}}";

        String actual = worker.toObject(json);
        String expected = "{\"name\":\"Оля Прокрастиненко\",\"age\":19,\"major\":\"Мистецтво Виживання\",\"skills\":[\"здача дедлайнів в останню хвилину\",\"читання конспектів уві сні\"],\"fridge\":[\"вода\",\"шматок сиру\",\"порожній контейнер\"],\"grades\":{\"історія\":\"B\",\"англійська\":\"A-\"},\"quote\":\"Посплю 5 хвилин і почну вчитись\"}";

        Assertions.assertEquals(expected, actual);

        System.out.println("Actual: " + actual);
        System.out.println("Expected: " + expected);
    }
}
