package ua.com.foxmineded.universitycms.utils.impl;

import static java.util.stream.Collectors.toCollection;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.springframework.stereotype.Component;
import lombok.Cleanup;
import ua.com.foxmineded.universitycms.utils.CoursesNamesReader;

@Component
public class CoursesNamesReaderImpl implements CoursesNamesReader {
	private static final Path COMPUTER_SCIENCE_COURSES_PATH = Paths.get("src", "main", "resources", "txt",
			"computer-science-courses.txt");
	private static final Path ART_COURSES_PATH = Paths.get("src", "main", "resources", "txt", "art-courses.txt");
	private static final Path ECONOMIC_COURSES_PATH = Paths.get("src", "main", "resources", "txt",
			"economic-courses.txt");
	private static final Path MEDICINE_COURSES_PATH = Paths.get("src", "main", "resources", "txt",
			"medicine-courses.txt");

	@Override
	public List<String> readEconomicCourses() throws IOException {
		@Cleanup
		Stream<String> stream = Files.lines(ECONOMIC_COURSES_PATH);
		return stream.collect(toCollection(ArrayList::new));
	}

	@Override
	public List<String> readComputerScienceCourses() throws IOException {
		@Cleanup
		Stream<String> stream = Files.lines(COMPUTER_SCIENCE_COURSES_PATH);
		return stream.collect(toCollection(ArrayList::new));
	}

	@Override
	public List<String> readMedicineCourses() throws IOException {
		@Cleanup
		Stream<String> stream = Files.lines(MEDICINE_COURSES_PATH);
		return stream.collect(toCollection(ArrayList::new));
	}

	@Override
	public List<String> readArtCourses() throws IOException {
		@Cleanup
		Stream<String> stream = Files.lines(ART_COURSES_PATH);
		return stream.collect(toCollection(ArrayList::new));
	}
}
