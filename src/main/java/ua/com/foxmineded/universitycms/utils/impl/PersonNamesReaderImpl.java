package ua.com.foxmineded.universitycms.utils.impl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toCollection;
import java.io.IOException;
import org.springframework.stereotype.Component;
import lombok.Cleanup;
import ua.com.foxmineded.universitycms.utils.PersonNamesReader;

@Component
public class PersonNamesReaderImpl implements PersonNamesReader {
	private static final Path MAN_FIRST_NAMES_PATH = Paths.get("src", "main", "resources", "txt", "man-names.txt");
	private static final Path WOMAN_FIRST_NAMES_PATH = Paths.get("src", "main", "resources", "txt", "women-names.txt");
	private static final Path LAST_NAMES = Paths.get("src", "main", "resources", "txt", "last-names.txt");

	@Override
	public List<String> readManFirstNames() throws IOException {
		@Cleanup
		Stream<String> stream = Files.lines(MAN_FIRST_NAMES_PATH);
		return stream.collect(toCollection(ArrayList::new));
	}

	@Override
	public List<String> readWomanFirstNames() throws IOException {
		@Cleanup
		Stream<String> stream = Files.lines(WOMAN_FIRST_NAMES_PATH);
		return stream.collect(toCollection(ArrayList::new));
	}

	@Override
	public List<String> readLastNames() throws IOException {
		@Cleanup
		Stream<String> stream = Files.lines(LAST_NAMES);
		return stream.collect(toCollection(ArrayList::new));
	}
}
