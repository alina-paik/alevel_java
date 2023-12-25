package ua.paik.hw11;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {

    public static Map<String, Integer> getStringLengthMap(List<String> strings) {
        return strings.stream()
                .collect(Collectors.toMap(
                        str -> str,
                        str -> str.length()
                ));
    }

    public static void main(String[] args) {
        List<String> inputStrings = List.of("тут", "там", "стол");
        Map<String, Integer> lengthMap = getStringLengthMap(inputStrings);
        lengthMap.forEach((key, value) -> System.out.println("{" + key + ", " + value + "}"));
    }
}

