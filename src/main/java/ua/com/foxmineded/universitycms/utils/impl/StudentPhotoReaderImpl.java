package ua.com.foxmineded.universitycms.utils.impl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.stereotype.Component;
import lombok.SneakyThrows;
import ua.com.foxmineded.universitycms.utils.StudentPhotoReader;

@Component
public class StudentPhotoReaderImpl implements StudentPhotoReader {
	private static final Path STUDENT_MAN_PHOTO_PATH = Paths.get("src", "main", "resources", "static", "photo",
			"student-man.png");
	private static final Path STUDENT_WOMAN_PHOTO_PATH = Paths.get("src", "main", "resources", "static", "photo",
			"student-woman.png");

	@SneakyThrows
	@Override
	public byte[] readManPng() {
		return Files.readAllBytes(STUDENT_MAN_PHOTO_PATH);
	}

	@SneakyThrows
	@Override
	public byte[] readWomanPng() {
		return Files.readAllBytes(STUDENT_WOMAN_PHOTO_PATH);
	}
}
